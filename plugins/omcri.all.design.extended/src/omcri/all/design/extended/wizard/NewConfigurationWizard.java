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

package omcri.all.design.extended.wizard;

import org.eclipse.cmf.occi.core.design.utils.NewDiagramWizard;

/**
 * This is a simple wizard for creating a new omcriall model file.
 */

public class NewConfigurationWizard extends NewDiagramWizard
{
	public NewConfigurationWizard()
	{
		super("http://occiware.org/cloudrobotics/all#", "viewpoint:/omcri.all.design.extended/OmcriallConfiguration", "omcriall", "OmcriallConfiguration Diagram");
	}
}
