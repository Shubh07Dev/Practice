package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.Home_Pom;

public class TC3_Bag_Verification extends Test_Base
{
	@Test
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
		System.out.println("actual product->"+actualProduct);
		
		System.out.println("apply validation");
		Assert.assertEquals(actualProduct, expectedProduct);
	}

}