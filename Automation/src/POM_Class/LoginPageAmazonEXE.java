package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageAmazonEXE {
	@Test
	public void demo() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?");
		
		LoginPageAmazon LA=new LoginPageAmazon(driver);
		LA.Login("  ", " thiru@123");
		Thread.sleep(5000);
		LA.Login("thirumaleshhsk@gmail.com", "Thiru@123");
	}

}
