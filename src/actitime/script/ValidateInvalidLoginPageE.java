package actitime.script;

import org.testng.annotations.Test;

import actitime.generics.Excel;
import actitime.pom.InvalidLoginPage;
import actitime.pom.LoginPage;

public class ValidateInvalidLoginPageE extends BaseTest
{

	
	@Test
	public void validateInvalidLoginPageE() throws InterruptedException
	{
		String sheet = "ValidateInvalidLoginPageE";
		
		int totalRowCount = Excel.getRowCount(PATH, sheet);
		
		
		for(int i = 1; i <=totalRowCount; i++)
		{
			String un = Excel.getCellValue(PATH, sheet, i, 1);
			String pw = Excel.getCellValue(PATH, sheet, i, 2);
			
			LoginPage l1 = new LoginPage(driver);
			
			      l1.setUserName(un);
			      
			      l1.setPassword(pw);
			      
			      l1.clickOnLoginButton();
			      
			      Thread.sleep(1000);
			   InvalidLoginPage i1 = new InvalidLoginPage(driver);
			                     i1.validateInvalidLoginPage();
		}
	}
}
