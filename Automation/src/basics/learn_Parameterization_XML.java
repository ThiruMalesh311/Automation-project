package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class learn_Parameterization_XML {
	@Parameters({"url","un","pwd"})
	@Test
    public void demoA(String url,String un,String pwd) {
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get(url);
    	driver.findElement(By.id("user-name")).sendKeys(un);
    	driver.findElement(By.id("password")).sendKeys(pwd);
    	driver.findElement(By.id("login-button")).click();
    	
    }
}
