package com.timeKeeping.actiTime.SeleniumAutomation.basicTestCase;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(enabled=false)
	public void testCase1() {
		System.out.println("From testCase1");
		
	}
	@Test(invocationCount=5)
	public void testCase2() {
		System.out.println("From testCase2");
		
	}
	@Test(invocationCount=0)
	public void testCase3() {
		System.out.println("From testCase3");
		
	}
}
