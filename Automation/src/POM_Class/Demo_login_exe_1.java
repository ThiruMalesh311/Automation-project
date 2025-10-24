package POM_Class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo_login_exe_1 {
	//login to actitime by calling Demo_LoginPage class 
	@Test
	public void demo() {
	
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		Demo_loginPage1 d=new Demo_loginPage1(driver);
		d.Login();
		
		driver.quit();
	}
	

}
