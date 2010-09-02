package uk.co.gidley.projectView.services.translators;

import com.google.appengine.api.datastore.Link;
import org.apache.tapestry5.Field;
import org.apache.tapestry5.MarkupWriter;
import org.apache.tapestry5.ValidationException;
import org.apache.tapestry5.internal.translator.AbstractTranslator;
import org.apache.tapestry5.services.FormSupport;

/**
 * Created by IntelliJ IDEA. User: ben Date: Sep 1, 2010 Time: 2:27:36 PM
 */
public class LinkTranslator extends AbstractTranslator<Link>{

	public LinkTranslator(){
		super("link", Link.class, "link-is-a-link");
	}

	@Override
	public String toClient(Link value) {
		return value.getValue();
	}

	@Override
	public Link parseClient(Field field, String clientValue, String message) throws ValidationException {
		return new Link(clientValue);
	}

	@Override
	public void render(Field field, String message, MarkupWriter writer, FormSupport formSupport) {
		//noop
	}
}
