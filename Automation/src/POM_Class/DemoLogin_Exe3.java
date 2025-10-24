package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoLogin_Exe3 {
	@Test
	public void demo() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		Demo_login_Page3 d3=new Demo_login_Page3(driver);
		d3.login("admin1", "manager@123");
		Thread.sleep(5000);
		d3.login("admin", "manager");
	}

}
   //using POM class we can Handle Stale Element Exception