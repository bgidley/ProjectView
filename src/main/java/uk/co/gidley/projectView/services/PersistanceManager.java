package uk.co.gidley.projectView.services;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

/**
 * Created by IntelliJ IDEA. User: ben Date: Jul 21, 2010 Time: 9:17:58 PM
 */
public class PersistanceManager {

	private final PersistenceManagerFactory pmfInstance;

	public PersistanceManager() {
		pmfInstance =
				JDOHelper.getPersistenceManagerFactory("transactions-optional");
	}


	public PersistenceManagerFactory getPmfInstance() {
		return pmfInstance;
	}
}
