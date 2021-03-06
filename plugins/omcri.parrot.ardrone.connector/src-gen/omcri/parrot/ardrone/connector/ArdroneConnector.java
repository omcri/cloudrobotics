/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *
 * Generated at Mon Oct 02 10:23:42 CEST 2017 from platform:/resource/omcri.parrot.ardrone/model/parrotardrone.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri.parrot.ardrone.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://omcri.org/cloudrobotics/parrotardrone#
 * - term: ardrone
 * - title: 
 */
public class ArdroneConnector extends parrotardrone.impl.ArdroneImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ArdroneConnector.class);

	// Start of user code Ardroneconnector_constructor
	/**
	 * Constructs a ardrone connector.
	 */
	ArdroneConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code ArdroneocciCreate
	/**
	 * Called when this Ardrone instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Ardrone_occiRetrieve_method
	/**
	 * Called when this Ardrone instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Ardrone_occiUpdate_method
	/**
	 * Called when this Ardrone instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code ArdroneocciDelete_method
	/**
	 * Called when this Ardrone instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Ardrone actions.
	//
}	
