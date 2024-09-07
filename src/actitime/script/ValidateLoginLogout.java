package actitime.script;

import java.util.Random;

import org.testng.annotations.Test;

import actitime.pom.CreateTask;
import actitime.pom.HomePage;
import actitime.pom.LoginPage;

public class ValidateLoginLogout extends BaseTest
{

	@Test
	public void validateLoginandLogout() throws InterruptedException
	{
LoginPage l1 = new LoginPage(driver);
		
		//Enter the UserName
		    l1.setUserName("admin");
		
		//Enter The Password
		    l1.setPassword("manager");
		
		//Click On LoginButton
		    l1.clickOnLoginButton();
		    
	
		              
		              HomePage h1 = new HomePage(driver);
		              Thread.sleep(3000);
		                       h1.clickOnLogoutButton();
		                       
		                       System.out.println("***********Successfully Loggedout*********");  
		   
	}
}
