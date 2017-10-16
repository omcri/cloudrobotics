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
 * A representation of the model object '<em><b>Motionactuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link omcricore.Motionactuator#getAngle <em>Angle</em>}</li>
 *   <li>{@link omcricore.Motionactuator#getSpeed <em>Speed</em>}</li>
 *   <li>{@link omcricore.Motionactuator#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see omcricore.OmcricorePackage#getMotionactuator()
 * @model
 * @generated
 */
public interface Motionactuator extends Actuator, MixinBase {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * The default value is <code>"45"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(Integer)
	 * @see omcricore.OmcricorePackage#getMotionactuator_Angle()
	 * @model default="45" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Motionactuator!angle'"
	 * @generated
	 */
	Integer getAngle();

	/**
	 * Sets the value of the '{@link omcricore.Motionactuator#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Integer value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(Integer)
	 * @see omcricore.OmcricorePackage#getMotionactuator_Speed()
	 * @model default="100" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Motionactuator!speed'"
	 * @generated
	 */
	Integer getSpeed();

	/**
	 * Sets the value of the '{@link omcricore.Motionactuator#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(Integer value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Integer)
	 * @see omcricore.OmcricorePackage#getMotionactuator_Duration()
	 * @model default="1000" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Motionactuator!duration'"
	 * @generated
	 */
	Integer getDuration();

	/**
	 * Sets the value of the '{@link omcricore.Motionactuator#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Motionactuator!moveforward()'"
	 * @generated
	 */
	void moveforward();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Motionactuator!movebackward()'"
	 * @generated
	 */
	void movebackward();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Motionactuator!turnright()'"
	 * @generated
	 */
	void turnright();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Motionactuator!turnleft()'"
	 * @generated
	 */
	void turnleft();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Motionactuator!stop()'"
	 * @generated
	 */
	void stop();

} // Motionactuator
