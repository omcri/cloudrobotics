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
package omcricore;

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
 * @see omcricore.OmcricoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 *        annotation="http://www.eclipse.org/OCL/Import occi='http://schemas.ogf.org/occi/core/ecore'"
 * @generated
 */
public interface OmcricorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "omcricore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/cloudrobotics/core/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "omcricore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OmcricorePackage eINSTANCE = omcricore.impl.OmcricorePackageImpl.init();

	/**
	 * The meta object id for the '{@link omcricore.impl.RobotlinkImpl <em>Robotlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcricore.impl.RobotlinkImpl
	 * @see omcricore.impl.OmcricorePackageImpl#getRobotlink()
	 * @generated
	 */
	int ROBOTLINK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTLINK__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTLINK__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Robotlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTLINK___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTLINK___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The number of operations of the '<em>Robotlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link omcricore.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcricore.impl.RobotImpl
	 * @see omcricore.impl.OmcricorePackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 1;

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
	 * The meta object id for the '{@link omcricore.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcricore.impl.ConnectionImpl
	 * @see omcricore.impl.OmcricorePackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TIME_OUT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___CONNECT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___DISCONNECT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link omcricore.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcricore.impl.SensorImpl
	 * @see omcricore.impl.OmcricorePackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 3;

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
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link omcricore.impl.ColorsensorImpl <em>Colorsensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcricore.impl.ColorsensorImpl
	 * @see omcricore.impl.OmcricorePackageImpl#getColorsensor()
	 * @generated
	 */
	int COLORSENSOR = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR__MIXIN = SENSOR__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR__ENTITY = SENSOR__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR__ATTRIBUTES = SENSOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR__COLOR = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR__LIGHT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Darkness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR__DARKNESS = SENSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Color Lamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR__COLOR_LAMP = SENSOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Colorsensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Sensecolor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR___SENSECOLOR = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Colorsensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORSENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link omcricore.impl.FlightactuatorImpl <em>Flightactuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcricore.impl.FlightactuatorImpl
	 * @see omcricore.impl.OmcricorePackageImpl#getFlightactuator()
	 * @generated
	 */
	int FLIGHTACTUATOR = 5;

	/**
	 * The meta object id for the '{@link omcricore.impl.TouchsensorImpl <em>Touchsensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcricore.impl.TouchsensorImpl
	 * @see omcricore.impl.OmcricorePackageImpl#getTouchsensor()
	 * @generated
	 */
	int TOUCHSENSOR = 6;

	/**
	 * The meta object id for the '{@link omcricore.impl.UltrasonicsensorImpl <em>Ultrasonicsensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcricore.impl.UltrasonicsensorImpl
	 * @see omcricore.impl.OmcricorePackageImpl#getUltrasonicsensor()
	 * @generated
	 */
	int ULTRASONICSENSOR = 7;

	/**
	 * The meta object id for the '{@link omcricore.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcricore.impl.ActuatorImpl
	 * @see omcricore.impl.OmcricorePackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 8;

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
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR__MIXIN = ACTUATOR__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR__ENTITY = ACTUATOR__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR__ATTRIBUTES = ACTUATOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Horizontal Tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR__HORIZONTAL_TILT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vertical Tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR__VERTICAL_TILT = ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Horizontal Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR__HORIZONTAL_SPEED = ACTUATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vertical Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR__VERTICAL_SPEED = ACTUATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Flightactuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR___MOVE = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Land</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR___LAND = ACTUATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Takeoff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR___TAKEOFF = ACTUATOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Flightactuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHTACTUATOR_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSENSOR__MIXIN = SENSOR__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSENSOR__ENTITY = SENSOR__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSENSOR__ATTRIBUTES = SENSOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSENSOR__TOUCH = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Touchsensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Sensetouch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSENSOR___SENSETOUCH = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Touchsensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHSENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONICSENSOR__MIXIN = SENSOR__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONICSENSOR__ENTITY = SENSOR__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONICSENSOR__ATTRIBUTES = SENSOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONICSENSOR__DISTANCE = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ultrasonicsensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONICSENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Sensedistance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONICSENSOR___SENSEDISTANCE = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ultrasonicsensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONICSENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link omcricore.impl.MotionactuatorImpl <em>Motionactuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcricore.impl.MotionactuatorImpl
	 * @see omcricore.impl.OmcricorePackageImpl#getMotionactuator()
	 * @generated
	 */
	int MOTIONACTUATOR = 9;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR__MIXIN = ACTUATOR__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR__ENTITY = ACTUATOR__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR__ATTRIBUTES = ACTUATOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR__ANGLE = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR__SPEED = ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR__DURATION = ACTUATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Motionactuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Moveforward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR___MOVEFORWARD = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Movebackward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR___MOVEBACKWARD = ACTUATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Turnright</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR___TURNRIGHT = ACTUATOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Turnleft</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR___TURNLEFT = ACTUATOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR___STOP = ACTUATOR_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Motionactuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIONACTUATOR_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link omcricore.impl.MouthactuatorImpl <em>Mouthactuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcricore.impl.MouthactuatorImpl
	 * @see omcricore.impl.OmcricorePackageImpl#getMouthactuator()
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
	int MOUTHACTUATOR__MIXIN = ACTUATOR__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTHACTUATOR__ENTITY = ACTUATOR__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTHACTUATOR__ATTRIBUTES = ACTUATOR__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Mouthactuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTHACTUATOR_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Openmouth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTHACTUATOR___OPENMOUTH = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Closemouth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTHACTUATOR___CLOSEMOUTH = ACTUATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mouthactuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUTHACTUATOR_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link omcricore.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcricore.Color
	 * @see omcricore.impl.OmcricorePackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 11;

	/**
	 * The meta object id for the '{@link omcricore.Touch <em>Touch</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcricore.Touch
	 * @see omcricore.impl.OmcricorePackageImpl#getTouch()
	 * @generated
	 */
	int TOUCH = 12;


	/**
	 * Returns the meta object for class '{@link omcricore.Robotlink <em>Robotlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robotlink</em>'.
	 * @see omcricore.Robotlink
	 * @generated
	 */
	EClass getRobotlink();

	/**
	 * Returns the meta object for class '{@link omcricore.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see omcricore.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for class '{@link omcricore.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see omcricore.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link omcricore.Connection#getTimeOut <em>Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Out</em>'.
	 * @see omcricore.Connection#getTimeOut()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_TimeOut();

	/**
	 * Returns the meta object for the '{@link omcricore.Connection#connect() <em>Connect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect</em>' operation.
	 * @see omcricore.Connection#connect()
	 * @generated
	 */
	EOperation getConnection__Connect();

	/**
	 * Returns the meta object for the '{@link omcricore.Connection#disconnect() <em>Disconnect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disconnect</em>' operation.
	 * @see omcricore.Connection#disconnect()
	 * @generated
	 */
	EOperation getConnection__Disconnect();

	/**
	 * Returns the meta object for class '{@link omcricore.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see omcricore.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link omcricore.Colorsensor <em>Colorsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colorsensor</em>'.
	 * @see omcricore.Colorsensor
	 * @generated
	 */
	EClass getColorsensor();

	/**
	 * Returns the meta object for the attribute '{@link omcricore.Colorsensor#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see omcricore.Colorsensor#getColor()
	 * @see #getColorsensor()
	 * @generated
	 */
	EAttribute getColorsensor_Color();

	/**
	 * Returns the meta object for the attribute '{@link omcricore.Colorsensor#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light</em>'.
	 * @see omcricore.Colorsensor#getLight()
	 * @see #getColorsensor()
	 * @generated
	 */
	EAttribute getColorsensor_Light();

	/**
	 * Returns the meta object for the attribute '{@link omcricore.Colorsensor#getDarkness <em>Darkness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Darkness</em>'.
	 * @see omcricore.Colorsensor#getDarkness()
	 * @see #getColorsensor()
	 * @generated
	 */
	EAttribute getColorsensor_Darkness();

	/**
	 * Returns the meta object for the attribute '{@link omcricore.Colorsensor#getColorLamp <em>Color Lamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Lamp</em>'.
	 * @see omcricore.Colorsensor#getColorLamp()
	 * @see #getColorsensor()
	 * @generated
	 */
	EAttribute getColorsensor_ColorLamp();

	/**
	 * Returns the meta object for the '{@link omcricore.Colorsensor#sensecolor() <em>Sensecolor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sensecolor</em>' operation.
	 * @see omcricore.Colorsensor#sensecolor()
	 * @generated
	 */
	EOperation getColorsensor__Sensecolor();

	/**
	 * Returns the meta object for class '{@link omcricore.Flightactuator <em>Flightactuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flightactuator</em>'.
	 * @see omcricore.Flightactuator
	 * @generated
	 */
	EClass getFlightactuator();

	/**
	 * Returns the meta object for the attribute '{@link omcricore.Flightactuator#getHorizontalTilt <em>Horizontal Tilt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Tilt</em>'.
	 * @see omcricore.Flightactuator#getHorizontalTilt()
	 * @see #getFlightactuator()
	 * @generated
	 */
	EAttribute getFlightactuator_HorizontalTilt();

	/**
	 * Returns the meta object for the attribute '{@link omcricore.Flightactuator#getVerticalTilt <em>Vertical Tilt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Tilt</em>'.
	 * @see omcricore.Flightactuator#getVerticalTilt()
	 * @see #getFlightactuator()
	 * @generated
	 */
	EAttribute getFlightactuator_VerticalTilt();

	/**
	 * Returns the meta object for the attribute '{@link omcricore.Flightactuator#getHorizontalSpeed <em>Horizontal Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Speed</em>'.
	 * @see omcricore.Flightactuator#getHorizontalSpeed()
	 * @see #getFlightactuator()
	 * @generated
	 */
	EAttribute getFlightactuator_HorizontalSpeed();

	/**
	 * Returns the meta object for the attribute '{@link omcricore.Flightactuator#getVerticalSpeed <em>Vertical Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Speed</em>'.
	 * @see omcricore.Flightactuator#getVerticalSpeed()
	 * @see #getFlightactuator()
	 * @generated
	 */
	EAttribute getFlightactuator_VerticalSpeed();

	/**
	 * Returns the meta object for the '{@link omcricore.Flightactuator#move() <em>Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move</em>' operation.
	 * @see omcricore.Flightactuator#move()
	 * @generated
	 */
	EOperation getFlightactuator__Move();

	/**
	 * Returns the meta object for the '{@link omcricore.Flightactuator#land() <em>Land</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Land</em>' operation.
	 * @see omcricore.Flightactuator#land()
	 * @generated
	 */
	EOperation getFlightactuator__Land();

	/**
	 * Returns the meta object for the '{@link omcricore.Flightactuator#takeoff() <em>Takeoff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Takeoff</em>' operation.
	 * @see omcricore.Flightactuator#takeoff()
	 * @generated
	 */
	EOperation getFlightactuator__Takeoff();

	/**
	 * Returns the meta object for class '{@link omcricore.Touchsensor <em>Touchsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touchsensor</em>'.
	 * @see omcricore.Touchsensor
	 * @generated
	 */
	EClass getTouchsensor();

	/**
	 * Returns the meta object for the attribute '{@link omcricore.Touchsensor#getTouch <em>Touch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Touch</em>'.
	 * @see omcricore.Touchsensor#getTouch()
	 * @see #getTouchsensor()
	 * @generated
	 */
	EAttribute getTouchsensor_Touch();

	/**
	 * Returns the meta object for the '{@link omcricore.Touchsensor#sensetouch() <em>Sensetouch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sensetouch</em>' operation.
	 * @see omcricore.Touchsensor#sensetouch()
	 * @generated
	 */
	EOperation getTouchsensor__Sensetouch();

	/**
	 * Returns the meta object for class '{@link omcricore.Ultrasonicsensor <em>Ultrasonicsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ultrasonicsensor</em>'.
	 * @see omcricore.Ultrasonicsensor
	 * @generated
	 */
	EClass getUltrasonicsensor();

	/**
	 * Returns the meta object for the attribute '{@link omcricore.Ultrasonicsensor#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see omcricore.Ultrasonicsensor#getDistance()
	 * @see #getUltrasonicsensor()
	 * @generated
	 */
	EAttribute getUltrasonicsensor_Distance();

	/**
	 * Returns the meta object for the '{@link omcricore.Ultrasonicsensor#sensedistance() <em>Sensedistance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sensedistance</em>' operation.
	 * @see omcricore.Ultrasonicsensor#sensedistance()
	 * @generated
	 */
	EOperation getUltrasonicsensor__Sensedistance();

	/**
	 * Returns the meta object for class '{@link omcricore.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see omcricore.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link omcricore.Motionactuator <em>Motionactuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motionactuator</em>'.
	 * @see omcricore.Motionactuator
	 * @generated
	 */
	EClass getMotionactuator();

	/**
	 * Returns the meta object for the attribute '{@link omcricore.Motionactuator#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see omcricore.Motionactuator#getAngle()
	 * @see #getMotionactuator()
	 * @generated
	 */
	EAttribute getMotionactuator_Angle();

	/**
	 * Returns the meta object for the attribute '{@link omcricore.Motionactuator#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see omcricore.Motionactuator#getSpeed()
	 * @see #getMotionactuator()
	 * @generated
	 */
	EAttribute getMotionactuator_Speed();

	/**
	 * Returns the meta object for the attribute '{@link omcricore.Motionactuator#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see omcricore.Motionactuator#getDuration()
	 * @see #getMotionactuator()
	 * @generated
	 */
	EAttribute getMotionactuator_Duration();

	/**
	 * Returns the meta object for the '{@link omcricore.Motionactuator#moveforward() <em>Moveforward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Moveforward</em>' operation.
	 * @see omcricore.Motionactuator#moveforward()
	 * @generated
	 */
	EOperation getMotionactuator__Moveforward();

	/**
	 * Returns the meta object for the '{@link omcricore.Motionactuator#movebackward() <em>Movebackward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Movebackward</em>' operation.
	 * @see omcricore.Motionactuator#movebackward()
	 * @generated
	 */
	EOperation getMotionactuator__Movebackward();

	/**
	 * Returns the meta object for the '{@link omcricore.Motionactuator#turnright() <em>Turnright</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Turnright</em>' operation.
	 * @see omcricore.Motionactuator#turnright()
	 * @generated
	 */
	EOperation getMotionactuator__Turnright();

	/**
	 * Returns the meta object for the '{@link omcricore.Motionactuator#turnleft() <em>Turnleft</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Turnleft</em>' operation.
	 * @see omcricore.Motionactuator#turnleft()
	 * @generated
	 */
	EOperation getMotionactuator__Turnleft();

	/**
	 * Returns the meta object for the '{@link omcricore.Motionactuator#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see omcricore.Motionactuator#stop()
	 * @generated
	 */
	EOperation getMotionactuator__Stop();

	/**
	 * Returns the meta object for class '{@link omcricore.Mouthactuator <em>Mouthactuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mouthactuator</em>'.
	 * @see omcricore.Mouthactuator
	 * @generated
	 */
	EClass getMouthactuator();

	/**
	 * Returns the meta object for the '{@link omcricore.Mouthactuator#openmouth() <em>Openmouth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Openmouth</em>' operation.
	 * @see omcricore.Mouthactuator#openmouth()
	 * @generated
	 */
	EOperation getMouthactuator__Openmouth();

	/**
	 * Returns the meta object for the '{@link omcricore.Mouthactuator#closemouth() <em>Closemouth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Closemouth</em>' operation.
	 * @see omcricore.Mouthactuator#closemouth()
	 * @generated
	 */
	EOperation getMouthactuator__Closemouth();

	/**
	 * Returns the meta object for enum '{@link omcricore.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see omcricore.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link omcricore.Touch <em>Touch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Touch</em>'.
	 * @see omcricore.Touch
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
	OmcricoreFactory getOmcricoreFactory();

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
		 * The meta object literal for the '{@link omcricore.impl.RobotlinkImpl <em>Robotlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcricore.impl.RobotlinkImpl
		 * @see omcricore.impl.OmcricorePackageImpl#getRobotlink()
		 * @generated
		 */
		EClass ROBOTLINK = eINSTANCE.getRobotlink();

		/**
		 * The meta object literal for the '{@link omcricore.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcricore.impl.RobotImpl
		 * @see omcricore.impl.OmcricorePackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '{@link omcricore.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcricore.impl.ConnectionImpl
		 * @see omcricore.impl.OmcricorePackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Time Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__TIME_OUT = eINSTANCE.getConnection_TimeOut();

		/**
		 * The meta object literal for the '<em><b>Connect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTION___CONNECT = eINSTANCE.getConnection__Connect();

		/**
		 * The meta object literal for the '<em><b>Disconnect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTION___DISCONNECT = eINSTANCE.getConnection__Disconnect();

		/**
		 * The meta object literal for the '{@link omcricore.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcricore.impl.SensorImpl
		 * @see omcricore.impl.OmcricorePackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link omcricore.impl.ColorsensorImpl <em>Colorsensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcricore.impl.ColorsensorImpl
		 * @see omcricore.impl.OmcricorePackageImpl#getColorsensor()
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
		 * The meta object literal for the '{@link omcricore.impl.FlightactuatorImpl <em>Flightactuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcricore.impl.FlightactuatorImpl
		 * @see omcricore.impl.OmcricorePackageImpl#getFlightactuator()
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
		 * The meta object literal for the '{@link omcricore.impl.TouchsensorImpl <em>Touchsensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcricore.impl.TouchsensorImpl
		 * @see omcricore.impl.OmcricorePackageImpl#getTouchsensor()
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
		 * The meta object literal for the '{@link omcricore.impl.UltrasonicsensorImpl <em>Ultrasonicsensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcricore.impl.UltrasonicsensorImpl
		 * @see omcricore.impl.OmcricorePackageImpl#getUltrasonicsensor()
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
		 * The meta object literal for the '{@link omcricore.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcricore.impl.ActuatorImpl
		 * @see omcricore.impl.OmcricorePackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link omcricore.impl.MotionactuatorImpl <em>Motionactuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcricore.impl.MotionactuatorImpl
		 * @see omcricore.impl.OmcricorePackageImpl#getMotionactuator()
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
		 * The meta object literal for the '{@link omcricore.impl.MouthactuatorImpl <em>Mouthactuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcricore.impl.MouthactuatorImpl
		 * @see omcricore.impl.OmcricorePackageImpl#getMouthactuator()
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
		 * The meta object literal for the '{@link omcricore.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcricore.Color
		 * @see omcricore.impl.OmcricorePackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link omcricore.Touch <em>Touch</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcricore.Touch
		 * @see omcricore.impl.OmcricorePackageImpl#getTouch()
		 * @generated
		 */
		EEnum TOUCH = eINSTANCE.getTouch();

	}

} //OmcricorePackage
