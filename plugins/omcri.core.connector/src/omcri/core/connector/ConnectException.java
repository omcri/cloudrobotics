/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
 *
 */
package omcri.core.connector;

/**
 * 
 * Manage connectivity exceptions.
 * @author Christophe Gourdin
 *
 */
public class ConnectException extends Exception {

	public ConnectException() {
		super();
	
	}

	public ConnectException(String message, Throwable cause) {
		super(message, cause);

	}

	public ConnectException(String message) {
		super(message);

	}

	public ConnectException(Throwable cause) {
		super(cause);

	}
	
}
