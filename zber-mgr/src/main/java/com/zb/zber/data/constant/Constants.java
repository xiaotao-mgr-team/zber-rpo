package com.zb.zber.data.constant;

import java.util.Properties;

/**
 *
 * @author zhaoqy
 */
public class Constants {

	public static String contextPath = "/";
	public static final String USER = "user";
	public static final String DRIVER = "driver";

	private Properties prop;

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public Properties getProp() {
		return this.prop;
	}

	public String getPropValue(String key) {
		return this.prop.getProperty(key);
	}

	public Object putValue(String key, String value) {
		return this.prop.put(key, value);
	}

}
