package actitime.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateUser extends BasePage
{

	@FindBy(xpath="//div[text()='USERS']")
	private WebElement users;


	@FindBy(xpath="//div[text()='Add User']")
	private WebElement addUser;

	
	@FindBy(name="firstName")
    private WebElement firstNameTF;
	
	@FindBy(name="lastName")
    private WebElement lastNameTF;
	
	@FindBy(name="email")
    private WebElement emailTF;
	
	
	@FindBy(name="username")
    private WebElement usernameTF;
	
	@FindBy(name="password")
    private WebElement passwordTF;
	
	@FindBy(name="passwordCopy")
    private WebElement reTypePasswordTF;
	
	
	
	@FindBy(xpath="//span[text()='Create User']")
    private WebElement createUserButton;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	public CreateUser(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnUsers()
	{
		wait.until(ExpectedConditions.elementToBeClickable(users));
		users.click();
	}
	
	
	public void clickonAddUser()
	{
		wait.until(ExpectedConditions.elementToBeClickable(addUser));
		addUser.click();
	}
	
	
	public void enterFirstName(String fn)
	{
		firstNameTF.sendKeys(fn);
	}
	
	public void enterLastName(String ln)
	{
		lastNameTF.sendKeys(ln);
	}
	
	
	public void enterEmail(String eMail1)
	{
		emailTF.sendKeys(eMail1);
	}
	
	
	public void enteruserName(String un)
	{
		usernameTF.sendKeys(un);
	}
	
	
	public void enterPassword(String pw)
	{
		passwordTF.sendKeys(pw);
	}
	
	
	public void enterPasswordCopy(String rPW)
	{
		reTypePasswordTF.sendKeys(rPW);
	}
	
	public void clickonCreateButton()
	{
		createUserButton.click();
	}
	
}
