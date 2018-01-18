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
package omcricore;

import java.util.Map;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robotlink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generic robotlink to link resources with a robot
 * <!-- end-model-doc -->
 *
 *
 * @see omcricore.OmcricorePackage#getRobotlink()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='targetConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot targetConstraint='self.target.oclIsKindOf(omcricore::Robot)'"
 * @generated
 */
public interface Robotlink extends Link {
} // Robotlink
