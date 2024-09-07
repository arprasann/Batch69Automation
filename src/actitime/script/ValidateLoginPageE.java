package actitime.script;

import org.testng.annotations.Test;

import actitime.generics.Excel;
import actitime.pom.HomePage;
import actitime.pom.LoginPage;

public class ValidateLoginPageE extends BaseTest
{

	
	@Test
	public void validateLoginPageHomePageTitle()
	{
		
		String sheet = "ValidLoginPageE";
		
		String un = Excel.getCellValue(PATH, sheet, 1, 1);
		String pw = Excel.getCellValue(PATH, sheet, 1, 2);
		String lpt = Excel.getCellValue(PATH, sheet, 1, 3);
		String hpt = Excel.getCellValue(PATH, sheet, 1, 4);
		
		
		LoginPage l1 = new LoginPage(driver);
		l1.validateTitle(lpt);
		           l1.setUserName(un);
		           
		           l1.setPassword(pw);
		           
		           l1.clickOnLoginButton();
		           
		           
		         HomePage h1 = new HomePage(driver);
		          h1.validateTitle(hpt);
	}
}
