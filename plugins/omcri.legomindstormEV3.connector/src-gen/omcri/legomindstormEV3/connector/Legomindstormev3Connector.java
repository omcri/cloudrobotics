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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://omcri.org/cloudrobotics/mindstormev3#
 * - term: legomindstormev3
 * - title: 
 */
public class Legomindstormev3Connector extends omcri.legomindstormev3.impl.Legomindstormev3Impl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(Legomindstormev3Connector.class);

	// Start of user code Legomindstormev3connector_constructor
	/**
	 * Constructs a legomindstormev3 connector.
	 */
	Legomindstormev3Connector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code Legomindstormev3occiCreate
	/**
	 * Called when this Legomindstormev3 instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Legomindstormev3_occiRetrieve_method
	/**
	 * Called when this Legomindstormev3 instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Legomindstormev3_occiUpdate_method
	/**
	 * Called when this Legomindstormev3 instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Legomindstormev3occiDelete_method
	/**
	 * Called when this Legomindstormev3 instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Legomindstormev3 actions.
	//
}	
