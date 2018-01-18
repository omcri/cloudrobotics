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
package omcri.legomindstormev3.impl;

import omcri.legomindstormev3.Legomindstormev3;
import omcri.legomindstormev3.Legomindstormev3Factory;
import omcri.legomindstormev3.Legomindstormev3Package;

import omcricore.OmcricorePackage;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Legomindstormev3PackageImpl extends EPackageImpl implements Legomindstormev3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legomindstormev3EClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see omcri.legomindstormev3.Legomindstormev3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Legomindstormev3PackageImpl() {
		super(eNS_URI, Legomindstormev3Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Legomindstormev3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Legomindstormev3Package init() {
		if (isInited) return (Legomindstormev3Package)EPackage.Registry.INSTANCE.getEPackage(Legomindstormev3Package.eNS_URI);

		// Obtain or create and register package
		Legomindstormev3PackageImpl theLegomindstormev3Package = (Legomindstormev3PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Legomindstormev3PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Legomindstormev3PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OmcricorePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLegomindstormev3Package.createPackageContents();

		// Initialize created meta-data
		theLegomindstormev3Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLegomindstormev3Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Legomindstormev3Package.eNS_URI, theLegomindstormev3Package);
		return theLegomindstormev3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegomindstormev3() {
		return legomindstormev3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegomindstormev3_Ipaddress() {
		return (EAttribute)legomindstormev3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Legomindstormev3Factory getLegomindstormev3Factory() {
		return (Legomindstormev3Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		legomindstormev3EClass = createEClass(LEGOMINDSTORMEV3);
		createEAttribute(legomindstormev3EClass, LEGOMINDSTORMEV3__IPADDRESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OmcricorePackage theOmcricorePackage = (OmcricorePackage)EPackage.Registry.INSTANCE.getEPackage(OmcricorePackage.eNS_URI);
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		legomindstormev3EClass.getESuperTypes().add(theOmcricorePackage.getRobot());

		// Initialize classes, features, and operations; add parameters
		initEClass(legomindstormev3EClass, Legomindstormev3.class, "Legomindstormev3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegomindstormev3_Ipaddress(), theOCCIPackage.getString(), "ipaddress", null, 0, 1, Legomindstormev3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "occi", "http://schemas.ogf.org/occi/core/ecore",
			 "omcricore", "http://occiware.org/cloudrobotics/core/ecore"
		   });
	}

} //Legomindstormev3PackageImpl
