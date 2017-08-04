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
package omcri;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see omcri.OmcriPackage
 * @generated
 */
public interface OmcriFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OmcriFactory eINSTANCE = omcri.impl.OmcriFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot</em>'.
	 * @generated
	 */
	Robot createRobot();

	/**
	 * Returns a new object of class '<em>Legomindstormnxt2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legomindstormnxt2</em>'.
	 * @generated
	 */
	Legomindstormnxt2 createLegomindstormnxt2();

	/**
	 * Returns a new object of class '<em>Ardrone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ardrone</em>'.
	 * @generated
	 */
	Ardrone createArdrone();

	/**
	 * Returns a new object of class '<em>Turtlebot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turtlebot</em>'.
	 * @generated
	 */
	Turtlebot createTurtlebot();

	/**
	 * Returns a new object of class '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator</em>'.
	 * @generated
	 */
	Actuator createActuator();

	/**
	 * Returns a new object of class '<em>Touchsensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Touchsensor</em>'.
	 * @generated
	 */
	Touchsensor createTouchsensor();

	/**
	 * Returns a new object of class '<em>Motionactuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motionactuator</em>'.
	 * @generated
	 */
	Motionactuator createMotionactuator();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Colorsensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colorsensor</em>'.
	 * @generated
	 */
	Colorsensor createColorsensor();

	/**
	 * Returns a new object of class '<em>Ultrasonicsensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ultrasonicsensor</em>'.
	 * @generated
	 */
	Ultrasonicsensor createUltrasonicsensor();

	/**
	 * Returns a new object of class '<em>Mouthactuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mouthactuator</em>'.
	 * @generated
	 */
	Mouthactuator createMouthactuator();

	/**
	 * Returns a new object of class '<em>Flightactuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flightactuator</em>'.
	 * @generated
	 */
	Flightactuator createFlightactuator();

	/**
	 * Returns a new object of class '<em>Turtlebotmotionactuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turtlebotmotionactuator</em>'.
	 * @generated
	 */
	Turtlebotmotionactuator createTurtlebotmotionactuator();

	/**
	 * Returns a new object of class '<em>Legomindstormnxt2motionactuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legomindstormnxt2motionactuator</em>'.
	 * @generated
	 */
	Legomindstormnxt2motionactuator createLegomindstormnxt2motionactuator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OmcriPackage getOmcriPackage();

} //OmcriFactory
