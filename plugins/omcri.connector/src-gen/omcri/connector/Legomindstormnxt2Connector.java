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
 * Generated at Fri Aug 04 08:01:09 CEST 2017 from platform:/resource/omcri/model/omcri.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import main.omcri.mindstorms.MindstormsControl;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://omcri.org/cloudrobotics#
 * - term: legomindstormnxt2
 * - title: 
 */
public class Legomindstormnxt2Connector extends omcri.impl.Legomindstormnxt2Impl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(Legomindstormnxt2Connector.class);
	private MindstormsControl mindstormControl = new MindstormsControl();


	// Start of user code Legomindstormnxt2connector_constructor
	/**
	 * Constructs a legomindstormnxt2 connector.
	 */
	Legomindstormnxt2Connector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code Legomindstormnxt2occiCreate
	/**
	 * Called when this Legomindstormnxt2 instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.info("occiCreate() called on " + this);
		
		// Try to connect to the mindstorms NXT2 via Bluetooth. 
		// If fail, check the bluetooth pairing on the host machine. 
		mindstormControl.BTconnect(this.getTitle(), macAddress);  
		System.out.println("bluetooth connection to NXT2!");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	// End of user code

	// Start of user code Legomindstormnxt2_occiRetrieve_method
	/**
	 * Called when this Legomindstormnxt2 instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Legomindstormnxt2_occiUpdate_method
	/**
	 * Called when this Legomindstormnxt2 instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Legomindstormnxt2occiDelete_method
	/**
	 * Called when this Legomindstormnxt2 instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		
		// Close the Bluetooth connection
		mindstormControl.BTdisconnect();
	}
	// End of user code

	//
	// Legomindstormnxt2 actions.
	//
	
	public MindstormsControl getMindstormsControl()
	{
		return mindstormControl;
	}
}	
