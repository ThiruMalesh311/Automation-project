package testNG_;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.dataloader.impl.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Instagram_verify_titleandLoginButton {
	@Test
	public void demoA() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://instagram.com");
		String actualTitle=driver.getTitle();
		String expectedTitle = "Instagram";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualTitle,expectedTitle);
	}
	
		@Test
		void toValidateLoginButton() {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://instagram.com");
		driver.findElement(By.name("username")).sendKeys("thiru");
		driver.findElement(By.name("password")).sendKeys("thiru@123");
	//boolean res = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
		boolean enable=ele.isEnabled();//we should create store it in ref variable boolean type enable or not
		SoftAssert s=new SoftAssert();
	    s.assertTrue(enable);
		driver.quit();
		s.assertAll();
		}

}
