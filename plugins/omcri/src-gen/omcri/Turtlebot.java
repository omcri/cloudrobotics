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
 * A representation of the model object '<em><b>Turtlebot</b></em>'.
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
 *   <li>{@link omcri.Turtlebot#getUser <em>User</em>}</li>
 *   <li>{@link omcri.Turtlebot#getPassword <em>Password</em>}</li>
 *   <li>{@link omcri.Turtlebot#getIPAddress <em>IP Address</em>}</li>
 * </ul>
 *
 * @see omcri.OmcriPackage#getTurtlebot()
 * @model
 * @generated
 */
public interface Turtlebot extends Robot {
	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see omcri.OmcriPackage#getTurtlebot_User()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Turtlebot!user'"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link omcri.Turtlebot#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see omcri.OmcriPackage#getTurtlebot_Password()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Turtlebot!password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link omcri.Turtlebot#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IP Address</em>' attribute.
	 * @see #setIPAddress(String)
	 * @see omcri.OmcriPackage#getTurtlebot_IPAddress()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Turtlebot!IPAddress'"
	 * @generated
	 */
	String getIPAddress();

	/**
	 * Sets the value of the '{@link omcri.Turtlebot#getIPAddress <em>IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Address</em>' attribute.
	 * @see #getIPAddress()
	 * @generated
	 */
	void setIPAddress(String value);

} // Turtlebot
