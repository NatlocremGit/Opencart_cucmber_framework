package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	
	
	@FindBy(name = "firstname")
	WebElement txtFirstname;

	@FindBy(name = "lastname")
	WebElement txtLasttname;

	@FindBy(name = "email")
	WebElement txtEmail;

	@FindBy(name = "password")
	WebElement txtPassword;

	@FindBy(xpath="(//input[@name='agree'])[1]")
	WebElement chkdPolicy;
	
	@FindBy(xpath = "(//button[normalize-space()='Continue'])[1]")
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	
	
	
	
	/*
	 * @FindBy (xpath="(//input[@id='input-email'])[1]") WebElement LoginEmail;
	 * 
	 * @FindBy (xpath="(//input[@id='input-password'])[1]") WebElement
	 * LoginPassword;
	 * 
	 * @FindBy (xpath="(//button[normalize-space()='Login'])[1]") WebElement
	 * LoginClk;
	 * 
	 * @FindBy (xpath="(//h2[normalize-space()='My Account'])[1]") WebElement
	 * msg2Confirmation;
	 */    
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtLasttname.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);	
	}
	

	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void setPrivacyPolicy() {
		//chkdPolicy.click();
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", chkdPolicy);
		
		//WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.elementToBeClickable(chkdPolicy)).click();
		
	}

	
	public void clickContinue() {
		//sol1 
		//btnContinue.click();
		
		//sol2 
		//btnContinue.submit();
		
		//sol3
		//Actions act=new Actions(driver);
		//act.moveToElement(btnContinue).click().perform();
					
		//sol4
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btnContinue);
		
		//Sol 5
		//btnContinue.sendKeys(Keys.RETURN);
		
		//Sol6  
		//WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
		
	}


	public String getConfirmationMsg() throws InterruptedException
	{
		
		try
		{
			return (msgConfirmation.getText());
		}
		catch (Exception e)
		{
			return (e.getMessage());
		}
	
		
			}
   
	
	
	
			/*
			 * public void LogInEmail(String email2) { LoginEmail.sendKeys(email2); }
			 * 
			 * public void LogInPassword(String password2) {
			 * LoginPassword.sendKeys(password2); }
			 * 
			 * public void LogInClk() { LoginClk.click(); }
			 * 
			 * 
			 * public String getConfirmationMsg2() throws InterruptedException {
			 * Thread.sleep(3000); try { String attribute2 =
			 * msg2Confirmation.getAttribute("value"); return attribute2; } catch (Exception
			 * f) { return (f.getMessage()); }
			 * 
			 * 
			 * }
			 */
}
