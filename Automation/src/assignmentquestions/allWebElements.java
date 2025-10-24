package assignmentquestions;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allWebElements {

	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	      WebElement email = driver.findElement(By.id("email"));
	    //  email.sendKeys("thirumalesh@hsk");
	    //  email.sendKeys(Keys.CONTROL+"a");
	    //  email.sendKeys(Keys.CONTROL+"c");
	      email.sendKeys("thirumaleshhsk" + Keys.CONTROL+"ac");
	      
	     WebElement pwd = driver.findElement(By.id("pass"));
	     pwd.sendKeys(Keys.CONTROL+"v");
	     Thread.sleep(2000);
	     email.clear();
	      
	   WebElement crtnewac = driver.findElement(By.linkText("Create new account"));
	  String TagName = crtnewac.getTagName();
	  String Text = crtnewac.getText();
	 @Nullable
	   String Url = crtnewac.getAttribute("href");
	     String backgroundcolor = crtnewac.getCssValue("background-color");
	     
	     System.out.println("Tagname of create new button is  "+TagName);
	     System.out.println("Tagtext of create new button is  "+Text);
	     System.out.println("url of of create new button is  "+Url);
	     System.out.println("background color of createnew button is  "+backgroundcolor);
	     
	     
	   boolean displayed = crtnewac.isDisplayed();
	   if(displayed==true)
	   {
		  System.out.println("Creat new account button is visible"); 
	   }else
	   {
		   System.out.println("create new account button is not visible");
	   }
	   
	    boolean enabled = crtnewac.isEnabled();
	    if(enabled==true)
	    {
	    	System.out.println("create new button is enabled");
	    }else
	    {
	    	System.out.println("create new button is not enabled");
	    }
	   
	    crtnewac.click();
	    
	   WebElement mblno = driver.findElement(By.xpath("//input[@type='text' and @name='reg_email__']"));
	   int heightmblno = mblno.getSize().getHeight();
	   int widthmblno = mblno.getRect().getWidth();
	   
	   WebElement pwdtxtbox = driver.findElement(By.xpath("//div[text()='New password']"));
	    int pwdheight = pwdtxtbox.getRect().getHeight();
	    int pwdwidth = pwdtxtbox.getRect().getWidth();
	    
	    if(heightmblno==pwdheight && pwdwidth==widthmblno) {
	    	System.out.println("Mobile and pwd text box size is same");
	    }else {
	    	System.out.println("mobile and pwd text box size is not same");
	    }
	   
	   driver.quit();
	           
		}

	}

	


