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

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colorsensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link omcri.Colorsensor#getColor <em>Color</em>}</li>
 *   <li>{@link omcri.Colorsensor#getLight <em>Light</em>}</li>
 *   <li>{@link omcri.Colorsensor#getDarkness <em>Darkness</em>}</li>
 *   <li>{@link omcri.Colorsensor#getColorLamp <em>Color Lamp</em>}</li>
 * </ul>
 *
 * @see omcri.OmcriPackage#getColorsensor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Colorsensor extends MixinBase, Sensor {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link omcri.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see omcri.Color
	 * @see #setColor(Color)
	 * @see omcri.OmcriPackage#getColorsensor_Color()
	 * @model
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link omcri.Colorsensor#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see omcri.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Light</em>' attribute.
	 * @see #setLight(Integer)
	 * @see omcri.OmcriPackage#getColorsensor_Light()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getLight();

	/**
	 * Sets the value of the '{@link omcri.Colorsensor#getLight <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' attribute.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(Integer value);

	/**
	 * Returns the value of the '<em><b>Darkness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Darkness</em>' attribute.
	 * @see #setDarkness(Integer)
	 * @see omcri.OmcriPackage#getColorsensor_Darkness()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getDarkness();

	/**
	 * Sets the value of the '{@link omcri.Colorsensor#getDarkness <em>Darkness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Darkness</em>' attribute.
	 * @see #getDarkness()
	 * @generated
	 */
	void setDarkness(Integer value);

	/**
	 * Returns the value of the '<em><b>Color Lamp</b></em>' attribute.
	 * The literals are from the enumeration {@link omcri.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color Lamp</em>' attribute.
	 * @see omcri.Color
	 * @see #setColorLamp(Color)
	 * @see omcri.OmcriPackage#getColorsensor_ColorLamp()
	 * @model
	 * @generated
	 */
	Color getColorLamp();

	/**
	 * Sets the value of the '{@link omcri.Colorsensor#getColorLamp <em>Color Lamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Lamp</em>' attribute.
	 * @see omcri.Color
	 * @see #getColorLamp()
	 * @generated
	 */
	void setColorLamp(Color value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void sensecolor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.entity.oclIsKindOf(omcri::Legomindstormnxt2)'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Colorsensor
