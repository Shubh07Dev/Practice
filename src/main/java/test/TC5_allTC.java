package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.Home_Pom;

public class TC5_allTC extends Test_Base
{
	@Test(priority = 1)
	public void verifyLoginFunctionality() throws IOException
	{		
		log.info("apply the validation");
		
	   String expectedTitle = "Swag Labs";
	   String actualTitle = driver.getTitle();
	
	   Assert.assertEquals(actualTitle, expectedTitle);

	}
	
	@Test(priority = 3)
	public void verifyLOgOutFunctionality()
	{
		log.info("apply the validation");
		
		String expectedTitle = "Swag Labs";
			
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 2)
	public void verifyBagProductFunctionality()
	{
		//--homePage--//
		//bag product
		
		Home_Pom hp = new Home_Pom(driver);
		hp.clickBagButton();
		log.info("Bag product will get selected");
		
		//--validation--//
		String expectedProduct = "1";
		
		String actualProduct = hp.getTextFromAddToCart();
		log.info("actual product->"+actualProduct);
		
		log.info("apply validation");
		Assert.assertEquals(actualProduct, expectedProduct);
	}
	
	@Test(priority = 0)
	public void verifyAllProductFunctionality()
	{
		//--homePage--//
		//bag product
		
		Home_Pom hp = new Home_Pom(driver);
		hp.Add_all();
		log.info("All products will get selected");
		
		//--validation--//
		String expectedProduct = "6";
		
		String actualProduct = hp.getTextFromAddToCart();
		log.info("actual product->"+actualProduct);
		
		log.info("apply validation");
		
		Assert.assertEquals(actualProduct, expectedProduct);

	}
}
