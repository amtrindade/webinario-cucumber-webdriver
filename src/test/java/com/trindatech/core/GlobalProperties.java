package com.trindatech.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalProperties {
	
	public static String getProperty(String name) {
		Properties properties = new Properties();
		String value = null;
		
		try {
		    properties.load(new FileInputStream("src/test/resources/environment.properties"));
		    value = properties.getProperty(name);
		    
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
}
