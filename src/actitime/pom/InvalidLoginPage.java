package actitime.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class InvalidLoginPage extends BasePage
{

	@FindBy(xpath="(//span[@class='errormsg'])[1]")
	private WebElement errorMsg;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	public InvalidLoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void validateInvalidLoginPage()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='errormsg'])[1]")));
		Assert.assertTrue(errorMsg.isDisplayed());
	}
}
