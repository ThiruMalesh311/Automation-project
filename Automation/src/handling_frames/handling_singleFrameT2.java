package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_singleFrameT2 {

	public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("file:///C:/Users/thiru/OneDrive/Desktop/T2.html");
       driver.findElement(By.id("email")).sendKeys("Thiru311@gmail.com");
       driver.switchTo().frame(0);
       driver.findElement(By.id("setPwd")).sendKeys("Thiru@122");
       driver.switchTo().parentFrame();
       driver.findElement(By.id("contact")).sendKeys("8884524620");
       driver.switchTo().frame("Frame 2");
       driver.findElement(By.id("confirmPwd")).sendKeys("Thiru@122");
	}

}
