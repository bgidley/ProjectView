package uk.co.gidley.projectView.dao;

import com.google.appengine.api.datastore.Key;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import java.util.Date;

/**
 * Created by IntelliJ IDEA. User: ben Date: Jul 21, 2010 Time: 9:19:50 PM
 */
@PersistenceCapable
public class StatusXmppMessage {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
	private String message;

	@Persistent
	private Date recieved;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Key getKey() {
		return key;
	}

	public Date getRecieved() {
		return recieved;
	}

	public void setRecieved(Date recieved) {
		this.recieved = recieved;
	}
}
