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
 * - term: connection
 * - title: Connect/disconnect to robot
 */
public class ConnectionConnector extends omcricore.impl.ConnectionImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ConnectionConnector.class);

	// Start of user code Connectionconnector_constructor
	/**
	 * Constructs a connection connector.
	 */
	ConnectionConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	// Start of user code Connection_Kind_connect_action
	/**
	 * Implement OCCI action:
     * - scheme: http://omcri.org/cloudrobotics/core/connection/action#
     * - term: connect
     * - title: 
	 */
	@Override
	public void connect()
	{
		LOGGER.debug("Action connect() called on " + this);

		// TODO: Implement how to connect this connection.
	}
		// End of user code

	// Start of user code Connection_Kind_disconnect_action
	/**
	 * Implement OCCI action:
     * - scheme: http://omcri.org/cloudrobotics/core/connection/action#
     * - term: disconnect
     * - title: 
	 */
	@Override
	public void disconnect()
	{
		LOGGER.debug("Action disconnect() called on " + this);

		// TODO: Implement how to disconnect this connection.
	}
		// End of user code

}	
