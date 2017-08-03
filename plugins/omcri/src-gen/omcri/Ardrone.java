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
 *   <li>{@link omcri.Ardrone#getIPAddress <em>IP Address</em>}</li>
 * </ul>
 *
 * @see omcri.OmcriPackage#getArdrone()
 * @model
 * @generated
 */
public interface Ardrone extends Robot {
	/**
	 * Returns the value of the '<em><b>IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IP Address</em>' attribute.
	 * @see #setIPAddress(String)
	 * @see omcri.OmcriPackage#getArdrone_IPAddress()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Ardrone!IPAddress'"
	 * @generated
	 */
	String getIPAddress();

	/**
	 * Sets the value of the '{@link omcri.Ardrone#getIPAddress <em>IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Address</em>' attribute.
	 * @see #getIPAddress()
	 * @generated
	 */
	void setIPAddress(String value);

} // Ardrone
