/*
 * This file is part of citygml4j.
 * Copyright (c) 2007 - 2012
 * Institute for Geodesy and Geoinformation Science
 * Technische Universität Berlin, Germany
 * http://www.igg.tu-berlin.de/
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
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library. If not, see 
 * <http://www.gnu.org/licenses/>.
 */
package org.citygml4j.builder.jaxb;

import java.util.HashMap;
import java.util.HashSet;

import org.citygml4j.model.module.Module;
import org.citygml4j.model.module.citygml.AppearanceModule;
import org.citygml4j.model.module.citygml.BridgeModule;
import org.citygml4j.model.module.citygml.BuildingModule;
import org.citygml4j.model.module.citygml.CityFurnitureModule;
import org.citygml4j.model.module.citygml.CityObjectGroupModule;
import org.citygml4j.model.module.citygml.CoreModule;
import org.citygml4j.model.module.citygml.GenericsModule;
import org.citygml4j.model.module.citygml.LandUseModule;
import org.citygml4j.model.module.citygml.ReliefModule;
import org.citygml4j.model.module.citygml.TexturedSurfaceModule;
import org.citygml4j.model.module.citygml.TransportationModule;
import org.citygml4j.model.module.citygml.TunnelModule;
import org.citygml4j.model.module.citygml.VegetationModule;
import org.citygml4j.model.module.citygml.WaterBodyModule;
import org.citygml4j.model.module.gml.GMLCoreModule;
import org.citygml4j.model.module.xal.XALCoreModule;

public class JAXBContextPath {
	static HashMap<Module, String> contextPathMap;

	static {
		contextPathMap = new HashMap<Module, String>();

		// CityGML 2.0
		contextPathMap.put(CoreModule.v2_0_0, "org.citygml4j.jaxb.citygml.core._2");
		contextPathMap.put(AppearanceModule.v2_0_0, "org.citygml4j.jaxb.citygml.app._2");
		contextPathMap.put(BridgeModule.v2_0_0, "org.citygml4j.jaxb.citygml.brid._2");
		contextPathMap.put(BuildingModule.v2_0_0, "org.citygml4j.jaxb.citygml.bldg._2");
		contextPathMap.put(CityFurnitureModule.v2_0_0, "org.citygml4j.jaxb.citygml.frn._2");
		contextPathMap.put(CityObjectGroupModule.v2_0_0, "org.citygml4j.jaxb.citygml.grp._2");
		contextPathMap.put(GenericsModule.v2_0_0, "org.citygml4j.jaxb.citygml.gen._2");
		contextPathMap.put(LandUseModule.v2_0_0, "org.citygml4j.jaxb.citygml.luse._2");
		contextPathMap.put(ReliefModule.v2_0_0, "org.citygml4j.jaxb.citygml.dem._2");
		contextPathMap.put(TexturedSurfaceModule.v2_0_0, "org.citygml4j.jaxb.citygml.tex._2");
		contextPathMap.put(TransportationModule.v2_0_0, "org.citygml4j.jaxb.citygml.tran._2");
		contextPathMap.put(TunnelModule.v2_0_0, "org.citygml4j.jaxb.citygml.tun._2");
		contextPathMap.put(VegetationModule.v2_0_0, "org.citygml4j.jaxb.citygml.veg._2");
		contextPathMap.put(WaterBodyModule.v2_0_0, "org.citygml4j.jaxb.citygml.wtr._2");
		
		// CityGML 1.0
		contextPathMap.put(CoreModule.v1_0_0, "org.citygml4j.jaxb.citygml.core._1");
		contextPathMap.put(AppearanceModule.v1_0_0, "org.citygml4j.jaxb.citygml.app._1");
		contextPathMap.put(BuildingModule.v1_0_0, "org.citygml4j.jaxb.citygml.bldg._1");
		contextPathMap.put(CityFurnitureModule.v1_0_0, "org.citygml4j.jaxb.citygml.frn._1");
		contextPathMap.put(CityObjectGroupModule.v1_0_0, "org.citygml4j.jaxb.citygml.grp._1");
		contextPathMap.put(GenericsModule.v1_0_0, "org.citygml4j.jaxb.citygml.gen._1");
		contextPathMap.put(LandUseModule.v1_0_0, "org.citygml4j.jaxb.citygml.luse._1");
		contextPathMap.put(ReliefModule.v1_0_0, "org.citygml4j.jaxb.citygml.dem._1");
		contextPathMap.put(TexturedSurfaceModule.v1_0_0, "org.citygml4j.jaxb.citygml.tex._1");
		contextPathMap.put(TransportationModule.v1_0_0, "org.citygml4j.jaxb.citygml.tran._1");
		contextPathMap.put(VegetationModule.v1_0_0, "org.citygml4j.jaxb.citygml.veg._1");
		contextPathMap.put(WaterBodyModule.v1_0_0, "org.citygml4j.jaxb.citygml.wtr._1");
		
		// GML 3.1.1 and xAL 2.0
		contextPathMap.put(GMLCoreModule.v3_1_1, "org.citygml4j.jaxb.gml._3_1_1");
		contextPathMap.put(XALCoreModule.v2_0, "org.citygml4j.jaxb.xal");
	}
	
	public static String getContextPath() {
		HashSet<String> contextPaths = new HashSet<String>();

		for (Module module : contextPathMap.keySet()) {
			String contextPath = contextPathMap.get(module);
			if (contextPath != null)
				contextPaths.add(contextPath);
		}

		return createContextPath(contextPaths);
	}
	
	public static String getContextPath(String... packageNames) {
		StringBuilder builder = new StringBuilder(getContextPath());
		
		for (String contextPath : packageNames) {
			builder.append(":");
			builder.append(contextPath);
		}
		
		return builder.toString();	
	}

	private static String createContextPath(HashSet<String> contextPaths) {
		StringBuilder builder = new StringBuilder();
		int counter = 0;
		int size = contextPaths.size();

		for (String contextPath : contextPaths) {
			builder.append(contextPath);
			if (++counter < size)
				builder.append(":");
		}

		return builder.toString();
	}
}
