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
package omcricore.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import omcricore.OmcricoreFactory;
import omcricore.Robotlink;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Robotlink</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotlinkTest extends TestCase {

	/**
	 * The fixture for this Robotlink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Robotlink fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RobotlinkTest.class);
	}

	/**
	 * Constructs a new Robotlink test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotlinkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Robotlink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Robotlink fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Robotlink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Robotlink getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OmcricoreFactory.eINSTANCE.createRobotlink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RobotlinkTest
