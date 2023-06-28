package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	@FindBy(xpath="(//span[normalize-space()='My Account'])[1]")
	WebElement lnkMyaccount;
	
	@FindBy(xpath="(//a[normalize-space()='Register'])[1]")
	WebElement lnkRegister;
	
	@FindBy(xpath="(//a[normalize-space()='Login'])[1]")
	WebElement lnklogin;
	
	@FindBy(xpath="(//a[normalize-space()='Login'])[1]")
	WebElement txtsearchbox;
	
	@FindBy (xpath="(//button[normalize-space()='Search'])[1]")
	WebElement btnsearch;
	
	
	//Action Methods
   public void clickMyAccount()
   {
	   lnkMyaccount.click();
   }
   
   public void clickRegister()
   {
	   lnkRegister.click();
   }
   
   public void clickLogin()
   {
	   lnklogin.click();
   }
   
   public void enterProductName(String pName)
   {
	   txtsearchbox.sendKeys(pName);
   }
   
   public void clickSearch()
   {
	   btnsearch.click(); 
   }
	
}
