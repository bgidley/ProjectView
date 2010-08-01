package uk.co.gidley.projectView.services;

import javax.jdo.PersistenceManager;

/**
 * Created by IntelliJ IDEA. User: ben Date: Aug 1, 2010 Time: 9:17:15 AM
 */
public interface PersistenceManagerProvider {
	PersistenceManager getPersistenceManager();
}
