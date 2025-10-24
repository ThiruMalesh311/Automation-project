package handling_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://demo.automationtesting.in/Alerts.html");
    driver.findElement(By.className("btn-danger")).click();
    Alert a = driver.switchTo().alert();Thread.sleep(2000);
    String text = a.getText();Thread.sleep(2000);
    System.out.println(text);Thread.sleep(2000);
    a.accept();Thread.sleep(1000);
    driver.quit();
	}

}
