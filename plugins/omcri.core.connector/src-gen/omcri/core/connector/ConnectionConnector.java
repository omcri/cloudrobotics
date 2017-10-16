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
 * Generated at Fri Sep 29 17:15:14 CEST 2017 from platform:/resource/omcri.core/model/omcricore.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri.core.connector;

import org.eclipse.cmf.occi.core.Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import omcri.core.IRobotController;
import omcricore.impl.RobotImpl;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://omcri.org/cloudrobotics/core# - term: connection - title:
 * Connect/disconnect to robot
 */
public class ConnectionConnector extends omcricore.impl.ConnectionImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ConnectionConnector.class);

	// Start of user code Connectionconnector_constructor
	/**
	 * Constructs a connection connector.
	 */
	ConnectionConnector() {
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}

	// End of user code
	// Start of user code Connection_Kind_connect_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://omcri.org/cloudrobotics/core/connection/action# - term: connect -
	 * title:
	 */
	@Override
	public void connect() {
		LOGGER.debug("Action connect() called on " + this);
		try {
			IRobotController iRobotController = getRobotController();
			iRobotController.connect();
		} catch (Exception ex) {
			LOGGER.error(ex.getMessage());
		}
	}
	// End of user code

	// Start of user code Connection_Kind_disconnect_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://omcri.org/cloudrobotics/core/connection/action# - term: disconnect -
	 * title:
	 */
	@Override
	public void disconnect() {
		LOGGER.debug("Action disconnect() called on " + this);
		try {
			IRobotController iRobotController = getRobotController();
			iRobotController.disconnect();
		} catch (Exception ex) {
			LOGGER.error(ex.getMessage());
		}
		
	}
	// End of user code

	/**
	 * 
	 * @return a robot controller interface.
	 * @throws ConnectException
	 */
	public IRobotController getRobotController() throws ConnectException {
		IRobotController iRobotController = null;
		Entity entity = getEntity();
		if (entity == null) {
			LOGGER.warn("The mixin Connection is not applied to an entity.");
			throw new ConnectException("The mixin Connection is not applied to an entity.");
		} else {
			if (entity instanceof RobotImpl) {
				RobotImpl robot = (RobotImpl) entity;
				iRobotController = robot.getRobotController();
				if (iRobotController == null) {
					LOGGER.warn("no robot controller defined, see interface IRobotController on omcri.core extension.");
					throw new ConnectException("Cannot connect to this robot, no controller defined !");
				}
				LOGGER.debug("Robot controller found for this robot : " + entity.getTitle());
				return iRobotController;
				
			} else {
				LOGGER.warn("The entity is not a robot !!");
				LOGGER.warn("No robot controller found for the entity : " + entity.getTitle() + "-->>" + ", id: "
						+ entity.getId() + " , location: " + entity.getLocation());
				throw new ConnectException("This entity is not a robot, please check your model : " + entity.getTitle() + "-->>" + ", id: "
						+ entity.getId() + " , location: " + entity.getLocation());
			}
			
		}

	}

}
