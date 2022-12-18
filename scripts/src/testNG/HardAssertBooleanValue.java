package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertBooleanValue {

	@Test
	public void demo() {
		boolean expectedResult=true;
		boolean actualResult=false;
		
		/*Assertion hardAssert = new Assertion();
		hardAssert.assertEquals(actualResult, expectedResult);*/
		
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("demo");
	}
}
