package handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClsHandlingHiddenDivision {

	public static void main(String[] args) {
       WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://demoapps.qspiders.com");
       driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
       driver.findElement(By.xpath("//section[text()='Popups']")).click();
       driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
       driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
       driver.findElement(By.id("customerName")).sendKeys("Ganesha");
       driver.findElement(By.id("customerEmail")).sendKeys("Ganesha@gmail.com");
       WebElement prod = driver.findElement(By.id("prod"));
       Select s=new Select(prod);
       s.selectByIndex(1);
       driver.findElement(By.id("message")).sendKeys("Happy Ganesha Chathurthi");
       driver.findElement(By.xpath("//button[text()='Submit']")).click();
       System.out.println("Successfully handled HiddenDivision Pop-Up");
       driver.quit();
	}

}
