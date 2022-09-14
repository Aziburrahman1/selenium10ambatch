package com.timeKeeping.actiTime.SeleniumAutomation.TaskTest;

import com.timeKeeping.actiTime.SeleniumAutomation.genericUtility.BaseClass;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.timeKeeping.actiTime.SeleniumAutomation.pomRepository.CreateNewCustomerPage;
import com.timeKeeping.actiTime.SeleniumAutomation.pomRepository.HomePage;
import com.timeKeeping.actiTime.SeleniumAutomation.pomRepository.TaskPage;
/**
 * This is a script to create customer
 * @author Azibur Rahman
 *
 */

    public class CreateCustomerInTaskTest extends BaseClass {
    /**
     * This is a script to create customer
     * @throws IOException
     */
	@Test
	public void createCustomerTest() throws IOException
	{   
		//object creation statements
		HomePage home = new HomePage(driver);
		TaskPage task = new TaskPage(driver);
		CreateNewCustomerPage createCustomer = new CreateNewCustomerPage(driver);
		//getting random number
		int randomNo = jUtils.generateRandomNo(1000);
		//fetching data from excel sheet
		String expectedCustomerName= eUtils.fetchDataFromExcelSheet("Sheet2",1,0)+randomNo;
		String description= eUtils.fetchDataFromExcelSheet("Sheet2",1,1);
        //clicking on Task Button in HomePage Class
		home.clickOnTaskButton();
		//clicking on new Customer button in TaskPage Class
		task.clickOnNewCustomerButton();
		//creating customer in CreateNewCustomerPage Class
		createCustomer.createCustomerAction(expectedCustomerName, description);
		//verification in TaskPage Class
		String actualCustomerName= task.verifyCustomerName(expectedCustomerName);
		Assert.assertEquals(actualCustomerName,expectedCustomerName);
		System.out.println("The Customer Name Has been Verified ");
		
		
	}
}
