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

import omcri.Actuator;
import omcri.Motionactuator;
import omcri.OmcriPackage;

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
 * An implementation of the model object '<em><b>Motionactuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link omcri.impl.MotionactuatorImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link omcri.impl.MotionactuatorImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link omcri.impl.MotionactuatorImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MotionactuatorImpl extends MixinBaseImpl implements Motionactuator {
	/**
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ANGLE_EDEFAULT = new Integer(45);

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected Integer angle = ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SPEED_EDEFAULT = new Integer(100);

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected Integer speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DURATION_EDEFAULT = new Integer(1000);

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Integer duration = DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotionactuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OmcriPackage.Literals.MOTIONACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(Integer newAngle) {
		Integer oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmcriPackage.MOTIONACTUATOR__ANGLE, oldAngle, angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(Integer newSpeed) {
		Integer oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmcriPackage.MOTIONACTUATOR__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Integer newDuration) {
		Integer oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmcriPackage.MOTIONACTUATOR__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void moveforward() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void movebackward() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void turnright() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void turnleft() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
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
	protected static final String APPLIES_CONSTRAINT_DIAGNOSTIC_CHAIN_MAP_1__EEXPRESSION = "self.entity.oclIsKindOf(omcri::Legomindstormnxt2) or self.entity.oclIsKindOf(omcri::Turtlebot)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			OmcriValidator.validate
				(OmcriPackage.Literals.MOTIONACTUATOR,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 OmcriPackage.Literals.MOTIONACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1,
				 APPLIES_CONSTRAINT_DIAGNOSTIC_CHAIN_MAP_1__EEXPRESSION,
				 Diagnostic.ERROR,
				 OmcriValidator.DIAGNOSTIC_SOURCE,
				 OmcriValidator.MOTIONACTUATOR__APPLIES_CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OmcriPackage.MOTIONACTUATOR__ANGLE:
				return getAngle();
			case OmcriPackage.MOTIONACTUATOR__SPEED:
				return getSpeed();
			case OmcriPackage.MOTIONACTUATOR__DURATION:
				return getDuration();
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
			case OmcriPackage.MOTIONACTUATOR__ANGLE:
				setAngle((Integer)newValue);
				return;
			case OmcriPackage.MOTIONACTUATOR__SPEED:
				setSpeed((Integer)newValue);
				return;
			case OmcriPackage.MOTIONACTUATOR__DURATION:
				setDuration((Integer)newValue);
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
			case OmcriPackage.MOTIONACTUATOR__ANGLE:
				setAngle(ANGLE_EDEFAULT);
				return;
			case OmcriPackage.MOTIONACTUATOR__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case OmcriPackage.MOTIONACTUATOR__DURATION:
				setDuration(DURATION_EDEFAULT);
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
			case OmcriPackage.MOTIONACTUATOR__ANGLE:
				return ANGLE_EDEFAULT == null ? angle != null : !ANGLE_EDEFAULT.equals(angle);
			case OmcriPackage.MOTIONACTUATOR__SPEED:
				return SPEED_EDEFAULT == null ? speed != null : !SPEED_EDEFAULT.equals(speed);
			case OmcriPackage.MOTIONACTUATOR__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
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
		if (baseClass == Actuator.class) {
			switch (baseOperationID) {
				case OmcriPackage.ACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1: return OmcriPackage.MOTIONACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
				case OmcriPackage.ACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return OmcriPackage.MOTIONACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
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
			case OmcriPackage.MOTIONACTUATOR___MOVEFORWARD:
				moveforward();
				return null;
			case OmcriPackage.MOTIONACTUATOR___MOVEBACKWARD:
				movebackward();
				return null;
			case OmcriPackage.MOTIONACTUATOR___TURNRIGHT:
				turnright();
				return null;
			case OmcriPackage.MOTIONACTUATOR___TURNLEFT:
				turnleft();
				return null;
			case OmcriPackage.MOTIONACTUATOR___STOP:
				stop();
				return null;
			case OmcriPackage.MOTIONACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (angle: ");
		result.append(angle);
		result.append(", speed: ");
		result.append(speed);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //MotionactuatorImpl
