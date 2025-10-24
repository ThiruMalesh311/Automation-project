package java_script_executor_handling_disabled_ele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_Disabled_ele {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://demoapps.qspiders.com/");
driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
driver.findElement(By.xpath("//li[text()='Disabled']")).click();
Thread.sleep(2000);
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("document.getElementById('name').value='manager';");
js.executeScript("document.getElementById('email').value='manager@gmail.com';");
js.executeScript("document.getElementById('password').value='Manager@321';");
//driver.findElement(By.xpath("//button[text()='Register']")).click();


	}

}
