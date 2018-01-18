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
package parrotminidrone.impl;

import omcricore.OmcricorePackage;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import parrotminidrone.Minidrone;
import parrotminidrone.ParrotminidroneFactory;
import parrotminidrone.ParrotminidronePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParrotminidronePackageImpl extends EPackageImpl implements ParrotminidronePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minidroneEClass = null;

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
	 * @see parrotminidrone.ParrotminidronePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ParrotminidronePackageImpl() {
		super(eNS_URI, ParrotminidroneFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ParrotminidronePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ParrotminidronePackage init() {
		if (isInited) return (ParrotminidronePackage)EPackage.Registry.INSTANCE.getEPackage(ParrotminidronePackage.eNS_URI);

		// Obtain or create and register package
		ParrotminidronePackageImpl theParrotminidronePackage = (ParrotminidronePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ParrotminidronePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ParrotminidronePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OmcricorePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theParrotminidronePackage.createPackageContents();

		// Initialize created meta-data
		theParrotminidronePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theParrotminidronePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ParrotminidronePackage.eNS_URI, theParrotminidronePackage);
		return theParrotminidronePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinidrone() {
		return minidroneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinidrone_Ipadress() {
		return (EAttribute)minidroneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinidrone_Name() {
		return (EAttribute)minidroneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParrotminidroneFactory getParrotminidroneFactory() {
		return (ParrotminidroneFactory)getEFactoryInstance();
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
		minidroneEClass = createEClass(MINIDRONE);
		createEAttribute(minidroneEClass, MINIDRONE__IPADRESS);
		createEAttribute(minidroneEClass, MINIDRONE__NAME);
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
		minidroneEClass.getESuperTypes().add(theOmcricorePackage.getRobot());

		// Initialize classes, features, and operations; add parameters
		initEClass(minidroneEClass, Minidrone.class, "Minidrone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinidrone_Ipadress(), theOCCIPackage.getString(), "ipadress", null, 0, 1, Minidrone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinidrone_Name(), theOCCIPackage.getString(), "name", null, 0, 1, Minidrone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

} //ParrotminidronePackageImpl
