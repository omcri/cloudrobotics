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
package omcri.legomindstormnxt2.impl;

import omcri.legomindstormnxt2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Legomindstormnxt2FactoryImpl extends EFactoryImpl implements Legomindstormnxt2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Legomindstormnxt2Factory init() {
		try {
			Legomindstormnxt2Factory theLegomindstormnxt2Factory = (Legomindstormnxt2Factory)EPackage.Registry.INSTANCE.getEFactory(Legomindstormnxt2Package.eNS_URI);
			if (theLegomindstormnxt2Factory != null) {
				return theLegomindstormnxt2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Legomindstormnxt2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Legomindstormnxt2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Legomindstormnxt2Package.LEGOMINDSTORMNXT2: return createLegomindstormnxt2();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Legomindstormnxt2 createLegomindstormnxt2() {
		Legomindstormnxt2Impl legomindstormnxt2 = new Legomindstormnxt2Impl();
		return legomindstormnxt2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Legomindstormnxt2Package getLegomindstormnxt2Package() {
		return (Legomindstormnxt2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Legomindstormnxt2Package getPackage() {
		return Legomindstormnxt2Package.eINSTANCE;
	}

} //Legomindstormnxt2FactoryImpl
