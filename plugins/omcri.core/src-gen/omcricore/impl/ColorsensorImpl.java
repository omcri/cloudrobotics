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
package omcricore.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import omcricore.Color;
import omcricore.Colorsensor;
import omcricore.OmcricorePackage;
import omcricore.OmcricoreTables;
import omcricore.Sensor;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colorsensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link omcricore.impl.ColorsensorImpl#getColor <em>Color</em>}</li>
 *   <li>{@link omcricore.impl.ColorsensorImpl#getLight <em>Light</em>}</li>
 *   <li>{@link omcricore.impl.ColorsensorImpl#getDarkness <em>Darkness</em>}</li>
 *   <li>{@link omcricore.impl.ColorsensorImpl#getColorLamp <em>Color Lamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorsensorImpl extends SensorImpl implements Colorsensor {
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
		return OmcricorePackage.Literals.COLORSENSOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OmcricorePackage.COLORSENSOR__COLOR, oldColor, color));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OmcricorePackage.COLORSENSOR__LIGHT, oldLight, light));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OmcricorePackage.COLORSENSOR__DARKNESS, oldDarkness, darkness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OmcricorePackage.COLORSENSOR__COLOR_LAMP, oldColorLamp, colorLamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sensecolor() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Colorsensor!sensecolor()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OmcricorePackage.COLORSENSOR__COLOR:
				return getColor();
			case OmcricorePackage.COLORSENSOR__LIGHT:
				return getLight();
			case OmcricorePackage.COLORSENSOR__DARKNESS:
				return getDarkness();
			case OmcricorePackage.COLORSENSOR__COLOR_LAMP:
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
			case OmcricorePackage.COLORSENSOR__COLOR:
				setColor((Color)newValue);
				return;
			case OmcricorePackage.COLORSENSOR__LIGHT:
				setLight((Integer)newValue);
				return;
			case OmcricorePackage.COLORSENSOR__DARKNESS:
				setDarkness((Integer)newValue);
				return;
			case OmcricorePackage.COLORSENSOR__COLOR_LAMP:
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
			case OmcricorePackage.COLORSENSOR__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case OmcricorePackage.COLORSENSOR__LIGHT:
				setLight(LIGHT_EDEFAULT);
				return;
			case OmcricorePackage.COLORSENSOR__DARKNESS:
				setDarkness(DARKNESS_EDEFAULT);
				return;
			case OmcricorePackage.COLORSENSOR__COLOR_LAMP:
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
			case OmcricorePackage.COLORSENSOR__COLOR:
				return color != COLOR_EDEFAULT;
			case OmcricorePackage.COLORSENSOR__LIGHT:
				return LIGHT_EDEFAULT == null ? light != null : !LIGHT_EDEFAULT.equals(light);
			case OmcricorePackage.COLORSENSOR__DARKNESS:
				return DARKNESS_EDEFAULT == null ? darkness != null : !DARKNESS_EDEFAULT.equals(darkness);
			case OmcricorePackage.COLORSENSOR__COLOR_LAMP:
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OmcricorePackage.COLORSENSOR___SENSECOLOR:
				sensecolor();
				return null;
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
