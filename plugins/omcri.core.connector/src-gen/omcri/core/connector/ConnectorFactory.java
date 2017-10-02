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

/**
 * Connector EFactory for the OCCI extension:
 * - name: omcricore
 * - scheme: http://omcri.org/cloudrobotics/core#
 */
public class ConnectorFactory extends omcricore.impl.OmcricoreFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics/core#
	 * - term: robotlink
	 * - title: Generic robotlink to link resources with a robot
	 */
	@Override
	public omcricore.Robotlink createRobotlink() {
		return new RobotlinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics/core#
	 * - term: robot
	 * - title: Generic robot
	 */
	@Override
	public omcricore.Robot createRobot() {
		return new RobotConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics/core#
	 * - term: connection
	 * - title: Connect/disconnect to robot
	 */
	@Override
	public omcricore.Connection createConnection() {
		return new ConnectionConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics/core#
	 * - term: sensor
	 * - title: Generic sensor
	 */
	@Override
	public omcricore.Sensor createSensor() {
		return new SensorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics/core#
	 * - term: colorsensor
	 * - title: Sensor color detection
	 */
	@Override
	public omcricore.Colorsensor createColorsensor() {
		return new ColorsensorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics/core#
	 * - term: flightactuator
	 * - title: 
	 */
	@Override
	public omcricore.Flightactuator createFlightactuator() {
		return new FlightactuatorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics/core#
	 * - term: touchsensor
	 * - title: Touch detection
	 */
	@Override
	public omcricore.Touchsensor createTouchsensor() {
		return new TouchsensorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics/core#
	 * - term: ultrasonicsensor
	 * - title: Sensor distance detection
	 */
	@Override
	public omcricore.Ultrasonicsensor createUltrasonicsensor() {
		return new UltrasonicsensorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics/core#
	 * - term: actuator
	 * - title: Generic actuator
	 */
	@Override
	public omcricore.Actuator createActuator() {
		return new ActuatorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics/core#
	 * - term: motionactuator
	 * - title: 
	 */
	@Override
	public omcricore.Motionactuator createMotionactuator() {
		return new MotionactuatorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://omcri.org/cloudrobotics/core#
	 * - term: mouthactuator
	 * - title: 
	 */
	@Override
	public omcricore.Mouthactuator createMouthactuator() {
		return new MouthactuatorConnector();
	}

}
