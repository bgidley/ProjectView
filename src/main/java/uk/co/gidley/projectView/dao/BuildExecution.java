package uk.co.gidley.projectView.dao;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Link;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 * Created by IntelliJ IDEA. User: ben Date: Aug 3, 2010 Time: 8:02:47 PM
 */
@PersistenceCapable
public class BuildExecution {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
	private int buildNumber;

	@Persistent
	private boolean passed;

	@Persistent
	private Link buildLink;

	public Key getKey() {
		return key;
	}

	public int getBuildNumber() {
		return buildNumber;
	}

	public void setBuildNumber(int buildNumber) {
		this.buildNumber = buildNumber;
	}

	public boolean isPassed() {
		return passed;
	}

	public void setPassed(boolean passed) {
		this.passed = passed;
	}

	public Link getBuildLink() {
		return buildLink;
	}

	public void setBuildLink(Link buildLink) {
		this.buildLink = buildLink;
	}
}
