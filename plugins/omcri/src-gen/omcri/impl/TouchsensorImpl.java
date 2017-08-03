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
import omcri.OmcriPackage;
import omcri.Sensor;
import omcri.Touchsensor;

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
 * An implementation of the model object '<em><b>Touchsensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link omcri.impl.TouchsensorImpl#getTouch <em>Touch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TouchsensorImpl extends MixinBaseImpl implements Touchsensor {
	/**
	 * The default value of the '{@link #getTouch() <em>Touch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouch()
	 * @generated
	 * @ordered
	 */
	protected static final Color TOUCH_EDEFAULT = Color.WHITE;

	/**
	 * The cached value of the '{@link #getTouch() <em>Touch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouch()
	 * @generated
	 * @ordered
	 */
	protected Color touch = TOUCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchsensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OmcriPackage.Literals.TOUCHSENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getTouch() {
		return touch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTouch(Color newTouch) {
		Color oldTouch = touch;
		touch = newTouch == null ? TOUCH_EDEFAULT : newTouch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmcriPackage.TOUCHSENSOR__TOUCH, oldTouch, touch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sensetouch() {
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
				(OmcriPackage.Literals.TOUCHSENSOR,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 OmcriPackage.Literals.TOUCHSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1,
				 APPLIES_CONSTRAINT_DIAGNOSTIC_CHAIN_MAP_1__EEXPRESSION,
				 Diagnostic.ERROR,
				 OmcriValidator.DIAGNOSTIC_SOURCE,
				 OmcriValidator.TOUCHSENSOR__APPLIES_CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OmcriPackage.TOUCHSENSOR__TOUCH:
				return getTouch();
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
			case OmcriPackage.TOUCHSENSOR__TOUCH:
				setTouch((Color)newValue);
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
			case OmcriPackage.TOUCHSENSOR__TOUCH:
				setTouch(TOUCH_EDEFAULT);
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
			case OmcriPackage.TOUCHSENSOR__TOUCH:
				return touch != TOUCH_EDEFAULT;
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
				case OmcriPackage.SENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1: return OmcriPackage.TOUCHSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
				case OmcriPackage.SENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return OmcriPackage.TOUCHSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
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
			case OmcriPackage.TOUCHSENSOR___SENSETOUCH:
				sensetouch();
				return null;
			case OmcriPackage.TOUCHSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (touch: ");
		result.append(touch);
		result.append(')');
		return result.toString();
	}

} //TouchsensorImpl
