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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://omcri.org/cloudrobotics/core#
 * - term: colorsensor
 * - title: Sensor color detection
 */
public class ColorsensorConnector extends omcricore.impl.ColorsensorImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ColorsensorConnector.class);

	// Start of user code Colorsensorconnector_constructor
	/**
	 * Constructs a colorsensor connector.
	 */
	ColorsensorConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	// Start of user code Colorsensor_Kind_senseColor_action
	/**
	 * Implement OCCI action:
     * - scheme: http://omcri.org/cloudrobotics/core/colorsensor/action#
     * - term: sensecolor
     * - title: 
	 */
	@Override
	public void sensecolor()
	{
		LOGGER.debug("Action sensecolor() called on " + this);

		// TODO: Implement how to sensecolor this colorsensor.
	}
		// End of user code

}	
