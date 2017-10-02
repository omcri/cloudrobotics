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
package parrotminidrone;

import omcricore.OmcricorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see parrotminidrone.ParrotminidroneFactory
 * @model kind="package"
 * @generated
 */
public interface ParrotminidronePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "parrotminidrone";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://omcri.org/cloudrobotics/parrotminidrone/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "parrotminidrone";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParrotminidronePackage eINSTANCE = parrotminidrone.impl.ParrotminidronePackageImpl.init();

	/**
	 * The meta object id for the '{@link parrotminidrone.impl.MinidroneImpl <em>Minidrone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parrotminidrone.impl.MinidroneImpl
	 * @see parrotminidrone.impl.ParrotminidronePackageImpl#getMinidrone()
	 * @generated
	 */
	int MINIDRONE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIDRONE__ID = OmcricorePackage.ROBOT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIDRONE__TITLE = OmcricorePackage.ROBOT__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIDRONE__KIND = OmcricorePackage.ROBOT__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIDRONE__LOCATION = OmcricorePackage.ROBOT__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIDRONE__ATTRIBUTES = OmcricorePackage.ROBOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIDRONE__MIXINS = OmcricorePackage.ROBOT__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIDRONE__PARTS = OmcricorePackage.ROBOT__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIDRONE__SUMMARY = OmcricorePackage.ROBOT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIDRONE__LINKS = OmcricorePackage.ROBOT__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIDRONE__RLINKS = OmcricorePackage.ROBOT__RLINKS;

	/**
	 * The feature id for the '<em><b>Ipadress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIDRONE__IPADRESS = OmcricorePackage.ROBOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIDRONE__NAME = OmcricorePackage.ROBOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Minidrone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIDRONE_FEATURE_COUNT = OmcricorePackage.ROBOT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIDRONE___OCCI_CREATE = OmcricorePackage.ROBOT___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIDRONE___OCCI_RETRIEVE = OmcricorePackage.ROBOT___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIDRONE___OCCI_UPDATE = OmcricorePackage.ROBOT___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIDRONE___OCCI_DELETE = OmcricorePackage.ROBOT___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Minidrone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIDRONE_OPERATION_COUNT = OmcricorePackage.ROBOT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link parrotminidrone.Minidrone <em>Minidrone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minidrone</em>'.
	 * @see parrotminidrone.Minidrone
	 * @generated
	 */
	EClass getMinidrone();

	/**
	 * Returns the meta object for the attribute '{@link parrotminidrone.Minidrone#getIpadress <em>Ipadress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ipadress</em>'.
	 * @see parrotminidrone.Minidrone#getIpadress()
	 * @see #getMinidrone()
	 * @generated
	 */
	EAttribute getMinidrone_Ipadress();

	/**
	 * Returns the meta object for the attribute '{@link parrotminidrone.Minidrone#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see parrotminidrone.Minidrone#getName()
	 * @see #getMinidrone()
	 * @generated
	 */
	EAttribute getMinidrone_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParrotminidroneFactory getParrotminidroneFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link parrotminidrone.impl.MinidroneImpl <em>Minidrone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parrotminidrone.impl.MinidroneImpl
		 * @see parrotminidrone.impl.ParrotminidronePackageImpl#getMinidrone()
		 * @generated
		 */
		EClass MINIDRONE = eINSTANCE.getMinidrone();

		/**
		 * The meta object literal for the '<em><b>Ipadress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINIDRONE__IPADRESS = eINSTANCE.getMinidrone_Ipadress();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINIDRONE__NAME = eINSTANCE.getMinidrone_Name();

	}

} //ParrotminidronePackage
