package uk.co.gidley.projectView.services;

import org.apache.tapestry5.ioc.services.ThreadCleanupListener;

import javax.jdo.PersistenceManager;

/**
 * Created by IntelliJ IDEA. User: ben Date: Jul 21, 2010 Time: 9:17:58 PM
 */
public class PersistenceManagerImpl implements ThreadCleanupListener {

	private final PersistenceManager persistenceManager;

	public PersistenceManagerImpl(PersistenceManagerSource persistenceManagerSource) {
		persistenceManager = persistenceManagerSource.getPmfInstance().getPersistenceManager();
	}

	public PersistenceManager getPersistenceManager() {
		return persistenceManager;
	}

	public void threadDidCleanup() {
		persistenceManager.close();
	}
}
