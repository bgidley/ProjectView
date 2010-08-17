package uk.co.gidley.projectView.components;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import uk.co.gidley.projectView.dao.Build;
import uk.co.gidley.projectView.dao.BuildGroup;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import java.util.List;

/**
 * Created by IntelliJ IDEA. User: ben Date: Aug 17, 2010 Time: 7:28:31 AM
 */
public class BuildGroupList {

	@Property
	private BuildGroup buildGroup;

	@Property
	private Build build;

	@Inject
	private PersistenceManager persistenceManager;

	public List<String> getBuildGroups() {
		Query query = persistenceManager.newQuery(BuildGroup.class);
		query.setOrdering(BuildGroup.BUILD_GROUP + " asc");
		return (List<String>) query.execute();

	}
}
