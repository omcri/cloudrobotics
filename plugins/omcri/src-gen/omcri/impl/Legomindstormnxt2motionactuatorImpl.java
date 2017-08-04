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
import omcri.Legomindstormnxt2motionactuator;
import omcri.Motionactuator;
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
 * An implementation of the model object '<em><b>Legomindstormnxt2motionactuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link omcri.impl.Legomindstormnxt2motionactuatorImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link omcri.impl.Legomindstormnxt2motionactuatorImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link omcri.impl.Legomindstormnxt2motionactuatorImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Legomindstormnxt2motionactuatorImpl extends MixinBaseImpl implements Legomindstormnxt2motionactuator {
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
	protected Legomindstormnxt2motionactuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OmcriPackage.Literals.LEGOMINDSTORMNXT2MOTIONACTUATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__ANGLE, oldAngle, angle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__SPEED, oldSpeed, speed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__DURATION, oldDuration, duration));
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
		 *     severity : Integer[1] = 'Legomindstormnxt2motionactuator::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Legomindstormnxt2)
		 *       in
		 *         'Legomindstormnxt2motionactuator::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OmcriTables.STR_Legomindstormnxt2motionactuator_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OmcriTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_omcri_c_c_Legomindstormnxt2_0 = idResolver.getClass(OmcriTables.CLSSid_Legomindstormnxt2, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_omcri_c_c_Legomindstormnxt2_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OmcriTables.STR_Legomindstormnxt2motionactuator_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, OmcriTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void moveforward() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Motionactuator!moveforward()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void movebackward() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Motionactuator!movebackward()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void turnright() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Motionactuator!turnright()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void turnleft() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Motionactuator!turnleft()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Motionactuator!stop()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__ANGLE:
				return getAngle();
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__SPEED:
				return getSpeed();
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__DURATION:
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
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__ANGLE:
				setAngle((Integer)newValue);
				return;
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__SPEED:
				setSpeed((Integer)newValue);
				return;
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__DURATION:
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
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__ANGLE:
				setAngle(ANGLE_EDEFAULT);
				return;
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__DURATION:
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
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__ANGLE:
				return ANGLE_EDEFAULT == null ? angle != null : !ANGLE_EDEFAULT.equals(angle);
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__SPEED:
				return SPEED_EDEFAULT == null ? speed != null : !SPEED_EDEFAULT.equals(speed);
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__DURATION:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Actuator.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Motionactuator.class) {
			switch (derivedFeatureID) {
				case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__ANGLE: return OmcriPackage.MOTIONACTUATOR__ANGLE;
				case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__SPEED: return OmcriPackage.MOTIONACTUATOR__SPEED;
				case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__DURATION: return OmcriPackage.MOTIONACTUATOR__DURATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Actuator.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Motionactuator.class) {
			switch (baseFeatureID) {
				case OmcriPackage.MOTIONACTUATOR__ANGLE: return OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__ANGLE;
				case OmcriPackage.MOTIONACTUATOR__SPEED: return OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__SPEED;
				case OmcriPackage.MOTIONACTUATOR__DURATION: return OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR__DURATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
				case OmcriPackage.ACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		if (baseClass == Motionactuator.class) {
			switch (baseOperationID) {
				case OmcriPackage.MOTIONACTUATOR___MOVEFORWARD: return OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR___MOVEFORWARD;
				case OmcriPackage.MOTIONACTUATOR___MOVEBACKWARD: return OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR___MOVEBACKWARD;
				case OmcriPackage.MOTIONACTUATOR___TURNRIGHT: return OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR___TURNRIGHT;
				case OmcriPackage.MOTIONACTUATOR___TURNLEFT: return OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR___TURNLEFT;
				case OmcriPackage.MOTIONACTUATOR___STOP: return OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR___STOP;
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
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR___MOVEFORWARD:
				moveforward();
				return null;
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR___MOVEBACKWARD:
				movebackward();
				return null;
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR___TURNRIGHT:
				turnright();
				return null;
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR___TURNLEFT:
				turnleft();
				return null;
			case OmcriPackage.LEGOMINDSTORMNXT2MOTIONACTUATOR___STOP:
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

} //Legomindstormnxt2motionactuatorImpl
