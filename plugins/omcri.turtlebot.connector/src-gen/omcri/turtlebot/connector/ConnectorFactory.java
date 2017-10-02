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
 * Generated at Mon Oct 02 10:27:18 CEST 2017 from platform:/resource/omcri.turtlebot/model/turtlebot.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri.turtlebot.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: turtlebot
 * - scheme: http://omcri.org/cloudrobotics/turtlebot#
 */
public class ConnectorFactory extends omcri.turtlebot.impl.TurtlebotFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics/turtlebot#
	 * - term: turtlebot
	 * - title: 
	 */
	@Override
	public omcri.turtlebot.Turtlebot createTurtlebot() {
		return new TurtlebotConnector();
	}

}
