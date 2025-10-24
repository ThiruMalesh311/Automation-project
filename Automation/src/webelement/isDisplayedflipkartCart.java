package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedflipkartCart {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.flipkart.com/");
     boolean res = driver.findElement(By.xpath("//li[text()='My Profile']")).isDisplayed();
     if(res==true) {
    	 System.out.println("Myprofile is visible");
     }else {
    	 System.out.println("Myprofile is not visible");
     }
     driver.quit();
	}
     
}
