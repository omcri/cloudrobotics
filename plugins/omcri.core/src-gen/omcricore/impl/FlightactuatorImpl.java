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
public class FlightactuatorImpl extends MixinBaseImpl implements Flightactuator {
	/**
	 * The default value of the '{@link #getHorizontalTilt() <em>Horizontal Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalTilt()
	 * @generated
	 * @ordered
	 */
	protected static final String HORIZONTAL_TILT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalTilt() <em>Horizontal Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalTilt()
	 * @generated
	 * @ordered
	 */
	protected String horizontalTilt = HORIZONTAL_TILT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalTilt() <em>Vertical Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalTilt()
	 * @generated
	 * @ordered
	 */
	protected static final String VERTICAL_TILT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerticalTilt() <em>Vertical Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalTilt()
	 * @generated
	 * @ordered
	 */
	protected String verticalTilt = VERTICAL_TILT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalSpeed() <em>Horizontal Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final String HORIZONTAL_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalSpeed() <em>Horizontal Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSpeed()
	 * @generated
	 * @ordered
	 */
	protected String horizontalSpeed = HORIZONTAL_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalSpeed() <em>Vertical Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final String VERTICAL_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerticalSpeed() <em>Vertical Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSpeed()
	 * @generated
	 * @ordered
	 */
	protected String verticalSpeed = VERTICAL_SPEED_EDEFAULT;

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
	public String getHorizontalTilt() {
		return horizontalTilt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalTilt(String newHorizontalTilt) {
		String oldHorizontalTilt = horizontalTilt;
		horizontalTilt = newHorizontalTilt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmcricorePackage.FLIGHTACTUATOR__HORIZONTAL_TILT, oldHorizontalTilt, horizontalTilt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVerticalTilt() {
		return verticalTilt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalTilt(String newVerticalTilt) {
		String oldVerticalTilt = verticalTilt;
		verticalTilt = newVerticalTilt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmcricorePackage.FLIGHTACTUATOR__VERTICAL_TILT, oldVerticalTilt, verticalTilt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHorizontalSpeed() {
		return horizontalSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalSpeed(String newHorizontalSpeed) {
		String oldHorizontalSpeed = horizontalSpeed;
		horizontalSpeed = newHorizontalSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmcricorePackage.FLIGHTACTUATOR__HORIZONTAL_SPEED, oldHorizontalSpeed, horizontalSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVerticalSpeed() {
		return verticalSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalSpeed(String newVerticalSpeed) {
		String oldVerticalSpeed = verticalSpeed;
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
	public boolean appliesConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv appliesConstraint:
		 *   let severity : Integer[1] = 'Actuator::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let result : occi::Boolean[1] = self.entity.oclIsKindOf(Robot)
		 *       in
		 *         'Actuator::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OmcricoreTables.STR_Actuator_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OmcricoreTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_omcricore_c_c_Robot_0 = idResolver.getClass(OmcricoreTables.CLSSid_Robot, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_omcricore_c_c_Robot_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OmcricoreTables.STR_Actuator_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, OmcricoreTables.INT_0).booleanValue();
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
				setHorizontalTilt((String)newValue);
				return;
			case OmcricorePackage.FLIGHTACTUATOR__VERTICAL_TILT:
				setVerticalTilt((String)newValue);
				return;
			case OmcricorePackage.FLIGHTACTUATOR__HORIZONTAL_SPEED:
				setHorizontalSpeed((String)newValue);
				return;
			case OmcricorePackage.FLIGHTACTUATOR__VERTICAL_SPEED:
				setVerticalSpeed((String)newValue);
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Actuator.class) {
			switch (baseOperationID) {
				case OmcricorePackage.ACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return OmcricorePackage.FLIGHTACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
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
			case OmcricorePackage.FLIGHTACTUATOR___MOVE:
				move();
				return null;
			case OmcricorePackage.FLIGHTACTUATOR___LAND:
				land();
				return null;
			case OmcricorePackage.FLIGHTACTUATOR___TAKEOFF:
				takeoff();
				return null;
			case OmcricorePackage.FLIGHTACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
