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
package parrotardrone.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import parrotardrone.Ardrone;
import parrotardrone.ParrotardroneFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ardrone</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArdroneTest extends TestCase {

	/**
	 * The fixture for this Ardrone test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ardrone fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArdroneTest.class);
	}

	/**
	 * Constructs a new Ardrone test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArdroneTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ardrone test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Ardrone fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ardrone test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ardrone getFixture() {
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
		setFixture(ParrotardroneFactory.eINSTANCE.createArdrone());
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

} //ArdroneTest
