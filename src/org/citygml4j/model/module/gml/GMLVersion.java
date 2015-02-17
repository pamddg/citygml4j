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
package org.citygml4j.model.module.gml;

import java.util.ArrayList;
import java.util.List;

import org.citygml4j.model.module.AbstractModuleConfiguration;
import org.citygml4j.model.module.Module;

public class GMLVersion extends AbstractModuleConfiguration {
	private static final List<GMLVersion> instances = new ArrayList<GMLVersion>();

	public static final GMLVersion DEFAULT;
	public static final GMLVersion v3_1_1;

	private GMLVersion(Module... modules) {
		super(modules);
		instances.add(this);
	}

	static {
		v3_1_1 = new GMLVersion(
				GMLCoreModule.v3_1_1,
				XLinkModule.v3_1_1
		);

		DEFAULT = v3_1_1;
	}

	public List<GMLModule> getGMLModules() {
		List<GMLModule> gml = new ArrayList<GMLModule>();
		for (Module module : modules)
			gml.add((GMLModule)module);

		return gml;
	}

}
