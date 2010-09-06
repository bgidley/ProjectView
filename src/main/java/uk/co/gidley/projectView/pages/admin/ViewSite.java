package uk.co.gidley.projectView.pages.admin;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Link;
import org.apache.commons.lang.StringUtils;
import org.apache.tapestry5.PersistenceConstants;
import org.apache.tapestry5.ValidationException;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import uk.co.gidley.projectView.dao.Site;

import javax.jdo.PersistenceManager;

/**
 * Created by IntelliJ IDEA. User: ben Date: Aug 31, 2010 Time: 9:29:14 PM
 */
public class ViewSite {

	@Persist
	private Site site;

	@Inject
	private PersistenceManager persistenceManager;

	public void onActivate(Key key) {
		// we detatch so we can use validation (otherwise it would save invalid objects)
		site = persistenceManager.detachCopy(persistenceManager.getObjectById(Site.class, key));
	}

	public Object onSuccess() {
		persistenceManager.makePersistent(site);
		return Index.class;
	}

	String onToClientFromLink() {
		if (site.getLink() == null) {
			return null;
		} else {
			return site.getLink().getValue();
		}
	}

	void onParseClientFromLink(String value) throws ValidationException {
		if (StringUtils.isEmpty(value)){
			throw new ValidationException("Link cannot be null");
		}
		site.setLink(new Link(value));
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public Site getSite() {
		return site;
	}
}