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
package omcri.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>omcri</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class OmcriTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new OmcriTests("omcri Tests");
		suite.addTestSuite(RobotTest.class);
		suite.addTestSuite(Legomindstormnxt2Test.class);
		suite.addTestSuite(ArdroneTest.class);
		suite.addTestSuite(TurtlebotTest.class);
		suite.addTestSuite(ActuatorTest.class);
		suite.addTestSuite(TouchsensorTest.class);
		suite.addTestSuite(MotionactuatorTest.class);
		suite.addTestSuite(SensorTest.class);
		suite.addTestSuite(ColorsensorTest.class);
		suite.addTestSuite(UltrasonicsensorTest.class);
		suite.addTestSuite(MouthactuatorTest.class);
		suite.addTestSuite(FlightactuatorTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OmcriTests(String name) {
		super(name);
	}

} //OmcriTests
