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

import omcricore.OmcricorePackage;
import omcricore.OmcricoreTables;
import omcricore.Sensor;
import omcricore.Ultrasonicsensor;

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
 * An implementation of the model object '<em><b>Ultrasonicsensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link omcricore.impl.UltrasonicsensorImpl#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UltrasonicsensorImpl extends MixinBaseImpl implements Ultrasonicsensor {
	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected String distance = DISTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UltrasonicsensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OmcricorePackage.Literals.ULTRASONICSENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(String newDistance) {
		String oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmcricorePackage.ULTRASONICSENSOR__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sensedistance() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/core/ecore!Ultrasonicsensor!sensedistance()
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
		 *   let severity : Integer[1] = 'Sensor::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let result : occi::Boolean[1] = self.entity.oclIsKindOf(Robot)
		 *       in
		 *         'Sensor::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OmcricoreTables.STR_Sensor_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OmcricoreTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_omcricore_c_c_Robot_0 = idResolver.getClass(OmcricoreTables.CLSSid_Robot, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_omcricore_c_c_Robot_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OmcricoreTables.STR_Sensor_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, OmcricoreTables.INT_0).booleanValue();
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
			case OmcricorePackage.ULTRASONICSENSOR__DISTANCE:
				return getDistance();
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
			case OmcricorePackage.ULTRASONICSENSOR__DISTANCE:
				setDistance((String)newValue);
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
			case OmcricorePackage.ULTRASONICSENSOR__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
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
			case OmcricorePackage.ULTRASONICSENSOR__DISTANCE:
				return DISTANCE_EDEFAULT == null ? distance != null : !DISTANCE_EDEFAULT.equals(distance);
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
				case OmcricorePackage.SENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return OmcricorePackage.ULTRASONICSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
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
			case OmcricorePackage.ULTRASONICSENSOR___SENSEDISTANCE:
				sensedistance();
				return null;
			case OmcricorePackage.ULTRASONICSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (distance: ");
		result.append(distance);
		result.append(')');
		return result.toString();
	}

} //UltrasonicsensorImpl