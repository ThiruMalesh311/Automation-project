package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra_Assignment {

	public static void main(String[] args) throws InterruptedException {
ChromeOptions opt=new ChromeOptions();
opt.addArguments("--disable-notifications");
		
WebDriver driver=new ChromeDriver(opt);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://www.myntra.com/");
WebElement Mensection = driver.findElement(By.xpath("//a[text()='Men']"));

Actions a=new Actions(driver);Thread.sleep(2000);
a.moveToElement(Mensection).perform();
Thread.sleep(2000);
WebElement ele = driver.findElement(By.linkText("Sneakers"));
a.moveToElement(ele).click().perform();
Thread.sleep(2000);
WebElement Price = driver.findElement(By.xpath(""));
a.clickAndHold(Price).moveByOffset(-50, 0).release().build().perform();
Thread.sleep(2000);


	}

}
