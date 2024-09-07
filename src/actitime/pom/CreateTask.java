package actitime.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CreateTask extends BasePage {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	@FindBy(xpath = "//div[text()='TASKS']")
	private WebElement task;

	@FindBy(xpath = "//span[text()='Create Tasks']")
	private WebElement createTask;

	@FindBy(xpath="//div[contains(text(),'Create New Tasks')]")
	private WebElement createTaskTitle;

	@FindBy(xpath="//div[@id='createTasksPopup_customerSelector']//tbody//td[2]")
	private WebElement selectCustomer;

	@FindBy(xpath="//div[contains(@class,'customerProjectListSelector')]/ul/li[2]/a")
	private WebElement newCustomer;

	@FindBy(id = "createTasksPopup_newCustomer")
	private WebElement customerName;

	@FindBy(id = "createTasksPopup_newProject")
	private WebElement newProjectName;

	@FindBy(xpath = "(//input[@placeholder='Enter task name'])[1]")
	private WebElement taskName1;
	
	@FindBy(xpath="(//span[text()='Create Tasks'])[1]")
	private WebElement createTaskButton;
	
	
	@FindBy(xpath="//table[@class='listTable withRoundCorners']//tr[3]/td[2]")
	private WebElement projectNameAfterCreate;
	
	Actions action = new Actions(driver);
	public String cName1;
	public String cName2;
	
	public CreateTask(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTask()
	{
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='TASKS']")));
	
	action.moveToElement(task).perform();
	task.click();
		
	}
	
	
	public void clickOnCreateTask()
	{
	wait.until(ExpectedConditions.elementToBeClickable(createTask));
	
	createTask.click();
		
	}
	
	
	public void validatecreateTaskTitle()
	{
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Create New Tasks')]")));
		System.out.println("********Create Task screen Displayed***********");
	}
	

	public void selectCustomer()
	{
	wait.until(ExpectedConditions.elementToBeClickable(selectCustomer));
	selectCustomer.click();
	
	
	wait.until(ExpectedConditions.elementToBeClickable(newCustomer));
	newCustomer.click();
		
	}
	
	
	public void enterCustomerName(String cName)
	{
		customerName.sendKeys(cName);
		
	}
	
	public void enterProjectName(String pName)
	{
		newProjectName.sendKeys(pName);
		cName1 = newProjectName.getAttribute("value");
		System.out.println("Project Name="+cName1);
	}
	
	public void enterTaskName(String tName1)
	{
		taskName1.sendKeys(tName1);
	}
	
	
	public void clickOnCreateTaskButton()
	{
		createTaskButton.click();
	}
	
	public void validateselctCustomer() throws InterruptedException
	{
		Thread.sleep(5000);
		cName2 = projectNameAfterCreate.getText();
		System.out.println(cName2);
		Thread.sleep(2000);
		Assert.assertEquals(cName1, cName2);
	}
	
	
}
