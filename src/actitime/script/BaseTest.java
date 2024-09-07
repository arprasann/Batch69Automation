package actitime.script;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutomationConstantFile
{

public WebDriver driver;

Logger log;

@BeforeMethod
public void preCondition() throws InterruptedException
{
	log = Logger.getLogger("devpinoyLogger");
	log.debug("Open The Browser");
	driver = new ChromeDriver();
	
	log.debug("Maximize The Browser");
	driver.manage().window().maximize();
	
	log.debug("Enter The URL");
	driver.get("http://localhost/login.do");
	Thread.sleep(2000);
	
	log.debug("Applying Implicitlywait 120 Seconds");
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
}


@AfterMethod
public void postCondtion() throws InterruptedException
{
	log.debug("Close The Broswer");
	Thread.sleep(2000);
	driver.close();
}
	
}
