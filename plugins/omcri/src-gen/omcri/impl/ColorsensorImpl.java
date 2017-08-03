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
package omcri.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import omcri.Color;
import omcri.Colorsensor;
import omcri.OmcriPackage;
import omcri.Sensor;

import omcri.util.OmcriValidator;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colorsensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link omcri.impl.ColorsensorImpl#getColor <em>Color</em>}</li>
 *   <li>{@link omcri.impl.ColorsensorImpl#getLight <em>Light</em>}</li>
 *   <li>{@link omcri.impl.ColorsensorImpl#getDarkness <em>Darkness</em>}</li>
 *   <li>{@link omcri.impl.ColorsensorImpl#getColorLamp <em>Color Lamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorsensorImpl extends MixinBaseImpl implements Colorsensor {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = Color.WHITE;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLight() <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLight() <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLight()
	 * @generated
	 * @ordered
	 */
	protected Integer light = LIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDarkness() <em>Darkness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDarkness()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DARKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDarkness() <em>Darkness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDarkness()
	 * @generated
	 * @ordered
	 */
	protected Integer darkness = DARKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColorLamp() <em>Color Lamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorLamp()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_LAMP_EDEFAULT = Color.WHITE;

	/**
	 * The cached value of the '{@link #getColorLamp() <em>Color Lamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorLamp()
	 * @generated
	 * @ordered
	 */
	protected Color colorLamp = COLOR_LAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorsensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OmcriPackage.Literals.COLORSENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		Color oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmcriPackage.COLORSENSOR__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLight() {
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLight(Integer newLight) {
		Integer oldLight = light;
		light = newLight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmcriPackage.COLORSENSOR__LIGHT, oldLight, light));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDarkness() {
		return darkness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDarkness(Integer newDarkness) {
		Integer oldDarkness = darkness;
		darkness = newDarkness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmcriPackage.COLORSENSOR__DARKNESS, oldDarkness, darkness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColorLamp() {
		return colorLamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorLamp(Color newColorLamp) {
		Color oldColorLamp = colorLamp;
		colorLamp = newColorLamp == null ? COLOR_LAMP_EDEFAULT : newColorLamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmcriPackage.COLORSENSOR__COLOR_LAMP, oldColorLamp, colorLamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sensecolor() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached validation expression for the '{@link #appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String APPLIES_CONSTRAINT_DIAGNOSTIC_CHAIN_MAP_1__EEXPRESSION = "self.entity.oclIsKindOf(omcri::Legomindstormnxt2)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			OmcriValidator.validate
				(OmcriPackage.Literals.COLORSENSOR,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 OmcriPackage.Literals.COLORSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1,
				 APPLIES_CONSTRAINT_DIAGNOSTIC_CHAIN_MAP_1__EEXPRESSION,
				 Diagnostic.ERROR,
				 OmcriValidator.DIAGNOSTIC_SOURCE,
				 OmcriValidator.COLORSENSOR__APPLIES_CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OmcriPackage.COLORSENSOR__COLOR:
				return getColor();
			case OmcriPackage.COLORSENSOR__LIGHT:
				return getLight();
			case OmcriPackage.COLORSENSOR__DARKNESS:
				return getDarkness();
			case OmcriPackage.COLORSENSOR__COLOR_LAMP:
				return getColorLamp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OmcriPackage.COLORSENSOR__COLOR:
				setColor((Color)newValue);
				return;
			case OmcriPackage.COLORSENSOR__LIGHT:
				setLight((Integer)newValue);
				return;
			case OmcriPackage.COLORSENSOR__DARKNESS:
				setDarkness((Integer)newValue);
				return;
			case OmcriPackage.COLORSENSOR__COLOR_LAMP:
				setColorLamp((Color)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OmcriPackage.COLORSENSOR__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case OmcriPackage.COLORSENSOR__LIGHT:
				setLight(LIGHT_EDEFAULT);
				return;
			case OmcriPackage.COLORSENSOR__DARKNESS:
				setDarkness(DARKNESS_EDEFAULT);
				return;
			case OmcriPackage.COLORSENSOR__COLOR_LAMP:
				setColorLamp(COLOR_LAMP_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OmcriPackage.COLORSENSOR__COLOR:
				return color != COLOR_EDEFAULT;
			case OmcriPackage.COLORSENSOR__LIGHT:
				return LIGHT_EDEFAULT == null ? light != null : !LIGHT_EDEFAULT.equals(light);
			case OmcriPackage.COLORSENSOR__DARKNESS:
				return DARKNESS_EDEFAULT == null ? darkness != null : !DARKNESS_EDEFAULT.equals(darkness);
			case OmcriPackage.COLORSENSOR__COLOR_LAMP:
				return colorLamp != COLOR_LAMP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Sensor.class) {
			switch (baseOperationID) {
				case OmcriPackage.SENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1: return OmcriPackage.COLORSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
				case OmcriPackage.SENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return OmcriPackage.COLORSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OmcriPackage.COLORSENSOR___SENSECOLOR:
				sensecolor();
				return null;
			case OmcriPackage.COLORSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (color: ");
		result.append(color);
		result.append(", light: ");
		result.append(light);
		result.append(", darkness: ");
		result.append(darkness);
		result.append(", colorLamp: ");
		result.append(colorLamp);
		result.append(')');
		return result.toString();
	}

} //ColorsensorImpl
