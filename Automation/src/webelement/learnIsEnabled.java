package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnIsEnabled {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
    boolean res = driver.findElement(By.name("login")).isEnabled();
    if(res==true) {
    	System.out.println("login button in fb is enabled");
     }
    else
    {
    	System.out.println("login button in fb is disabled");
    }
    
    driver.navigate().to("https://www.instagram.com/");Thread.sleep(2000);
    boolean res1 = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
     if(res1==true)   {
    	 System.out.println("login button in insta is enabled");
    	    }
     else
     {
    	 System.out.println("login button in insta is disabled");
    }
     driver.quit();
	}

}
