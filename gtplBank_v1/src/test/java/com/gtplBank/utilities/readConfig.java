package com.gtplBank.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {
	Properties prop;
	public readConfig() {
		File src= new File("./configuration/config.properties");
		try {
			FileInputStream fis= new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		}
		catch(Exception e){
			System.out.println("Excepction is"+ e.getMessage());
			
		}
	}
	public String getURL() {
		String url= prop.getProperty("url");
		return url;
	}
	public String getUserName() {
		String uname= prop.getProperty("uname");
		return uname;
	}
	public String password() {
		String password= prop.getProperty("password");
		return password;
	}
	
}
