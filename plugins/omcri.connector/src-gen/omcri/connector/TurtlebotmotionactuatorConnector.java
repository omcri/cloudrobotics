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
 * Generated at Fri Aug 04 08:01:09 CEST 2017 from platform:/resource/omcri/model/omcri.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri.connector;

import org.eclipse.cmf.occi.core.Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import omcri.connector.TurtlebotConnector;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://omcri.org/cloudrobotics#
 * - term: turtlebotmotionactuator
 * - title: 
 */
public class TurtlebotmotionactuatorConnector extends omcri.impl.TurtlebotmotionactuatorImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(TurtlebotmotionactuatorConnector.class);

	// Start of user code Turtlebotmotionactuatorconnector_constructor
	/**
	 * Constructs a turtlebotmotionactuator connector.
	 */
	TurtlebotmotionactuatorConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
		System.out.println("TurtlebotmotionactuatorConnector ctor");	
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void moveforward() 
	{
		LOGGER.debug("Action move_forward() called on " + this + " during " + this.getDuration());
		
		System.out.println("TurtlebotmotionactuatorConnector moveForward");	

		Entity entity = getEntity();
		TurtlebotConnector turtlebot = null;
		if (entity != null) {
			turtlebot = (TurtlebotConnector)entity;
		}
		
		if (turtlebot != null && turtlebot.isConnected() && turtlebot.hasController()) {
			turtlebot.getTurtlebotControl().move_forward(this.getDuration());
		}
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void movebackward() 
	{
		LOGGER.debug("Action move_backward() called on " + this + " during " + this.getDuration());
		
		System.out.println("TurtlebotmotionactuatorConnector moveBackward");	

		Entity entity = getEntity();
		TurtlebotConnector turtlebot = null;
		if (entity != null) {
			turtlebot = (TurtlebotConnector)entity;
		}
		
		if (turtlebot != null && turtlebot.isConnected() && turtlebot.hasController()) {
			turtlebot.getTurtlebotControl().move_backward(this.getDuration());
		}
	}

	// End of user code
}	
