package uk.co.gidley.projectView.components;

import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.RenderSupport;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SetupRender;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONArray;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;
import uk.co.gidley.projectView.dao.Site;

/**
 * Created by IntelliJ IDEA. User: ben Date: Aug 25, 2010 Time: 9:57:12 PM
 */
@Import(library = "SiteFrame.js")
public class SiteFrame {

	@Parameter
	@Property
	private Site site;

	@Inject
	private ComponentResources resources;

	@Inject
	private JavaScriptSupport renderSupport;

	@Parameter(required = true)
	private String tabsId;


	private String clientId;

	@SetupRender
	private void setupRender(){
		clientId = null;

		JSONObject parameters = new JSONObject();
		parameters.put("clientId", getClientId());
		parameters.put("tabsId", tabsId);
		parameters.put("refresh", site.getRefresh());
		renderSupport.addInitializerCall("initialiseSiteFrame", parameters);
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