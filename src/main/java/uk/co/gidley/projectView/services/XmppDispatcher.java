package uk.co.gidley.projectView.services;

import com.google.appengine.api.xmpp.JID;
import com.google.appengine.api.xmpp.Message;
import com.google.appengine.api.xmpp.XMPPService;
import com.google.appengine.api.xmpp.XMPPServiceFactory;
import org.apache.tapestry5.services.Dispatcher;
import org.apache.tapestry5.services.Request;
import org.apache.tapestry5.services.RequestGlobals;
import org.apache.tapestry5.services.Response;
import uk.co.gidley.projectView.dao.StatusXmppMessage;

import javax.jdo.PersistenceManager;
import java.io.IOException;
import java.util.Date;

/**
 * Created by IntelliJ IDEA. User: ben Date: Jul 21, 2010 Time: 9:01:06 PM
 */
public class XmppDispatcher implements Dispatcher {
	private RequestGlobals requestGlobals;

	private PersistenceManager persistanceManager;

	public XmppDispatcher(RequestGlobals requestGlobals, PersistenceManager persistanceManager){
		this.requestGlobals = requestGlobals;
		this.persistanceManager = persistanceManager;
	}

	public boolean dispatch(Request request, Response response) throws IOException {
		String path = request.getPath();

		if (path.equals("/_ah/xmpp/message/chat/")) {
			// XMPP Request

			XMPPService xmpp = XMPPServiceFactory.getXMPPService();
			Message message = xmpp.parseMessage(requestGlobals.getHTTPServletRequest());

			JID fromJid = message.getFromJid();
			String body = message.getBody();

			StatusXmppMessage statusXmppMessage = new StatusXmppMessage();
			statusXmppMessage.setMessage(body);
			statusXmppMessage.setRecieved(new Date());
			persistanceManager.makePersistent(statusXmppMessage);
			
			return true;
		}

		return false;
	}
}
