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
 * - term: mouthactuator
 * - title: 
 */
public class MouthactuatorConnector extends omcri.impl.MouthactuatorImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(MouthactuatorConnector.class);

	// Start of user code Mouthactuatorconnector_constructor
	/**
	 * Constructs a mouthactuator connector.
	 */
	MouthactuatorConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	// Start of user code Mouthactuator_Kind_openMouth_action
	/**
	 * Implement OCCI action:
     * - scheme: http://omcri.org/cloudrobotics/mouthactuator/action#
     * - term: openmouth
     * - title: 
	 */
	@Override
	public void openmouth()
	{
		LOGGER.debug("Action openmouth() called on " + this);

		// TODO: Implement how to openmouth this mouthactuator.
	}
		// End of user code

	// Start of user code Mouthactuator_Kind_closeMouth_action
	/**
	 * Implement OCCI action:
     * - scheme: http://omcri.org/cloudrobotics/mouthactuator/action#
     * - term: closemouth
     * - title: 
	 */
	@Override
	public void closemouth()
	{
		LOGGER.debug("Action closemouth() called on " + this);

		// TODO: Implement how to closemouth this mouthactuator.
	}
		// End of user code

}	
