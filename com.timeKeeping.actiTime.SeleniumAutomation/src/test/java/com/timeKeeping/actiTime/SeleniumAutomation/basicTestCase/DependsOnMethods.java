package com.timeKeeping.actiTime.SeleniumAutomation.basicTestCase;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test(dependsOnMethods= {"testCase3"})
	public void testCase1() {
		System.out.println("From testCase1");
		
	}
	@Test
	public void testCase2() {
		System.out.println("From testCase2");
		
	}
	@Test
	public void testCase3() {
		System.out.println("From testCase3");
		
	}
}
