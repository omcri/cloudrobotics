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
package omcri.legomindstormev3;

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
 * @see omcri.legomindstormev3.Legomindstormev3Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 *        annotation="http://www.eclipse.org/OCL/Import core='http://schemas.ogf.org/occi/core/ecore' omcricore='http://omcri.org/cloudrobotics/core/ecore'"
 * @generated
 */
public interface Legomindstormev3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "legomindstormev3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://omcri.org/cloudrobotics/mindstormev3/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "legomindstormev3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Legomindstormev3Package eINSTANCE = omcri.legomindstormev3.impl.Legomindstormev3PackageImpl.init();

	/**
	 * The meta object id for the '{@link omcri.legomindstormev3.impl.Legomindstormev3Impl <em>Legomindstormev3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.legomindstormev3.impl.Legomindstormev3Impl
	 * @see omcri.legomindstormev3.impl.Legomindstormev3PackageImpl#getLegomindstormev3()
	 * @generated
	 */
	int LEGOMINDSTORMEV3 = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMEV3__ID = OmcricorePackage.ROBOT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMEV3__TITLE = OmcricorePackage.ROBOT__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMEV3__KIND = OmcricorePackage.ROBOT__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMEV3__LOCATION = OmcricorePackage.ROBOT__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMEV3__ATTRIBUTES = OmcricorePackage.ROBOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMEV3__MIXINS = OmcricorePackage.ROBOT__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMEV3__PARTS = OmcricorePackage.ROBOT__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMEV3__SUMMARY = OmcricorePackage.ROBOT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMEV3__LINKS = OmcricorePackage.ROBOT__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMEV3__RLINKS = OmcricorePackage.ROBOT__RLINKS;

	/**
	 * The feature id for the '<em><b>Ipaddress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMEV3__IPADDRESS = OmcricorePackage.ROBOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Legomindstormev3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMEV3_FEATURE_COUNT = OmcricorePackage.ROBOT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMEV3___OCCI_CREATE = OmcricorePackage.ROBOT___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMEV3___OCCI_RETRIEVE = OmcricorePackage.ROBOT___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMEV3___OCCI_UPDATE = OmcricorePackage.ROBOT___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMEV3___OCCI_DELETE = OmcricorePackage.ROBOT___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Legomindstormev3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMEV3_OPERATION_COUNT = OmcricorePackage.ROBOT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link omcri.legomindstormev3.Legomindstormev3 <em>Legomindstormev3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legomindstormev3</em>'.
	 * @see omcri.legomindstormev3.Legomindstormev3
	 * @generated
	 */
	EClass getLegomindstormev3();

	/**
	 * Returns the meta object for the attribute '{@link omcri.legomindstormev3.Legomindstormev3#getIpaddress <em>Ipaddress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ipaddress</em>'.
	 * @see omcri.legomindstormev3.Legomindstormev3#getIpaddress()
	 * @see #getLegomindstormev3()
	 * @generated
	 */
	EAttribute getLegomindstormev3_Ipaddress();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Legomindstormev3Factory getLegomindstormev3Factory();

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
		 * The meta object literal for the '{@link omcri.legomindstormev3.impl.Legomindstormev3Impl <em>Legomindstormev3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.legomindstormev3.impl.Legomindstormev3Impl
		 * @see omcri.legomindstormev3.impl.Legomindstormev3PackageImpl#getLegomindstormev3()
		 * @generated
		 */
		EClass LEGOMINDSTORMEV3 = eINSTANCE.getLegomindstormev3();

		/**
		 * The meta object literal for the '<em><b>Ipaddress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGOMINDSTORMEV3__IPADDRESS = eINSTANCE.getLegomindstormev3_Ipaddress();

	}

} //Legomindstormev3Package
