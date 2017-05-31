package com.application.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

		  public String readValue(String key){
			  
			  String data;
			  
			  File file = new File("/home/prasannakumar/workspace/Snapdeal/src/com/application/pages/dataFile.properties");
			  
				FileInputStream fis = null;
				try {
					fis = new FileInputStream(file);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
				Properties prop = new Properties();
				
				//load properties file
				try {
					prop.load(fis);
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				data = prop.getProperty(key);
				System.out.println("value::" +data);
				
				return data;
				
		  }
}


