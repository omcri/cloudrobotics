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
 *   /omcri.legomindstormEV3/model/legomindstormev3.ecore
 * using:
 *   /omcri.legomindstormEV3/model/legomindstormev3.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package omcri.legomindstormev3;

import omcri.legomindstormev3.Legomindstormev3Tables;
import omcricore.OmcricoreTables;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

/**
 * Legomindstormev3Tables provides the dispatch tables for the legomindstormev3 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class Legomindstormev3Tables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Legomindstormev3Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Legomindstormev3Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Legomindstormev3Tables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Legomindstormev3 = new EcoreExecutorType(Legomindstormev3Package.Literals.LEGOMINDSTORMEV3, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Legomindstormev3
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Legomindstormev3Tables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Legomindstormev3__Entity = new ExecutorFragment(Types._Legomindstormev3, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Legomindstormev3__Legomindstormev3 = new ExecutorFragment(Types._Legomindstormev3, Legomindstormev3Tables.Types._Legomindstormev3);
		private static final /*@NonNull*/ ExecutorFragment _Legomindstormev3__OclAny = new ExecutorFragment(Types._Legomindstormev3, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Legomindstormev3__OclElement = new ExecutorFragment(Types._Legomindstormev3, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Legomindstormev3__Resource = new ExecutorFragment(Types._Legomindstormev3, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Legomindstormev3__Robot = new ExecutorFragment(Types._Legomindstormev3, OmcricoreTables.Types._Robot);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Legomindstormev3Tables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of Legomindstormev3Tables::Parameters and all preceding sub-packages.
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

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Legomindstormev3Tables::Operations and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorProperty _Legomindstormev3__ipaddress = new EcoreExecutorProperty(Legomindstormev3Package.Literals.LEGOMINDSTORMEV3__IPADDRESS, Types._Legomindstormev3, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Legomindstormev3Tables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Legomindstormev3 =
		{
			Fragments._Legomindstormev3__OclAny /* 0 */,
			Fragments._Legomindstormev3__OclElement /* 1 */,
			Fragments._Legomindstormev3__Entity /* 2 */,
			Fragments._Legomindstormev3__Resource /* 3 */,
			Fragments._Legomindstormev3__Robot /* 4 */,
			Fragments._Legomindstormev3__Legomindstormev3 /* 5 */
		};
		private static final int /*@NonNull*/ [] __Legomindstormev3 = { 1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Legomindstormev3.initFragments(_Legomindstormev3, __Legomindstormev3);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Legomindstormev3Tables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Legomindstormev3__Legomindstormev3 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Legomindstormev3__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Legomindstormev3__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Legomindstormev3__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Legomindstormev3__Resource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Legomindstormev3__Robot = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Legomindstormev3__Entity.initOperations(_Legomindstormev3__Entity);
			Fragments._Legomindstormev3__Legomindstormev3.initOperations(_Legomindstormev3__Legomindstormev3);
			Fragments._Legomindstormev3__OclAny.initOperations(_Legomindstormev3__OclAny);
			Fragments._Legomindstormev3__OclElement.initOperations(_Legomindstormev3__OclElement);
			Fragments._Legomindstormev3__Resource.initOperations(_Legomindstormev3__Resource);
			Fragments._Legomindstormev3__Robot.initOperations(_Legomindstormev3__Robot);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Legomindstormev3Tables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Legomindstormev3 = {
			Legomindstormev3Tables.Properties._Legomindstormev3__ipaddress
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Legomindstormev3__Legomindstormev3.initProperties(_Legomindstormev3);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Legomindstormev3Tables::FragmentProperties and all preceding sub-packages.
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

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Legomindstormev3Tables::EnumerationLiterals and all preceding sub-packages.
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
