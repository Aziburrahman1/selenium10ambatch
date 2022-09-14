package com.timeKeeping.actiTime.SeleniumAutomation.basicTestCase;

import org.testng.annotations.Test;

public class ToPerformGroupExecution {
    @Test(groups="smokeTesting")
	public void login()
	{
		System.out.println("Login to flipkart");
	}
    @Test(groups="regressionTesting")
    public void select()
	{
		System.out.println("Product is selected");
	}
    @Test(groups="regressionTesting")
    public void addToCart()
	{
		System.out.println("added to cart");
	}
    @Test(groups="regressionTesting")
    public void payment()
	{
		System.out.println("Payment is successful");
	}
    @Test(groups="smokeTesting")
    public void logout()
	{
		System.out.println("logged out successfully");
	}
}
