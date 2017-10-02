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
package parrotminidrone.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import parrotminidrone.Minidrone;
import parrotminidrone.ParrotminidroneFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Minidrone</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MinidroneTest extends TestCase {

	/**
	 * The fixture for this Minidrone test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Minidrone fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MinidroneTest.class);
	}

	/**
	 * Constructs a new Minidrone test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinidroneTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Minidrone test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Minidrone fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Minidrone test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Minidrone getFixture() {
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
		setFixture(ParrotminidroneFactory.eINSTANCE.createMinidrone());
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

} //MinidroneTest
