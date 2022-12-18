package com.timeKeeping.actiTime.SeleniumAutomation.basicTestCase;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=1)
	public void demo1() {
		System.out.println("From Demo1");
		
	}
	@Test(priority=-1)
	public void demo2() {
		System.out.println("From Demo2");
		
	}
	@Test
	public void demo3() {
		System.out.println("From Demo3");
		
	}


}
