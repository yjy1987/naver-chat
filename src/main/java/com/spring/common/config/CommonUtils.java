package com.spring.common.config;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class CommonUtils extends PropertiesLoaderUtils{
/*	
	public static String getProperty(String propName) {
		String strProp = null;
		try {
			String propertiesPath = "config/properties/config-".concat("service.mode").concat("properties");
			Properties props = PropertiesLoaderUtils.loadProperties(new ClassPathResource("config/properties/config"));
			strProp = props.getProperty(propName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return strProp;
	}*/
}
