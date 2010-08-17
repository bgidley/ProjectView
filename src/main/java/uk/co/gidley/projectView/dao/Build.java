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
	@Order(extensions = @Extension(vendorName = "datanucleus", key = "list-ordering", value = "buildNumber desc"))
	private List<BuildExecution> buildExecutions;

	public String getBuildName() {
		return buildName;
	}

	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}

	public List<BuildExecution> getBuildExecutions() {
		return buildExecutions;
	}

	public void setBuildExecutions(List<BuildExecution> buildExecutions) {
		this.buildExecutions = buildExecutions;
	}

	public Key getKey() {
		return key;
	}
}
