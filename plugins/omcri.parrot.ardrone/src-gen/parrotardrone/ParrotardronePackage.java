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
package parrotardrone;

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
 * @see parrotardrone.ParrotardroneFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 *        annotation="http://www.eclipse.org/OCL/Import occi='http://schemas.ogf.org/occi/core/ecore' omcricore='http://occiware.org/cloudrobotics/core/ecore'"
 * @generated
 */
public interface ParrotardronePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "parrotardrone";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/cloudrobotics/parrotardrone/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "parrotardrone";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParrotardronePackage eINSTANCE = parrotardrone.impl.ParrotardronePackageImpl.init();

	/**
	 * The meta object id for the '{@link parrotardrone.impl.ArdroneImpl <em>Ardrone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parrotardrone.impl.ArdroneImpl
	 * @see parrotardrone.impl.ParrotardronePackageImpl#getArdrone()
	 * @generated
	 */
	int ARDRONE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__ID = OmcricorePackage.ROBOT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__TITLE = OmcricorePackage.ROBOT__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__KIND = OmcricorePackage.ROBOT__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__LOCATION = OmcricorePackage.ROBOT__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__ATTRIBUTES = OmcricorePackage.ROBOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__MIXINS = OmcricorePackage.ROBOT__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__PARTS = OmcricorePackage.ROBOT__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__SUMMARY = OmcricorePackage.ROBOT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__LINKS = OmcricorePackage.ROBOT__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__RLINKS = OmcricorePackage.ROBOT__RLINKS;

	/**
	 * The feature id for the '<em><b>Ipadress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__IPADRESS = OmcricorePackage.ROBOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ssid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__SSID = OmcricorePackage.ROBOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ardrone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE_FEATURE_COUNT = OmcricorePackage.ROBOT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE___OCCI_CREATE = OmcricorePackage.ROBOT___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE___OCCI_RETRIEVE = OmcricorePackage.ROBOT___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE___OCCI_UPDATE = OmcricorePackage.ROBOT___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE___OCCI_DELETE = OmcricorePackage.ROBOT___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Ardrone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE_OPERATION_COUNT = OmcricorePackage.ROBOT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link parrotardrone.Ardrone <em>Ardrone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ardrone</em>'.
	 * @see parrotardrone.Ardrone
	 * @generated
	 */
	EClass getArdrone();

	/**
	 * Returns the meta object for the attribute '{@link parrotardrone.Ardrone#getIpadress <em>Ipadress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ipadress</em>'.
	 * @see parrotardrone.Ardrone#getIpadress()
	 * @see #getArdrone()
	 * @generated
	 */
	EAttribute getArdrone_Ipadress();

	/**
	 * Returns the meta object for the attribute '{@link parrotardrone.Ardrone#getSsid <em>Ssid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssid</em>'.
	 * @see parrotardrone.Ardrone#getSsid()
	 * @see #getArdrone()
	 * @generated
	 */
	EAttribute getArdrone_Ssid();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParrotardroneFactory getParrotardroneFactory();

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
		 * The meta object literal for the '{@link parrotardrone.impl.ArdroneImpl <em>Ardrone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parrotardrone.impl.ArdroneImpl
		 * @see parrotardrone.impl.ParrotardronePackageImpl#getArdrone()
		 * @generated
		 */
		EClass ARDRONE = eINSTANCE.getArdrone();

		/**
		 * The meta object literal for the '<em><b>Ipadress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDRONE__IPADRESS = eINSTANCE.getArdrone_Ipadress();

		/**
		 * The meta object literal for the '<em><b>Ssid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDRONE__SSID = eINSTANCE.getArdrone_Ssid();

	}

} //ParrotardronePackage
