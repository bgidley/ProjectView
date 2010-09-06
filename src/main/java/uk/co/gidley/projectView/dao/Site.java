package uk.co.gidley.projectView.dao;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Link;
import org.apache.tapestry5.beaneditor.NonVisual;
import org.apache.tapestry5.beaneditor.Width;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 * Represents a site to be shown in the rotating tabs
 * Created by IntelliJ IDEA. User: ben Date: Aug 25, 2010 Time: 8:38:23 PM
 */
@PersistenceCapable
public class Site {

	public static final String ORDER = "order";

	@NonVisual
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Width(125)
	@Persistent
	private Link link;

	@Persistent
	private Boolean refresh;

	@Persistent
	private int order;

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	public Boolean getRefresh() {
		return refresh;
	}

	public void setRefresh(Boolean refresh) {
		this.refresh = refresh;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
}
