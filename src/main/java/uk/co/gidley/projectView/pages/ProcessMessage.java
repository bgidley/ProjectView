package uk.co.gidley.projectView.pages;

import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.co.gidley.projectView.dao.StatusXmppMessage;

import javax.jdo.PersistenceManager;


/**
 * Created by IntelliJ IDEA. User: ben Date: Aug 3, 2010 Time: 8:54:12 PM
 */
public class ProcessMessage {
	private static final Logger logger = LoggerFactory.getLogger(ProcessMessage.class);

	@Inject
	private Request request;
	public static final String KEY = "key";

	@Inject
	private PersistenceManager persistenceManager;


	public void onActivate() {

		String key = (String) request.getParameter(KEY);
		logger.debug("Key passed {}", key);

		StatusXmppMessage statusXmppMessage = (StatusXmppMessage) persistenceManager.getObjectById(
				StatusXmppMessage.class, key);

		// parse message and create appropiate objects


	}
}
