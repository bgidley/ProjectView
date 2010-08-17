package uk.co.gidley.projectView.components;

import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.labs.taskqueue.Queue;
import com.google.appengine.api.labs.taskqueue.QueueFactory;
import org.apache.tapestry5.ioc.annotations.Inject;
import uk.co.gidley.projectView.dao.StatusXmppMessage;
import uk.co.gidley.projectView.services.ProcessMessageDispatcher;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import java.util.List;

import static com.google.appengine.api.labs.taskqueue.TaskOptions.Builder.*;

/**
 * Created by IntelliJ IDEA. User: ben Date: Aug 3, 2010 Time: 8:56:29 PM
 */
public class ReprocessMessages {
	@Inject
	private PersistenceManager persistenceManager;

	public void onSuccess() {

		// Iterate over messages and add to the queue
		Queue queue = QueueFactory.getQueue(ProcessMessageDispatcher.BUILD_PROCESSING);
		Query query = persistenceManager.newQuery(StatusXmppMessage.class);
		query.setOrdering(StatusXmppMessage.RECIEVED);

		List<StatusXmppMessage> results = (List<StatusXmppMessage>) query.execute();

		for (StatusXmppMessage statusXmppMessage : results) {
			queue.add(url(ProcessMessageDispatcher.TASKS_PROCESS_MESSAGE).param(ProcessMessageDispatcher.KEY,
					KeyFactory.keyToString(statusXmppMessage.getKey())));
		}


	}
}
