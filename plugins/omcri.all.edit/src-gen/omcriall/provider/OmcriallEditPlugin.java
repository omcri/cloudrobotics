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
package omcriall.provider;

import omcri.legomindstormev3.provider.Legomindstormev3EditPlugin;

import omcri.legomindstormnxt2.provider.Legomindstormnxt2EditPlugin;

import omcri.turtlebot.provider.TurtlebotEditPlugin;

import omcricore.provider.OmcricoreEditPlugin;

import org.eclipse.cmf.occi.core.provider.OCCIEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import parrotardrone.provider.ParrotardroneEditPlugin;

import parrotminidrone.provider.ParrotminidroneEditPlugin;

/**
 * This is the central singleton for the Omcriall edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class OmcriallEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OmcriallEditPlugin INSTANCE = new OmcriallEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OmcriallEditPlugin() {
		super
		  (new ResourceLocator [] {
		     Legomindstormnxt2EditPlugin.INSTANCE,
		     TurtlebotEditPlugin.INSTANCE,
		     ParrotminidroneEditPlugin.INSTANCE,
		     OmcricoreEditPlugin.INSTANCE,
		     ParrotardroneEditPlugin.INSTANCE,
		     Legomindstormev3EditPlugin.INSTANCE,
		     OCCIEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
