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
 * - term: colorsensor
 * - title: 
 */
public class ColorsensorConnector extends omcri.impl.ColorsensorImpl
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
     * - scheme: http://omcri.org/cloudrobotics/colorsensor/action#
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
