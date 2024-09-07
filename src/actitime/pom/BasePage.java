package actitime.pom;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public abstract class BasePage 
{

	public WebDriver driver;
	
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void validateTitle(String eTitle)
	{
		@Nullable
		String aTitle = driver.getTitle();
		
		Assert.assertEquals(aTitle, eTitle);
		System.out.println("**************Successfuly Validated Title***");
		
	}
}
