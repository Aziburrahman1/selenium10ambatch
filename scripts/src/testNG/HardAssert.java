package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class HardAssert {

	@Test
	public void demo() {
		String expectedResult="Qspiders";
		String actualResult="Jspiders";  
		Assertion hardAssert = new Assertion();//hard Assert stop further execution if condition gets fail
		                                       //at check point while soft Assert allows further execution
		hardAssert.assertEquals(actualResult, expectedResult);
		System.out.println("Demo");
	}
}
