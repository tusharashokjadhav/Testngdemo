package pageobjectodel.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactoryFinder;

public class Homepage {
	
	  @FindBy(partialLinkText ="Update Contact Info")
      WebElement updateinfo;
	  
	  @FindBy(partialLinkText = "Bill Pay")
	  WebElement billpay;
	  
	  
	  
	  public void taponupdatecontactinfo() {
		  updateinfo.click();
	  }
      
	  public void taponbillpay() {
		  billpay.click();
	  }
}
