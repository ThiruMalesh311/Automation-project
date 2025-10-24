package assignmentquestions;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActiTimeAssig_Frames {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
	   WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("http://localhost/login.do");
       driver.findElement(By.id("username")).sendKeys("admin");
       driver.findElement(By.name("pwd")).sendKeys("manager");
       driver.findElement(By.xpath("//div[text()='Login ']")).click();
       
      driver.findElement(By.xpath("//div[text()='USERS']")).click();
      driver.findElement(By.xpath("//div[text()='Add User']")).click();
     
      driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Thiru");
      driver.findElement(By.name("middleName")).sendKeys("s");
      driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("H C");
      driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("Thiru@gmail.com");
      driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Thiru1");
      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Thiru@123");Thread.sleep(2000);
      driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Thiru@123");
      Thread.sleep(2000);
      driver.findElement(By.id("userDataLightBox_timeZoneGroupRow")).click();
      driver.findElement(By.xpath("//div[@title='Sydney Office']")).click();
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("(//td[@class='x-btn-right'])[13]")).click();Thread.sleep(2000);
      driver.findElement(By.xpath("(//button[@class='x-btn-text'])[14]")).click();Thread.sleep(2000);
      driver.findElement(By.xpath("//a[text()='Nov']")).click();Thread.sleep(2000);
      driver.findElement(By.xpath("(//td[@class='x-date-mp-year'])[7]")).click();Thread.sleep(2000);
      driver.findElement(By.xpath("//button[@class='x-date-mp-ok']")).click();
      driver.findElement(By.xpath("(//a[@class='x-date-date'])[33]")).click();Thread.sleep(2000);
      driver.findElement(By.id("userDataLightBox_commitBtn")).click();
      Thread.sleep(2000);
      //delete user
      driver.findElement(By.xpath("//input[@placeholder='Start typing name']")).sendKeys("Thiru");
      driver.findElement(By.xpath("//span[text()='Thiru']")).click();Thread.sleep(2000);
      driver.findElement(By.id("userDataLightBox_deleteBtn")).click();Thread.sleep(2000);
      driver.switchTo().alert().accept();
      Thread.sleep(2000);
      driver.quit();
      
      /* Robot r=new Robot();Thread.sleep(2000);
      r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);*/
	}

}
