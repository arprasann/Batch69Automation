package actitime.script;

import org.testng.annotations.Test;

import actitime.pom.LoginPage;

public class ValidateValidLoginPage extends BaseTest
{

	
	@Test
	public void validateValidLoginPage()
	{
		log.debug("*******ValidateLoginPage Test Case****");
		LoginPage l1 = new LoginPage(driver);
		
		log.debug("Enter The UserName");
		//Enter the UserName
		    l1.setUserName("admin");
		
		    log.debug("Enter The password");
		//Enter The Password
		    l1.setPassword("manager");
		
		    log.debug("Click on LoginButton");
		//Click On LoginButton
		    l1.clickOnLoginButton();
		    log.debug("****Successfully LoginPage Test Case Executed***");
	}
}
