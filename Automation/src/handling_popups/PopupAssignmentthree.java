package handling_popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAssignmentthree {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://demoapps.qspiders.com/");
      driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
      driver.findElement(By.xpath("//section[text()='Popups']")).click();
      driver.findElement(By.xpath("//section[text()='Javascript']")).click();
      List<WebElement> allchkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
      
      for (WebElement chk : allchkbox) {
    	  if(!chk.isSelected()) {
    		  chk.click();
    	  }
	}
     WebElement da = driver.findElement(By.id("deleteButton"));Thread.sleep(2000);
      da.click();
      //handle confirmatin alert---click on ok button
      driver.switchTo().alert().accept();Thread.sleep(2000);
      
      System.out.println("All checkboxes selected ,delete clicked,and confirmation accepted");
	}

}
