package assignmentquestions;

import java.security.cert.CollectionCertStoreParameters;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printAlloptINAlphaOrder {

	public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://demoapps.qspiders.com/");
       driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
       driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
       driver.findElement(By.linkText("Multi Select")).click();
       
      WebElement Allopt = driver.findElement(By.id("select-multiple-native"));
      
      Select s=new Select(Allopt);//create a select object for a dropdown;
      List<WebElement> allList = s.getOptions();//get all options from a dropDown:
      
      List<String> opttext=new ArrayList<String>();//collect the text of all options into a list:
          for (WebElement option : allList) {
        	  opttext.add(option.getText());
			
		}
          Collections.sort(opttext);//Sort the options in Alphabetical order
          
          //print the sorted options
          System.out.println("Options in Alphabetical order: ");
          for (String text : opttext) {
        	  System.out.println(text);
			
		}
      
      
	}

}
