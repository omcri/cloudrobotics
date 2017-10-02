/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package omcricore.impl;

import omcricore.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OmcricoreFactoryImpl extends EFactoryImpl implements OmcricoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OmcricoreFactory init() {
		try {
			OmcricoreFactory theOmcricoreFactory = (OmcricoreFactory)EPackage.Registry.INSTANCE.getEFactory(OmcricorePackage.eNS_URI);
			if (theOmcricoreFactory != null) {
				return theOmcricoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OmcricoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OmcricoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OmcricorePackage.ROBOTLINK: return createRobotlink();
			case OmcricorePackage.ROBOT: return createRobot();
			case OmcricorePackage.CONNECTION: return createConnection();
			case OmcricorePackage.SENSOR: return createSensor();
			case OmcricorePackage.COLORSENSOR: return createColorsensor();
			case OmcricorePackage.FLIGHTACTUATOR: return createFlightactuator();
			case OmcricorePackage.TOUCHSENSOR: return createTouchsensor();
			case OmcricorePackage.ULTRASONICSENSOR: return createUltrasonicsensor();
			case OmcricorePackage.ACTUATOR: return createActuator();
			case OmcricorePackage.MOTIONACTUATOR: return createMotionactuator();
			case OmcricorePackage.MOUTHACTUATOR: return createMouthactuator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OmcricorePackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case OmcricorePackage.TOUCH:
				return createTouchFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OmcricorePackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case OmcricorePackage.TOUCH:
				return convertTouchToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robotlink createRobotlink() {
		RobotlinkImpl robotlink = new RobotlinkImpl();
		return robotlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colorsensor createColorsensor() {
		ColorsensorImpl colorsensor = new ColorsensorImpl();
		return colorsensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flightactuator createFlightactuator() {
		FlightactuatorImpl flightactuator = new FlightactuatorImpl();
		return flightactuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Touchsensor createTouchsensor() {
		TouchsensorImpl touchsensor = new TouchsensorImpl();
		return touchsensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ultrasonicsensor createUltrasonicsensor() {
		UltrasonicsensorImpl ultrasonicsensor = new UltrasonicsensorImpl();
		return ultrasonicsensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motionactuator createMotionactuator() {
		MotionactuatorImpl motionactuator = new MotionactuatorImpl();
		return motionactuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mouthactuator createMouthactuator() {
		MouthactuatorImpl mouthactuator = new MouthactuatorImpl();
		return mouthactuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		Color result = Color.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Touch createTouchFromString(EDataType eDataType, String initialValue) {
		Touch result = Touch.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTouchToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OmcricorePackage getOmcricorePackage() {
		return (OmcricorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OmcricorePackage getPackage() {
		return OmcricorePackage.eINSTANCE;
	}

} //OmcricoreFactoryImpl
