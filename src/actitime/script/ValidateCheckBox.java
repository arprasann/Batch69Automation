package actitime.script;

import org.testng.Assert;
import org.testng.annotations.Test;

import actitime.pom.CheckBox;

public class ValidateCheckBox extends BaseTest
{

	
	@Test
	public void validateCheckBox()
	{
		log.debug("Validate Checkbox TestBox");
		CheckBox c1 = new CheckBox(driver);
		log.debug("Click on CHeckBox and Check Checkbox is selected or Not");
		         c1.clickOnCheckBox();
		       
	}
}
