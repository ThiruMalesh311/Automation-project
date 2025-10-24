package handling_popups;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import assignmentquestions.scannerClassMonthDrpdwnFB;

public class TFcontrollertoSpecificwid {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://demoapps.qspiders.com/");
     driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
     driver.findElement(By.xpath("//section[text()='Popups']")).click();
     driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
     driver.findElement(By.linkText("Multiple Windows")).click();
     driver.findElement(By.xpath("//button[text()='Shop Now']")).click();
       
	 //desired window keyword(hardcoded)
     String expectedTitle = "Laptop";
     
      Set<String> allwid = driver.getWindowHandles();
	  for (String winID : allwid) {
		  driver.switchTo().window(winID);
		@Nullable
		String actualTitle = driver.getTitle();
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("Switched to window "+actualTitle);
			break;//stop once correct window found
		}
	}
	  //perform actions in the Laptop window
	  driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
	  driver.findElement(By.tagName("svg")).click();
	  WebElement LaptopName = driver.findElement(By.xpath("//h3[text()='High-Performance Laptop']"));
	   System.out.println(" Product name: " +LaptopName.getText()); 
	   driver.quit();
	}
	}

