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
package omcri.util;

import omcri.*;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see omcri.OmcriPackage
 * @generated
 */
public class OmcriSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OmcriPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OmcriSwitch() {
		if (modelPackage == null) {
			modelPackage = OmcriPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OmcriPackage.ROBOT: {
				Robot robot = (Robot)theEObject;
				T result = caseRobot(robot);
				if (result == null) result = caseResource(robot);
				if (result == null) result = caseEntity(robot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmcriPackage.LEGOMINDSTORMNXT2: {
				Legomindstormnxt2 legomindstormnxt2 = (Legomindstormnxt2)theEObject;
				T result = caseLegomindstormnxt2(legomindstormnxt2);
				if (result == null) result = caseRobot(legomindstormnxt2);
				if (result == null) result = caseResource(legomindstormnxt2);
				if (result == null) result = caseEntity(legomindstormnxt2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmcriPackage.ARDRONE: {
				Ardrone ardrone = (Ardrone)theEObject;
				T result = caseArdrone(ardrone);
				if (result == null) result = caseRobot(ardrone);
				if (result == null) result = caseResource(ardrone);
				if (result == null) result = caseEntity(ardrone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmcriPackage.TURTLEBOT: {
				Turtlebot turtlebot = (Turtlebot)theEObject;
				T result = caseTurtlebot(turtlebot);
				if (result == null) result = caseRobot(turtlebot);
				if (result == null) result = caseResource(turtlebot);
				if (result == null) result = caseEntity(turtlebot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmcriPackage.ACTUATOR: {
				Actuator actuator = (Actuator)theEObject;
				T result = caseActuator(actuator);
				if (result == null) result = caseMixinBase(actuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmcriPackage.TOUCHSENSOR: {
				Touchsensor touchsensor = (Touchsensor)theEObject;
				T result = caseTouchsensor(touchsensor);
				if (result == null) result = caseSensor(touchsensor);
				if (result == null) result = caseMixinBase(touchsensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmcriPackage.MOTIONACTUATOR: {
				Motionactuator motionactuator = (Motionactuator)theEObject;
				T result = caseMotionactuator(motionactuator);
				if (result == null) result = caseActuator(motionactuator);
				if (result == null) result = caseMixinBase(motionactuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmcriPackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseMixinBase(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmcriPackage.COLORSENSOR: {
				Colorsensor colorsensor = (Colorsensor)theEObject;
				T result = caseColorsensor(colorsensor);
				if (result == null) result = caseSensor(colorsensor);
				if (result == null) result = caseMixinBase(colorsensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmcriPackage.ULTRASONICSENSOR: {
				Ultrasonicsensor ultrasonicsensor = (Ultrasonicsensor)theEObject;
				T result = caseUltrasonicsensor(ultrasonicsensor);
				if (result == null) result = caseSensor(ultrasonicsensor);
				if (result == null) result = caseMixinBase(ultrasonicsensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmcriPackage.MOUTHACTUATOR: {
				Mouthactuator mouthactuator = (Mouthactuator)theEObject;
				T result = caseMouthactuator(mouthactuator);
				if (result == null) result = caseActuator(mouthactuator);
				if (result == null) result = caseMixinBase(mouthactuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmcriPackage.FLIGHTACTUATOR: {
				Flightactuator flightactuator = (Flightactuator)theEObject;
				T result = caseFlightactuator(flightactuator);
				if (result == null) result = caseActuator(flightactuator);
				if (result == null) result = caseMixinBase(flightactuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmcriPackage.TURTLEBOTMOTIONACTUATOR: {
				Turtlebotmotionactuator turtlebotmotionactuator = (Turtlebotmotionactuator)theEObject;
				T result = caseTurtlebotmotionactuator(turtlebotmotionactuator);
				if (result == null) result = caseMotionactuator(turtlebotmotionactuator);
				if (result == null) result = caseActuator(turtlebotmotionactuator);
				if (result == null) result = caseMixinBase(turtlebotmotionactuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR: {
				Legomindstormnxt2motionactuator legomindstormnxt2motionactuator = (Legomindstormnxt2motionactuator)theEObject;
				T result = caseLegomindstormnxt2motionactuator(legomindstormnxt2motionactuator);
				if (result == null) result = caseMotionactuator(legomindstormnxt2motionactuator);
				if (result == null) result = caseActuator(legomindstormnxt2motionactuator);
				if (result == null) result = caseMixinBase(legomindstormnxt2motionactuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobot(Robot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legomindstormnxt2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legomindstormnxt2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegomindstormnxt2(Legomindstormnxt2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ardrone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ardrone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArdrone(Ardrone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turtlebot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turtlebot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurtlebot(Turtlebot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touchsensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touchsensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchsensor(Touchsensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motionactuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motionactuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotionactuator(Motionactuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colorsensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colorsensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorsensor(Colorsensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ultrasonicsensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ultrasonicsensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUltrasonicsensor(Ultrasonicsensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mouthactuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mouthactuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMouthactuator(Mouthactuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flightactuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flightactuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightactuator(Flightactuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turtlebotmotionactuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turtlebotmotionactuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurtlebotmotionactuator(Turtlebotmotionactuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legomindstormnxt2motionactuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legomindstormnxt2motionactuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegomindstormnxt2motionactuator(Legomindstormnxt2motionactuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixin Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixin Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixinBase(MixinBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OmcriSwitch
