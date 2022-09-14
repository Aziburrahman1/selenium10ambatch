package com.timeKeeping.actiTime.SeleniumAutomation.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
/**
 * 
 * @author Azibur Rahman
 *
 */
public class JavaUtility {
	/**
	 * This method generates random no
	 * @param limit
	 * @return
	 */
    //Using this because Script fails if we refresh the page or re enter the  customerName and Description
	public int generateRandomNo(int limit)
	{
		Random random = new Random();
		return random.nextInt(limit);	
	}
	/**
	 * This method fetch data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	//For url,username and username
	public String fetchDataFromPropertyFile(String key) throws IOException
	{
		//the actual representation of property file is converted to java representation
		FileInputStream fis = new FileInputStream("./src/test/resources/PropertyDataFor10AM.properties");
		//creating an object of properties class
		Properties property = new Properties();
		//we are loading all the keys and values
		property.load(fis);
		//fetching the value using the key and returing it
		return property.getProperty(key);
	}
}
