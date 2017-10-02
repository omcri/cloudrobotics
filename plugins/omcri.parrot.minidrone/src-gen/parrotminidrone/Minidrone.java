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
package parrotminidrone;

import omcricore.Robot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minidrone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link parrotminidrone.Minidrone#getIpadress <em>Ipadress</em>}</li>
 *   <li>{@link parrotminidrone.Minidrone#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see parrotminidrone.ParrotminidronePackage#getMinidrone()
 * @model
 * @generated
 */
public interface Minidrone extends Robot {
	/**
	 * Returns the value of the '<em><b>Ipadress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ipadress</em>' attribute.
	 * @see #setIpadress(String)
	 * @see parrotminidrone.ParrotminidronePackage#getMinidrone_Ipadress()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/parrotminidrone/ecore!Minidrone!ipadress'"
	 * @generated
	 */
	String getIpadress();

	/**
	 * Sets the value of the '{@link parrotminidrone.Minidrone#getIpadress <em>Ipadress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipadress</em>' attribute.
	 * @see #getIpadress()
	 * @generated
	 */
	void setIpadress(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see parrotminidrone.ParrotminidronePackage#getMinidrone_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/parrotminidrone/ecore!Minidrone!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link parrotminidrone.Minidrone#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Minidrone
