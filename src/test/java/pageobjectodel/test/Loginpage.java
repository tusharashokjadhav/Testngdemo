package pageobjectodel.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
      
	  @FindBy(xpath = "//input[@name='username']")
      WebElement username;
	  
	  @FindBy(xpath ="//input[@name='password']")
	  WebElement password;
	  
	  @FindBy(xpath ="//input[@type='submit']")
	  WebElement submit;
	  
	  @FindBy(partialLinkText = "Forgot login info?")
	  WebElement forgotlogin;
	  
	  @FindBy(partialLinkText = "Register")
	  WebElement register;


    public  void Loginpage (WebDriver driver) {
	this.driver =driver;
	PageFactory.initElements(driver, this);
	
	
}
	  
 public void login() {
	
	username.sendKeys("john");
	password.sendKeys("demo");
	submit.click();
	}
 public void register() {
	 
	 register.click();
 }
 
 public void  forgotlogin() {
	 
	 forgotlogin.click();
 }

}
