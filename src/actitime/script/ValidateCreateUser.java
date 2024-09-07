package actitime.script;

import java.util.Random;

import org.testng.annotations.Test;

import actitime.pom.CreateTask;
import actitime.pom.CreateUser;
import actitime.pom.HomePage;
import actitime.pom.LoginPage;

public class ValidateCreateUser extends BaseTest {

	@Test
	public void validateCreateUser() throws InterruptedException {
		LoginPage l1 = new LoginPage(driver);

		// Enter the UserName
		l1.setUserName("admin");

		// Enter The Password
		l1.setPassword("manager");

		// Click On LoginButton
		l1.clickOnLoginButton();

		Thread.sleep(2000);
		Random num = new Random();

		int rNum = num.nextInt(99999);

		CreateUser c1 = new CreateUser(driver);
		  c1.clickOnUsers();
		  
		  c1.clickonAddUser();
		  Thread.sleep(2000);
		  c1.enterFirstName("Dinga"+rNum);
		  c1.enterLastName("Manga"+rNum);
		  c1.enterEmail("DingaManga"+rNum+"@gmail.com");
		  
		  Thread.sleep(5000);
		  c1.enteruserName("Dinga"+rNum);
		  
		  c1.enterPassword("123456");
		  c1.enterPasswordCopy("123456");
		  Thread.sleep(5000);
		  c1.clickonCreateButton();

		System.out.println("***********Successfully Created the User*********");
		Thread.sleep(2000);
		HomePage h1 = new HomePage(driver);
		h1.clickOnLogoutButton();

		System.out.println("***********Successfully Loggedout*********");

	}
}
