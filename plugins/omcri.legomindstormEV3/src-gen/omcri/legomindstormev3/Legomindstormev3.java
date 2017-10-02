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
package omcri.legomindstormev3;

import omcricore.Robot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legomindstormev3</b></em>'.
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
 *   <li>{@link omcri.legomindstormev3.Legomindstormev3#getIpaddress <em>Ipaddress</em>}</li>
 * </ul>
 *
 * @see omcri.legomindstormev3.Legomindstormev3Package#getLegomindstormev3()
 * @model
 * @generated
 */
public interface Legomindstormev3 extends Robot {
	/**
	 * Returns the value of the '<em><b>Ipaddress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ipaddress</em>' attribute.
	 * @see #setIpaddress(String)
	 * @see omcri.legomindstormev3.Legomindstormev3Package#getLegomindstormev3_Ipaddress()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getIpaddress();

	/**
	 * Sets the value of the '{@link omcri.legomindstormev3.Legomindstormev3#getIpaddress <em>Ipaddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipaddress</em>' attribute.
	 * @see #getIpaddress()
	 * @generated
	 */
	void setIpaddress(String value);

} // Legomindstormev3
