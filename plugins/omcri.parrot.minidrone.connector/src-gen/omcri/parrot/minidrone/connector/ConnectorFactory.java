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
 * Generated at Mon Oct 02 10:25:56 CEST 2017 from platform:/resource/omcri.parrot.minidrone/model/parrotminidrone.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri.parrot.minidrone.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: parrotminidrone
 * - scheme: http://omcri.org/cloudrobotics/parrotminidrone#
 */
public class ConnectorFactory extends parrotminidrone.impl.ParrotminidroneFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics/parrotminidrone#
	 * - term: minidrone
	 * - title: 
	 */
	@Override
	public parrotminidrone.Minidrone createMinidrone() {
		return new MinidroneConnector();
	}

}
