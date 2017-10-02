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
 * Generated at Mon Oct 02 10:23:42 CEST 2017 from platform:/resource/omcri.parrot.ardrone/model/parrotardrone.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri.parrot.ardrone.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: parrotardrone
 * - scheme: http://omcri.org/cloudrobotics/parrotardrone#
 */
public class ConnectorFactory extends parrotardrone.impl.ParrotardroneFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics/parrotardrone#
	 * - term: ardrone
	 * - title: 
	 */
	@Override
	public parrotardrone.Ardrone createArdrone() {
		return new ArdroneConnector();
	}

}
