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
 * A representation of the model object '<em><b>Touchsensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link omcricore.Touchsensor#getTouch <em>Touch</em>}</li>
 * </ul>
 *
 * @see omcricore.OmcricorePackage#getTouchsensor()
 * @model
 * @generated
 */
public interface Touchsensor extends Sensor, MixinBase {
	/**
	 * Returns the value of the '<em><b>Touch</b></em>' attribute.
	 * The literals are from the enumeration {@link omcricore.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Touch</em>' attribute.
	 * @see omcricore.Color
	 * @see #setTouch(Color)
	 * @see omcricore.OmcricorePackage#getTouchsensor_Touch()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Touchsensor!touch'"
	 * @generated
	 */
	Color getTouch();

	/**
	 * Sets the value of the '{@link omcricore.Touchsensor#getTouch <em>Touch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Touch</em>' attribute.
	 * @see omcricore.Color
	 * @see #getTouch()
	 * @generated
	 */
	void setTouch(Color value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Touchsensor!sensetouch()'"
	 * @generated
	 */
	void sensetouch();

} // Touchsensor
