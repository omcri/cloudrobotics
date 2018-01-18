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
package omcricore;

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link omcricore.Connection#getTimeOut <em>Time Out</em>}</li>
 * </ul>
 *
 * @see omcricore.OmcricorePackage#getConnection()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appliesConstraint='self.entity.oclIsKindOf(omcricore::Robot)'"
 * @generated
 */
public interface Connection extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timeout session in seconds if no connections
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Out</em>' attribute.
	 * @see #setTimeOut(Integer)
	 * @see omcricore.OmcricorePackage#getConnection_TimeOut()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getTimeOut();

	/**
	 * Sets the value of the '{@link omcricore.Connection#getTimeOut <em>Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Out</em>' attribute.
	 * @see #getTimeOut()
	 * @generated
	 */
	void setTimeOut(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void connect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void disconnect();

} // Connection
