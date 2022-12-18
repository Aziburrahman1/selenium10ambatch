package testNG;

import org.testng.annotations.Test;

public class ClassB1 {

	@Test(priority=1)
	public void login()
	{
		System.out.println("Logged into the app");
	}
	@Test(priority=2)
	public void selectProduct()
	{
		System.out.println("product selected");
	}
	@Test(priority=3)
	public void addProductToCart()
	{
		System.out.println("product added to cart");
	}
	@Test(priority=4)
	public void payment()
	{
		System.out.println("payment complete");
	}



}
