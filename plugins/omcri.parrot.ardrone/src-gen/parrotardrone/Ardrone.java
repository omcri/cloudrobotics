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
package parrotardrone;

import omcricore.Robot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ardrone</b></em>'.
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
 *   <li>{@link parrotardrone.Ardrone#getIpadress <em>Ipadress</em>}</li>
 *   <li>{@link parrotardrone.Ardrone#getSsid <em>Ssid</em>}</li>
 * </ul>
 *
 * @see parrotardrone.ParrotardronePackage#getArdrone()
 * @model
 * @generated
 */
public interface Ardrone extends Robot {
	/**
	 * Returns the value of the '<em><b>Ipadress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ipadress</em>' attribute.
	 * @see #setIpadress(String)
	 * @see parrotardrone.ParrotardronePackage#getArdrone_Ipadress()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/parrotardrone/ecore!Ardrone!ipadress'"
	 * @generated
	 */
	String getIpadress();

	/**
	 * Sets the value of the '{@link parrotardrone.Ardrone#getIpadress <em>Ipadress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipadress</em>' attribute.
	 * @see #getIpadress()
	 * @generated
	 */
	void setIpadress(String value);

	/**
	 * Returns the value of the '<em><b>Ssid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ssid</em>' attribute.
	 * @see #setSsid(String)
	 * @see parrotardrone.ParrotardronePackage#getArdrone_Ssid()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/parrotardrone/ecore!Ardrone!ssid'"
	 * @generated
	 */
	String getSsid();

	/**
	 * Sets the value of the '{@link parrotardrone.Ardrone#getSsid <em>Ssid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssid</em>' attribute.
	 * @see #getSsid()
	 * @generated
	 */
	void setSsid(String value);

} // Ardrone
