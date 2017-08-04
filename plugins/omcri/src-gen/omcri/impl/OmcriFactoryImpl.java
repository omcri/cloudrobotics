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
package omcri.impl;

import omcri.*;

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
public class OmcriFactoryImpl extends EFactoryImpl implements OmcriFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OmcriFactory init() {
		try {
			OmcriFactory theOmcriFactory = (OmcriFactory)EPackage.Registry.INSTANCE.getEFactory(OmcriPackage.eNS_URI);
			if (theOmcriFactory != null) {
				return theOmcriFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OmcriFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OmcriFactoryImpl() {
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
			case OmcriPackage.ROBOT: return createRobot();
			case OmcriPackage.LEGOMINDSTORMNXT2: return createLegomindstormnxt2();
			case OmcriPackage.ARDRONE: return createArdrone();
			case OmcriPackage.TURTLEBOT: return createTurtlebot();
			case OmcriPackage.ACTUATOR: return createActuator();
			case OmcriPackage.TOUCHSENSOR: return createTouchsensor();
			case OmcriPackage.MOTIONACTUATOR: return createMotionactuator();
			case OmcriPackage.SENSOR: return createSensor();
			case OmcriPackage.COLORSENSOR: return createColorsensor();
			case OmcriPackage.ULTRASONICSENSOR: return createUltrasonicsensor();
			case OmcriPackage.MOUTHACTUATOR: return createMouthactuator();
			case OmcriPackage.FLIGHTACTUATOR: return createFlightactuator();
			case OmcriPackage.TURTLEBOTMOTIONACTUATOR: return createTurtlebotmotionactuator();
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR: return createLegomindstormnxt2motionactuator();
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
			case OmcriPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case OmcriPackage.TOUCH:
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
			case OmcriPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case OmcriPackage.TOUCH:
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
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Legomindstormnxt2 createLegomindstormnxt2() {
		Legomindstormnxt2Impl legomindstormnxt2 = new Legomindstormnxt2Impl();
		return legomindstormnxt2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ardrone createArdrone() {
		ArdroneImpl ardrone = new ArdroneImpl();
		return ardrone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turtlebot createTurtlebot() {
		TurtlebotImpl turtlebot = new TurtlebotImpl();
		return turtlebot;
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
	public Touchsensor createTouchsensor() {
		TouchsensorImpl touchsensor = new TouchsensorImpl();
		return touchsensor;
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
	public Ultrasonicsensor createUltrasonicsensor() {
		UltrasonicsensorImpl ultrasonicsensor = new UltrasonicsensorImpl();
		return ultrasonicsensor;
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
	public Flightactuator createFlightactuator() {
		FlightactuatorImpl flightactuator = new FlightactuatorImpl();
		return flightactuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turtlebotmotionactuator createTurtlebotmotionactuator() {
		TurtlebotmotionactuatorImpl turtlebotmotionactuator = new TurtlebotmotionactuatorImpl();
		return turtlebotmotionactuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Legomindstormnxt2motionactuator createLegomindstormnxt2motionactuator() {
		Legomindstormnxt2motionactuatorImpl legomindstormnxt2motionactuator = new Legomindstormnxt2motionactuatorImpl();
		return legomindstormnxt2motionactuator;
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
	public OmcriPackage getOmcriPackage() {
		return (OmcriPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OmcriPackage getPackage() {
		return OmcriPackage.eINSTANCE;
	}

} //OmcriFactoryImpl
