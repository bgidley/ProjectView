package uk.co.gidley.projectView.exceptions;

import org.apache.commons.lang.exception.NestableException;

/**
 * Created by IntelliJ IDEA. User: ben Date: Aug 11, 2010 Time: 8:30:23 PM
 */
public class UnparseableMessageException extends NestableException {
	private String message;

	public UnparseableMessageException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
