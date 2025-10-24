package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
     boolean res = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
     if(res==true) {
    	 System.out.println("logo is Displayed");
    	 
     }else {
    	 System.out.println("logo is not Displayed");
    	 
     }
     
     driver.quit();
	}

}
