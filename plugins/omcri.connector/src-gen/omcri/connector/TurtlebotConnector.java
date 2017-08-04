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

import tb.TurtlebotControl;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://omcri.org/cloudrobotics#
 * - term: turtlebot
 * - title: 
 */
public class TurtlebotConnector extends omcri.impl.TurtlebotImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(TurtlebotConnector.class);

	private TurtlebotControl turtlebotControl;

	private boolean isConnected = false;
	// Define if controller is instanced.
	private boolean hasController = false;
	
	/**
	 * Constructs a turtlebot connector.
	 */
	TurtlebotConnector() {
		// LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//
	
	public TurtlebotControl getTurtlebotControl() {
		return turtlebotControl;
	}

	/**
	 * Called when this Turtlebot instance is completely created.
	 */
	@Override
	public void occiCreate() {
		// LOGGER.debug("occiCreate() called on " + this + " for the user " + this.getUser() + " at ip " + this.getIp_address());
		turtlebotControl = new TurtlebotControl(this.getUser(), this.getPassword(), this.getIPAddress());
		hasController = true;
	}

	/**
	 * Called when this Turtlebot instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		// LOGGER.debug("occiRetrieve() called on " + this);
	}

	/**
	 * Called when this Turtlebot instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		// LOGGER.debug("occiUpdate() called on " + this);
	}

	/**
	 * Called when this Turtlebot instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		// LOGGER.debug("occiDelete() called on " + this);
		if (hasController) {
			this.disconnect();
		}
	}

	//
	// Turtlebot actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/turtlebot/turtlebot/action#
     * - term: move_forward
     * - title: The turtlebot move forward
	 */
	public void move_forward() {
		// LOGGER.debug("Action move_forward() called on " + this + " during " + this.getDuration());
		if (isConnected && hasController) {
			// turtlebotControl.move_forward(this.getDuration());
		}
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/turtlebot/turtlebot/action#
     * - term: move_backward
     * - title: The turtlebot move backward
	 */
	public void move_backward() {
		// LOGGER.debug("Action move_backward() called on " + this + " during " + this.getDuration());
		if (isConnected && hasController) {
			// turtlebotControl.move_backward(this.getDuration());
		}
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/turtlebot/turtlebot/action#
     * - term: turn_left
     * - title: The turtlebot turn left
	 */
	public void turn_left() {
		// LOGGER.debug("Action turn_left() called on " + this + " during " + this.getDuration());
		if (isConnected && hasController) {
			// turtlebotControl.turnLeft(this.getDuration());
		}
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/turtlebot/turtlebot/action#
     * - term: turn_right
     * - title: The turtlebot turn right
	 */
	public void turn_right() {
		// LOGGER.debug("Action turn_right() called on " + this + " during " + this.getDuration());
		if (isConnected && hasController) {
			// turtlebotControl.turnRight(this.getDuration());
		}
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/turtlebot/turtlebot/action#
     * - term: stop
     * - title: Force the turtlebot to stop
	 */
	public void stop() {
		// LOGGER.debug("Action stop() called on " + this);
		if (isConnected && hasController) {
			// turtlebotControl.stop(this.getDuration());
		}
	}
	
	
	public void connect() {
		// LOGGER.debug("Connect action to this turtlebot : " + this.getId());
		try {
			if (!isConnected && hasController) {
				turtlebotControl.connect();
				isConnected = true;
			}
		} catch (Exception ex) {
			LOGGER.error("Error while connecting to turtlebot : " + this.getId() + " --> " + ex.getMessage());
			isConnected = false;
		}
	}
	
	
	public void disconnect() {
		// LOGGER.debug("Disconnect from this turtlebot : " + this.getId());
		try {
			if (isConnected && hasController) {
				turtlebotControl.disconnect();
			}
		} catch (Exception ex) {
			LOGGER.error("Error while disconnecting from turtlebot : " + this.getId() + " --> " + ex.getMessage());
		}
		
	}
}	
