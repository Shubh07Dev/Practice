package test;

import java.io.IOException;
//import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pom.Login_Pom;
import utility.ScreenShotC;

public class Test_Base
{
	public WebDriver driver;
	Logger log= Logger.getLogger("Shubh2");
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
		    System.setProperty("webdriver.chrome.driver", "./Drivers\\ChromeDriver.exe");
			driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		PropertyConfigurator.configure("log4j.properties");
		log.info("browser is opened");

		driver.manage().window().maximize();
		log.info("browser is maximized");

		driver.get("https://www.saucedemo.com/");
		log.info("SauceDemo URL is opened");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//take screenshot
		ScreenShotC.takeScreenshot(driver);

		//loginPage elements find +action perform

		Login_Pom x = new Login_Pom(driver);
		x.sendUsername();
		log.info("username is entered");
		x.sendPassword();
		log.info("Password is entered");
		x.clickOnLoginButton();
		log.info("Clicked on login button");
		ScreenShotC.takeScreenshot(driver);	
	}

	@AfterMethod
	public void tearDown()
	{
		   driver.quit();
		   log.info("browser is closed");
		   log.info("end of Program");	
	}

}
