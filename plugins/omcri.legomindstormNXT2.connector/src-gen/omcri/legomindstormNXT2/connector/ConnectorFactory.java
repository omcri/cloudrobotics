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
 * Generated at Mon Oct 02 10:20:37 CEST 2017 from platform:/resource/omcri.legomindstormNXT2/model/legomindstormnxt2.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri.legomindstormNXT2.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: legomindstormnxt2
 * - scheme: http://omcri.org/cloudrobotics/mindstormnxt#
 */
public class ConnectorFactory extends omcri.legomindstormnxt2.impl.Legomindstormnxt2FactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics/mindstormnxt#
	 * - term: legomindstormnxt2
	 * - title: 
	 */
	@Override
	public omcri.legomindstormnxt2.Legomindstormnxt2 createLegomindstormnxt2() {
		return new Legomindstormnxt2Connector();
	}

}
