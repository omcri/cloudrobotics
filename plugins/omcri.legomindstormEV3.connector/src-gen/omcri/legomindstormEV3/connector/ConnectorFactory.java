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
 * Generated at Fri Sep 29 17:17:41 CEST 2017 from platform:/resource/omcri.legomindstormEV3/model/legomindstormev3.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri.legomindstormEV3.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: legomindstormev3
 * - scheme: http://omcri.org/cloudrobotics/mindstormev3#
 */
public class ConnectorFactory extends omcri.legomindstormev3.impl.Legomindstormev3FactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics/mindstormev3#
	 * - term: legomindstormev3
	 * - title: 
	 */
	@Override
	public omcri.legomindstormev3.Legomindstormev3 createLegomindstormev3() {
		return new Legomindstormev3Connector();
	}

}
