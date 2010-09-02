package uk.co.gidley.projectView.components;

import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SetupRender;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.javascript.InitializationPriority;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;
import uk.co.gidley.projectView.dao.Site;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import java.util.List;

/**
 * Created by IntelliJ IDEA. User: ben Date: Aug 25, 2010 Time: 8:40:50 PM
 */
@Import(library = "SiteTabs.js")
public class SiteTabs {

	@Inject
	private PersistenceManager persistenceManager;

	public List<Site> getSites() {
		Query query = persistenceManager.newQuery(Site.class);
		query.setOrdering(Site.ORDER);
		return (List<Site>) query.execute();
	}

	@Property
	private Site site;
	
	@Inject
	private ComponentResources resources;

	@Inject
	private JavaScriptSupport renderSupport;


	private String clientId;

	@SetupRender
	private void setupRender(){
		clientId = null;
		renderSupport.addInitializerCall(InitializationPriority.EARLY, "initialiseSiteTabs", getClientId());
		renderSupport.addInitializerCall(InitializationPriority.LATE, "rotateSiteTabs", getClientId());
	}

	/**
	 * Returns the unique client id for this element. This is valid only after the component has rendered (its start
	 * tag).  A client id is generated the first time this method is invoked, after the link renders its start tag.
	 */
	public final String getClientId() {
		if (clientId == null) {
			clientId = renderSupport.allocateClientId(resources);
		}
		return clientId;
	}
}
