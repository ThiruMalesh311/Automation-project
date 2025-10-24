package assignmentquestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectLastoption {
	//to print and select the LAST OPTION in multiselect dropdown:

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
	      
	     List<WebElement> allList = s.getOptions();
	     int Lastoption = allList.size()-1;
	     //to select last option
	     s.selectByIndex(Lastoption);
	     //to print the last option
       System.out.println(allList.get(Lastoption).getText());	     
	    driver.quit();
	}

}
