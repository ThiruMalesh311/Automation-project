package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classsirexcecutionSendkeys {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
     Thread.sleep(2000);
     
     WebElement email = driver.findElement(By.id("email"));
     email.sendKeys("Thiru@123");
     email.sendKeys(Keys.CONTROL+"A");
     email.sendKeys(Keys.CONTROL+"C");
     
     driver.findElement()
	}

}
