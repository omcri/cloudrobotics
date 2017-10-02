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
 * - term: ultrasonicsensor
 * - title: Sensor distance detection
 */
public class UltrasonicsensorConnector extends omcricore.impl.UltrasonicsensorImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(UltrasonicsensorConnector.class);

	// Start of user code Ultrasonicsensorconnector_constructor
	/**
	 * Constructs a ultrasonicsensor connector.
	 */
	UltrasonicsensorConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	// Start of user code Ultrasonicsensor_Kind_senseDistance_action
	/**
	 * Implement OCCI action:
     * - scheme: http://omcri.org/cloudrobotics/core/ultrasonicsensor/action#
     * - term: sensedistance
     * - title: 
	 */
	@Override
	public void sensedistance()
	{
		LOGGER.debug("Action sensedistance() called on " + this);

		// TODO: Implement how to sensedistance this ultrasonicsensor.
	}
		// End of user code

}	
