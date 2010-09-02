package uk.co.gidley.projectView.pages;

import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.FieldTranslator;
import org.apache.tapestry5.FieldValidator;
import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Environmental;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.TextField;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.PropertyEditContext;

/**
 * Created by IntelliJ IDEA. User: ben Date: Sep 1, 2010 Time: 3:13:09 PM
 */
public class LinkPropertyEditBlock {
	@Property
	@Environmental
	private PropertyEditContext context;

	@Component(parameters =
			{ "value=context.propertyValue", "label=prop:context.label",
					"translate=prop:linkTranslator", "validate=prop:linkValidator",
					"clientId=prop:context.propertyId", "annotationProvider=context" })
	private TextField link;

	@Inject
	private ComponentResources resources;

	public FieldValidator getLinkValidator() {
		return context.getValidator(link);
	}

	public FieldTranslator getLinkTranslator() {
		return context.getTranslator(link);
	}
}
