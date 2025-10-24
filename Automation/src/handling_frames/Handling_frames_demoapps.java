package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_frames_demoapps {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://demoapps.qspiders.com/");
driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Frames']")).click();Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='iframes']")).click();//or we can use ( //section[text()='iframes'] )
Thread.sleep(2000);
driver.findElement(By.linkText("Nested with Multiple iframe")).click();Thread.sleep(2000);
driver.switchTo().frame(0);
Thread.sleep(2000);
String email = driver.findElement(By.xpath("//p[text()='Default Email']/following-sibling::p")).getText();Thread.sleep(2000);
String pwd = driver.findElement(By.xpath("//p[text()='Default Password']/following-sibling::p")).getText();Thread.sleep(2000);
String conpwd = driver.findElement(By.xpath("//p[contains(text(),'Confirm Password')]/following-sibling::p")).getText();Thread.sleep(2000);
driver.switchTo().frame(0);
driver.switchTo().frame(0);
driver.findElement(By.id("email")).sendKeys(email);Thread.sleep(2000);
driver.switchTo().parentFrame();
driver.switchTo().frame(1);
driver.findElement(By.id("password")).sendKeys(pwd);Thread.sleep(2000);
driver.switchTo().parentFrame();
driver.switchTo().frame(2);
driver.findElement(By.id("confirm")).sendKeys(conpwd);Thread.sleep(2000);
driver.switchTo().parentFrame();
driver.switchTo().frame(3);
driver.findElement(By.id("submitButton")).click();

driver.quit();


	}

}
