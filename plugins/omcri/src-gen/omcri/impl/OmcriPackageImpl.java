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

import omcri.Actuator;
import omcri.Ardrone;
import omcri.Color;
import omcri.Colorsensor;
import omcri.Flightactuator;
import omcri.Legomindstormnxt2;
import omcri.Motionactuator;
import omcri.Mouthactuator;
import omcri.OmcriFactory;
import omcri.OmcriPackage;
import omcri.Robot;
import omcri.Sensor;
import omcri.Touch;
import omcri.Touchsensor;
import omcri.Turtlebot;
import omcri.Ultrasonicsensor;

import omcri.util.OmcriValidator;

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
public class OmcriPackageImpl extends EPackageImpl implements OmcriPackage {
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
	private EClass legomindstormnxt2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ardroneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turtlebotEClass = null;

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
	private EClass touchsensorEClass = null;

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
	private EClass ultrasonicsensorEClass = null;

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
	private EClass flightactuatorEClass = null;

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
	 * @see omcri.OmcriPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OmcriPackageImpl() {
		super(eNS_URI, OmcriFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OmcriPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OmcriPackage init() {
		if (isInited) return (OmcriPackage)EPackage.Registry.INSTANCE.getEPackage(OmcriPackage.eNS_URI);

		// Obtain or create and register package
		OmcriPackageImpl theOmcriPackage = (OmcriPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OmcriPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OmcriPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOmcriPackage.createPackageContents();

		// Initialize created meta-data
		theOmcriPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOmcriPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return OmcriValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOmcriPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OmcriPackage.eNS_URI, theOmcriPackage);
		return theOmcriPackage;
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
	public EClass getLegomindstormnxt2() {
		return legomindstormnxt2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegomindstormnxt2_MacAddress() {
		return (EAttribute)legomindstormnxt2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArdrone() {
		return ardroneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArdrone_IPAddress() {
		return (EAttribute)ardroneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurtlebot() {
		return turtlebotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurtlebot_User() {
		return (EAttribute)turtlebotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurtlebot_Password() {
		return (EAttribute)turtlebotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurtlebot_IPAddress() {
		return (EAttribute)turtlebotEClass.getEStructuralFeatures().get(2);
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
	public EOperation getActuator__AppliesConstraint__DiagnosticChain_Map_1() {
		return actuatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActuator__AppliesConstraint__DiagnosticChain_Map() {
		return actuatorEClass.getEOperations().get(1);
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
	public EOperation getTouchsensor__AppliesConstraint__DiagnosticChain_Map_1() {
		return touchsensorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTouchsensor__AppliesConstraint__DiagnosticChain_Map() {
		return touchsensorEClass.getEOperations().get(2);
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
	public EOperation getMotionactuator__AppliesConstraint__DiagnosticChain_Map_1() {
		return motionactuatorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotionactuator__AppliesConstraint__DiagnosticChain_Map() {
		return motionactuatorEClass.getEOperations().get(6);
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
	public EOperation getSensor__AppliesConstraint__DiagnosticChain_Map_1() {
		return sensorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensor__AppliesConstraint__DiagnosticChain_Map() {
		return sensorEClass.getEOperations().get(1);
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
	public EOperation getColorsensor__AppliesConstraint__DiagnosticChain_Map_1() {
		return colorsensorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getColorsensor__AppliesConstraint__DiagnosticChain_Map() {
		return colorsensorEClass.getEOperations().get(2);
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
	public EOperation getUltrasonicsensor__AppliesConstraint__DiagnosticChain_Map_1() {
		return ultrasonicsensorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUltrasonicsensor__AppliesConstraint__DiagnosticChain_Map() {
		return ultrasonicsensorEClass.getEOperations().get(2);
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
	public EOperation getMouthactuator__AppliesConstraint__DiagnosticChain_Map_1() {
		return mouthactuatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMouthactuator__AppliesConstraint__DiagnosticChain_Map() {
		return mouthactuatorEClass.getEOperations().get(3);
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
	public EOperation getFlightactuator__AppliesConstraint__DiagnosticChain_Map_1() {
		return flightactuatorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFlightactuator__AppliesConstraint__DiagnosticChain_Map() {
		return flightactuatorEClass.getEOperations().get(4);
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
	public OmcriFactory getOmcriFactory() {
		return (OmcriFactory)getEFactoryInstance();
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
		robotEClass = createEClass(ROBOT);

		legomindstormnxt2EClass = createEClass(LEGOMINDSTORMNXT2);
		createEAttribute(legomindstormnxt2EClass, LEGOMINDSTORMNXT2__MAC_ADDRESS);

		ardroneEClass = createEClass(ARDRONE);
		createEAttribute(ardroneEClass, ARDRONE__IP_ADDRESS);

		turtlebotEClass = createEClass(TURTLEBOT);
		createEAttribute(turtlebotEClass, TURTLEBOT__USER);
		createEAttribute(turtlebotEClass, TURTLEBOT__PASSWORD);
		createEAttribute(turtlebotEClass, TURTLEBOT__IP_ADDRESS);

		actuatorEClass = createEClass(ACTUATOR);
		createEOperation(actuatorEClass, ACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1);
		createEOperation(actuatorEClass, ACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		touchsensorEClass = createEClass(TOUCHSENSOR);
		createEAttribute(touchsensorEClass, TOUCHSENSOR__TOUCH);
		createEOperation(touchsensorEClass, TOUCHSENSOR___SENSETOUCH);
		createEOperation(touchsensorEClass, TOUCHSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1);
		createEOperation(touchsensorEClass, TOUCHSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		motionactuatorEClass = createEClass(MOTIONACTUATOR);
		createEAttribute(motionactuatorEClass, MOTIONACTUATOR__ANGLE);
		createEAttribute(motionactuatorEClass, MOTIONACTUATOR__SPEED);
		createEAttribute(motionactuatorEClass, MOTIONACTUATOR__DURATION);
		createEOperation(motionactuatorEClass, MOTIONACTUATOR___MOVEFORWARD);
		createEOperation(motionactuatorEClass, MOTIONACTUATOR___MOVEBACKWARD);
		createEOperation(motionactuatorEClass, MOTIONACTUATOR___TURNRIGHT);
		createEOperation(motionactuatorEClass, MOTIONACTUATOR___TURNLEFT);
		createEOperation(motionactuatorEClass, MOTIONACTUATOR___STOP);
		createEOperation(motionactuatorEClass, MOTIONACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1);
		createEOperation(motionactuatorEClass, MOTIONACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		sensorEClass = createEClass(SENSOR);
		createEOperation(sensorEClass, SENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1);
		createEOperation(sensorEClass, SENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		colorsensorEClass = createEClass(COLORSENSOR);
		createEAttribute(colorsensorEClass, COLORSENSOR__COLOR);
		createEAttribute(colorsensorEClass, COLORSENSOR__LIGHT);
		createEAttribute(colorsensorEClass, COLORSENSOR__DARKNESS);
		createEAttribute(colorsensorEClass, COLORSENSOR__COLOR_LAMP);
		createEOperation(colorsensorEClass, COLORSENSOR___SENSECOLOR);
		createEOperation(colorsensorEClass, COLORSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1);
		createEOperation(colorsensorEClass, COLORSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		ultrasonicsensorEClass = createEClass(ULTRASONICSENSOR);
		createEAttribute(ultrasonicsensorEClass, ULTRASONICSENSOR__DISTANCE);
		createEOperation(ultrasonicsensorEClass, ULTRASONICSENSOR___SENSEDISTANCE);
		createEOperation(ultrasonicsensorEClass, ULTRASONICSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1);
		createEOperation(ultrasonicsensorEClass, ULTRASONICSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		mouthactuatorEClass = createEClass(MOUTHACTUATOR);
		createEOperation(mouthactuatorEClass, MOUTHACTUATOR___OPENMOUTH);
		createEOperation(mouthactuatorEClass, MOUTHACTUATOR___CLOSEMOUTH);
		createEOperation(mouthactuatorEClass, MOUTHACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1);
		createEOperation(mouthactuatorEClass, MOUTHACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		flightactuatorEClass = createEClass(FLIGHTACTUATOR);
		createEAttribute(flightactuatorEClass, FLIGHTACTUATOR__HORIZONTAL_TILT);
		createEAttribute(flightactuatorEClass, FLIGHTACTUATOR__VERTICAL_TILT);
		createEAttribute(flightactuatorEClass, FLIGHTACTUATOR__HORIZONTAL_SPEED);
		createEAttribute(flightactuatorEClass, FLIGHTACTUATOR__VERTICAL_SPEED);
		createEOperation(flightactuatorEClass, FLIGHTACTUATOR___MOVE);
		createEOperation(flightactuatorEClass, FLIGHTACTUATOR___LAND);
		createEOperation(flightactuatorEClass, FLIGHTACTUATOR___TAKEOFF);
		createEOperation(flightactuatorEClass, FLIGHTACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1);
		createEOperation(flightactuatorEClass, FLIGHTACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

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
		robotEClass.getESuperTypes().add(theOCCIPackage.getResource());
		legomindstormnxt2EClass.getESuperTypes().add(this.getRobot());
		ardroneEClass.getESuperTypes().add(this.getRobot());
		turtlebotEClass.getESuperTypes().add(this.getRobot());
		actuatorEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		touchsensorEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		touchsensorEClass.getESuperTypes().add(this.getSensor());
		motionactuatorEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		motionactuatorEClass.getESuperTypes().add(this.getActuator());
		sensorEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		colorsensorEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		colorsensorEClass.getESuperTypes().add(this.getSensor());
		ultrasonicsensorEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ultrasonicsensorEClass.getESuperTypes().add(this.getSensor());
		mouthactuatorEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		mouthactuatorEClass.getESuperTypes().add(this.getActuator());
		flightactuatorEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		flightactuatorEClass.getESuperTypes().add(this.getActuator());

		// Initialize classes, features, and operations; add parameters
		initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(legomindstormnxt2EClass, Legomindstormnxt2.class, "Legomindstormnxt2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegomindstormnxt2_MacAddress(), theOCCIPackage.getString(), "macAddress", null, 0, 1, Legomindstormnxt2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ardroneEClass, Ardrone.class, "Ardrone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArdrone_IPAddress(), theOCCIPackage.getString(), "IPAddress", null, 0, 1, Ardrone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turtlebotEClass, Turtlebot.class, "Turtlebot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurtlebot_User(), theOCCIPackage.getString(), "user", null, 0, 1, Turtlebot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurtlebot_Password(), theOCCIPackage.getString(), "password", null, 0, 1, Turtlebot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurtlebot_IPAddress(), theOCCIPackage.getString(), "IPAddress", null, 0, 1, Turtlebot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getActuator__AppliesConstraint__DiagnosticChain_Map_1(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActuator__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(touchsensorEClass, Touchsensor.class, "Touchsensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTouchsensor_Touch(), this.getColor(), "touch", null, 0, 1, Touchsensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTouchsensor__Sensetouch(), null, "sensetouch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTouchsensor__AppliesConstraint__DiagnosticChain_Map_1(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTouchsensor__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(motionactuatorEClass, Motionactuator.class, "Motionactuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotionactuator_Angle(), theOCCIPackage.getInteger(), "angle", "45", 0, 1, Motionactuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotionactuator_Speed(), theOCCIPackage.getInteger(), "speed", "100", 0, 1, Motionactuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotionactuator_Duration(), theOCCIPackage.getInteger(), "duration", "1000", 0, 1, Motionactuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMotionactuator__Moveforward(), null, "moveforward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotionactuator__Movebackward(), null, "movebackward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotionactuator__Turnright(), null, "turnright", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotionactuator__Turnleft(), null, "turnleft", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotionactuator__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMotionactuator__AppliesConstraint__DiagnosticChain_Map_1(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMotionactuator__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSensor__AppliesConstraint__DiagnosticChain_Map_1(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSensor__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(colorsensorEClass, Colorsensor.class, "Colorsensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorsensor_Color(), this.getColor(), "color", null, 0, 1, Colorsensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorsensor_Light(), theOCCIPackage.getInteger(), "light", null, 0, 1, Colorsensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorsensor_Darkness(), theOCCIPackage.getInteger(), "darkness", null, 0, 1, Colorsensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorsensor_ColorLamp(), this.getColor(), "colorLamp", null, 0, 1, Colorsensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getColorsensor__Sensecolor(), null, "sensecolor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getColorsensor__AppliesConstraint__DiagnosticChain_Map_1(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getColorsensor__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ultrasonicsensorEClass, Ultrasonicsensor.class, "Ultrasonicsensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUltrasonicsensor_Distance(), theOCCIPackage.getInteger(), "distance", null, 0, 1, Ultrasonicsensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUltrasonicsensor__Sensedistance(), null, "sensedistance", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUltrasonicsensor__AppliesConstraint__DiagnosticChain_Map_1(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUltrasonicsensor__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mouthactuatorEClass, Mouthactuator.class, "Mouthactuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMouthactuator__Openmouth(), null, "openmouth", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMouthactuator__Closemouth(), null, "closemouth", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMouthactuator__AppliesConstraint__DiagnosticChain_Map_1(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMouthactuator__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(flightactuatorEClass, Flightactuator.class, "Flightactuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlightactuator_HorizontalTilt(), theOCCIPackage.getInteger(), "horizontalTilt", null, 0, 1, Flightactuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightactuator_VerticalTilt(), theOCCIPackage.getInteger(), "verticalTilt", null, 0, 1, Flightactuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightactuator_HorizontalSpeed(), theOCCIPackage.getInteger(), "horizontalSpeed", null, 0, 1, Flightactuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlightactuator_VerticalSpeed(), theOCCIPackage.getInteger(), "verticalSpeed", null, 0, 1, Flightactuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFlightactuator__Move(), null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFlightactuator__Land(), null, "land", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFlightactuator__Takeoff(), null, "takeoff", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFlightactuator__AppliesConstraint__DiagnosticChain_Map_1(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFlightactuator__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (actuatorEClass, 
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
		addAnnotation
		  (touchsensorEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (touchsensorEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (motionactuatorEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (motionactuatorEClass, 
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
		  (sensorEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (colorsensorEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (colorsensorEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (ultrasonicsensorEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (ultrasonicsensorEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (mouthactuatorEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (mouthactuatorEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (flightactuatorEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (flightactuatorEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
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
		  (getActuator__AppliesConstraint__DiagnosticChain_Map_1(), 
		   source, 
		   new String[] {
			 "body", "self.entity.oclIsKindOf(omcri::Robot)"
		   });	
		addAnnotation
		  (getActuator__AppliesConstraint__DiagnosticChain_Map_1(), 
		   source, 
		   new String[] {
			 "body", "self.entity.oclIsKindOf(omcri::Robot)"
		   });	
		addAnnotation
		  (getTouchsensor__AppliesConstraint__DiagnosticChain_Map_1(), 
		   source, 
		   new String[] {
			 "body", "self.entity.oclIsKindOf(omcri::Legomindstormnxt2)"
		   });	
		addAnnotation
		  (getTouchsensor__AppliesConstraint__DiagnosticChain_Map_1(), 
		   source, 
		   new String[] {
			 "body", "self.entity.oclIsKindOf(omcri::Legomindstormnxt2)"
		   });	
		addAnnotation
		  (getMotionactuator__AppliesConstraint__DiagnosticChain_Map_1(), 
		   source, 
		   new String[] {
			 "body", "self.entity.oclIsKindOf(omcri::Legomindstormnxt2) or self.entity.oclIsKindOf(omcri::Turtlebot)"
		   });	
		addAnnotation
		  (getMotionactuator__AppliesConstraint__DiagnosticChain_Map_1(), 
		   source, 
		   new String[] {
			 "body", "self.entity.oclIsKindOf(omcri::Legomindstormnxt2) or self.entity.oclIsKindOf(omcri::Turtlebot)"
		   });	
		addAnnotation
		  (getSensor__AppliesConstraint__DiagnosticChain_Map_1(), 
		   source, 
		   new String[] {
			 "body", "self.entity.oclIsKindOf(omcri::Robot)"
		   });	
		addAnnotation
		  (getSensor__AppliesConstraint__DiagnosticChain_Map_1(), 
		   source, 
		   new String[] {
			 "body", "self.entity.oclIsKindOf(omcri::Robot)"
		   });	
		addAnnotation
		  (getColorsensor__AppliesConstraint__DiagnosticChain_Map_1(), 
		   source, 
		   new String[] {
			 "body", "self.entity.oclIsKindOf(omcri::Legomindstormnxt2)"
		   });	
		addAnnotation
		  (getColorsensor__AppliesConstraint__DiagnosticChain_Map_1(), 
		   source, 
		   new String[] {
			 "body", "self.entity.oclIsKindOf(omcri::Legomindstormnxt2)"
		   });	
		addAnnotation
		  (getUltrasonicsensor__AppliesConstraint__DiagnosticChain_Map_1(), 
		   source, 
		   new String[] {
			 "body", "self.entity.oclIsKindOf(omcri::Legomindstormnxt2)"
		   });	
		addAnnotation
		  (getUltrasonicsensor__AppliesConstraint__DiagnosticChain_Map_1(), 
		   source, 
		   new String[] {
			 "body", "self.entity.oclIsKindOf(omcri::Legomindstormnxt2)"
		   });	
		addAnnotation
		  (getMouthactuator__AppliesConstraint__DiagnosticChain_Map_1(), 
		   source, 
		   new String[] {
			 "body", "self.entity.oclIsKindOf(omcri::Legomindstormnxt2)"
		   });	
		addAnnotation
		  (getMouthactuator__AppliesConstraint__DiagnosticChain_Map_1(), 
		   source, 
		   new String[] {
			 "body", "self.entity.oclIsKindOf(omcri::Legomindstormnxt2)"
		   });	
		addAnnotation
		  (getFlightactuator__AppliesConstraint__DiagnosticChain_Map_1(), 
		   source, 
		   new String[] {
			 "body", "self.entity.oclIsKindOf(omcri::Ardrone)"
		   });	
		addAnnotation
		  (getFlightactuator__AppliesConstraint__DiagnosticChain_Map_1(), 
		   source, 
		   new String[] {
			 "body", "self.entity.oclIsKindOf(omcri::Ardrone)"
		   });
	}

} //OmcriPackageImpl
