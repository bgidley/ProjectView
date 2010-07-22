package uk.co.gidley.projectView.components;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import uk.co.gidley.projectView.dao.StatusXmppMessage;
import uk.co.gidley.projectView.services.PersistanceManager;

import javax.jdo.Query;
import java.util.List;

/**
 * Created by IntelliJ IDEA. User: ben Date: Jul 21, 2010 Time: 9:43:19 PM
 */
public class MessageList {

	@Property
	private String message;

	@Inject
	private PersistanceManager persistanceManager;

	public List<String> getMessages() {
		Query query = persistanceManager.getPmfInstance().getPersistenceManager().newQuery(StatusXmppMessage.class);

		query.setOrdering("recieved");
		return (List<String>) query.execute();

	}
}
