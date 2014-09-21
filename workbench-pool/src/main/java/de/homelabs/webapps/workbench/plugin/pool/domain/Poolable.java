package de.homelabs.webapps.workbench.plugin.pool.domain;

/**
 * TODO: einen Weg finden, beliebige Objekte als Poolable zu definieren und mit der core.pool Tabelle 
 * in Verbindung zu bringen
 * 
 * @author D.Mueller
 *
 */
public interface Poolable {

	long getPoolRefId();
}
