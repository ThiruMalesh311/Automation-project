package webelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectAndDEselectMULTISELECTdropdwn {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.get("https://demoapps.qspiders.com/");
       driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
       driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
       driver.findElement(By.linkText("Multi Select")).click();
       
       WebElement mult = driver.findElement(By.id("select-multiple-native"));
       Select s=new Select(mult);
       Thread.sleep(2000);
       s.selectByIndex(0);
       s.selectByValue("Mens Casual Premium Slim Fit T-Shirts ");
       s.selectByVisibleText("Mens Cotton Jacket...");
       s.selectByContainsVisibleText("Casual Slim");
       
      // s.deselectAll(); we can use these to unselect/deselect all options at once or we can use:-
       
         s.deselectByIndex(3);
         s.deselectByValue("Mens Cotton Jacket");
         s.deselectByVisibleText("Mens Casual Premium ...");
         s.deSelectByContainsVisibleText("Foldsac...");
         
         driver.quit();
	}
	
	}


