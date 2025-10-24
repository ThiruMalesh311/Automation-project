package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo_login_Page3 {

	     //here we overcome the Problem of Stale Element Reference Exception
	
	    @FindBy(id="username")
	    private WebElement unTbx;                             //Declaration
	    @FindBy(name="pwd")
	    private WebElement pwdTbx;
	    @FindBy(xpath="//div[text()='Login ']")
	    private WebElement loginBtn;
	    
	    Demo_login_Page3(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);           //Lazy-Initialization--lazy instantiation
	    }
	   
	    public void login(String un , String pwd)
	    {
	    	unTbx.sendKeys(un);//actually here they load/initialization happen
	    	pwdTbx.sendKeys(pwd);                            
	    	loginBtn.click();                                     //Utilization
	    }

}
