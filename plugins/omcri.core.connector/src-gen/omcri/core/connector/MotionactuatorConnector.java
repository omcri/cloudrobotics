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

import omcri.core.IMotionController;
import omcri.core.IRobotController;
import omcricore.Robot;
import omcricore.impl.RobotImpl;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://omcri.org/cloudrobotics/core# - term: motionactuator - title:
 */
public class MotionactuatorConnector extends omcricore.impl.MotionactuatorImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(MotionactuatorConnector.class);

	// Start of user code Motionactuatorconnector_constructor
	/**
	 * Constructs a motionactuator connector.
	 */
	MotionactuatorConnector() {
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}

	// End of user code
	// Start of user code Motionactuator_Kind_moveForward_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://omcri.org/cloudrobotics/core/motionactuator/action# - term:
	 * moveforward - title:
	 */
	@Override
	public void moveforward() {
		LOGGER.debug("Action moveforward() called on " + this);
		IMotionController iMotion = getController();
		if (iMotion != null) {
			try {
				preAction(iMotion);
				iMotion.moveforward();
			} catch (Exception ex) {
				LOGGER.error("Cant move forward on : " + this.getEntity());
			}
		}
	}
	// End of user code

	// Start of user code Motionactuator_Kind_moveBackward_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://omcri.org/cloudrobotics/core/motionactuator/action# - term:
	 * movebackward - title:
	 */
	@Override
	public void movebackward() {
		LOGGER.debug("Action movebackward() called on " + this);
		IMotionController iMotion = getController();
		if (iMotion != null) {
			try {
				preAction(iMotion);
				iMotion.movebackward();
			} catch (Exception ex) {
				LOGGER.error("Cant move forward on : " + this.getEntity());
			}
		}

	}
	// End of user code

	// Start of user code Motionactuator_Kind_turnRight_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://omcri.org/cloudrobotics/core/motionactuator/action# - term: turnright
	 * - title:
	 */
	@Override
	public void turnright() {
		LOGGER.debug("Action turnright() called on " + this);
		IMotionController iMotion = getController();
		if (iMotion != null) {
			try {
				preAction(iMotion);
				iMotion.turnright();
			} catch (Exception ex) {
				LOGGER.error("Cant move forward on : " + this.getEntity());
			}
		}
	}
	// End of user code

	// Start of user code Motionactuator_Kind_turnLeft_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://omcri.org/cloudrobotics/core/motionactuator/action# - term: turnleft -
	 * title:
	 */
	@Override
	public void turnleft() {
		LOGGER.debug("Action turnleft() called on " + this);
		IMotionController iMotion = getController();
		if (iMotion != null) {
			try {
				preAction(iMotion);
				iMotion.turnleft();
			} catch (Exception ex) {
				LOGGER.error("Cant move forward on : " + this.getEntity());
			}
		}
	}
	// End of user code

	// Start of user code Motionactuator_Kind_stop_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://omcri.org/cloudrobotics/core/motionactuator/action# - term: stop -
	 * title:
	 */
	@Override
	public void stop() {
		LOGGER.debug("Action stop() called on " + this);

		IMotionController iMotion = getController();
		if (iMotion != null) {
			try {
				preAction(iMotion);
				iMotion.stop();
			} catch (Exception ex) {
				LOGGER.error("Cant move forward on : " + this.getEntity());
			}
		}
	}
	// End of user code

	// Get from entity the robot controller.
	/**
	 * Get from entity the motion controller.
	 * 
	 * @return
	 */
	public IMotionController getController() {
		IRobotController iRobotController = null;
		IMotionController iMotion = null;
		Entity entity = getEntity();
		if (entity == null) {
			LOGGER.warn("The mixin Motionactuator is not applied to an entity.");
		} else {
			if (entity instanceof RobotImpl) {
				RobotImpl robot = (RobotImpl) entity;
				iRobotController = robot.getRobotController();
				if (iRobotController instanceof IMotionController) {
					LOGGER.debug("Motion controller found for this robot : " + entity.getTitle());
					iMotion = (IMotionController) iRobotController;
				} else {
					LOGGER.error(
							"There is a controller but this is not the good implementation for this robot instance : "
									+ entity.getTitle() + ", id:" + entity.getId());
				}

			} else {
				LOGGER.warn("The entity is not a robot !!");
				LOGGER.warn("No motion controller found for the entity : " + entity.getTitle() + "-->>" + ", id: "
						+ entity.getId() + " , location: " + entity.getLocation());
			}
		}

		return iMotion;
	}

	/**
	 * 
	 * @param iMotion
	 * @return
	 */
	private boolean preAction(IMotionController iMotion) throws Exception {
		if (!iMotion.isConnected()) {
			// Try to connect and do the task moveForward.
			try {
				iMotion.connect();
			} catch (Exception ex) {
				// TODO : throws exception on model as well on model@runtime.
				LOGGER.error("Cannot connect to mindstorm : " + ex.getMessage() + " , exception: "
						+ ex.getClass().getName());
				throw ex;
			}
		}

		// Convert String to int.

		if (angle == null) {
			angle = 45;
		}
		if (duration == null) {
			duration = 1000;
		}
		if (speed == null) {
			speed = 100;
		}
		iMotion.setAngle(angle);
		iMotion.setDuration(duration);
		iMotion.setSpeed(speed);

		return false;
	}

}
