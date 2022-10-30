package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pom
{
	private Actions act;
		
	//2.element find
	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement username;
		
	//3.create a method as per action on ele //and add action in that method
		
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
		
	//2.
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
		
		
	//3
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	//2.
	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement loginButton;
		
	//3.
//	public void clickOnLoginButton()
//	{
//		loginButton.click();
//	}
	
	//or
//	mouse action
	public void clickOnLoginButton()
	{
		act.click(loginButton).perform();
	}
	
	//4.create a constructor
	public Login_Pom(WebDriver driver)
	{
		//sele class
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}

}
