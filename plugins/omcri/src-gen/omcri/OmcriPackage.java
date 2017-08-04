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
package omcri;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see omcri.OmcriFactory
 * @model kind="package"
 * @generated
 */
public interface OmcriPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "omcri";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://omcri.org/cloudrobotics/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "omcri";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OmcriPackage eINSTANCE = omcri.impl.OmcriPackageImpl.init();

	/**
	 * The meta object id for the '{@link omcri.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.impl.RobotImpl
	 * @see omcri.impl.OmcriPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link omcri.impl.Legomindstormnxt2Impl <em>Legomindstormnxt2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.impl.Legomindstormnxt2Impl
	 * @see omcri.impl.OmcriPackageImpl#getLegomindstormnxt2()
	 * @generated
	 */
	int LEGOMINDSTORMNXT2 = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__ID = ROBOT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__TITLE = ROBOT__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__KIND = ROBOT__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__LOCATION = ROBOT__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__ATTRIBUTES = ROBOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__MIXINS = ROBOT__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__PARTS = ROBOT__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__SUMMARY = ROBOT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__LINKS = ROBOT__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__RLINKS = ROBOT__RLINKS;

	/**
	 * The feature id for the '<em><b>Mac Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2__MAC_ADDRESS = ROBOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Legomindstormnxt2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2_FEATURE_COUNT = ROBOT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2___OCCI_CREATE = ROBOT___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2___OCCI_RETRIEVE = ROBOT___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2___OCCI_UPDATE = ROBOT___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2___OCCI_DELETE = ROBOT___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Legomindstormnxt2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2_OPERATION_COUNT = ROBOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link omcri.impl.ArdroneImpl <em>Ardrone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.impl.ArdroneImpl
	 * @see omcri.impl.OmcriPackageImpl#getArdrone()
	 * @generated
	 */
	int ARDRONE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__ID = ROBOT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__TITLE = ROBOT__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__KIND = ROBOT__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__LOCATION = ROBOT__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__ATTRIBUTES = ROBOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__MIXINS = ROBOT__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__PARTS = ROBOT__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__SUMMARY = ROBOT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__LINKS = ROBOT__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__RLINKS = ROBOT__RLINKS;

	/**
	 * The feature id for the '<em><b>IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE__IP_ADDRESS = ROBOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ardrone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE_FEATURE_COUNT = ROBOT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE___OCCI_CREATE = ROBOT___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE___OCCI_RETRIEVE = ROBOT___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE___OCCI_UPDATE = ROBOT___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE___OCCI_DELETE = ROBOT___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Ardrone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDRONE_OPERATION_COUNT = ROBOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link omcri.impl.TurtlebotImpl <em>Turtlebot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.impl.TurtlebotImpl
	 * @see omcri.impl.OmcriPackageImpl#getTurtlebot()
	 * @generated
	 */
	int TURTLEBOT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__ID = ROBOT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__TITLE = ROBOT__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__KIND = ROBOT__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__LOCATION = ROBOT__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__ATTRIBUTES = ROBOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__MIXINS = ROBOT__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__PARTS = ROBOT__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__SUMMARY = ROBOT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__LINKS = ROBOT__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__RLINKS = ROBOT__RLINKS;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__USER = ROBOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__PASSWORD = ROBOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT__IP_ADDRESS = ROBOT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Turtlebot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT_FEATURE_COUNT = ROBOT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT___OCCI_CREATE = ROBOT___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT___OCCI_RETRIEVE = ROBOT___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT___OCCI_UPDATE = ROBOT___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT___OCCI_DELETE = ROBOT___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Turtlebot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOT_OPERATION_COUNT = ROBOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link omcri.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.impl.ActuatorImpl
	 * @see omcri.impl.OmcriPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link omcri.impl.TouchsensorImpl <em>Touchsensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.impl.TouchsensorImpl
	 * @see omcri.impl.OmcriPackageImpl#getTouchsensor()
	 * @generated
	 */
	int TOUCHSENSOR = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSENSOR__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSENSOR__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSENSOR__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSENSOR__TOUCH = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Touchsensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSENSOR_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Sensetouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSENSOR___SENSETOUCH = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Touchsensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSENSOR_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link omcri.impl.MotionactuatorImpl <em>Motionactuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.impl.MotionactuatorImpl
	 * @see omcri.impl.OmcriPackageImpl#getMotionactuator()
	 * @generated
	 */
	int MOTIONACTUATOR = 6;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR__ANGLE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR__SPEED = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR__DURATION = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Motionactuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Moveforward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR___MOVEFORWARD = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Movebackward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR___MOVEBACKWARD = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Turnright</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR___TURNRIGHT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Turnleft</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR___TURNLEFT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR___STOP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Motionactuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link omcri.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.impl.SensorImpl
	 * @see omcri.impl.OmcriPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 7;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link omcri.impl.ColorsensorImpl <em>Colorsensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.impl.ColorsensorImpl
	 * @see omcri.impl.OmcriPackageImpl#getColorsensor()
	 * @generated
	 */
	int COLORSENSOR = 8;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR__COLOR = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR__LIGHT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Darkness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR__DARKNESS = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Color Lamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR__COLOR_LAMP = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Colorsensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Sensecolor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR___SENSECOLOR = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Colorsensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link omcri.impl.UltrasonicsensorImpl <em>Ultrasonicsensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.impl.UltrasonicsensorImpl
	 * @see omcri.impl.OmcriPackageImpl#getUltrasonicsensor()
	 * @generated
	 */
	int ULTRASONICSENSOR = 9;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONICSENSOR__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONICSENSOR__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONICSENSOR__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONICSENSOR__DISTANCE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ultrasonicsensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONICSENSOR_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Sensedistance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONICSENSOR___SENSEDISTANCE = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONICSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ultrasonicsensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONICSENSOR_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link omcri.impl.MouthactuatorImpl <em>Mouthactuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.impl.MouthactuatorImpl
	 * @see omcri.impl.OmcriPackageImpl#getMouthactuator()
	 * @generated
	 */
	int MOUTHACTUATOR = 10;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTHACTUATOR__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTHACTUATOR__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTHACTUATOR__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Mouthactuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTHACTUATOR_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Openmouth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTHACTUATOR___OPENMOUTH = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Closemouth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTHACTUATOR___CLOSEMOUTH = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTHACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mouthactuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTHACTUATOR_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link omcri.impl.FlightactuatorImpl <em>Flightactuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.impl.FlightactuatorImpl
	 * @see omcri.impl.OmcriPackageImpl#getFlightactuator()
	 * @generated
	 */
	int FLIGHTACTUATOR = 11;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Horizontal Tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR__HORIZONTAL_TILT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vertical Tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR__VERTICAL_TILT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Horizontal Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR__HORIZONTAL_SPEED = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vertical Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR__VERTICAL_SPEED = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Flightactuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR___MOVE = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Land</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR___LAND = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Takeoff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR___TAKEOFF = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Flightactuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link omcri.impl.TurtlebotmotionactuatorImpl <em>Turtlebotmotionactuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.impl.TurtlebotmotionactuatorImpl
	 * @see omcri.impl.OmcriPackageImpl#getTurtlebotmotionactuator()
	 * @generated
	 */
	int TURTLEBOTMOTIONACTUATOR = 12;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOTMOTIONACTUATOR__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOTMOTIONACTUATOR__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOTMOTIONACTUATOR__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOTMOTIONACTUATOR__ANGLE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOTMOTIONACTUATOR__SPEED = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOTMOTIONACTUATOR__DURATION = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Turtlebotmotionactuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOTMOTIONACTUATOR_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Moveforward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOTMOTIONACTUATOR___MOVEFORWARD = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Movebackward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOTMOTIONACTUATOR___MOVEBACKWARD = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Turnright</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOTMOTIONACTUATOR___TURNRIGHT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Turnleft</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOTMOTIONACTUATOR___TURNLEFT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOTMOTIONACTUATOR___STOP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOTMOTIONACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Turtlebotmotionactuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLEBOTMOTIONACTUATOR_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link omcri.impl.Legomindstormnxt2motionactuatorImpl <em>Legomindstormnxt2motionactuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.impl.Legomindstormnxt2motionactuatorImpl
	 * @see omcri.impl.OmcriPackageImpl#getLegomindstormnxt2motionactuator()
	 * @generated
	 */
	int LEGOMINDSTORMNXT2MOTIONACTUATOR = 13;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2MOTIONACTUATOR__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2MOTIONACTUATOR__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2MOTIONACTUATOR__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2MOTIONACTUATOR__ANGLE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2MOTIONACTUATOR__SPEED = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2MOTIONACTUATOR__DURATION = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Legomindstormnxt2motionactuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2MOTIONACTUATOR_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Moveforward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2MOTIONACTUATOR___MOVEFORWARD = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Movebackward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2MOTIONACTUATOR___MOVEBACKWARD = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Turnright</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2MOTIONACTUATOR___TURNRIGHT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Turnleft</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2MOTIONACTUATOR___TURNLEFT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2MOTIONACTUATOR___STOP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2MOTIONACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Legomindstormnxt2motionactuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOMINDSTORMNXT2MOTIONACTUATOR_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link omcri.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.Color
	 * @see omcri.impl.OmcriPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 14;

	/**
	 * The meta object id for the '{@link omcri.Touch <em>Touch</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri.Touch
	 * @see omcri.impl.OmcriPackageImpl#getTouch()
	 * @generated
	 */
	int TOUCH = 15;


	/**
	 * Returns the meta object for class '{@link omcri.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see omcri.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for class '{@link omcri.Legomindstormnxt2 <em>Legomindstormnxt2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legomindstormnxt2</em>'.
	 * @see omcri.Legomindstormnxt2
	 * @generated
	 */
	EClass getLegomindstormnxt2();

	/**
	 * Returns the meta object for the attribute '{@link omcri.Legomindstormnxt2#getMacAddress <em>Mac Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac Address</em>'.
	 * @see omcri.Legomindstormnxt2#getMacAddress()
	 * @see #getLegomindstormnxt2()
	 * @generated
	 */
	EAttribute getLegomindstormnxt2_MacAddress();

	/**
	 * Returns the meta object for class '{@link omcri.Ardrone <em>Ardrone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ardrone</em>'.
	 * @see omcri.Ardrone
	 * @generated
	 */
	EClass getArdrone();

	/**
	 * Returns the meta object for the attribute '{@link omcri.Ardrone#getIPAddress <em>IP Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP Address</em>'.
	 * @see omcri.Ardrone#getIPAddress()
	 * @see #getArdrone()
	 * @generated
	 */
	EAttribute getArdrone_IPAddress();

	/**
	 * Returns the meta object for class '{@link omcri.Turtlebot <em>Turtlebot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turtlebot</em>'.
	 * @see omcri.Turtlebot
	 * @generated
	 */
	EClass getTurtlebot();

	/**
	 * Returns the meta object for the attribute '{@link omcri.Turtlebot#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see omcri.Turtlebot#getUser()
	 * @see #getTurtlebot()
	 * @generated
	 */
	EAttribute getTurtlebot_User();

	/**
	 * Returns the meta object for the attribute '{@link omcri.Turtlebot#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see omcri.Turtlebot#getPassword()
	 * @see #getTurtlebot()
	 * @generated
	 */
	EAttribute getTurtlebot_Password();

	/**
	 * Returns the meta object for the attribute '{@link omcri.Turtlebot#getIPAddress <em>IP Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP Address</em>'.
	 * @see omcri.Turtlebot#getIPAddress()
	 * @see #getTurtlebot()
	 * @generated
	 */
	EAttribute getTurtlebot_IPAddress();

	/**
	 * Returns the meta object for class '{@link omcri.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see omcri.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the '{@link omcri.Actuator#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see omcri.Actuator#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getActuator__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link omcri.Touchsensor <em>Touchsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touchsensor</em>'.
	 * @see omcri.Touchsensor
	 * @generated
	 */
	EClass getTouchsensor();

	/**
	 * Returns the meta object for the attribute '{@link omcri.Touchsensor#getTouch <em>Touch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Touch</em>'.
	 * @see omcri.Touchsensor#getTouch()
	 * @see #getTouchsensor()
	 * @generated
	 */
	EAttribute getTouchsensor_Touch();

	/**
	 * Returns the meta object for the '{@link omcri.Touchsensor#sensetouch() <em>Sensetouch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sensetouch</em>' operation.
	 * @see omcri.Touchsensor#sensetouch()
	 * @generated
	 */
	EOperation getTouchsensor__Sensetouch();

	/**
	 * Returns the meta object for the '{@link omcri.Touchsensor#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see omcri.Touchsensor#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTouchsensor__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link omcri.Motionactuator <em>Motionactuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motionactuator</em>'.
	 * @see omcri.Motionactuator
	 * @generated
	 */
	EClass getMotionactuator();

	/**
	 * Returns the meta object for the attribute '{@link omcri.Motionactuator#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see omcri.Motionactuator#getAngle()
	 * @see #getMotionactuator()
	 * @generated
	 */
	EAttribute getMotionactuator_Angle();

	/**
	 * Returns the meta object for the attribute '{@link omcri.Motionactuator#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see omcri.Motionactuator#getSpeed()
	 * @see #getMotionactuator()
	 * @generated
	 */
	EAttribute getMotionactuator_Speed();

	/**
	 * Returns the meta object for the attribute '{@link omcri.Motionactuator#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see omcri.Motionactuator#getDuration()
	 * @see #getMotionactuator()
	 * @generated
	 */
	EAttribute getMotionactuator_Duration();

	/**
	 * Returns the meta object for the '{@link omcri.Motionactuator#moveforward() <em>Moveforward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Moveforward</em>' operation.
	 * @see omcri.Motionactuator#moveforward()
	 * @generated
	 */
	EOperation getMotionactuator__Moveforward();

	/**
	 * Returns the meta object for the '{@link omcri.Motionactuator#movebackward() <em>Movebackward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Movebackward</em>' operation.
	 * @see omcri.Motionactuator#movebackward()
	 * @generated
	 */
	EOperation getMotionactuator__Movebackward();

	/**
	 * Returns the meta object for the '{@link omcri.Motionactuator#turnright() <em>Turnright</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Turnright</em>' operation.
	 * @see omcri.Motionactuator#turnright()
	 * @generated
	 */
	EOperation getMotionactuator__Turnright();

	/**
	 * Returns the meta object for the '{@link omcri.Motionactuator#turnleft() <em>Turnleft</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Turnleft</em>' operation.
	 * @see omcri.Motionactuator#turnleft()
	 * @generated
	 */
	EOperation getMotionactuator__Turnleft();

	/**
	 * Returns the meta object for the '{@link omcri.Motionactuator#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see omcri.Motionactuator#stop()
	 * @generated
	 */
	EOperation getMotionactuator__Stop();

	/**
	 * Returns the meta object for class '{@link omcri.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see omcri.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the '{@link omcri.Sensor#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see omcri.Sensor#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSensor__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link omcri.Colorsensor <em>Colorsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colorsensor</em>'.
	 * @see omcri.Colorsensor
	 * @generated
	 */
	EClass getColorsensor();

	/**
	 * Returns the meta object for the attribute '{@link omcri.Colorsensor#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see omcri.Colorsensor#getColor()
	 * @see #getColorsensor()
	 * @generated
	 */
	EAttribute getColorsensor_Color();

	/**
	 * Returns the meta object for the attribute '{@link omcri.Colorsensor#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light</em>'.
	 * @see omcri.Colorsensor#getLight()
	 * @see #getColorsensor()
	 * @generated
	 */
	EAttribute getColorsensor_Light();

	/**
	 * Returns the meta object for the attribute '{@link omcri.Colorsensor#getDarkness <em>Darkness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Darkness</em>'.
	 * @see omcri.Colorsensor#getDarkness()
	 * @see #getColorsensor()
	 * @generated
	 */
	EAttribute getColorsensor_Darkness();

	/**
	 * Returns the meta object for the attribute '{@link omcri.Colorsensor#getColorLamp <em>Color Lamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Lamp</em>'.
	 * @see omcri.Colorsensor#getColorLamp()
	 * @see #getColorsensor()
	 * @generated
	 */
	EAttribute getColorsensor_ColorLamp();

	/**
	 * Returns the meta object for the '{@link omcri.Colorsensor#sensecolor() <em>Sensecolor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sensecolor</em>' operation.
	 * @see omcri.Colorsensor#sensecolor()
	 * @generated
	 */
	EOperation getColorsensor__Sensecolor();

	/**
	 * Returns the meta object for the '{@link omcri.Colorsensor#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see omcri.Colorsensor#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getColorsensor__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link omcri.Ultrasonicsensor <em>Ultrasonicsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ultrasonicsensor</em>'.
	 * @see omcri.Ultrasonicsensor
	 * @generated
	 */
	EClass getUltrasonicsensor();

	/**
	 * Returns the meta object for the attribute '{@link omcri.Ultrasonicsensor#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see omcri.Ultrasonicsensor#getDistance()
	 * @see #getUltrasonicsensor()
	 * @generated
	 */
	EAttribute getUltrasonicsensor_Distance();

	/**
	 * Returns the meta object for the '{@link omcri.Ultrasonicsensor#sensedistance() <em>Sensedistance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sensedistance</em>' operation.
	 * @see omcri.Ultrasonicsensor#sensedistance()
	 * @generated
	 */
	EOperation getUltrasonicsensor__Sensedistance();

	/**
	 * Returns the meta object for the '{@link omcri.Ultrasonicsensor#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see omcri.Ultrasonicsensor#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUltrasonicsensor__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link omcri.Mouthactuator <em>Mouthactuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mouthactuator</em>'.
	 * @see omcri.Mouthactuator
	 * @generated
	 */
	EClass getMouthactuator();

	/**
	 * Returns the meta object for the '{@link omcri.Mouthactuator#openmouth() <em>Openmouth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Openmouth</em>' operation.
	 * @see omcri.Mouthactuator#openmouth()
	 * @generated
	 */
	EOperation getMouthactuator__Openmouth();

	/**
	 * Returns the meta object for the '{@link omcri.Mouthactuator#closemouth() <em>Closemouth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Closemouth</em>' operation.
	 * @see omcri.Mouthactuator#closemouth()
	 * @generated
	 */
	EOperation getMouthactuator__Closemouth();

	/**
	 * Returns the meta object for the '{@link omcri.Mouthactuator#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see omcri.Mouthactuator#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMouthactuator__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link omcri.Flightactuator <em>Flightactuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flightactuator</em>'.
	 * @see omcri.Flightactuator
	 * @generated
	 */
	EClass getFlightactuator();

	/**
	 * Returns the meta object for the attribute '{@link omcri.Flightactuator#getHorizontalTilt <em>Horizontal Tilt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Tilt</em>'.
	 * @see omcri.Flightactuator#getHorizontalTilt()
	 * @see #getFlightactuator()
	 * @generated
	 */
	EAttribute getFlightactuator_HorizontalTilt();

	/**
	 * Returns the meta object for the attribute '{@link omcri.Flightactuator#getVerticalTilt <em>Vertical Tilt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Tilt</em>'.
	 * @see omcri.Flightactuator#getVerticalTilt()
	 * @see #getFlightactuator()
	 * @generated
	 */
	EAttribute getFlightactuator_VerticalTilt();

	/**
	 * Returns the meta object for the attribute '{@link omcri.Flightactuator#getHorizontalSpeed <em>Horizontal Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Speed</em>'.
	 * @see omcri.Flightactuator#getHorizontalSpeed()
	 * @see #getFlightactuator()
	 * @generated
	 */
	EAttribute getFlightactuator_HorizontalSpeed();

	/**
	 * Returns the meta object for the attribute '{@link omcri.Flightactuator#getVerticalSpeed <em>Vertical Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Speed</em>'.
	 * @see omcri.Flightactuator#getVerticalSpeed()
	 * @see #getFlightactuator()
	 * @generated
	 */
	EAttribute getFlightactuator_VerticalSpeed();

	/**
	 * Returns the meta object for the '{@link omcri.Flightactuator#move() <em>Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move</em>' operation.
	 * @see omcri.Flightactuator#move()
	 * @generated
	 */
	EOperation getFlightactuator__Move();

	/**
	 * Returns the meta object for the '{@link omcri.Flightactuator#land() <em>Land</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Land</em>' operation.
	 * @see omcri.Flightactuator#land()
	 * @generated
	 */
	EOperation getFlightactuator__Land();

	/**
	 * Returns the meta object for the '{@link omcri.Flightactuator#takeoff() <em>Takeoff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Takeoff</em>' operation.
	 * @see omcri.Flightactuator#takeoff()
	 * @generated
	 */
	EOperation getFlightactuator__Takeoff();

	/**
	 * Returns the meta object for the '{@link omcri.Flightactuator#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see omcri.Flightactuator#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFlightactuator__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link omcri.Turtlebotmotionactuator <em>Turtlebotmotionactuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turtlebotmotionactuator</em>'.
	 * @see omcri.Turtlebotmotionactuator
	 * @generated
	 */
	EClass getTurtlebotmotionactuator();

	/**
	 * Returns the meta object for the '{@link omcri.Turtlebotmotionactuator#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see omcri.Turtlebotmotionactuator#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTurtlebotmotionactuator__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link omcri.Legomindstormnxt2motionactuator <em>Legomindstormnxt2motionactuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legomindstormnxt2motionactuator</em>'.
	 * @see omcri.Legomindstormnxt2motionactuator
	 * @generated
	 */
	EClass getLegomindstormnxt2motionactuator();

	/**
	 * Returns the meta object for the '{@link omcri.Legomindstormnxt2motionactuator#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see omcri.Legomindstormnxt2motionactuator#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLegomindstormnxt2motionactuator__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link omcri.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see omcri.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link omcri.Touch <em>Touch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Touch</em>'.
	 * @see omcri.Touch
	 * @generated
	 */
	EEnum getTouch();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OmcriFactory getOmcriFactory();

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
		 * The meta object literal for the '{@link omcri.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.impl.RobotImpl
		 * @see omcri.impl.OmcriPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '{@link omcri.impl.Legomindstormnxt2Impl <em>Legomindstormnxt2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.impl.Legomindstormnxt2Impl
		 * @see omcri.impl.OmcriPackageImpl#getLegomindstormnxt2()
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

		/**
		 * The meta object literal for the '{@link omcri.impl.ArdroneImpl <em>Ardrone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.impl.ArdroneImpl
		 * @see omcri.impl.OmcriPackageImpl#getArdrone()
		 * @generated
		 */
		EClass ARDRONE = eINSTANCE.getArdrone();

		/**
		 * The meta object literal for the '<em><b>IP Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDRONE__IP_ADDRESS = eINSTANCE.getArdrone_IPAddress();

		/**
		 * The meta object literal for the '{@link omcri.impl.TurtlebotImpl <em>Turtlebot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.impl.TurtlebotImpl
		 * @see omcri.impl.OmcriPackageImpl#getTurtlebot()
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
		 * The meta object literal for the '<em><b>IP Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURTLEBOT__IP_ADDRESS = eINSTANCE.getTurtlebot_IPAddress();

		/**
		 * The meta object literal for the '{@link omcri.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.impl.ActuatorImpl
		 * @see omcri.impl.OmcriPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getActuator__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link omcri.impl.TouchsensorImpl <em>Touchsensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.impl.TouchsensorImpl
		 * @see omcri.impl.OmcriPackageImpl#getTouchsensor()
		 * @generated
		 */
		EClass TOUCHSENSOR = eINSTANCE.getTouchsensor();

		/**
		 * The meta object literal for the '<em><b>Touch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHSENSOR__TOUCH = eINSTANCE.getTouchsensor_Touch();

		/**
		 * The meta object literal for the '<em><b>Sensetouch</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOUCHSENSOR___SENSETOUCH = eINSTANCE.getTouchsensor__Sensetouch();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOUCHSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTouchsensor__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link omcri.impl.MotionactuatorImpl <em>Motionactuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.impl.MotionactuatorImpl
		 * @see omcri.impl.OmcriPackageImpl#getMotionactuator()
		 * @generated
		 */
		EClass MOTIONACTUATOR = eINSTANCE.getMotionactuator();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTIONACTUATOR__ANGLE = eINSTANCE.getMotionactuator_Angle();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTIONACTUATOR__SPEED = eINSTANCE.getMotionactuator_Speed();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTIONACTUATOR__DURATION = eINSTANCE.getMotionactuator_Duration();

		/**
		 * The meta object literal for the '<em><b>Moveforward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTIONACTUATOR___MOVEFORWARD = eINSTANCE.getMotionactuator__Moveforward();

		/**
		 * The meta object literal for the '<em><b>Movebackward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTIONACTUATOR___MOVEBACKWARD = eINSTANCE.getMotionactuator__Movebackward();

		/**
		 * The meta object literal for the '<em><b>Turnright</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTIONACTUATOR___TURNRIGHT = eINSTANCE.getMotionactuator__Turnright();

		/**
		 * The meta object literal for the '<em><b>Turnleft</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTIONACTUATOR___TURNLEFT = eINSTANCE.getMotionactuator__Turnleft();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTIONACTUATOR___STOP = eINSTANCE.getMotionactuator__Stop();

		/**
		 * The meta object literal for the '{@link omcri.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.impl.SensorImpl
		 * @see omcri.impl.OmcriPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSensor__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link omcri.impl.ColorsensorImpl <em>Colorsensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.impl.ColorsensorImpl
		 * @see omcri.impl.OmcriPackageImpl#getColorsensor()
		 * @generated
		 */
		EClass COLORSENSOR = eINSTANCE.getColorsensor();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLORSENSOR__COLOR = eINSTANCE.getColorsensor_Color();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLORSENSOR__LIGHT = eINSTANCE.getColorsensor_Light();

		/**
		 * The meta object literal for the '<em><b>Darkness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLORSENSOR__DARKNESS = eINSTANCE.getColorsensor_Darkness();

		/**
		 * The meta object literal for the '<em><b>Color Lamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLORSENSOR__COLOR_LAMP = eINSTANCE.getColorsensor_ColorLamp();

		/**
		 * The meta object literal for the '<em><b>Sensecolor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLORSENSOR___SENSECOLOR = eINSTANCE.getColorsensor__Sensecolor();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLORSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getColorsensor__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link omcri.impl.UltrasonicsensorImpl <em>Ultrasonicsensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.impl.UltrasonicsensorImpl
		 * @see omcri.impl.OmcriPackageImpl#getUltrasonicsensor()
		 * @generated
		 */
		EClass ULTRASONICSENSOR = eINSTANCE.getUltrasonicsensor();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ULTRASONICSENSOR__DISTANCE = eINSTANCE.getUltrasonicsensor_Distance();

		/**
		 * The meta object literal for the '<em><b>Sensedistance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ULTRASONICSENSOR___SENSEDISTANCE = eINSTANCE.getUltrasonicsensor__Sensedistance();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ULTRASONICSENSOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUltrasonicsensor__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link omcri.impl.MouthactuatorImpl <em>Mouthactuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.impl.MouthactuatorImpl
		 * @see omcri.impl.OmcriPackageImpl#getMouthactuator()
		 * @generated
		 */
		EClass MOUTHACTUATOR = eINSTANCE.getMouthactuator();

		/**
		 * The meta object literal for the '<em><b>Openmouth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOUTHACTUATOR___OPENMOUTH = eINSTANCE.getMouthactuator__Openmouth();

		/**
		 * The meta object literal for the '<em><b>Closemouth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOUTHACTUATOR___CLOSEMOUTH = eINSTANCE.getMouthactuator__Closemouth();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOUTHACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMouthactuator__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link omcri.impl.FlightactuatorImpl <em>Flightactuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.impl.FlightactuatorImpl
		 * @see omcri.impl.OmcriPackageImpl#getFlightactuator()
		 * @generated
		 */
		EClass FLIGHTACTUATOR = eINSTANCE.getFlightactuator();

		/**
		 * The meta object literal for the '<em><b>Horizontal Tilt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHTACTUATOR__HORIZONTAL_TILT = eINSTANCE.getFlightactuator_HorizontalTilt();

		/**
		 * The meta object literal for the '<em><b>Vertical Tilt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHTACTUATOR__VERTICAL_TILT = eINSTANCE.getFlightactuator_VerticalTilt();

		/**
		 * The meta object literal for the '<em><b>Horizontal Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHTACTUATOR__HORIZONTAL_SPEED = eINSTANCE.getFlightactuator_HorizontalSpeed();

		/**
		 * The meta object literal for the '<em><b>Vertical Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHTACTUATOR__VERTICAL_SPEED = eINSTANCE.getFlightactuator_VerticalSpeed();

		/**
		 * The meta object literal for the '<em><b>Move</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FLIGHTACTUATOR___MOVE = eINSTANCE.getFlightactuator__Move();

		/**
		 * The meta object literal for the '<em><b>Land</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FLIGHTACTUATOR___LAND = eINSTANCE.getFlightactuator__Land();

		/**
		 * The meta object literal for the '<em><b>Takeoff</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FLIGHTACTUATOR___TAKEOFF = eINSTANCE.getFlightactuator__Takeoff();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FLIGHTACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getFlightactuator__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link omcri.impl.TurtlebotmotionactuatorImpl <em>Turtlebotmotionactuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.impl.TurtlebotmotionactuatorImpl
		 * @see omcri.impl.OmcriPackageImpl#getTurtlebotmotionactuator()
		 * @generated
		 */
		EClass TURTLEBOTMOTIONACTUATOR = eINSTANCE.getTurtlebotmotionactuator();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TURTLEBOTMOTIONACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTurtlebotmotionactuator__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link omcri.impl.Legomindstormnxt2motionactuatorImpl <em>Legomindstormnxt2motionactuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.impl.Legomindstormnxt2motionactuatorImpl
		 * @see omcri.impl.OmcriPackageImpl#getLegomindstormnxt2motionactuator()
		 * @generated
		 */
		EClass LEGOMINDSTORMNXT2MOTIONACTUATOR = eINSTANCE.getLegomindstormnxt2motionactuator();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGOMINDSTORMNXT2MOTIONACTUATOR___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLegomindstormnxt2motionactuator__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link omcri.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.Color
		 * @see omcri.impl.OmcriPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link omcri.Touch <em>Touch</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri.Touch
		 * @see omcri.impl.OmcriPackageImpl#getTouch()
		 * @generated
		 */
		EEnum TOUCH = eINSTANCE.getTouch();

	}

} //OmcriPackage
