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

import omcricore.impl.RobotImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import parrotminidrone.Minidrone;
import parrotminidrone.ParrotminidronePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Minidrone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link parrotminidrone.impl.MinidroneImpl#getIpadress <em>Ipadress</em>}</li>
 *   <li>{@link parrotminidrone.impl.MinidroneImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinidroneImpl extends RobotImpl implements Minidrone {
	/**
	 * The default value of the '{@link #getIpadress() <em>Ipadress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpadress()
	 * @generated
	 * @ordered
	 */
	protected static final String IPADRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpadress() <em>Ipadress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpadress()
	 * @generated
	 * @ordered
	 */
	protected String ipadress = IPADRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinidroneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParrotminidronePackage.Literals.MINIDRONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpadress() {
		return ipadress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpadress(String newIpadress) {
		String oldIpadress = ipadress;
		ipadress = newIpadress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParrotminidronePackage.MINIDRONE__IPADRESS, oldIpadress, ipadress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParrotminidronePackage.MINIDRONE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParrotminidronePackage.MINIDRONE__IPADRESS:
				return getIpadress();
			case ParrotminidronePackage.MINIDRONE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ParrotminidronePackage.MINIDRONE__IPADRESS:
				setIpadress((String)newValue);
				return;
			case ParrotminidronePackage.MINIDRONE__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ParrotminidronePackage.MINIDRONE__IPADRESS:
				setIpadress(IPADRESS_EDEFAULT);
				return;
			case ParrotminidronePackage.MINIDRONE__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ParrotminidronePackage.MINIDRONE__IPADRESS:
				return IPADRESS_EDEFAULT == null ? ipadress != null : !IPADRESS_EDEFAULT.equals(ipadress);
			case ParrotminidronePackage.MINIDRONE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ipadress: ");
		result.append(ipadress);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MinidroneImpl
