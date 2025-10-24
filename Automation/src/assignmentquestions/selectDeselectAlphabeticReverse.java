package assignmentquestions;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDeselectAlphabeticReverse {

	public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://demoapps.qspiders.com");
       driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
       driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
       driver.findElement(By.linkText("Multi Select")).click();
      WebElement multi = driver.findElement(By.id("select-multiple-native"));
      
      Select s=new Select(multi);
      List<WebElement> Alloptions = s.getOptions();
      
      List<String> text=new ArrayList<String>();
      for (WebElement option : Alloptions) {
    	  text.add(option.getText());
	}
      //sort in alphabetical order
      Collections.sort(text);
      //print the sorted options
      for (String textAlpha : text) {
    	  System.out.println(textAlpha);
		}
   driver.quit();
      }
	}

