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

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://omcri.org/cloudrobotics#
 * - term: touchsensor
 * - title: 
 */
public class TouchsensorConnector extends omcri.impl.TouchsensorImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(TouchsensorConnector.class);

	// Start of user code Touchsensorconnector_constructor
	/**
	 * Constructs a touchsensor connector.
	 */
	TouchsensorConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	// Start of user code Touchsensor_Kind_senseTouch_action
	/**
	 * Implement OCCI action:
     * - scheme: http://omcri.org/cloudrobotics/touchsensor/action#
     * - term: sensetouch
     * - title: 
	 */
	@Override
	public void sensetouch()
	{
		LOGGER.debug("Action sensetouch() called on " + this);

		// TODO: Implement how to sensetouch this touchsensor.
	}
		// End of user code

}	
