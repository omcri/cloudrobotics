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
package omcri.legomindstormnxt2;

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
 * @see omcri.legomindstormnxt2.Legomindstormnxt2Factory
 * @model kind="package"
 * @generated
 */
public interface Legomindstormnxt2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "legomindstormnxt2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://omcri.org/cloudrobotics/mindstormnxt/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "legomindstormnxt2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Legomindstormnxt2Package eINSTANCE = omcri.legomindstormnxt2.impl.Legomindstormnxt2PackageImpl.init();

	/**
	 * The meta object id for the '{@link omcri.legomindstormnxt2.impl.Legomindstormnxt2Impl <em>Legomindstormnxt2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.legomindstormnxt2.impl.Legomindstormnxt2Impl
	 * @see omcri.legomindstormnxt2.impl.Legomindstormnxt2PackageImpl#getLegomindstormnxt2()
	 * @generated
	 */
	int LEGOMINDSTORMNXT2 = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__ID = OmcricorePackage.ROBOT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__TITLE = OmcricorePackage.ROBOT__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__KIND = OmcricorePackage.ROBOT__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__LOCATION = OmcricorePackage.ROBOT__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__ATTRIBUTES = OmcricorePackage.ROBOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__MIXINS = OmcricorePackage.ROBOT__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__PARTS = OmcricorePackage.ROBOT__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__SUMMARY = OmcricorePackage.ROBOT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__LINKS = OmcricorePackage.ROBOT__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__RLINKS = OmcricorePackage.ROBOT__RLINKS;

	/**
	 * The feature id for the '<em><b>Mac Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__MAC_ADDRESS = OmcricorePackage.ROBOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Legomindstormnxt2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2_FEATURE_COUNT = OmcricorePackage.ROBOT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2___OCCI_CREATE = OmcricorePackage.ROBOT___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2___OCCI_RETRIEVE = OmcricorePackage.ROBOT___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2___OCCI_UPDATE = OmcricorePackage.ROBOT___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2___OCCI_DELETE = OmcricorePackage.ROBOT___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Legomindstormnxt2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2_OPERATION_COUNT = OmcricorePackage.ROBOT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link omcri.legomindstormnxt2.Legomindstormnxt2 <em>Legomindstormnxt2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legomindstormnxt2</em>'.
	 * @see omcri.legomindstormnxt2.Legomindstormnxt2
	 * @generated
	 */
	EClass getLegomindstormnxt2();

	/**
	 * Returns the meta object for the attribute '{@link omcri.legomindstormnxt2.Legomindstormnxt2#getMacAddress <em>Mac Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac Address</em>'.
	 * @see omcri.legomindstormnxt2.Legomindstormnxt2#getMacAddress()
	 * @see #getLegomindstormnxt2()
	 * @generated
	 */
	EAttribute getLegomindstormnxt2_MacAddress();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Legomindstormnxt2Factory getLegomindstormnxt2Factory();

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
		 * The meta object literal for the '{@link omcri.legomindstormnxt2.impl.Legomindstormnxt2Impl <em>Legomindstormnxt2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.legomindstormnxt2.impl.Legomindstormnxt2Impl
		 * @see omcri.legomindstormnxt2.impl.Legomindstormnxt2PackageImpl#getLegomindstormnxt2()
		 * @generated
		 */
		EClass LEGOMINDSTORMNXT2 = eINSTANCE.getLegomindstormnxt2();

		/**
		 * The meta object literal for the '<em><b>Mac Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGOMINDSTORMNXT2__MAC_ADDRESS = eINSTANCE.getLegomindstormnxt2_MacAddress();

	}

} //Legomindstormnxt2Package
