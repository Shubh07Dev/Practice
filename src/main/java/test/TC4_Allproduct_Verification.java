package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.Home_Pom;

public class TC4_Allproduct_Verification extends Test_Base
{
	@Test
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
