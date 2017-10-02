/*******************************************************************************
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
 *******************************************************************************/

package omcri.legomindstormNXT2.design.wizard;

import org.eclipse.cmf.occi.core.design.utils.NewDiagramWizard;

/**
 * This is a simple wizard for creating a new legomindstormnxt2 model file.
 */

public class NewConfigurationWizard extends NewDiagramWizard
{
	public NewConfigurationWizard()
	{
		super("http://omcri.org/cloudrobotics/mindstormnxt#", "viewpoint:/omcri.legomindstormNXT2.design/Legomindstormnxt2Configuration", "legomindstormnxt2", "Legomindstormnxt2Configuration Diagram");
	}
}
