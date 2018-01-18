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

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flightactuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link omcricore.Flightactuator#getHorizontalTilt <em>Horizontal Tilt</em>}</li>
 *   <li>{@link omcricore.Flightactuator#getVerticalTilt <em>Vertical Tilt</em>}</li>
 *   <li>{@link omcricore.Flightactuator#getHorizontalSpeed <em>Horizontal Speed</em>}</li>
 *   <li>{@link omcricore.Flightactuator#getVerticalSpeed <em>Vertical Speed</em>}</li>
 * </ul>
 *
 * @see omcricore.OmcricorePackage#getFlightactuator()
 * @model
 * @generated
 */
public interface Flightactuator extends Actuator, MixinBase {
	/**
	 * Returns the value of the '<em><b>Horizontal Tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Tilt</em>' attribute.
	 * @see #setHorizontalTilt(Integer)
	 * @see omcricore.OmcricorePackage#getFlightactuator_HorizontalTilt()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getHorizontalTilt();

	/**
	 * Sets the value of the '{@link omcricore.Flightactuator#getHorizontalTilt <em>Horizontal Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Tilt</em>' attribute.
	 * @see #getHorizontalTilt()
	 * @generated
	 */
	void setHorizontalTilt(Integer value);

	/**
	 * Returns the value of the '<em><b>Vertical Tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Tilt</em>' attribute.
	 * @see #setVerticalTilt(Integer)
	 * @see omcricore.OmcricorePackage#getFlightactuator_VerticalTilt()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getVerticalTilt();

	/**
	 * Sets the value of the '{@link omcricore.Flightactuator#getVerticalTilt <em>Vertical Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Tilt</em>' attribute.
	 * @see #getVerticalTilt()
	 * @generated
	 */
	void setVerticalTilt(Integer value);

	/**
	 * Returns the value of the '<em><b>Horizontal Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Speed</em>' attribute.
	 * @see #setHorizontalSpeed(Integer)
	 * @see omcricore.OmcricorePackage#getFlightactuator_HorizontalSpeed()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getHorizontalSpeed();

	/**
	 * Sets the value of the '{@link omcricore.Flightactuator#getHorizontalSpeed <em>Horizontal Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Speed</em>' attribute.
	 * @see #getHorizontalSpeed()
	 * @generated
	 */
	void setHorizontalSpeed(Integer value);

	/**
	 * Returns the value of the '<em><b>Vertical Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Speed</em>' attribute.
	 * @see #setVerticalSpeed(Integer)
	 * @see omcricore.OmcricorePackage#getFlightactuator_VerticalSpeed()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getVerticalSpeed();

	/**
	 * Sets the value of the '{@link omcricore.Flightactuator#getVerticalSpeed <em>Vertical Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Speed</em>' attribute.
	 * @see #getVerticalSpeed()
	 * @generated
	 */
	void setVerticalSpeed(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void move();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void land();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void takeoff();

} // Flightactuator
