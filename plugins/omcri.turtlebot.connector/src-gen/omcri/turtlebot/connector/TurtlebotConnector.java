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
 * Generated at Mon Oct 02 10:27:18 CEST 2017 from platform:/resource/omcri.turtlebot/model/turtlebot.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri.turtlebot.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import omcri.core.IRobotController;
import tb.TurtlebotControl;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://omcri.org/cloudrobotics/turtlebot# - term: turtlebot - title:
 */
public class TurtlebotConnector extends omcri.turtlebot.impl.TurtlebotImpl {
	
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(TurtlebotConnector.class);

	private IRobotController robotController = null;
	
	
	private boolean isConnected = false;
	// Define if controller is instanced.
	private boolean hasController = false;
	
	public boolean isConnected()
	{ 
		return isConnected;
	}
	
	public boolean hasController()
	{ 
		return hasController;
	}
	
	// Start of user code Turtlebotconnector_constructor
	/**
	 * Constructs a turtlebot connector.
	 */
	TurtlebotConnector() {
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//

	// Start of user code TurtlebotocciCreate
	/**
	 * Called when this Turtlebot instance is completely created.
	 */
	@Override
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);
		if (robotController == null) {
			robotController = new TurtlebotMotionController(this.getUser(), this.getPassword(), this.getIpaddress());
		} else {
			((TurtlebotMotionController) robotController).setHostAddress(getIpaddress());
			((TurtlebotMotionController) robotController).setUsername(getUser());
			((TurtlebotMotionController) robotController).setPassword(getPassword());
		}
		hasController = true;
		connect();
	}
	// End of user code

	// Start of user code Turtlebot_occiRetrieve_method
	/**
	 * Called when this Turtlebot instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Turtlebot_occiUpdate_method
	/**
	 * Called when this Turtlebot instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);
		if (robotController != null) {
			((TurtlebotMotionController) robotController).setHostAddress(getIpaddress());
			((TurtlebotMotionController) robotController).setUsername(getUser());
			((TurtlebotMotionController) robotController).setPassword(getPassword());
		}
	}
	// End of user code

	// Start of user code TurtlebotocciDelete_method
	/**
	 * Called when this Turtlebot instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
		if (hasController) {
			this.disconnect();
		}
	}
	// End of user code

	//
	// Turtlebot actions.
	//
	// TODO : Manage connection within mixin connection.
	/**
	 * Connect to turtlebot before motion actions.
	 */
	public void connect() {
		LOGGER.info("Connect to this turtlebot : " + this.getId());
		try {
			if (!isConnected && hasController) {
				robotController.connect();
				isConnected = true;
			}
		} catch (Exception ex) {
			LOGGER.error("Error while connecting to turtlebot : " + this.getId() + " --> " + ex.getMessage());
			isConnected = false;
		}
	}
	
	/**
	 * Disconnect from this turtlebot.
	 */
	public void disconnect() {
		// LOGGER.debug("Disconnect from this turtlebot : " + this.getId());
		try {
			if (isConnected && hasController) {
				robotController.disconnect();
			}
		} catch (Exception ex) {
			LOGGER.error("Error while disconnecting from turtlebot : " + this.getId() + " --> " + ex.getMessage());
		}
		
	}
	
	@Override
	public IRobotController getRobotController() {
		return robotController;
	}
	
}
