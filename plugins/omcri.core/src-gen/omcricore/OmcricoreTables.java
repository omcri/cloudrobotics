/*******************************************************************************
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
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /omcri.core/model/omcricore.ecore
 * using:
 *   /omcri.core/model/omcricore.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package omcricore;

import omcricore.OmcricoreTables;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;

/**
 * OmcricoreTables provides the dispatch tables for the omcricore for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class OmcricoreTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(OmcricorePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_omcri_org_s_cloudrobotics_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://omcri.org/cloudrobotics/core/ecore", null, omcricore.OmcricorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Actuator = omcricore.OmcricoreTables.PACKid_http_c_s_s_omcri_org_s_cloudrobotics_s_core_s_ecore.getClassId("Actuator", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = omcricore.OmcricoreTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Connection = omcricore.OmcricoreTables.PACKid_http_c_s_s_omcri_org_s_cloudrobotics_s_core_s_ecore.getClassId("Connection", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = omcricore.OmcricoreTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = omcricore.OmcricoreTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Robot = omcricore.OmcricoreTables.PACKid_http_c_s_s_omcri_org_s_cloudrobotics_s_core_s_ecore.getClassId("Robot", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Robotlink = omcricore.OmcricoreTables.PACKid_http_c_s_s_omcri_org_s_cloudrobotics_s_core_s_ecore.getClassId("Robotlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Sensor = omcricore.OmcricoreTables.PACKid_http_c_s_s_omcri_org_s_cloudrobotics_s_core_s_ecore.getClassId("Sensor", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_Color = omcricore.OmcricoreTables.PACKid_http_c_s_s_omcri_org_s_cloudrobotics_s_core_s_ecore.getEnumerationId("Color");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Actuator_c_c_appliesConstraint = "Actuator::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Connection_c_c_appliesConstraint = "Connection::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Robotlink_c_c_targetConstraint = "Robotlink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Sensor_c_c_appliesConstraint = "Sensor::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			OmcricoreTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OmcricoreTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _Actuator = new EcoreExecutorType(OmcricorePackage.Literals.ACTUATOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Color = new EcoreExecutorEnumeration(OmcricorePackage.Literals.COLOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Colorsensor = new EcoreExecutorType(OmcricorePackage.Literals.COLORSENSOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Connection = new EcoreExecutorType(OmcricorePackage.Literals.CONNECTION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Flightactuator = new EcoreExecutorType(OmcricorePackage.Literals.FLIGHTACTUATOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Motionactuator = new EcoreExecutorType(OmcricorePackage.Literals.MOTIONACTUATOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Mouthactuator = new EcoreExecutorType(OmcricorePackage.Literals.MOUTHACTUATOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Robot = new EcoreExecutorType(OmcricorePackage.Literals.ROBOT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Robotlink = new EcoreExecutorType(OmcricorePackage.Literals.ROBOTLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Sensor = new EcoreExecutorType(OmcricorePackage.Literals.SENSOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Touch = new EcoreExecutorEnumeration(OmcricorePackage.Literals.TOUCH, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Touchsensor = new EcoreExecutorType(OmcricorePackage.Literals.TOUCHSENSOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ultrasonicsensor = new EcoreExecutorType(OmcricorePackage.Literals.ULTRASONICSENSOR, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Actuator,
			_Color,
			_Colorsensor,
			_Connection,
			_Flightactuator,
			_Motionactuator,
			_Mouthactuator,
			_Robot,
			_Robotlink,
			_Sensor,
			_Touch,
			_Touchsensor,
			_Ultrasonicsensor
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OmcricoreTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Actuator__Actuator = new ExecutorFragment(Types._Actuator, OmcricoreTables.Types._Actuator);
		private static final /*@NonNull*/ ExecutorFragment _Actuator__MixinBase = new ExecutorFragment(Types._Actuator, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Actuator__OclAny = new ExecutorFragment(Types._Actuator, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Actuator__OclElement = new ExecutorFragment(Types._Actuator, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Color__Color = new ExecutorFragment(Types._Color, OmcricoreTables.Types._Color);
		private static final /*@NonNull*/ ExecutorFragment _Color__OclAny = new ExecutorFragment(Types._Color, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Color__OclElement = new ExecutorFragment(Types._Color, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Color__OclEnumeration = new ExecutorFragment(Types._Color, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Color__OclType = new ExecutorFragment(Types._Color, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Colorsensor__Colorsensor = new ExecutorFragment(Types._Colorsensor, OmcricoreTables.Types._Colorsensor);
		private static final /*@NonNull*/ ExecutorFragment _Colorsensor__MixinBase = new ExecutorFragment(Types._Colorsensor, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Colorsensor__OclAny = new ExecutorFragment(Types._Colorsensor, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Colorsensor__OclElement = new ExecutorFragment(Types._Colorsensor, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Colorsensor__Sensor = new ExecutorFragment(Types._Colorsensor, OmcricoreTables.Types._Sensor);

		private static final /*@NonNull*/ ExecutorFragment _Connection__Connection = new ExecutorFragment(Types._Connection, OmcricoreTables.Types._Connection);
		private static final /*@NonNull*/ ExecutorFragment _Connection__MixinBase = new ExecutorFragment(Types._Connection, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Connection__OclAny = new ExecutorFragment(Types._Connection, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Connection__OclElement = new ExecutorFragment(Types._Connection, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Flightactuator__Actuator = new ExecutorFragment(Types._Flightactuator, OmcricoreTables.Types._Actuator);
		private static final /*@NonNull*/ ExecutorFragment _Flightactuator__Flightactuator = new ExecutorFragment(Types._Flightactuator, OmcricoreTables.Types._Flightactuator);
		private static final /*@NonNull*/ ExecutorFragment _Flightactuator__MixinBase = new ExecutorFragment(Types._Flightactuator, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Flightactuator__OclAny = new ExecutorFragment(Types._Flightactuator, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Flightactuator__OclElement = new ExecutorFragment(Types._Flightactuator, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Motionactuator__Actuator = new ExecutorFragment(Types._Motionactuator, OmcricoreTables.Types._Actuator);
		private static final /*@NonNull*/ ExecutorFragment _Motionactuator__MixinBase = new ExecutorFragment(Types._Motionactuator, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Motionactuator__Motionactuator = new ExecutorFragment(Types._Motionactuator, OmcricoreTables.Types._Motionactuator);
		private static final /*@NonNull*/ ExecutorFragment _Motionactuator__OclAny = new ExecutorFragment(Types._Motionactuator, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Motionactuator__OclElement = new ExecutorFragment(Types._Motionactuator, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Mouthactuator__Actuator = new ExecutorFragment(Types._Mouthactuator, OmcricoreTables.Types._Actuator);
		private static final /*@NonNull*/ ExecutorFragment _Mouthactuator__MixinBase = new ExecutorFragment(Types._Mouthactuator, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Mouthactuator__Mouthactuator = new ExecutorFragment(Types._Mouthactuator, OmcricoreTables.Types._Mouthactuator);
		private static final /*@NonNull*/ ExecutorFragment _Mouthactuator__OclAny = new ExecutorFragment(Types._Mouthactuator, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Mouthactuator__OclElement = new ExecutorFragment(Types._Mouthactuator, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Robot__Entity = new ExecutorFragment(Types._Robot, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Robot__OclAny = new ExecutorFragment(Types._Robot, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Robot__OclElement = new ExecutorFragment(Types._Robot, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Robot__Resource = new ExecutorFragment(Types._Robot, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Robot__Robot = new ExecutorFragment(Types._Robot, OmcricoreTables.Types._Robot);

		private static final /*@NonNull*/ ExecutorFragment _Robotlink__Entity = new ExecutorFragment(Types._Robotlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Robotlink__Link = new ExecutorFragment(Types._Robotlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Robotlink__OclAny = new ExecutorFragment(Types._Robotlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Robotlink__OclElement = new ExecutorFragment(Types._Robotlink, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Robotlink__Robotlink = new ExecutorFragment(Types._Robotlink, OmcricoreTables.Types._Robotlink);

		private static final /*@NonNull*/ ExecutorFragment _Sensor__MixinBase = new ExecutorFragment(Types._Sensor, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Sensor__OclAny = new ExecutorFragment(Types._Sensor, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Sensor__OclElement = new ExecutorFragment(Types._Sensor, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Sensor__Sensor = new ExecutorFragment(Types._Sensor, OmcricoreTables.Types._Sensor);

		private static final /*@NonNull*/ ExecutorFragment _Touch__OclAny = new ExecutorFragment(Types._Touch, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Touch__OclElement = new ExecutorFragment(Types._Touch, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Touch__OclEnumeration = new ExecutorFragment(Types._Touch, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Touch__OclType = new ExecutorFragment(Types._Touch, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _Touch__Touch = new ExecutorFragment(Types._Touch, OmcricoreTables.Types._Touch);

		private static final /*@NonNull*/ ExecutorFragment _Touchsensor__MixinBase = new ExecutorFragment(Types._Touchsensor, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Touchsensor__OclAny = new ExecutorFragment(Types._Touchsensor, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Touchsensor__OclElement = new ExecutorFragment(Types._Touchsensor, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Touchsensor__Sensor = new ExecutorFragment(Types._Touchsensor, OmcricoreTables.Types._Sensor);
		private static final /*@NonNull*/ ExecutorFragment _Touchsensor__Touchsensor = new ExecutorFragment(Types._Touchsensor, OmcricoreTables.Types._Touchsensor);

		private static final /*@NonNull*/ ExecutorFragment _Ultrasonicsensor__MixinBase = new ExecutorFragment(Types._Ultrasonicsensor, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ultrasonicsensor__OclAny = new ExecutorFragment(Types._Ultrasonicsensor, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ultrasonicsensor__OclElement = new ExecutorFragment(Types._Ultrasonicsensor, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ultrasonicsensor__Sensor = new ExecutorFragment(Types._Ultrasonicsensor, OmcricoreTables.Types._Sensor);
		private static final /*@NonNull*/ ExecutorFragment _Ultrasonicsensor__Ultrasonicsensor = new ExecutorFragment(Types._Ultrasonicsensor, OmcricoreTables.Types._Ultrasonicsensor);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OmcricoreTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OmcricoreTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final /*@NonNull*/ ExecutorOperation _Colorsensor__sensecolor = new ExecutorOperation("sensecolor", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Colorsensor,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Connection__connect = new ExecutorOperation("connect", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Connection,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Connection__disconnect = new ExecutorOperation("disconnect", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Connection,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Flightactuator__land = new ExecutorOperation("land", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Flightactuator,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Flightactuator__move = new ExecutorOperation("move", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Flightactuator,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Flightactuator__takeoff = new ExecutorOperation("takeoff", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Flightactuator,
			2, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Motionactuator__movebackward = new ExecutorOperation("movebackward", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motionactuator,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motionactuator__moveforward = new ExecutorOperation("moveforward", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motionactuator,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motionactuator__stop = new ExecutorOperation("stop", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motionactuator,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motionactuator__turnleft = new ExecutorOperation("turnleft", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motionactuator,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motionactuator__turnright = new ExecutorOperation("turnright", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motionactuator,
			4, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Mouthactuator__closemouth = new ExecutorOperation("closemouth", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Mouthactuator,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Mouthactuator__openmouth = new ExecutorOperation("openmouth", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Mouthactuator,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Touchsensor__sensetouch = new ExecutorOperation("sensetouch", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Touchsensor,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Ultrasonicsensor__sensedistance = new ExecutorOperation("sensedistance", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Ultrasonicsensor,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OmcricoreTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final /*@NonNull*/ ExecutorProperty _Colorsensor__color = new EcoreExecutorProperty(OmcricorePackage.Literals.COLORSENSOR__COLOR, Types._Colorsensor, 0);
		public static final /*@NonNull*/ ExecutorProperty _Colorsensor__colorLamp = new EcoreExecutorProperty(OmcricorePackage.Literals.COLORSENSOR__COLOR_LAMP, Types._Colorsensor, 1);
		public static final /*@NonNull*/ ExecutorProperty _Colorsensor__darkness = new EcoreExecutorProperty(OmcricorePackage.Literals.COLORSENSOR__DARKNESS, Types._Colorsensor, 2);
		public static final /*@NonNull*/ ExecutorProperty _Colorsensor__light = new EcoreExecutorProperty(OmcricorePackage.Literals.COLORSENSOR__LIGHT, Types._Colorsensor, 3);

		public static final /*@NonNull*/ ExecutorProperty _Connection__timeOut = new EcoreExecutorProperty(OmcricorePackage.Literals.CONNECTION__TIME_OUT, Types._Connection, 0);

		public static final /*@NonNull*/ ExecutorProperty _Flightactuator__horizontalSpeed = new EcoreExecutorProperty(OmcricorePackage.Literals.FLIGHTACTUATOR__HORIZONTAL_SPEED, Types._Flightactuator, 0);
		public static final /*@NonNull*/ ExecutorProperty _Flightactuator__horizontalTilt = new EcoreExecutorProperty(OmcricorePackage.Literals.FLIGHTACTUATOR__HORIZONTAL_TILT, Types._Flightactuator, 1);
		public static final /*@NonNull*/ ExecutorProperty _Flightactuator__verticalSpeed = new EcoreExecutorProperty(OmcricorePackage.Literals.FLIGHTACTUATOR__VERTICAL_SPEED, Types._Flightactuator, 2);
		public static final /*@NonNull*/ ExecutorProperty _Flightactuator__verticalTilt = new EcoreExecutorProperty(OmcricorePackage.Literals.FLIGHTACTUATOR__VERTICAL_TILT, Types._Flightactuator, 3);

		public static final /*@NonNull*/ ExecutorProperty _Motionactuator__angle = new EcoreExecutorProperty(OmcricorePackage.Literals.MOTIONACTUATOR__ANGLE, Types._Motionactuator, 0);
		public static final /*@NonNull*/ ExecutorProperty _Motionactuator__duration = new EcoreExecutorProperty(OmcricorePackage.Literals.MOTIONACTUATOR__DURATION, Types._Motionactuator, 1);
		public static final /*@NonNull*/ ExecutorProperty _Motionactuator__speed = new EcoreExecutorProperty(OmcricorePackage.Literals.MOTIONACTUATOR__SPEED, Types._Motionactuator, 2);

		public static final /*@NonNull*/ ExecutorProperty _Touchsensor__touch = new EcoreExecutorProperty(OmcricorePackage.Literals.TOUCHSENSOR__TOUCH, Types._Touchsensor, 0);

		public static final /*@NonNull*/ ExecutorProperty _Ultrasonicsensor__distance = new EcoreExecutorProperty(OmcricorePackage.Literals.ULTRASONICSENSOR__DISTANCE, Types._Ultrasonicsensor, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OmcricoreTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Actuator =
		{
			Fragments._Actuator__OclAny /* 0 */,
			Fragments._Actuator__OclElement /* 1 */,
			Fragments._Actuator__MixinBase /* 2 */,
			Fragments._Actuator__Actuator /* 3 */
		};
		private static final int /*@NonNull*/ [] __Actuator = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Color =
		{
			Fragments._Color__OclAny /* 0 */,
			Fragments._Color__OclElement /* 1 */,
			Fragments._Color__OclType /* 2 */,
			Fragments._Color__OclEnumeration /* 3 */,
			Fragments._Color__Color /* 4 */
		};
		private static final int /*@NonNull*/ [] __Color = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Colorsensor =
		{
			Fragments._Colorsensor__OclAny /* 0 */,
			Fragments._Colorsensor__OclElement /* 1 */,
			Fragments._Colorsensor__MixinBase /* 2 */,
			Fragments._Colorsensor__Sensor /* 3 */,
			Fragments._Colorsensor__Colorsensor /* 4 */
		};
		private static final int /*@NonNull*/ [] __Colorsensor = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Connection =
		{
			Fragments._Connection__OclAny /* 0 */,
			Fragments._Connection__OclElement /* 1 */,
			Fragments._Connection__MixinBase /* 2 */,
			Fragments._Connection__Connection /* 3 */
		};
		private static final int /*@NonNull*/ [] __Connection = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Flightactuator =
		{
			Fragments._Flightactuator__OclAny /* 0 */,
			Fragments._Flightactuator__OclElement /* 1 */,
			Fragments._Flightactuator__MixinBase /* 2 */,
			Fragments._Flightactuator__Actuator /* 3 */,
			Fragments._Flightactuator__Flightactuator /* 4 */
		};
		private static final int /*@NonNull*/ [] __Flightactuator = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Motionactuator =
		{
			Fragments._Motionactuator__OclAny /* 0 */,
			Fragments._Motionactuator__OclElement /* 1 */,
			Fragments._Motionactuator__MixinBase /* 2 */,
			Fragments._Motionactuator__Actuator /* 3 */,
			Fragments._Motionactuator__Motionactuator /* 4 */
		};
		private static final int /*@NonNull*/ [] __Motionactuator = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Mouthactuator =
		{
			Fragments._Mouthactuator__OclAny /* 0 */,
			Fragments._Mouthactuator__OclElement /* 1 */,
			Fragments._Mouthactuator__MixinBase /* 2 */,
			Fragments._Mouthactuator__Actuator /* 3 */,
			Fragments._Mouthactuator__Mouthactuator /* 4 */
		};
		private static final int /*@NonNull*/ [] __Mouthactuator = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Robot =
		{
			Fragments._Robot__OclAny /* 0 */,
			Fragments._Robot__OclElement /* 1 */,
			Fragments._Robot__Entity /* 2 */,
			Fragments._Robot__Resource /* 3 */,
			Fragments._Robot__Robot /* 4 */
		};
		private static final int /*@NonNull*/ [] __Robot = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Robotlink =
		{
			Fragments._Robotlink__OclAny /* 0 */,
			Fragments._Robotlink__OclElement /* 1 */,
			Fragments._Robotlink__Entity /* 2 */,
			Fragments._Robotlink__Link /* 3 */,
			Fragments._Robotlink__Robotlink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Robotlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Sensor =
		{
			Fragments._Sensor__OclAny /* 0 */,
			Fragments._Sensor__OclElement /* 1 */,
			Fragments._Sensor__MixinBase /* 2 */,
			Fragments._Sensor__Sensor /* 3 */
		};
		private static final int /*@NonNull*/ [] __Sensor = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Touch =
		{
			Fragments._Touch__OclAny /* 0 */,
			Fragments._Touch__OclElement /* 1 */,
			Fragments._Touch__OclType /* 2 */,
			Fragments._Touch__OclEnumeration /* 3 */,
			Fragments._Touch__Touch /* 4 */
		};
		private static final int /*@NonNull*/ [] __Touch = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Touchsensor =
		{
			Fragments._Touchsensor__OclAny /* 0 */,
			Fragments._Touchsensor__OclElement /* 1 */,
			Fragments._Touchsensor__MixinBase /* 2 */,
			Fragments._Touchsensor__Sensor /* 3 */,
			Fragments._Touchsensor__Touchsensor /* 4 */
		};
		private static final int /*@NonNull*/ [] __Touchsensor = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ultrasonicsensor =
		{
			Fragments._Ultrasonicsensor__OclAny /* 0 */,
			Fragments._Ultrasonicsensor__OclElement /* 1 */,
			Fragments._Ultrasonicsensor__MixinBase /* 2 */,
			Fragments._Ultrasonicsensor__Sensor /* 3 */,
			Fragments._Ultrasonicsensor__Ultrasonicsensor /* 4 */
		};
		private static final int /*@NonNull*/ [] __Ultrasonicsensor = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Actuator.initFragments(_Actuator, __Actuator);
			Types._Color.initFragments(_Color, __Color);
			Types._Colorsensor.initFragments(_Colorsensor, __Colorsensor);
			Types._Connection.initFragments(_Connection, __Connection);
			Types._Flightactuator.initFragments(_Flightactuator, __Flightactuator);
			Types._Motionactuator.initFragments(_Motionactuator, __Motionactuator);
			Types._Mouthactuator.initFragments(_Mouthactuator, __Mouthactuator);
			Types._Robot.initFragments(_Robot, __Robot);
			Types._Robotlink.initFragments(_Robotlink, __Robotlink);
			Types._Sensor.initFragments(_Sensor, __Sensor);
			Types._Touch.initFragments(_Touch, __Touch);
			Types._Touchsensor.initFragments(_Touchsensor, __Touchsensor);
			Types._Ultrasonicsensor.initFragments(_Ultrasonicsensor, __Ultrasonicsensor);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OmcricoreTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actuator__Actuator = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actuator__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actuator__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actuator__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Color__Color = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Color__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Color__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Color__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Color__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Colorsensor__Colorsensor = {
			OmcricoreTables.Operations._Colorsensor__sensecolor /* sensecolor() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Colorsensor__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Colorsensor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Colorsensor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Colorsensor__Sensor = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Connection__Connection = {
			OmcricoreTables.Operations._Connection__connect /* connect() */,
			OmcricoreTables.Operations._Connection__disconnect /* disconnect() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Connection__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Connection__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Connection__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Flightactuator__Flightactuator = {
			OmcricoreTables.Operations._Flightactuator__land /* land() */,
			OmcricoreTables.Operations._Flightactuator__move /* move() */,
			OmcricoreTables.Operations._Flightactuator__takeoff /* takeoff() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Flightactuator__Actuator = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Flightactuator__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Flightactuator__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Flightactuator__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Motionactuator__Motionactuator = {
			OmcricoreTables.Operations._Motionactuator__movebackward /* movebackward() */,
			OmcricoreTables.Operations._Motionactuator__moveforward /* moveforward() */,
			OmcricoreTables.Operations._Motionactuator__stop /* stop() */,
			OmcricoreTables.Operations._Motionactuator__turnleft /* turnleft() */,
			OmcricoreTables.Operations._Motionactuator__turnright /* turnright() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Motionactuator__Actuator = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Motionactuator__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Motionactuator__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Motionactuator__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mouthactuator__Mouthactuator = {
			OmcricoreTables.Operations._Mouthactuator__closemouth /* closemouth() */,
			OmcricoreTables.Operations._Mouthactuator__openmouth /* openmouth() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mouthactuator__Actuator = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mouthactuator__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mouthactuator__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mouthactuator__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Robot__Robot = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Robot__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Robot__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Robot__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Robot__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Robotlink__Robotlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Robotlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Robotlink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Robotlink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Robotlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensor__Sensor = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensor__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touch__Touch = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touch__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touch__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touch__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touch__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touchsensor__Touchsensor = {
			OmcricoreTables.Operations._Touchsensor__sensetouch /* sensetouch() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touchsensor__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touchsensor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touchsensor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Touchsensor__Sensor = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ultrasonicsensor__Ultrasonicsensor = {
			OmcricoreTables.Operations._Ultrasonicsensor__sensedistance /* sensedistance() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ultrasonicsensor__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ultrasonicsensor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ultrasonicsensor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ultrasonicsensor__Sensor = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Actuator__Actuator.initOperations(_Actuator__Actuator);
			Fragments._Actuator__MixinBase.initOperations(_Actuator__MixinBase);
			Fragments._Actuator__OclAny.initOperations(_Actuator__OclAny);
			Fragments._Actuator__OclElement.initOperations(_Actuator__OclElement);

			Fragments._Color__Color.initOperations(_Color__Color);
			Fragments._Color__OclAny.initOperations(_Color__OclAny);
			Fragments._Color__OclElement.initOperations(_Color__OclElement);
			Fragments._Color__OclEnumeration.initOperations(_Color__OclEnumeration);
			Fragments._Color__OclType.initOperations(_Color__OclType);

			Fragments._Colorsensor__Colorsensor.initOperations(_Colorsensor__Colorsensor);
			Fragments._Colorsensor__MixinBase.initOperations(_Colorsensor__MixinBase);
			Fragments._Colorsensor__OclAny.initOperations(_Colorsensor__OclAny);
			Fragments._Colorsensor__OclElement.initOperations(_Colorsensor__OclElement);
			Fragments._Colorsensor__Sensor.initOperations(_Colorsensor__Sensor);

			Fragments._Connection__Connection.initOperations(_Connection__Connection);
			Fragments._Connection__MixinBase.initOperations(_Connection__MixinBase);
			Fragments._Connection__OclAny.initOperations(_Connection__OclAny);
			Fragments._Connection__OclElement.initOperations(_Connection__OclElement);

			Fragments._Flightactuator__Actuator.initOperations(_Flightactuator__Actuator);
			Fragments._Flightactuator__Flightactuator.initOperations(_Flightactuator__Flightactuator);
			Fragments._Flightactuator__MixinBase.initOperations(_Flightactuator__MixinBase);
			Fragments._Flightactuator__OclAny.initOperations(_Flightactuator__OclAny);
			Fragments._Flightactuator__OclElement.initOperations(_Flightactuator__OclElement);

			Fragments._Motionactuator__Actuator.initOperations(_Motionactuator__Actuator);
			Fragments._Motionactuator__MixinBase.initOperations(_Motionactuator__MixinBase);
			Fragments._Motionactuator__Motionactuator.initOperations(_Motionactuator__Motionactuator);
			Fragments._Motionactuator__OclAny.initOperations(_Motionactuator__OclAny);
			Fragments._Motionactuator__OclElement.initOperations(_Motionactuator__OclElement);

			Fragments._Mouthactuator__Actuator.initOperations(_Mouthactuator__Actuator);
			Fragments._Mouthactuator__MixinBase.initOperations(_Mouthactuator__MixinBase);
			Fragments._Mouthactuator__Mouthactuator.initOperations(_Mouthactuator__Mouthactuator);
			Fragments._Mouthactuator__OclAny.initOperations(_Mouthactuator__OclAny);
			Fragments._Mouthactuator__OclElement.initOperations(_Mouthactuator__OclElement);

			Fragments._Robot__Entity.initOperations(_Robot__Entity);
			Fragments._Robot__OclAny.initOperations(_Robot__OclAny);
			Fragments._Robot__OclElement.initOperations(_Robot__OclElement);
			Fragments._Robot__Resource.initOperations(_Robot__Resource);
			Fragments._Robot__Robot.initOperations(_Robot__Robot);

			Fragments._Robotlink__Entity.initOperations(_Robotlink__Entity);
			Fragments._Robotlink__Link.initOperations(_Robotlink__Link);
			Fragments._Robotlink__OclAny.initOperations(_Robotlink__OclAny);
			Fragments._Robotlink__OclElement.initOperations(_Robotlink__OclElement);
			Fragments._Robotlink__Robotlink.initOperations(_Robotlink__Robotlink);

			Fragments._Sensor__MixinBase.initOperations(_Sensor__MixinBase);
			Fragments._Sensor__OclAny.initOperations(_Sensor__OclAny);
			Fragments._Sensor__OclElement.initOperations(_Sensor__OclElement);
			Fragments._Sensor__Sensor.initOperations(_Sensor__Sensor);

			Fragments._Touch__OclAny.initOperations(_Touch__OclAny);
			Fragments._Touch__OclElement.initOperations(_Touch__OclElement);
			Fragments._Touch__OclEnumeration.initOperations(_Touch__OclEnumeration);
			Fragments._Touch__OclType.initOperations(_Touch__OclType);
			Fragments._Touch__Touch.initOperations(_Touch__Touch);

			Fragments._Touchsensor__MixinBase.initOperations(_Touchsensor__MixinBase);
			Fragments._Touchsensor__OclAny.initOperations(_Touchsensor__OclAny);
			Fragments._Touchsensor__OclElement.initOperations(_Touchsensor__OclElement);
			Fragments._Touchsensor__Sensor.initOperations(_Touchsensor__Sensor);
			Fragments._Touchsensor__Touchsensor.initOperations(_Touchsensor__Touchsensor);

			Fragments._Ultrasonicsensor__MixinBase.initOperations(_Ultrasonicsensor__MixinBase);
			Fragments._Ultrasonicsensor__OclAny.initOperations(_Ultrasonicsensor__OclAny);
			Fragments._Ultrasonicsensor__OclElement.initOperations(_Ultrasonicsensor__OclElement);
			Fragments._Ultrasonicsensor__Sensor.initOperations(_Ultrasonicsensor__Sensor);
			Fragments._Ultrasonicsensor__Ultrasonicsensor.initOperations(_Ultrasonicsensor__Ultrasonicsensor);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OmcricoreTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Actuator = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Color = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Colorsensor = {
			OmcricoreTables.Properties._Colorsensor__color,
			OmcricoreTables.Properties._Colorsensor__colorLamp,
			OmcricoreTables.Properties._Colorsensor__darkness,
			OmcricoreTables.Properties._Colorsensor__light
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Connection = {
			OmcricoreTables.Properties._Connection__timeOut
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Flightactuator = {
			OmcricoreTables.Properties._Flightactuator__horizontalSpeed,
			OmcricoreTables.Properties._Flightactuator__horizontalTilt,
			OmcricoreTables.Properties._Flightactuator__verticalSpeed,
			OmcricoreTables.Properties._Flightactuator__verticalTilt
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Motionactuator = {
			OmcricoreTables.Properties._Motionactuator__angle,
			OmcricoreTables.Properties._Motionactuator__duration,
			OmcricoreTables.Properties._Motionactuator__speed
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Mouthactuator = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Robot = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Robotlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Sensor = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Touch = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Touchsensor = {
			OmcricoreTables.Properties._Touchsensor__touch
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ultrasonicsensor = {
			OmcricoreTables.Properties._Ultrasonicsensor__distance
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Actuator__Actuator.initProperties(_Actuator);
			Fragments._Color__Color.initProperties(_Color);
			Fragments._Colorsensor__Colorsensor.initProperties(_Colorsensor);
			Fragments._Connection__Connection.initProperties(_Connection);
			Fragments._Flightactuator__Flightactuator.initProperties(_Flightactuator);
			Fragments._Motionactuator__Motionactuator.initProperties(_Motionactuator);
			Fragments._Mouthactuator__Mouthactuator.initProperties(_Mouthactuator);
			Fragments._Robot__Robot.initProperties(_Robot);
			Fragments._Robotlink__Robotlink.initProperties(_Robotlink);
			Fragments._Sensor__Sensor.initProperties(_Sensor);
			Fragments._Touch__Touch.initProperties(_Touch);
			Fragments._Touchsensor__Touchsensor.initProperties(_Touchsensor);
			Fragments._Ultrasonicsensor__Ultrasonicsensor.initProperties(_Ultrasonicsensor);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OmcricoreTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Color__WHITE = new EcoreExecutorEnumerationLiteral(OmcricorePackage.Literals.COLOR.getEEnumLiteral("WHITE"), Types._Color, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Color__BLACK = new EcoreExecutorEnumerationLiteral(OmcricorePackage.Literals.COLOR.getEEnumLiteral("BLACK"), Types._Color, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Color__BLUE = new EcoreExecutorEnumerationLiteral(OmcricorePackage.Literals.COLOR.getEEnumLiteral("BLUE"), Types._Color, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Color__YELLOW = new EcoreExecutorEnumerationLiteral(OmcricorePackage.Literals.COLOR.getEEnumLiteral("YELLOW"), Types._Color, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Color__RED = new EcoreExecutorEnumerationLiteral(OmcricorePackage.Literals.COLOR.getEEnumLiteral("RED"), Types._Color, 4);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Color__GREEN = new EcoreExecutorEnumerationLiteral(OmcricorePackage.Literals.COLOR.getEEnumLiteral("GREEN"), Types._Color, 5);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Color = {
			_Color__WHITE,
			_Color__BLACK,
			_Color__BLUE,
			_Color__YELLOW,
			_Color__RED,
			_Color__GREEN
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Touch__PRESSED = new EcoreExecutorEnumerationLiteral(OmcricorePackage.Literals.TOUCH.getEEnumLiteral("PRESSED"), Types._Touch, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Touch__RELEASED = new EcoreExecutorEnumerationLiteral(OmcricorePackage.Literals.TOUCH.getEEnumLiteral("RELEASED"), Types._Touch, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Touch__HIT = new EcoreExecutorEnumerationLiteral(OmcricorePackage.Literals.TOUCH.getEEnumLiteral("HIT"), Types._Touch, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Touch = {
			_Touch__PRESSED,
			_Touch__RELEASED,
			_Touch__HIT
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Color.initLiterals(_Color);
			Types._Touch.initLiterals(_Touch);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OmcricoreTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
