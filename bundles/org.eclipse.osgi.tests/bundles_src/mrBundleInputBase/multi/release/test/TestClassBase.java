/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package multi.release.test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestClassBase {
	public String toString() {
		return "BASEXX";
	}

	public static URL createURL(String spec) throws MalformedURLException {
		return new URL(spec);
	}
}
