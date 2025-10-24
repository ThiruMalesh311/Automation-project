package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_single_frame {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("file:///C:/Users/thiru/OneDrive/Desktop/T3.html");
driver.findElement(By.id("setPwd")).sendKeys("Thiru@123");
driver.findElement(By.id("confirmPwd")).sendKeys("Thiru@123");
driver.quit();


	}

}
