package actitime.script;

import java.util.Random;

import org.testng.annotations.Test;

import actitime.pom.CreateTask;
import actitime.pom.HomePage;
import actitime.pom.LoginPage;

public class ValidateCreateTask extends BaseTest
{

	
	@Test
	public void validateCreateTask() throws InterruptedException
	{
LoginPage l1 = new LoginPage(driver);
		
		//Enter the UserName
		    l1.setUserName("admin");
		
		//Enter The Password
		    l1.setPassword("manager");
		
		//Click On LoginButton
		    l1.clickOnLoginButton();
		    
		    Thread.sleep(2000);
		 Random num = new Random();
		 
		 int rNum = num.nextInt(99999);
		    
		   CreateTask c1 = new CreateTask(driver); 
		              c1.clickOnTask();
		              
		              c1.clickOnCreateTask();
		              
		              c1.validatecreateTaskTitle();
		              
		              c1.selectCustomer();
		              
		              c1.enterCustomerName("ABCD"+rNum);
		              
		              c1.enterProjectName("ActiTime"+rNum);
		              
		              c1.enterTaskName("Script1"+rNum);
		              
		              c1.clickOnCreateTaskButton();
		              
		              c1.validateselctCustomer();
		              
		              System.out.println("***********Successfully Validated Create Task*********");
		              
		              
		              HomePage h1 = new HomePage(driver);
		                       h1.clickOnLogoutButton();
		                       
		                       System.out.println("***********Successfully Loggedout*********");  
		   
	}
}
