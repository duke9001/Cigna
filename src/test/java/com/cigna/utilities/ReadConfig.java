package com.cigna.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	//create reference variable from properties class, import java.util.Properties;
	Properties property;
	
	//constructor
	public ReadConfig() {

		//give config.properties file path to File object
		File src = new File("./Configuration/config.properties");

		try {
			/*
			 * Java FileInputStream class obtains input bytes from a file. It is used for
			 * reading byte-oriented data (streams of raw bytes) such as image data, audio,
			 * video etc. You can also read character-stream data. But, for reading streams
			 * of characters, it is recommended to use FileReader class.
			 */
			FileInputStream file = new FileInputStream(src);
			//create object from properties class
			property = new Properties();
			/*
			 * chromepath=./Drivers\\chromedriver.exe 
			 * chromedriver=webdriver.chrome.driver
			 * etc
			 * load above configurations to properties object
			 */
			property.load(file);

		}
		catch (Exception e) {
			//if file is not available print exception
			System.out.println("Excetion is" + e.getMessage());
		}
	}
	
	//get chrome path from properties file and return 
	public String getChromePath() {
		
		String chromePath = property.getProperty("chromepath");
		return chromePath;
	}
	
	//get chrome driver from properties file and return 
	public String getChromeDriver() {

		String chromeDriver = property.getProperty("chromedriver");
		return chromeDriver;
	}

	//get base url from properties file and return 
	public String getBaseURL() {

		String url = property.getProperty("baseurl");
		return url;
	}	
	
	
}
