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

import omcricore.Actuator;
import omcricore.Color;
import omcricore.Colorsensor;
import omcricore.Connection;
import omcricore.Flightactuator;
import omcricore.Motionactuator;
import omcricore.Mouthactuator;
import omcricore.OmcricoreFactory;
import omcricore.OmcricorePackage;
import omcricore.Robot;
import omcricore.Robotlink;
import omcricore.Sensor;
import omcricore.Touch;
import omcricore.Touchsensor;
import omcricore.Ultrasonicsensor;

import omcricore.util.OmcricoreValidator;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OmcricorePackageImpl extends EPackageImpl implements OmcricorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorsensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flightactuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchsensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ultrasonicsensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motionactuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mouthactuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum touchEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see omcricore.OmcricorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OmcricorePackageImpl() {
		super(eNS_URI, OmcricoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OmcricorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OmcricorePackage init() {
		if (isInited) return (OmcricorePackage)EPackage.Registry.INSTANCE.getEPackage(OmcricorePackage.eNS_URI);

		// Obtain or create and register package
		OmcricorePackageImpl theOmcricorePackage = (OmcricorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OmcricorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OmcricorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOmcricorePackage.createPackageContents();

		// Initialize created meta-data
		theOmcricorePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOmcricorePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return OmcricoreValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOmcricorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OmcricorePackage.eNS_URI, theOmcricorePackage);
		return theOmcricorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobotlink() {
		return robotlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobot() {
		return robotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_TimeOut() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnection__Connect() {
		return connectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnection__Disconnect() {
		return connectionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorsensor() {
		return colorsensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorsensor_Color() {
		return (EAttribute)colorsensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorsensor_Light() {
		return (EAttribute)colorsensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorsensor_Darkness() {
		return (EAttribute)colorsensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorsensor_ColorLamp() {
		return (EAttribute)colorsensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getColorsensor__Sensecolor() {
		return colorsensorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlightactuator() {
		return flightactuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightactuator_HorizontalTilt() {
		return (EAttribute)flightactuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightactuator_VerticalTilt() {
		return (EAttribute)flightactuatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightactuator_HorizontalSpeed() {
		return (EAttribute)flightactuatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlightactuator_VerticalSpeed() {
		return (EAttribute)flightactuatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFlightactuator__Move() {
		return flightactuatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFlightactuator__Land() {
		return flightactuatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFlightactuator__Takeoff() {
		return flightactuatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchsensor() {
		return touchsensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchsensor_Touch() {
		return (EAttribute)touchsensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTouchsensor__Sensetouch() {
		return touchsensorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUltrasonicsensor() {
		return ultrasonicsensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUltrasonicsensor_Distance() {
		return (EAttribute)ultrasonicsensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUltrasonicsensor__Sensedistance() {
		return ultrasonicsensorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotionactuator() {
		return motionactuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotionactuator_Angle() {
		return (EAttribute)motionactuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotionactuator_Speed() {
		return (EAttribute)motionactuatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotionactuator_Duration() {
		return (EAttribute)motionactuatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotionactuator__Moveforward() {
		return motionactuatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotionactuator__Movebackward() {
		return motionactuatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotionactuator__Turnright() {
		return motionactuatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotionactuator__Turnleft() {
		return motionactuatorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotionactuator__Stop() {
		return motionactuatorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMouthactuator() {
		return mouthactuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMouthactuator__Openmouth() {
		return mouthactuatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMouthactuator__Closemouth() {
		return mouthactuatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTouch() {
		return touchEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OmcricoreFactory getOmcricoreFactory() {
		return (OmcricoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		robotlinkEClass = createEClass(ROBOTLINK);

		robotEClass = createEClass(ROBOT);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__TIME_OUT);
		createEOperation(connectionEClass, CONNECTION___CONNECT);
		createEOperation(connectionEClass, CONNECTION___DISCONNECT);

		sensorEClass = createEClass(SENSOR);

		colorsensorEClass = createEClass(COLORSENSOR);
		createEAttribute(colorsensorEClass, COLORSENSOR__COLOR);
		createEAttribute(colorsensorEClass, COLORSENSOR__LIGHT);
		createEAttribute(colorsensorEClass, COLORSENSOR__DARKNESS);
		createEAttribute(colorsensorEClass, COLORSENSOR__COLOR_LAMP);
		createEOperation(colorsensorEClass, COLORSENSOR___SENSECOLOR);

		flightactuatorEClass = createEClass(FLIGHTACTUATOR);
		createEAttribute(flightactuatorEClass, FLIGHTACTUATOR__HORIZONTAL_TILT);
		createEAttribute(flightactuatorEClass, FLIGHTACTUATOR__VERTICAL_TILT);
		createEAttribute(flightactuatorEClass, FLIGHTACTUATOR__HORIZONTAL_SPEED);
		createEAttribute(flightactuatorEClass, FLIGHTACTUATOR__VERTICAL_SPEED);
		createEOperation(flightactuatorEClass, FLIGHTACTUATOR___MOVE);
		createEOperation(flightactuatorEClass, FLIGHTACTUATOR___LAND);
		createEOperation(flightactuatorEClass, FLIGHTACTUATOR___TAKEOFF);

		touchsensorEClass = createEClass(TOUCHSENSOR);
		createEAttribute(touchsensorEClass, TOUCHSENSOR__TOUCH);
		createEOperation(touchsensorEClass, TOUCHSENSOR___SENSETOUCH);

		ultrasonicsensorEClass = createEClass(ULTRASONICSENSOR);
		createEAttribute(ultrasonicsensorEClass, ULTRASONICSENSOR__DISTANCE);
		createEOperation(ultrasonicsensorEClass, ULTRASONICSENSOR___SENSEDISTANCE);

		actuatorEClass = createEClass(ACTUATOR);

		motionactuatorEClass = createEClass(MOTIONACTUATOR);
		createEAttribute(motionactuatorEClass, MOTIONACTUATOR__ANGLE);
		createEAttribute(motionactuatorEClass, MOTIONACTUATOR__SPEED);
		createEAttribute(motionactuatorEClass, MOTIONACTUATOR__DURATION);
		createEOperation(motionactuatorEClass, MOTIONACTUATOR___MOVEFORWARD);
		createEOperation(motionactuatorEClass, MOTIONACTUATOR___MOVEBACKWARD);
		createEOperation(motionactuatorEClass, MOTIONACTUATOR___TURNRIGHT);
		createEOperation(motionactuatorEClass, MOTIONACTUATOR___TURNLEFT);
		createEOperation(motionactuatorEClass, MOTIONACTUATOR___STOP);

		mouthactuatorEClass = createEClass(MOUTHACTUATOR);
		createEOperation(mouthactuatorEClass, MOUTHACTUATOR___OPENMOUTH);
		createEOperation(mouthactuatorEClass, MOUTHACTUATOR___CLOSEMOUTH);

		// Create enums
		colorEEnum = createEEnum(COLOR);
		touchEEnum = createEEnum(TOUCH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		robotlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		robotEClass.getESuperTypes().add(theOCCIPackage.getResource());
		connectionEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		sensorEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		colorsensorEClass.getESuperTypes().add(this.getSensor());
		colorsensorEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		flightactuatorEClass.getESuperTypes().add(this.getActuator());
		flightactuatorEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		touchsensorEClass.getESuperTypes().add(this.getSensor());
		touchsensorEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ultrasonicsensorEClass.getESuperTypes().add(this.getSensor());
		ultrasonicsensorEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		actuatorEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		motionactuatorEClass.getESuperTypes().add(this.getActuator());
		motionactuatorEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		mouthactuatorEClass.getESuperTypes().add(this.getActuator());
		mouthactuatorEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(robotlinkEClass, Robotlink.class, "Robotlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_TimeOut(), theOCCIPackage.getInteger(), "timeOut", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getConnection__Connect(), null, "connect", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getConnection__Disconnect(), null, "disconnect", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(colorsensorEClass, Colorsensor.class, "Colorsensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorsensor_Color(), this.getColor(), "color", null, 0, 1, Colorsensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorsensor_Light(), theOCCIPackage.getInteger(), "light", null, 0, 1, Colorsensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorsensor_Darkness(), theOCCIPackage.getInteger(), "darkness", null, 0, 1, Colorsensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorsensor_ColorLamp(), this.getColor(), "colorLamp", null, 0, 1, Colorsensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getColorsensor__Sensecolor(), null, "sensecolor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(flightactuatorEClass, Flightactuator.class, "Flightactuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlightactuator_HorizontalTilt(), theOCCIPackage.getInteger(), "horizontalTilt", null, 0, 1, Flightactuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightactuator_VerticalTilt(), theOCCIPackage.getInteger(), "verticalTilt", null, 0, 1, Flightactuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightactuator_HorizontalSpeed(), theOCCIPackage.getInteger(), "horizontalSpeed", null, 0, 1, Flightactuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightactuator_VerticalSpeed(), theOCCIPackage.getInteger(), "verticalSpeed", null, 0, 1, Flightactuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFlightactuator__Move(), null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFlightactuator__Land(), null, "land", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFlightactuator__Takeoff(), null, "takeoff", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(touchsensorEClass, Touchsensor.class, "Touchsensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTouchsensor_Touch(), this.getColor(), "touch", null, 0, 1, Touchsensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTouchsensor__Sensetouch(), null, "sensetouch", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ultrasonicsensorEClass, Ultrasonicsensor.class, "Ultrasonicsensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUltrasonicsensor_Distance(), theOCCIPackage.getInteger(), "distance", null, 0, 1, Ultrasonicsensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUltrasonicsensor__Sensedistance(), null, "sensedistance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(motionactuatorEClass, Motionactuator.class, "Motionactuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotionactuator_Angle(), theOCCIPackage.getInteger(), "angle", "45", 0, 1, Motionactuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotionactuator_Speed(), theOCCIPackage.getInteger(), "speed", "100", 0, 1, Motionactuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotionactuator_Duration(), theOCCIPackage.getInteger(), "duration", "1000", 0, 1, Motionactuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMotionactuator__Moveforward(), null, "moveforward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotionactuator__Movebackward(), null, "movebackward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotionactuator__Turnright(), null, "turnright", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotionactuator__Turnleft(), null, "turnleft", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotionactuator__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mouthactuatorEClass, Mouthactuator.class, "Mouthactuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMouthactuator__Openmouth(), null, "openmouth", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMouthactuator__Closemouth(), null, "closemouth", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.WHITE);
		addEEnumLiteral(colorEEnum, Color.BLACK);
		addEEnumLiteral(colorEEnum, Color.BLUE);
		addEEnumLiteral(colorEEnum, Color.YELLOW);
		addEEnumLiteral(colorEEnum, Color.RED);
		addEEnumLiteral(colorEEnum, Color.GREEN);

		initEEnum(touchEEnum, Touch.class, "Touch");
		addEEnumLiteral(touchEEnum, Touch.PRESSED);
		addEEnumLiteral(touchEEnum, Touch.RELEASED);
		addEEnumLiteral(touchEEnum, Touch.HIT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (robotlinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetConstraint"
		   });	
		addAnnotation
		  (connectionEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (sensorEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (actuatorEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "occi", "http://schemas.ogf.org/occi/core/ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (robotlinkEClass, 
		   source, 
		   new String[] {
			 "targetConstraint", "self.target.oclIsKindOf(omcricore::Robot)"
		   });	
		addAnnotation
		  (connectionEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(omcricore::Robot)"
		   });	
		addAnnotation
		  (sensorEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(omcricore::Robot)"
		   });	
		addAnnotation
		  (actuatorEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(omcricore::Robot)"
		   });
	}

} //OmcricorePackageImpl
