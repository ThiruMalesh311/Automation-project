package handling_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationpopup {

	public static void main(String[] args) throws InterruptedException {
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://demo.automationtesting.in/Alerts.html");
         
         driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
         driver.findElement(By.className("btn-primary")).click();
         Alert a = driver.switchTo().alert();
         String text = a.getText();
         System.out.println(text);
         a.dismiss();
         driver.quit();
	}

}
