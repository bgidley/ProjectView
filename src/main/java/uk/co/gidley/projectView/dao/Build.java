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
 * Created by IntelliJ IDEA. User: ben Date: Aug 3, 2010 Time: 8:01:50 PM
 */
@PersistenceCapable
public class Build {


	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
	private String buildName;

	@Persistent
	@Order(extensions = @Extension(vendorName="datanucleus", key="list-ordering", value="buildNumber asc"))
	private List<BuildExecution> builds;

	public String getBuildName() {
		return buildName;
	}

	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}

	public List<BuildExecution> getBuilds() {
		return builds;
	}

	public void setBuilds(List<BuildExecution> builds) {
		this.builds = builds;
	}

	public Key getKey() {
		return key;
	}
}
