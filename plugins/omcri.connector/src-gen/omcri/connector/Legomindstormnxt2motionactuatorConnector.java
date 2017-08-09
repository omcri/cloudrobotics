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

import main.omcri.mindstorms.MindstormsControl;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://omcri.org/cloudrobotics#
 * - term: legomindstormnxt2motionactuator
 * - title: 
 */
public class Legomindstormnxt2motionactuatorConnector extends omcri.impl.Legomindstormnxt2motionactuatorImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(Legomindstormnxt2motionactuatorConnector.class);

	// Start of user code Legomindstormnxt2motionactuatorconnector_constructor
	/**
	 * Constructs a legomindstormnxt2motionactuator connector.
	 */
	Legomindstormnxt2motionactuatorConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	
	
	/**
	 * Move forward the NXT2 robot during n milliseconds specified by the duration attribute.
	 */
	public void moveforward() 
	{
		LOGGER.debug("Action move_forward() called on " + this + " during " + this.getDuration());	

		Entity entity = getEntity();
		Legomindstormnxt2Connector nxt2Mindstorms = null;
		if (entity != null) {
			nxt2Mindstorms = (Legomindstormnxt2Connector)entity;
		}
		
		if (nxt2Mindstorms != null) {
			nxt2Mindstorms.getMindstormsControl().move_forward(this.getDuration());
			System.out.println("The mindstorms must move forward during " + this.getDuration() + "ms");				
		}
	}

	
	/**
	 * Move backward the NXT2 robot during n milliseconds specified by the duration attribute.
	 */
	public void movebackward() 
	{
		LOGGER.debug("Action move_backward() called on " + this + " during " + this.getDuration());	

		Entity entity = getEntity();
		Legomindstormnxt2Connector nxt2Mindstorms = null;
		if (entity != null) {
			nxt2Mindstorms = (Legomindstormnxt2Connector)entity;
		}
		
		if (nxt2Mindstorms != null) {
			nxt2Mindstorms.getMindstormsControl().move_backward(this.getDuration());
		}
	}
	
	/**
	 * Make turn left the NXT2 to X degrees specified by the angle attribute. 
	 */
	public void turnleft() 
	{
		LOGGER.debug("Action turnleft() called on " + this + " to " + this.getAngle());	

		Entity entity = getEntity();
		Legomindstormnxt2Connector nxt2Mindstorms = null;
		if (entity != null) {
			nxt2Mindstorms = (Legomindstormnxt2Connector)entity;
		}
		
		if (nxt2Mindstorms != null) {
			nxt2Mindstorms.getMindstormsControl().turnLeft(this.getAngle());
		}
	}
	
	/**
	 * Make turn right the NXT2 to X degrees specified by the angle attribute. 
	 */
	public void turnright() 
	{
		LOGGER.debug("Action turnright() called on " + this + " to " + this.getAngle());	

		Entity entity = getEntity();
		Legomindstormnxt2Connector nxt2Mindstorms = null;
		if (entity != null) {
			nxt2Mindstorms = (Legomindstormnxt2Connector)entity;
		}
		
		if (nxt2Mindstorms != null) {
			nxt2Mindstorms.getMindstormsControl().turnRight(this.getAngle());
		}
	}
	
	
	// End of user code
}	
