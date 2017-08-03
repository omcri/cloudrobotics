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
 * Generated at Thu Aug 03 14:00:32 CEST 2017 from platform:/resource/omcri/model/omcri.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: omcri
 * - scheme: http://omcri.org/cloudrobotics#
 */
public class ConnectorFactory extends omcri.impl.OmcriFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics#
	 * - term: robot
	 * - title: 
	 */
	@Override
	public omcri.Robot createRobot() {
		return new RobotConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics#
	 * - term: legomindstormnxt2
	 * - title: 
	 */
	@Override
	public omcri.Legomindstormnxt2 createLegomindstormnxt2() {
		return new Legomindstormnxt2Connector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics#
	 * - term: ardrone
	 * - title: 
	 */
	@Override
	public omcri.Ardrone createArdrone() {
		return new ArdroneConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics#
	 * - term: turtlebot
	 * - title: 
	 */
	@Override
	public omcri.Turtlebot createTurtlebot() {
		return new TurtlebotConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics#
	 * - term: actuator
	 * - title: 
	 */
	@Override
	public omcri.Actuator createActuator() {
		return new ActuatorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics#
	 * - term: touchsensor
	 * - title: 
	 */
	@Override
	public omcri.Touchsensor createTouchsensor() {
		return new TouchsensorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics#
	 * - term: motionactuator
	 * - title: 
	 */
	@Override
	public omcri.Motionactuator createMotionactuator() {
		return new MotionactuatorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics#
	 * - term: sensor
	 * - title: 
	 */
	@Override
	public omcri.Sensor createSensor() {
		return new SensorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics#
	 * - term: colorsensor
	 * - title: 
	 */
	@Override
	public omcri.Colorsensor createColorsensor() {
		return new ColorsensorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics#
	 * - term: ultrasonicsensor
	 * - title: 
	 */
	@Override
	public omcri.Ultrasonicsensor createUltrasonicsensor() {
		return new UltrasonicsensorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics#
	 * - term: mouthactuator
	 * - title: 
	 */
	@Override
	public omcri.Mouthactuator createMouthactuator() {
		return new MouthactuatorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics#
	 * - term: flightactuator
	 * - title: 
	 */
	@Override
	public omcri.Flightactuator createFlightactuator() {
		return new FlightactuatorConnector();
	}

}
