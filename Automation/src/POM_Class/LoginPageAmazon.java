package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAmazon {
	
	@FindBy(id="ap_email_login")
	private WebElement MblORemailTextField;
	
	@FindBy(id="continue-announce")
	private WebElement ContinueBtn;
	                                                                               //Declaration
	@FindBy(xpath = "//a[@class='a-link-nav-icon']")
	private WebElement amazonLogo;
    
	@FindBy(xpath = "//div[@class='a-alert-content']")
	private WebElement errorMSG;
	
	@FindBy(id="ap_password")
	private WebElement pwdTextField;
	
	@FindBy(id="signInSubmit")
	private WebElement SignInBTN;
	
	LoginPageAmazon(WebDriver driver)
	{
	    PageFactory.initElements(driver, this);	         //lazy-initialization
	}
	
	public void Login(String MblOREmail,String pwdTbx ) 
	{
		MblORemailTextField.sendKeys(MblOREmail);
		ContinueBtn.click();
		pwdTextField.sendKeys(pwdTbx);                                 //utilization
		SignInBTN.click();
		String text = errorMSG.getText();
		System.out.println(text);
		
	}
}
