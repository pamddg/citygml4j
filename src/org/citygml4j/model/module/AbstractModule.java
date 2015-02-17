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
package org.citygml4j.model.module;

public abstract class AbstractModule implements Module {
	private final ModuleType type;
	private final ModuleVersion version;
	private final String namespaceURI;
	private final String namespacePrefix;
	private final String schemaLocation;
	private final Module[] dependencies;
	
	public AbstractModule(
			ModuleType type,
			ModuleVersion version,
			String namespaceURI, 
			String namespacePrefix, 
			String schemaLocation, 
			Module... dependencies) {
		this.type = type;
		this.version = version;
		this.namespaceURI = namespaceURI;
		this.namespacePrefix = namespacePrefix;
		this.schemaLocation = schemaLocation;
		this.dependencies = dependencies;
	}
	
	public ModuleType getType() {
		return type;
	}

	public ModuleVersion getVersion() {
		return version;
	}

	public String getNamespaceURI() {
		return namespaceURI;
	}

	public String getNamespacePrefix() {
		return namespacePrefix;
	}

	public String getSchemaLocation() {
		return schemaLocation;
	}
	
	public Module[] getDependencies() {
		return dependencies;
	}
	
	public boolean isDependentOn(Module module, boolean transitive) {
		if (dependencies != null) {
			for (Module dependency : dependencies) {
				if (module == dependency)
					return true;

				if (transitive && dependency.isDependentOn(module, transitive))
					return true;			
			}
		}

		return false;
	}

}
