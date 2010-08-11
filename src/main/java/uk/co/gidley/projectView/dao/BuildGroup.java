package uk.co.gidley.projectView.dao;

import com.google.appengine.api.datastore.Key;

import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Order;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import java.util.List;

/**
 * Created by IntelliJ IDEA. User: ben Date: Aug 11, 2010 Time: 8:50:34 PM
 */
@PersistenceCapable
public class BuildGroup {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
	private String buildGroup;

@	Persistent
	@Order(extensions = @Extension(vendorName="datanucleus", key="list-ordering", value="key asc"))
	private List<Build> builds;


	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public String getBuildGroup() {
		return buildGroup;
	}

	public void setBuildGroup(String buildGroup) {
		this.buildGroup = buildGroup;
	}

	public List<Build> getBuilds() {
		return builds;
	}
}
