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
 * A representation of the model object '<em><b>Colorsensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link omcricore.Colorsensor#getColor <em>Color</em>}</li>
 *   <li>{@link omcricore.Colorsensor#getLight <em>Light</em>}</li>
 *   <li>{@link omcricore.Colorsensor#getDarkness <em>Darkness</em>}</li>
 *   <li>{@link omcricore.Colorsensor#getColorLamp <em>Color Lamp</em>}</li>
 * </ul>
 *
 * @see omcricore.OmcricorePackage#getColorsensor()
 * @model
 * @generated
 */
public interface Colorsensor extends Sensor, MixinBase {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link omcricore.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see omcricore.Color
	 * @see #setColor(Color)
	 * @see omcricore.OmcricorePackage#getColorsensor_Color()
	 * @model
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link omcricore.Colorsensor#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see omcricore.Color
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
	 * @see omcricore.OmcricorePackage#getColorsensor_Light()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getLight();

	/**
	 * Sets the value of the '{@link omcricore.Colorsensor#getLight <em>Light</em>}' attribute.
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
	 * @see omcricore.OmcricorePackage#getColorsensor_Darkness()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getDarkness();

	/**
	 * Sets the value of the '{@link omcricore.Colorsensor#getDarkness <em>Darkness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Darkness</em>' attribute.
	 * @see #getDarkness()
	 * @generated
	 */
	void setDarkness(Integer value);

	/**
	 * Returns the value of the '<em><b>Color Lamp</b></em>' attribute.
	 * The literals are from the enumeration {@link omcricore.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color Lamp</em>' attribute.
	 * @see omcricore.Color
	 * @see #setColorLamp(Color)
	 * @see omcricore.OmcricorePackage#getColorsensor_ColorLamp()
	 * @model
	 * @generated
	 */
	Color getColorLamp();

	/**
	 * Sets the value of the '{@link omcricore.Colorsensor#getColorLamp <em>Color Lamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Lamp</em>' attribute.
	 * @see omcricore.Color
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

} // Colorsensor
