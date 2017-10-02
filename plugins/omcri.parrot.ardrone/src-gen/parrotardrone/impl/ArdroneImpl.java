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
package parrotardrone.impl;

import omcricore.impl.RobotImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import parrotardrone.Ardrone;
import parrotardrone.ParrotardronePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ardrone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link parrotardrone.impl.ArdroneImpl#getIpadress <em>Ipadress</em>}</li>
 *   <li>{@link parrotardrone.impl.ArdroneImpl#getSsid <em>Ssid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArdroneImpl extends RobotImpl implements Ardrone {
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
	 * The default value of the '{@link #getSsid() <em>Ssid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsid()
	 * @generated
	 * @ordered
	 */
	protected static final String SSID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsid() <em>Ssid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsid()
	 * @generated
	 * @ordered
	 */
	protected String ssid = SSID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArdroneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParrotardronePackage.Literals.ARDRONE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ParrotardronePackage.ARDRONE__IPADRESS, oldIpadress, ipadress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSsid() {
		return ssid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsid(String newSsid) {
		String oldSsid = ssid;
		ssid = newSsid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParrotardronePackage.ARDRONE__SSID, oldSsid, ssid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParrotardronePackage.ARDRONE__IPADRESS:
				return getIpadress();
			case ParrotardronePackage.ARDRONE__SSID:
				return getSsid();
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
			case ParrotardronePackage.ARDRONE__IPADRESS:
				setIpadress((String)newValue);
				return;
			case ParrotardronePackage.ARDRONE__SSID:
				setSsid((String)newValue);
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
			case ParrotardronePackage.ARDRONE__IPADRESS:
				setIpadress(IPADRESS_EDEFAULT);
				return;
			case ParrotardronePackage.ARDRONE__SSID:
				setSsid(SSID_EDEFAULT);
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
			case ParrotardronePackage.ARDRONE__IPADRESS:
				return IPADRESS_EDEFAULT == null ? ipadress != null : !IPADRESS_EDEFAULT.equals(ipadress);
			case ParrotardronePackage.ARDRONE__SSID:
				return SSID_EDEFAULT == null ? ssid != null : !SSID_EDEFAULT.equals(ssid);
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
		result.append(", ssid: ");
		result.append(ssid);
		result.append(')');
		return result.toString();
	}

} //ArdroneImpl
