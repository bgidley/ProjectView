package uk.co.gidley.projectView.services;

import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.Link;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.Dispatcher;
import org.apache.tapestry5.services.Request;
import org.apache.tapestry5.services.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.co.gidley.projectView.dao.Build;
import uk.co.gidley.projectView.dao.BuildExecution;
import uk.co.gidley.projectView.dao.BuildGroup;
import uk.co.gidley.projectView.dao.StatusXmppMessage;
import uk.co.gidley.projectView.exceptions.UnparseableMessageException;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import java.io.IOException;
import java.util.List;


/**
 * Created by IntelliJ IDEA. User: ben Date: Aug 3, 2010 Time: 8:54:12 PM
 */
public class ProcessMessageDispatcher implements Dispatcher {
	private static final Logger logger = LoggerFactory.getLogger(ProcessMessageDispatcher.class);

	public static final String KEY = "key";

	@Inject
	private PersistenceManager persistenceManager;
	public static final String TASKS_PROCESS_MESSAGE = "/tasks/ProcessMessageDispatcher";
	public static final String BUILD_PROCESSING = "buildProcessing";


	public boolean dispatch(Request request, Response response) throws IOException {

		if (request.getPath().equals(TASKS_PROCESS_MESSAGE)) {

			String key = request.getParameter(KEY);
			logger.debug("Key passed {}", key);

			StatusXmppMessage statusXmppMessage = (StatusXmppMessage) persistenceManager.getObjectById(
					StatusXmppMessage.class, KeyFactory.stringToKey(key));

			// parse message and create appropriate objects
			String message = statusXmppMessage.getMessage();
			try {
				String[] messages = message.split("\\.");
				// should have n sections - message type, the rest

				if (messages.length >= 1) {
					if (messages[0].equals("Build successful")) {
						processSucessMessage(message, true);
					} else if (messages[0].equals("Build failed")) {
						processSucessMessage(message, false);
					}
				}
			} catch (UnparseableMessageException e) {
				logger.warn("Unparseable Message:{}", e.getMessage());
			}
			return true;
		} else {
			return false;
		}
	}

	private void processSucessMessage(String message, Boolean passed) throws UnparseableMessageException {

		String[] splitForPeriod = message.split("\\.");

		if (splitForPeriod.length > 2) {
			// Find the build name
			String[] splitForComma = message.split(",");
			if (splitForComma.length == 2 || splitForComma.length == 3) {
				// splitForComma [0] is BUILDGROUP::BUILDNAME #BUILDNUMBER
				String buildGroupName = splitForComma[0].substring(splitForComma[0].indexOf("\n") + 1,
						splitForComma[0].indexOf("::"));
				String buildName = splitForComma[0].substring(splitForComma[0].indexOf("::") + 2,
						splitForComma[0].indexOf("#") - 1);
				int buildNumber = Integer.valueOf(splitForComma[0].substring(splitForComma[0].indexOf("#") + 1,
						splitForComma[0].length()));
				Link link;
				if (splitForComma.length == 2) {
					link = new Link(
							splitForComma[1].substring(splitForComma[1].indexOf("http"), splitForComma[1].length()));
				} else {
					link = new Link(
							splitForComma[2].substring(splitForComma[2].indexOf("http"), splitForComma[2].length()));
				}

				BuildGroup buildGroup = createUpdateBuildGroup(buildGroupName);
				Build build = createUpdateBuild(message, buildName, buildGroup);
				createUpdateBuildExecution(buildNumber, link, build, passed);
			} else {
				throw new UnparseableMessageException(message);
			}
		} else {
			throw new UnparseableMessageException(message);
		}
	}

	private void createUpdateBuildExecution(int buildNumber, Link link, Build build, Boolean passed) {
		boolean found = false;
		for (BuildExecution buildExecution : build.getBuildExecutions()) {
			if (buildExecution.getBuildNumber() == buildNumber) {
				found = true;
			}
		}
		if (!found) {
			BuildExecution buildExecution = new BuildExecution();
			buildExecution.setBuildNumber(buildNumber);
			buildExecution.setPassed(passed);
			buildExecution.setBuildLink(link);
			build.getBuildExecutions().add(buildExecution);
		}
	}

	private Build createUpdateBuild(String message, String buildName,
			BuildGroup buildGroup) throws UnparseableMessageException {
		Query buildNameQuery = persistenceManager.newQuery(Build.class,
				"buildName == buildNameParam");
		buildNameQuery.declareParameters("String buildNameParam");
		List<Build> builds = (List<Build>) buildNameQuery.execute(buildName);
		Build build = null;
		if (builds.size() == 1) {
			// Update or create
			boolean found = false;
			for (Build buildItem : buildGroup.getBuilds()) {
				if (buildItem.equals(builds.get(0))) {
					found = true;
					build = buildItem;
					break;
				}
			}
			if (!found) {
				throw new UnparseableMessageException(message);
			}
		} else {
			// create
			build = new Build();
			buildGroup.getBuilds().add(build);
			build.setBuildName(buildName);
		}
		return build;
	}

	private BuildGroup createUpdateBuildGroup(String buildGroupName) {
		// Update with this messages status
		Query query = persistenceManager.newQuery(BuildGroup.class);
		query.setFilter("buildGroup == buildGroupParam");
		query.declareParameters("String buildGroupParam");
		List<BuildGroup> buildGroupList = (List<BuildGroup>) query.execute(buildGroupName);
		BuildGroup buildGroup;
		if (buildGroupList.size() == 1) {
			buildGroup = buildGroupList.get(0);
		} else {
			buildGroup = new BuildGroup();
			buildGroup.setBuildGroup(buildGroupName);
			persistenceManager.makePersistent(buildGroup);
		}
		return buildGroup;
	}
}
