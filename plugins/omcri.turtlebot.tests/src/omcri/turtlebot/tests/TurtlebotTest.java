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
package omcri.turtlebot.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import omcri.turtlebot.Turtlebot;
import omcri.turtlebot.TurtlebotFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Turtlebot</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TurtlebotTest extends TestCase {

	/**
	 * The fixture for this Turtlebot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Turtlebot fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TurtlebotTest.class);
	}

	/**
	 * Constructs a new Turtlebot test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurtlebotTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Turtlebot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Turtlebot fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Turtlebot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Turtlebot getFixture() {
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
		setFixture(TurtlebotFactory.eINSTANCE.createTurtlebot());
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

} //TurtlebotTest
