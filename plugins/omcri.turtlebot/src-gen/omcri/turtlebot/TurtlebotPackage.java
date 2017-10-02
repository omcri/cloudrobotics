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
package omcri.turtlebot;

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
 * @see omcri.turtlebot.TurtlebotFactory
 * @model kind="package"
 * @generated
 */
public interface TurtlebotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "turtlebot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://omcri.org/cloudrobotics/turtlebot/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "turtlebot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TurtlebotPackage eINSTANCE = omcri.turtlebot.impl.TurtlebotPackageImpl.init();

	/**
	 * The meta object id for the '{@link omcri.turtlebot.impl.TurtlebotImpl <em>Turtlebot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.turtlebot.impl.TurtlebotImpl
	 * @see omcri.turtlebot.impl.TurtlebotPackageImpl#getTurtlebot()
	 * @generated
	 */
	int TURTLEBOT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__ID = OmcricorePackage.ROBOT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__TITLE = OmcricorePackage.ROBOT__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__KIND = OmcricorePackage.ROBOT__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__LOCATION = OmcricorePackage.ROBOT__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__ATTRIBUTES = OmcricorePackage.ROBOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__MIXINS = OmcricorePackage.ROBOT__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__PARTS = OmcricorePackage.ROBOT__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__SUMMARY = OmcricorePackage.ROBOT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__LINKS = OmcricorePackage.ROBOT__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__RLINKS = OmcricorePackage.ROBOT__RLINKS;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__USER = OmcricorePackage.ROBOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__PASSWORD = OmcricorePackage.ROBOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ipaddress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__IPADDRESS = OmcricorePackage.ROBOT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Turtlebot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT_FEATURE_COUNT = OmcricorePackage.ROBOT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT___OCCI_CREATE = OmcricorePackage.ROBOT___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT___OCCI_RETRIEVE = OmcricorePackage.ROBOT___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT___OCCI_UPDATE = OmcricorePackage.ROBOT___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT___OCCI_DELETE = OmcricorePackage.ROBOT___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Turtlebot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT_OPERATION_COUNT = OmcricorePackage.ROBOT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link omcri.turtlebot.Turtlebot <em>Turtlebot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turtlebot</em>'.
	 * @see omcri.turtlebot.Turtlebot
	 * @generated
	 */
	EClass getTurtlebot();

	/**
	 * Returns the meta object for the attribute '{@link omcri.turtlebot.Turtlebot#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see omcri.turtlebot.Turtlebot#getUser()
	 * @see #getTurtlebot()
	 * @generated
	 */
	EAttribute getTurtlebot_User();

	/**
	 * Returns the meta object for the attribute '{@link omcri.turtlebot.Turtlebot#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see omcri.turtlebot.Turtlebot#getPassword()
	 * @see #getTurtlebot()
	 * @generated
	 */
	EAttribute getTurtlebot_Password();

	/**
	 * Returns the meta object for the attribute '{@link omcri.turtlebot.Turtlebot#getIpaddress <em>Ipaddress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ipaddress</em>'.
	 * @see omcri.turtlebot.Turtlebot#getIpaddress()
	 * @see #getTurtlebot()
	 * @generated
	 */
	EAttribute getTurtlebot_Ipaddress();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TurtlebotFactory getTurtlebotFactory();

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
		 * The meta object literal for the '{@link omcri.turtlebot.impl.TurtlebotImpl <em>Turtlebot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.turtlebot.impl.TurtlebotImpl
		 * @see omcri.turtlebot.impl.TurtlebotPackageImpl#getTurtlebot()
		 * @generated
		 */
		EClass TURTLEBOT = eINSTANCE.getTurtlebot();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURTLEBOT__USER = eINSTANCE.getTurtlebot_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURTLEBOT__PASSWORD = eINSTANCE.getTurtlebot_Password();

		/**
		 * The meta object literal for the '<em><b>Ipaddress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURTLEBOT__IPADDRESS = eINSTANCE.getTurtlebot_Ipaddress();

	}

} //TurtlebotPackage
