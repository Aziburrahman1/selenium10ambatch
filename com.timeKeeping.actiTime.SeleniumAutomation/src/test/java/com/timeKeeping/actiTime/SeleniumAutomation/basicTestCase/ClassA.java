package com.timeKeeping.actiTime.SeleniumAutomation.basicTestCase;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassA {

	@Test
	public void demo1() 
	{
		System.out.println("From Demo1");
		Reporter.log("Message from demo1",true);
	}
	@Test
	public void demo2() 
	{
		System.out.println("From Demo2");
	}
	@Test
	public void demo3() 
	{
		System.out.println("From Demo3");
	}
	
}
