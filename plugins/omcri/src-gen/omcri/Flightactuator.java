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
package omcri;

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flightactuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link omcri.Flightactuator#getHorizontalTilt <em>Horizontal Tilt</em>}</li>
 *   <li>{@link omcri.Flightactuator#getVerticalTilt <em>Vertical Tilt</em>}</li>
 *   <li>{@link omcri.Flightactuator#getHorizontalSpeed <em>Horizontal Speed</em>}</li>
 *   <li>{@link omcri.Flightactuator#getVerticalSpeed <em>Vertical Speed</em>}</li>
 * </ul>
 *
 * @see omcri.OmcriPackage#getFlightactuator()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Flightactuator extends MixinBase, Actuator {
	/**
	 * Returns the value of the '<em><b>Horizontal Tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Tilt</em>' attribute.
	 * @see #setHorizontalTilt(Integer)
	 * @see omcri.OmcriPackage#getFlightactuator_HorizontalTilt()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Flightactuator!horizontalTilt'"
	 * @generated
	 */
	Integer getHorizontalTilt();

	/**
	 * Sets the value of the '{@link omcri.Flightactuator#getHorizontalTilt <em>Horizontal Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Tilt</em>' attribute.
	 * @see #getHorizontalTilt()
	 * @generated
	 */
	void setHorizontalTilt(Integer value);

	/**
	 * Returns the value of the '<em><b>Vertical Tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Tilt</em>' attribute.
	 * @see #setVerticalTilt(Integer)
	 * @see omcri.OmcriPackage#getFlightactuator_VerticalTilt()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Flightactuator!verticalTilt'"
	 * @generated
	 */
	Integer getVerticalTilt();

	/**
	 * Sets the value of the '{@link omcri.Flightactuator#getVerticalTilt <em>Vertical Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Tilt</em>' attribute.
	 * @see #getVerticalTilt()
	 * @generated
	 */
	void setVerticalTilt(Integer value);

	/**
	 * Returns the value of the '<em><b>Horizontal Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Speed</em>' attribute.
	 * @see #setHorizontalSpeed(Integer)
	 * @see omcri.OmcriPackage#getFlightactuator_HorizontalSpeed()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Flightactuator!horizontalSpeed'"
	 * @generated
	 */
	Integer getHorizontalSpeed();

	/**
	 * Sets the value of the '{@link omcri.Flightactuator#getHorizontalSpeed <em>Horizontal Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Speed</em>' attribute.
	 * @see #getHorizontalSpeed()
	 * @generated
	 */
	void setHorizontalSpeed(Integer value);

	/**
	 * Returns the value of the '<em><b>Vertical Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Speed</em>' attribute.
	 * @see #setVerticalSpeed(Integer)
	 * @see omcri.OmcriPackage#getFlightactuator_VerticalSpeed()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Flightactuator!verticalSpeed'"
	 * @generated
	 */
	Integer getVerticalSpeed();

	/**
	 * Sets the value of the '{@link omcri.Flightactuator#getVerticalSpeed <em>Vertical Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Speed</em>' attribute.
	 * @see #getVerticalSpeed()
	 * @generated
	 */
	void setVerticalSpeed(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Flightactuator!move()'"
	 * @generated
	 */
	void move();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Flightactuator!land()'"
	 * @generated
	 */
	void land();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://omcri.org/cloudrobotics/ecore!Flightactuator!takeoff()'"
	 * @generated
	 */
	void takeoff();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let\n *     severity : Integer[1] = \'Flightactuator::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let result : occi::Boolean[1] = self.entity.oclIsKindOf(Ardrone)\n *       in\n *         \'Flightactuator::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%omcri.OmcriTables%&gt;.STR_Flightactuator_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%omcri.OmcriTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_omcri_c_c_Ardrone = idResolver.getClass(&lt;%omcri.OmcriTables%&gt;.CLSSid_Ardrone, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_omcri_c_c_Ardrone).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%omcri.OmcriTables%&gt;.STR_Flightactuator_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%omcri.OmcriTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Flightactuator
