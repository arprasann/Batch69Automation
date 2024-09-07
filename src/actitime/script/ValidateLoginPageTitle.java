package actitime.script;

import org.testng.annotations.Test;

import actitime.pom.BasePage;
import actitime.pom.LoginPage;

public class ValidateLoginPageTitle extends BaseTest
{

	
	@Test
	public void validateLoginPageTitle()
	{
		
		LoginPage l1 = new LoginPage(driver);
		          l1.validateTitle("actiTIME - Login");
		
	}
}
