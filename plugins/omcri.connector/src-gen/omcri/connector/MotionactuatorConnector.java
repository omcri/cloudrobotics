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
 * Generated at Thu Aug 03 14:00:32 CEST 2017 from platform:/resource/omcri/model/omcri.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://omcri.org/cloudrobotics#
 * - term: motionactuator
 * - title: 
 */
public class MotionactuatorConnector extends omcri.impl.MotionactuatorImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(MotionactuatorConnector.class);

	// Start of user code Motionactuatorconnector_constructor
	/**
	 * Constructs a motionactuator connector.
	 */
	MotionactuatorConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	// Start of user code Motionactuator_Kind_moveForward_action
	/**
	 * Implement OCCI action:
     * - scheme: http://omcri.org/cloudrobotics/motionactuator/action#
     * - term: moveforward
     * - title: 
	 */
	@Override
	public void moveforward()
	{
		LOGGER.debug("Action moveforward() called on " + this);

		// TODO: Implement how to moveforward this motionactuator.
	}
		// End of user code

	// Start of user code Motionactuator_Kind_moveBackward_action
	/**
	 * Implement OCCI action:
     * - scheme: http://omcri.org/cloudrobotics/motionactuator/action#
     * - term: movebackward
     * - title: 
	 */
	@Override
	public void movebackward()
	{
		LOGGER.debug("Action movebackward() called on " + this);

		// TODO: Implement how to movebackward this motionactuator.
	}
		// End of user code

	// Start of user code Motionactuator_Kind_turnRight_action
	/**
	 * Implement OCCI action:
     * - scheme: http://omcri.org/cloudrobotics/motionactuator/action#
     * - term: turnright
     * - title: 
	 */
	@Override
	public void turnright()
	{
		LOGGER.debug("Action turnright() called on " + this);

		// TODO: Implement how to turnright this motionactuator.
	}
		// End of user code

	// Start of user code Motionactuator_Kind_turnLeft_action
	/**
	 * Implement OCCI action:
     * - scheme: http://omcri.org/cloudrobotics/motionactuator/action#
     * - term: turnleft
     * - title: 
	 */
	@Override
	public void turnleft()
	{
		LOGGER.debug("Action turnleft() called on " + this);

		// TODO: Implement how to turnleft this motionactuator.
	}
		// End of user code

	// Start of user code Motionactuator_Kind_stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://omcri.org/cloudrobotics/motionactuator/action#
     * - term: stop
     * - title: 
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);

		// TODO: Implement how to stop this motionactuator.
	}
		// End of user code

}	
