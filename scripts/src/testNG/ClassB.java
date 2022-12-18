package testNG;

import org.testng.annotations.Test;

public class ClassB {

	
	
		@Test
		public void login()
		{
			System.out.println("Logged into the app");
		}
		@Test
		public void selectProduct()
		{
			System.out.println("product selected");
		}
		@Test
		public void addProductToCart()
		{
			System.out.println("product added to cart");
		}
		@Test
		public void payment()
		{
			System.out.println("payment complete");
		}

}
