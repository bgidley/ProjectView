package uk.co.gidley.projectView.services;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

/**
 * Created by IntelliJ IDEA. User: ben Date: Jul 27, 2010 Time: 9:19:59 PM
 */
public class PersistenceManagerSource {

	private final PersistenceManagerFactory pmfInstance;

	public PersistenceManagerSource() {
		pmfInstance =
				JDOHelper.getPersistenceManagerFactory("transactions-optional");
	}

	public PersistenceManagerFactory getPmfInstance() {
		return pmfInstance;
	}
}
