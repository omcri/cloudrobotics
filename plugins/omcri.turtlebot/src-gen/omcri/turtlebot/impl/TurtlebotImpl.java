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
package omcri.turtlebot.impl;

import omcri.turtlebot.Turtlebot;
import omcri.turtlebot.TurtlebotPackage;

import omcricore.impl.RobotImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turtlebot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link omcri.turtlebot.impl.TurtlebotImpl#getUser <em>User</em>}</li>
 *   <li>{@link omcri.turtlebot.impl.TurtlebotImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link omcri.turtlebot.impl.TurtlebotImpl#getIpaddress <em>Ipaddress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurtlebotImpl extends RobotImpl implements Turtlebot {
	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

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
	protected TurtlebotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TurtlebotPackage.Literals.TURTLEBOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.TURTLEBOT__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.TURTLEBOT__PASSWORD, oldPassword, password));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.TURTLEBOT__IPADDRESS, oldIpaddress, ipaddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TurtlebotPackage.TURTLEBOT__USER:
				return getUser();
			case TurtlebotPackage.TURTLEBOT__PASSWORD:
				return getPassword();
			case TurtlebotPackage.TURTLEBOT__IPADDRESS:
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
			case TurtlebotPackage.TURTLEBOT__USER:
				setUser((String)newValue);
				return;
			case TurtlebotPackage.TURTLEBOT__PASSWORD:
				setPassword((String)newValue);
				return;
			case TurtlebotPackage.TURTLEBOT__IPADDRESS:
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
			case TurtlebotPackage.TURTLEBOT__USER:
				setUser(USER_EDEFAULT);
				return;
			case TurtlebotPackage.TURTLEBOT__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case TurtlebotPackage.TURTLEBOT__IPADDRESS:
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
			case TurtlebotPackage.TURTLEBOT__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case TurtlebotPackage.TURTLEBOT__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case TurtlebotPackage.TURTLEBOT__IPADDRESS:
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
		result.append(" (user: ");
		result.append(user);
		result.append(", password: ");
		result.append(password);
		result.append(", ipaddress: ");
		result.append(ipaddress);
		result.append(')');
		return result.toString();
	}

} //TurtlebotImpl
