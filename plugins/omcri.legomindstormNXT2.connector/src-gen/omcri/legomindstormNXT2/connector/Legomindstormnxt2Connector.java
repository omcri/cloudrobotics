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
 * Generated at Mon Oct 02 10:20:37 CEST 2017 from platform:/resource/omcri.legomindstormNXT2/model/legomindstormnxt2.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri.legomindstormNXT2.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import omcri.core.IRobotController;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://omcri.org/cloudrobotics/mindstormnxt# - term: legomindstormnxt2 -
 * title:
 */
public class Legomindstormnxt2Connector extends omcri.legomindstormnxt2.impl.Legomindstormnxt2Impl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(Legomindstormnxt2Connector.class);
	// private MindstormsControl mindstormControl = new MindstormsControl();
	private IRobotController robotController = null;

	
	// Start of user code Legomindstormnxt2connector_constructor
	/**
	 * Constructs a legomindstormnxt2 connector.
	 */
	Legomindstormnxt2Connector() {
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
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);
		// Instanciate Mindstorm controller.
		robotController = new MindstormNXTMotionController(this.getTitle(), macAddress);
		
		// Try to connect to the mindstorms NXT2 via Bluetooth. 
		// If fail, check the bluetooth pairing on the host machine.
		// TODO : Use this on mixin connection --> connect() method, if no mixin connection is done here by default + check connection state.
		// mindstormControl.BTconnect(this.getTitle(), macAddress);  
		if (this.getTitle() != null && macAddress != null) {
			LOGGER.info("bluetooth connection to NXT2!");
			try {
				robotController.connect();
			} catch (Exception ex) {
				LOGGER.error("Cant connect to lego mindstorm for name : " + this.getTitle() + ", macAddress: " + macAddress);
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	// End of user code

	// Start of user code Legomindstormnxt2_occiRetrieve_method
	/**
	 * Called when this Legomindstormnxt2 instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Legomindstormnxt2_occiUpdate_method
	/**
	 * Called when this Legomindstormnxt2 instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Legomindstormnxt2occiDelete_method
	/**
	 * Called when this Legomindstormnxt2 instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
		// Close the Bluetooth connection
		// TODO : if mixin connection --> disconnect() called on mixin, if none use this :
		// TODO : check connection state, if on mixin connection the connection state must be defined.
		try {
			robotController.disconnect();
		} catch (Exception ex) {
			ex.printStackTrace();
			LOGGER.error(ex.getMessage());
		}
		// mindstormControl.BTdisconnect();
	}
	// End of user code

	@Override
	public IRobotController getRobotController() {
		return robotController;
	}
	
	
	//
	// Legomindstormnxt2 actions.
	//
}
