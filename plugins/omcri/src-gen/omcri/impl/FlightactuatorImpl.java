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
import omcri.Flightactuator;
import omcri.OmcriPackage;
import omcri.OmcriTables;

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
 *   <li>{@link omcri.impl.FlightactuatorImpl#getHorizontalTilt <em>Horizontal Tilt</em>}</li>
 *   <li>{@link omcri.impl.FlightactuatorImpl#getVerticalTilt <em>Vertical Tilt</em>}</li>
 *   <li>{@link omcri.impl.FlightactuatorImpl#getHorizontalSpeed <em>Horizontal Speed</em>}</li>
 *   <li>{@link omcri.impl.FlightactuatorImpl#getVerticalSpeed <em>Vertical Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightactuatorImpl extends MixinBaseImpl implements Flightactuator {
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
		return OmcriPackage.Literals.FLIGHTACTUATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OmcriPackage.FLIGHTACTUATOR__HORIZONTAL_TILT, oldHorizontalTilt, horizontalTilt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OmcriPackage.FLIGHTACTUATOR__VERTICAL_TILT, oldVerticalTilt, verticalTilt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OmcriPackage.FLIGHTACTUATOR__HORIZONTAL_SPEED, oldHorizontalSpeed, horizontalSpeed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OmcriPackage.FLIGHTACTUATOR__VERTICAL_SPEED, oldVerticalSpeed, verticalSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void move() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Flightactuator!move()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void land() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Flightactuator!land()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void takeoff() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Flightactuator!takeoff()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv appliesConstraint:
		 *   let
		 *     severity : Integer[1] = 'Flightactuator::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let result : occi::Boolean[1] = self.entity.oclIsKindOf(Ardrone)
		 *       in
		 *         'Flightactuator::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OmcriTables.STR_Flightactuator_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OmcriTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_omcri_c_c_Ardrone = idResolver.getClass(OmcriTables.CLSSid_Ardrone, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_omcri_c_c_Ardrone).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OmcriTables.STR_Flightactuator_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, OmcriTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OmcriPackage.FLIGHTACTUATOR__HORIZONTAL_TILT:
				return getHorizontalTilt();
			case OmcriPackage.FLIGHTACTUATOR__VERTICAL_TILT:
				return getVerticalTilt();
			case OmcriPackage.FLIGHTACTUATOR__HORIZONTAL_SPEED:
				return getHorizontalSpeed();
			case OmcriPackage.FLIGHTACTUATOR__VERTICAL_SPEED:
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
			case OmcriPackage.FLIGHTACTUATOR__HORIZONTAL_TILT:
				setHorizontalTilt((Integer)newValue);
				return;
			case OmcriPackage.FLIGHTACTUATOR__VERTICAL_TILT:
				setVerticalTilt((Integer)newValue);
				return;
			case OmcriPackage.FLIGHTACTUATOR__HORIZONTAL_SPEED:
				setHorizontalSpeed((Integer)newValue);
				return;
			case OmcriPackage.FLIGHTACTUATOR__VERTICAL_SPEED:
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
			case OmcriPackage.FLIGHTACTUATOR__HORIZONTAL_TILT:
				setHorizontalTilt(HORIZONTAL_TILT_EDEFAULT);
				return;
			case OmcriPackage.FLIGHTACTUATOR__VERTICAL_TILT:
				setVerticalTilt(VERTICAL_TILT_EDEFAULT);
				return;
			case OmcriPackage.FLIGHTACTUATOR__HORIZONTAL_SPEED:
				setHorizontalSpeed(HORIZONTAL_SPEED_EDEFAULT);
				return;
			case OmcriPackage.FLIGHTACTUATOR__VERTICAL_SPEED:
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
			case OmcriPackage.FLIGHTACTUATOR__HORIZONTAL_TILT:
				return HORIZONTAL_TILT_EDEFAULT == null ? horizontalTilt != null : !HORIZONTAL_TILT_EDEFAULT.equals(horizontalTilt);
			case OmcriPackage.FLIGHTACTUATOR__VERTICAL_TILT:
				return VERTICAL_TILT_EDEFAULT == null ? verticalTilt != null : !VERTICAL_TILT_EDEFAULT.equals(verticalTilt);
			case OmcriPackage.FLIGHTACTUATOR__HORIZONTAL_SPEED:
				return HORIZONTAL_SPEED_EDEFAULT == null ? horizontalSpeed != null : !HORIZONTAL_SPEED_EDEFAULT.equals(horizontalSpeed);
			case OmcriPackage.FLIGHTACTUATOR__VERTICAL_SPEED:
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Actuator.class) {
			switch (baseOperationID) {
				case OmcriPackage.ACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return OmcriPackage.FLIGHTACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
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
			case OmcriPackage.FLIGHTACTUATOR___MOVE:
				move();
				return null;
			case OmcriPackage.FLIGHTACTUATOR___LAND:
				land();
				return null;
			case OmcriPackage.FLIGHTACTUATOR___TAKEOFF:
				takeoff();
				return null;
			case OmcriPackage.FLIGHTACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
