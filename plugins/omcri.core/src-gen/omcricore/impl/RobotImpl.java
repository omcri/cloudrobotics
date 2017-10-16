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

import omcricore.OmcricorePackage;
import omcricore.Robot;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.ecore.EClass;

import omcri.core.IRobotController;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RobotImpl extends ResourceImpl implements Robot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OmcricorePackage.Literals.ROBOT;
	}

	/**
	 * Get default controller for this robot.
	 * @notgenerated
	 */
	public IRobotController getRobotController() {
		// Default to no controller.
		return null;
	}

} //RobotImpl
