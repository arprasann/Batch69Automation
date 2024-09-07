package actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage
{
	
	
	//D
		@FindBy(id="username")
		private WebElement username;
		
		@FindBy(name="pwd")
		private WebElement password;
		
		@FindBy(id="loginButton")
		private WebElement loginButton;
		



	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	//U
	public void setUserName(String un)
	{
		username.sendKeys(un);
	}
	
	
	//Set Password
	public void setPassword(String pw)
	{
		password.sendKeys(pw);
	}
	
	
	//click on Login Button
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
}
