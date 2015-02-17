/*
 * citygml4j - The Open Source Java API for CityGML
 * https://github.com/citygml4j
 * 
 * Copyright (C) 2013 - 2015,
 * Claus Nagel <claus.nagel@gmail.com>
 *
 * The citygml4j library is free software:
 * you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 */
package org.citygml4j.model.module.citygml;

import org.citygml4j.model.module.ModuleVersion;

public enum CityGMLModuleVersion implements ModuleVersion {
	v2_0_0("2.0.0"),
	v1_0_0("1.0.0");
	
	private final String value;
	
	CityGMLModuleVersion(String value) {
		this.value = value;
	}
		
	public String toString() {
		return value;
	}
	
}
