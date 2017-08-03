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
 * - term: flightactuator
 * - title: 
 */
public class FlightactuatorConnector extends omcri.impl.FlightactuatorImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(FlightactuatorConnector.class);

	// Start of user code Flightactuatorconnector_constructor
	/**
	 * Constructs a flightactuator connector.
	 */
	FlightactuatorConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	// Start of user code Flightactuator_Kind_move_action
	/**
	 * Implement OCCI action:
     * - scheme: http://omcri.org/cloudrobotics/flightactuator/action#
     * - term: move
     * - title: 
	 */
	@Override
	public void move()
	{
		LOGGER.debug("Action move() called on " + this);

		// TODO: Implement how to move this flightactuator.
	}
		// End of user code

	// Start of user code Flightactuator_Kind_land_action
	/**
	 * Implement OCCI action:
     * - scheme: http://omcri.org/cloudrobotics/flightactuator/action#
     * - term: land
     * - title: 
	 */
	@Override
	public void land()
	{
		LOGGER.debug("Action land() called on " + this);

		// TODO: Implement how to land this flightactuator.
	}
		// End of user code

	// Start of user code Flightactuator_Kind_takeOff_action
	/**
	 * Implement OCCI action:
     * - scheme: http://omcri.org/cloudrobotics/flightactuator/action#
     * - term: takeoff
     * - title: 
	 */
	@Override
	public void takeoff()
	{
		LOGGER.debug("Action takeoff() called on " + this);

		// TODO: Implement how to takeoff this flightactuator.
	}
		// End of user code

}	
