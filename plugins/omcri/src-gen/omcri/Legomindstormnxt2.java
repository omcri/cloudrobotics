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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legomindstormnxt2</b></em>'.
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
 *   <li>{@link omcri.Legomindstormnxt2#getMacAddress <em>Mac Address</em>}</li>
 * </ul>
 *
 * @see omcri.OmcriPackage#getLegomindstormnxt2()
 * @model
 * @generated
 */
public interface Legomindstormnxt2 extends Robot {
	/**
	 * Returns the value of the '<em><b>Mac Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mac Address</em>' attribute.
	 * @see #setMacAddress(String)
	 * @see omcri.OmcriPackage#getLegomindstormnxt2_MacAddress()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getMacAddress();

	/**
	 * Sets the value of the '{@link omcri.Legomindstormnxt2#getMacAddress <em>Mac Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac Address</em>' attribute.
	 * @see #getMacAddress()
	 * @generated
	 */
	void setMacAddress(String value);

} // Legomindstormnxt2
