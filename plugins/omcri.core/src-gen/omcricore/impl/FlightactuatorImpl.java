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
import omcricore.Flightactuator;
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
 * An implementation of the model object '<em><b>Flightactuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link omcricore.impl.FlightactuatorImpl#getHorizontalTilt <em>Horizontal Tilt</em>}</li>
 *   <li>{@link omcricore.impl.FlightactuatorImpl#getVerticalTilt <em>Vertical Tilt</em>}</li>
 *   <li>{@link omcricore.impl.FlightactuatorImpl#getHorizontalSpeed <em>Horizontal Speed</em>}</li>
 *   <li>{@link omcricore.impl.FlightactuatorImpl#getVerticalSpeed <em>Vertical Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightactuatorImpl extends ActuatorImpl implements Flightactuator {
	/**
	 * The default value of the '{@link #getHorizontalTilt() <em>Horizontal Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalTilt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HORIZONTAL_TILT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalTilt() <em>Horizontal Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalTilt()
	 * @generated
	 * @ordered
	 */
	protected Integer horizontalTilt = HORIZONTAL_TILT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalTilt() <em>Vertical Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalTilt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VERTICAL_TILT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerticalTilt() <em>Vertical Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalTilt()
	 * @generated
	 * @ordered
	 */
	protected Integer verticalTilt = VERTICAL_TILT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalSpeed() <em>Horizontal Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HORIZONTAL_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalSpeed() <em>Horizontal Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSpeed()
	 * @generated
	 * @ordered
	 */
	protected Integer horizontalSpeed = HORIZONTAL_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalSpeed() <em>Vertical Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VERTICAL_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerticalSpeed() <em>Vertical Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSpeed()
	 * @generated
	 * @ordered
	 */
	protected Integer verticalSpeed = VERTICAL_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightactuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OmcricorePackage.Literals.FLIGHTACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHorizontalTilt() {
		return horizontalTilt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalTilt(Integer newHorizontalTilt) {
		Integer oldHorizontalTilt = horizontalTilt;
		horizontalTilt = newHorizontalTilt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmcricorePackage.FLIGHTACTUATOR__HORIZONTAL_TILT, oldHorizontalTilt, horizontalTilt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVerticalTilt() {
		return verticalTilt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalTilt(Integer newVerticalTilt) {
		Integer oldVerticalTilt = verticalTilt;
		verticalTilt = newVerticalTilt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmcricorePackage.FLIGHTACTUATOR__VERTICAL_TILT, oldVerticalTilt, verticalTilt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHorizontalSpeed() {
		return horizontalSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalSpeed(Integer newHorizontalSpeed) {
		Integer oldHorizontalSpeed = horizontalSpeed;
		horizontalSpeed = newHorizontalSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmcricorePackage.FLIGHTACTUATOR__HORIZONTAL_SPEED, oldHorizontalSpeed, horizontalSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVerticalSpeed() {
		return verticalSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalSpeed(Integer newVerticalSpeed) {
		Integer oldVerticalSpeed = verticalSpeed;
		verticalSpeed = newVerticalSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmcricorePackage.FLIGHTACTUATOR__VERTICAL_SPEED, oldVerticalSpeed, verticalSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void move() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Flightactuator!move()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void land() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Flightactuator!land()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void takeoff() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Flightactuator!takeoff()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OmcricorePackage.FLIGHTACTUATOR__HORIZONTAL_TILT:
				return getHorizontalTilt();
			case OmcricorePackage.FLIGHTACTUATOR__VERTICAL_TILT:
				return getVerticalTilt();
			case OmcricorePackage.FLIGHTACTUATOR__HORIZONTAL_SPEED:
				return getHorizontalSpeed();
			case OmcricorePackage.FLIGHTACTUATOR__VERTICAL_SPEED:
				return getVerticalSpeed();
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
			case OmcricorePackage.FLIGHTACTUATOR__HORIZONTAL_TILT:
				setHorizontalTilt((Integer)newValue);
				return;
			case OmcricorePackage.FLIGHTACTUATOR__VERTICAL_TILT:
				setVerticalTilt((Integer)newValue);
				return;
			case OmcricorePackage.FLIGHTACTUATOR__HORIZONTAL_SPEED:
				setHorizontalSpeed((Integer)newValue);
				return;
			case OmcricorePackage.FLIGHTACTUATOR__VERTICAL_SPEED:
				setVerticalSpeed((Integer)newValue);
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
			case OmcricorePackage.FLIGHTACTUATOR__HORIZONTAL_TILT:
				setHorizontalTilt(HORIZONTAL_TILT_EDEFAULT);
				return;
			case OmcricorePackage.FLIGHTACTUATOR__VERTICAL_TILT:
				setVerticalTilt(VERTICAL_TILT_EDEFAULT);
				return;
			case OmcricorePackage.FLIGHTACTUATOR__HORIZONTAL_SPEED:
				setHorizontalSpeed(HORIZONTAL_SPEED_EDEFAULT);
				return;
			case OmcricorePackage.FLIGHTACTUATOR__VERTICAL_SPEED:
				setVerticalSpeed(VERTICAL_SPEED_EDEFAULT);
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
			case OmcricorePackage.FLIGHTACTUATOR__HORIZONTAL_TILT:
				return HORIZONTAL_TILT_EDEFAULT == null ? horizontalTilt != null : !HORIZONTAL_TILT_EDEFAULT.equals(horizontalTilt);
			case OmcricorePackage.FLIGHTACTUATOR__VERTICAL_TILT:
				return VERTICAL_TILT_EDEFAULT == null ? verticalTilt != null : !VERTICAL_TILT_EDEFAULT.equals(verticalTilt);
			case OmcricorePackage.FLIGHTACTUATOR__HORIZONTAL_SPEED:
				return HORIZONTAL_SPEED_EDEFAULT == null ? horizontalSpeed != null : !HORIZONTAL_SPEED_EDEFAULT.equals(horizontalSpeed);
			case OmcricorePackage.FLIGHTACTUATOR__VERTICAL_SPEED:
				return VERTICAL_SPEED_EDEFAULT == null ? verticalSpeed != null : !VERTICAL_SPEED_EDEFAULT.equals(verticalSpeed);
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
			case OmcricorePackage.FLIGHTACTUATOR___MOVE:
				move();
				return null;
			case OmcricorePackage.FLIGHTACTUATOR___LAND:
				land();
				return null;
			case OmcricorePackage.FLIGHTACTUATOR___TAKEOFF:
				takeoff();
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
		result.append(" (horizontalTilt: ");
		result.append(horizontalTilt);
		result.append(", verticalTilt: ");
		result.append(verticalTilt);
		result.append(", horizontalSpeed: ");
		result.append(horizontalSpeed);
		result.append(", verticalSpeed: ");
		result.append(verticalSpeed);
		result.append(')');
		return result.toString();
	}

} //FlightactuatorImpl
