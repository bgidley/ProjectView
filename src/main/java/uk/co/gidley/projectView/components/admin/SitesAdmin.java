package uk.co.gidley.projectView.components.admin;

import com.google.appengine.api.datastore.Key;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import uk.co.gidley.projectView.dao.Site;
import uk.co.gidley.projectView.pages.admin.ViewSite;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import java.util.List;

/**
 * Created by IntelliJ IDEA. User: ben Date: Aug 31, 2010 Time: 9:06:53 PM
 */
public class SitesAdmin {

	@Inject
	private PersistenceManager persistenceManager;

	@Property
	private Site site;

	@InjectPage
	private ViewSite viewSite;


	public List<Site> getSites() {
		Query query = persistenceManager.newQuery(Site.class);
		query.setOrdering(Site.ORDER);
		return (List<Site>) query.execute();
	}

	void onActionFromDelete(Key key) {
		persistenceManager.deletePersistent(persistenceManager.getObjectById(Site.class, key));
	}

	Object onActionFromAdd(){
		Site site = new Site();
		viewSite.setSite(site);
		return viewSite;
	}
}
