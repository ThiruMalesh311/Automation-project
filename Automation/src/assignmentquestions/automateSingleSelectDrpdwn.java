package assignmentquestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automateSingleSelectDrpdwn {


	public static void main(String[] args) throws InterruptedException {
		// WAS to automate Single Select DropDown in demoapps.qspiders.com:
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com");
        driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Single Select")).click();
      WebElement countrycode = driver.findElement(By.id("country_code")); 
      Select s=new Select(countrycode);
      s.selectByIndex(0);
      driver.findElement(By.id("phone")).sendKeys("8884524620");
      Thread.sleep(2000);
      driver.findElement(By.id("male")).click();
      Thread.sleep(2000);
      WebElement country = driver.findElement(By.xpath("//option[contains(@id,'countryOpt')]"));
      Thread.sleep(2000);
      Select s1=new Select(country);
      s1.selectByVisibleText("India");Thread.sleep(2000);
     // s1.selectByVisibleText("")
      
      
      Thread.sleep(2000);
      WebElement Qty = driver.findElement(By.xpath("(//select[contains(@id,'select')])[3]"));Thread.sleep(2000);
      Select s2=new Select(Qty);
      s2.selectByIndex(1);
        
        
        driver.findElement(By.xpath("//button[text()='Continue']")).click();
	}

}
