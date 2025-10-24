package handling_popups;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import assignmentquestions.selectDeselectALLdemoapps;
import webelement.selectAndDEselectMULTISELECTdropdwn;

public class HandlefileUploadpopUp {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://demoapps.qspiders.com/");
       driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
       driver.findElement(By.xpath("//section[text()='Popups']")).click();
       driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
       
       driver.findElement(By.id("fullName")).sendKeys("thiru");
       driver.findElement(By.id("emailId")).sendKeys("thiru@gmail.com");
       driver.findElement(By.id("password")).sendKeys("Thiru@123");
       driver.findElement(By.id("mobile")).sendKeys("8884524620");
       
       WebElement city = driver.findElement(By.id("city"));
       Select s=new Select(city);
       s.selectByIndex(1);
       
       File f= new File("./data/All xpath pratice with syntax.txt");
       String abspath = f.getAbsolutePath();
       driver.findElement(By.id("resume")).sendKeys(abspath);
       
       WebElement Allchkbox = driver.findElement(By.xpath("//select[@multiple]"));
       Select s1=new Select(Allchkbox);
      List<WebElement> allopt = s1.getOptions();
      for(int i=0;i<allopt.size();i++) {
    	  allopt.get(i);
    	  s1.selectByIndex(i);
      }
    	  driver.findElement(By.id("alert")).click();
    	  driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(2000);  
    driver.quit();
    System.out.println("Successfully handled fileupload popup");
	}
	
}
      
      
       
	


