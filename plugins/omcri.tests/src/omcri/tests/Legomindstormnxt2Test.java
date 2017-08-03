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

import junit.textui.TestRunner;

import omcri.Legomindstormnxt2;
import omcri.OmcriFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Legomindstormnxt2</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Legomindstormnxt2Test extends RobotTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Legomindstormnxt2Test.class);
	}

	/**
	 * Constructs a new Legomindstormnxt2 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Legomindstormnxt2Test(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Legomindstormnxt2 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Legomindstormnxt2 getFixture() {
		return (Legomindstormnxt2)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OmcriFactory.eINSTANCE.createLegomindstormnxt2());
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

} //Legomindstormnxt2Test
