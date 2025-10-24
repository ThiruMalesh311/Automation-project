package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoLoginExe_2 {
	@Test
	public void demo() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		DemoLoginPage2 d=new DemoLoginPage2(driver);
		d.Login("admin1","manager12");//1st time wrong un and Pwd
		Thread.sleep(5000);
		d.Login("admin","manager");
		
		//StaleElementException
		
		
	}

}
