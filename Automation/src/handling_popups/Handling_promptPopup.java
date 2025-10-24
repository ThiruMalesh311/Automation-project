package handling_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_promptPopup {

	public static void main(String[] args) {
		  WebDriver driver=new ChromeDriver();
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	         driver.get("https://demo.automationtesting.in/Alerts.html");
	         driver.findElement(By.partialLinkText("Alert with Textbox")).click();
	         driver.findElement(By.className("btn-info")).click();
	       Alert b = driver.switchTo().alert();
	       b.sendKeys("hii thiru");
	       b.accept();
	     WebElement txt = driver.findElement(By.id("demo1"));
	     String msg = txt.getText();
	     System.out.println(msg);
	     driver.quit();
	       
	         
	}

}
