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

import omcricore.Actuator;
import omcricore.Motionactuator;
import omcricore.OmcricorePackage;
import omcricore.OmcricoreTables;

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
 * An implementation of the model object '<em><b>Motionactuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link omcricore.impl.MotionactuatorImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link omcricore.impl.MotionactuatorImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link omcricore.impl.MotionactuatorImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MotionactuatorImpl extends ActuatorImpl implements Motionactuator {
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
		return OmcricorePackage.Literals.MOTIONACTUATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OmcricorePackage.MOTIONACTUATOR__ANGLE, oldAngle, angle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OmcricorePackage.MOTIONACTUATOR__SPEED, oldSpeed, speed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OmcricorePackage.MOTIONACTUATOR__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void moveforward() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Motionactuator!moveforward()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void movebackward() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Motionactuator!movebackward()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void turnright() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Motionactuator!turnright()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void turnleft() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Motionactuator!turnleft()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Motionactuator!stop()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OmcricorePackage.MOTIONACTUATOR__ANGLE:
				return getAngle();
			case OmcricorePackage.MOTIONACTUATOR__SPEED:
				return getSpeed();
			case OmcricorePackage.MOTIONACTUATOR__DURATION:
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
			case OmcricorePackage.MOTIONACTUATOR__ANGLE:
				setAngle((Integer)newValue);
				return;
			case OmcricorePackage.MOTIONACTUATOR__SPEED:
				setSpeed((Integer)newValue);
				return;
			case OmcricorePackage.MOTIONACTUATOR__DURATION:
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
			case OmcricorePackage.MOTIONACTUATOR__ANGLE:
				setAngle(ANGLE_EDEFAULT);
				return;
			case OmcricorePackage.MOTIONACTUATOR__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case OmcricorePackage.MOTIONACTUATOR__DURATION:
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
			case OmcricorePackage.MOTIONACTUATOR__ANGLE:
				return ANGLE_EDEFAULT == null ? angle != null : !ANGLE_EDEFAULT.equals(angle);
			case OmcricorePackage.MOTIONACTUATOR__SPEED:
				return SPEED_EDEFAULT == null ? speed != null : !SPEED_EDEFAULT.equals(speed);
			case OmcricorePackage.MOTIONACTUATOR__DURATION:
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OmcricorePackage.MOTIONACTUATOR___MOVEFORWARD:
				moveforward();
				return null;
			case OmcricorePackage.MOTIONACTUATOR___MOVEBACKWARD:
				movebackward();
				return null;
			case OmcricorePackage.MOTIONACTUATOR___TURNRIGHT:
				turnright();
				return null;
			case OmcricorePackage.MOTIONACTUATOR___TURNLEFT:
				turnleft();
				return null;
			case OmcricorePackage.MOTIONACTUATOR___STOP:
				stop();
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
