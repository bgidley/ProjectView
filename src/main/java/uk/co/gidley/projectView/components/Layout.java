package uk.co.gidley.projectView.components;

import org.apache.tapestry5.BindingConstants;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;

/**
 * Layout component for pages of application ProjectView.
 */
@Import(stylesheet = "context:css/global.css")
public class Layout {
	@Property
	@Parameter(required = true, defaultPrefix = BindingConstants.LITERAL)
	private String title;

}
