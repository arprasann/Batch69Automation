package actitime.script;

import org.testng.annotations.Test;

import actitime.generics.Excel;
import actitime.pom.Version;

public class ValidateVersion extends BaseTest
{

	
	@Test
	public void validateVersionE()
	{
		log.debug("Validate Actitime Version");
		String sheet= "ValidateVersionE";
		
		String ver = Excel.getCellValue(PATH, sheet, 1, 1);
	
	
	    Version v1 = new Version(driver);
	    log.debug("Validate Version from Data Sheet");
	            v1.validateVersion(ver);
	}
}
