package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2_Logout_Verification extends Test_Base
{
	@Test
	public void verifyLOgOutFunctionality()
	{
		log.info("apply the validation");
		
		String expectedTitle = "Swag Labs";
			
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
