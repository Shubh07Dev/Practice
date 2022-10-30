package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_Login_Verification extends Test_Base
{
	@Test
	public void verifyLoginFunctionality() throws IOException
	{		
		log.info("apply the validation");
		
	   String expectedTitle = "Swag Labs";
	   String actualTitle = driver.getTitle();
	
	   Assert.assertEquals(actualTitle, expectedTitle);

	}

}
