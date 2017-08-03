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
package omcri.util;

import java.util.Map;

import omcri.*;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see omcri.OmcriPackage
 * @generated
 */
public class OmcriValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OmcriValidator INSTANCE = new OmcriValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "omcri";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Actuator'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTUATOR__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Touchsensor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOUCHSENSOR__APPLIES_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Motionactuator'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOTIONACTUATOR__APPLIES_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Sensor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SENSOR__APPLIES_CONSTRAINT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Colorsensor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COLORSENSOR__APPLIES_CONSTRAINT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Ultrasonicsensor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ULTRASONICSENSOR__APPLIES_CONSTRAINT = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Mouthactuator'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOUTHACTUATOR__APPLIES_CONSTRAINT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Flightactuator'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FLIGHTACTUATOR__APPLIES_CONSTRAINT = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCCIValidator occiValidator;

	/**
	 * Delegates evaluation of the given invariant expression against the object in the given context.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context, String validationDelegate, EOperation invariant, String expression, int severity, String source, int code) {
		return EObjectValidator.validate(eClass, eObject, diagnostics, context, validationDelegate, invariant, expression, severity, source, code);
	}

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OmcriValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OmcriPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case OmcriPackage.ROBOT:
				return validateRobot((Robot)value, diagnostics, context);
			case OmcriPackage.LEGOMINDSTORMNXT2:
				return validateLegomindstormnxt2((Legomindstormnxt2)value, diagnostics, context);
			case OmcriPackage.ARDRONE:
				return validateArdrone((Ardrone)value, diagnostics, context);
			case OmcriPackage.TURTLEBOT:
				return validateTurtlebot((Turtlebot)value, diagnostics, context);
			case OmcriPackage.ACTUATOR:
				return validateActuator((Actuator)value, diagnostics, context);
			case OmcriPackage.TOUCHSENSOR:
				return validateTouchsensor((Touchsensor)value, diagnostics, context);
			case OmcriPackage.MOTIONACTUATOR:
				return validateMotionactuator((Motionactuator)value, diagnostics, context);
			case OmcriPackage.SENSOR:
				return validateSensor((Sensor)value, diagnostics, context);
			case OmcriPackage.COLORSENSOR:
				return validateColorsensor((Colorsensor)value, diagnostics, context);
			case OmcriPackage.ULTRASONICSENSOR:
				return validateUltrasonicsensor((Ultrasonicsensor)value, diagnostics, context);
			case OmcriPackage.MOUTHACTUATOR:
				return validateMouthactuator((Mouthactuator)value, diagnostics, context);
			case OmcriPackage.FLIGHTACTUATOR:
				return validateFlightactuator((Flightactuator)value, diagnostics, context);
			case OmcriPackage.COLOR:
				return validateColor((Color)value, diagnostics, context);
			case OmcriPackage.TOUCH:
				return validateTouch((Touch)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRobot(Robot robot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(robot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(robot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(robot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(robot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(robot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(robot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(robot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(robot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(robot, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(robot, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(robot, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(robot, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(robot, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegomindstormnxt2(Legomindstormnxt2 legomindstormnxt2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(legomindstormnxt2, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(legomindstormnxt2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(legomindstormnxt2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(legomindstormnxt2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(legomindstormnxt2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(legomindstormnxt2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(legomindstormnxt2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(legomindstormnxt2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(legomindstormnxt2, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(legomindstormnxt2, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(legomindstormnxt2, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(legomindstormnxt2, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(legomindstormnxt2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArdrone(Ardrone ardrone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ardrone, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ardrone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ardrone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ardrone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ardrone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ardrone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ardrone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ardrone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ardrone, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(ardrone, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(ardrone, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(ardrone, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(ardrone, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurtlebot(Turtlebot turtlebot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(turtlebot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(turtlebot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(turtlebot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(turtlebot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(turtlebot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(turtlebot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(turtlebot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(turtlebot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(turtlebot, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(turtlebot, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(turtlebot, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(turtlebot, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(turtlebot, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuator(Actuator actuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actuator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actuator, diagnostics, context);
		if (result || diagnostics != null) result &= validateActuator_appliesConstraint(actuator, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuator_appliesConstraint(Actuator actuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return actuator.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTouchsensor(Touchsensor touchsensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(touchsensor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(touchsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(touchsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(touchsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(touchsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(touchsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(touchsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(touchsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(touchsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validateTouchsensor_appliesConstraint(touchsensor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Touchsensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTouchsensor_appliesConstraint(Touchsensor touchsensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return touchsensor.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMotionactuator(Motionactuator motionactuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(motionactuator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(motionactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(motionactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(motionactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(motionactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(motionactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(motionactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(motionactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(motionactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validateMotionactuator_appliesConstraint(motionactuator, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Motionactuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMotionactuator_appliesConstraint(Motionactuator motionactuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return motionactuator.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sensor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validateSensor_appliesConstraint(sensor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor_appliesConstraint(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sensor.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorsensor(Colorsensor colorsensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(colorsensor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(colorsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(colorsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(colorsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(colorsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(colorsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(colorsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(colorsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(colorsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validateColorsensor_appliesConstraint(colorsensor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Colorsensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorsensor_appliesConstraint(Colorsensor colorsensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return colorsensor.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUltrasonicsensor(Ultrasonicsensor ultrasonicsensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ultrasonicsensor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ultrasonicsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ultrasonicsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ultrasonicsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ultrasonicsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ultrasonicsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ultrasonicsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ultrasonicsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ultrasonicsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validateUltrasonicsensor_appliesConstraint(ultrasonicsensor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Ultrasonicsensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUltrasonicsensor_appliesConstraint(Ultrasonicsensor ultrasonicsensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ultrasonicsensor.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMouthactuator(Mouthactuator mouthactuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mouthactuator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mouthactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mouthactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mouthactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mouthactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mouthactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mouthactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mouthactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mouthactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validateMouthactuator_appliesConstraint(mouthactuator, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Mouthactuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMouthactuator_appliesConstraint(Mouthactuator mouthactuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mouthactuator.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightactuator(Flightactuator flightactuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(flightactuator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(flightactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(flightactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(flightactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(flightactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(flightactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(flightactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(flightactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(flightactuator, diagnostics, context);
		if (result || diagnostics != null) result &= validateFlightactuator_appliesConstraint(flightactuator, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Flightactuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightactuator_appliesConstraint(Flightactuator flightactuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return flightactuator.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor(Color color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTouch(Touch touch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //OmcriValidator
