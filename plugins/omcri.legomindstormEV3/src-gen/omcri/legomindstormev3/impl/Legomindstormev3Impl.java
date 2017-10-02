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
package omcri.legomindstormev3.impl;

import omcri.legomindstormev3.Legomindstormev3;
import omcri.legomindstormev3.Legomindstormev3Package;

import omcricore.impl.RobotImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legomindstormev3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link omcri.legomindstormev3.impl.Legomindstormev3Impl#getIpaddress <em>Ipaddress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Legomindstormev3Impl extends RobotImpl implements Legomindstormev3 {
	/**
	 * The default value of the '{@link #getIpaddress() <em>Ipaddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpaddress()
	 * @generated
	 * @ordered
	 */
	protected static final String IPADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpaddress() <em>Ipaddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpaddress()
	 * @generated
	 * @ordered
	 */
	protected String ipaddress = IPADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Legomindstormev3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Legomindstormev3Package.Literals.LEGOMINDSTORMEV3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpaddress() {
		return ipaddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpaddress(String newIpaddress) {
		String oldIpaddress = ipaddress;
		ipaddress = newIpaddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Legomindstormev3Package.LEGOMINDSTORMEV3__IPADDRESS, oldIpaddress, ipaddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Legomindstormev3Package.LEGOMINDSTORMEV3__IPADDRESS:
				return getIpaddress();
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
			case Legomindstormev3Package.LEGOMINDSTORMEV3__IPADDRESS:
				setIpaddress((String)newValue);
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
			case Legomindstormev3Package.LEGOMINDSTORMEV3__IPADDRESS:
				setIpaddress(IPADDRESS_EDEFAULT);
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
			case Legomindstormev3Package.LEGOMINDSTORMEV3__IPADDRESS:
				return IPADDRESS_EDEFAULT == null ? ipaddress != null : !IPADDRESS_EDEFAULT.equals(ipaddress);
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
		result.append(" (ipaddress: ");
		result.append(ipaddress);
		result.append(')');
		return result.toString();
	}

} //Legomindstormev3Impl
