package webelement;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginToActiPritTitle {
	//login & print actitime home page title using titleIs();

	public static void main(String[] args) {
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
           
           driver.get("http://online.actitime.com/tyss/login.do");
           
           driver.findElement(By.id("username")).sendKeys("admin");
           driver.findElement(By.name("pwd")).sendKeys("manager");
           driver.findElement(By.xpath("//div[text()='Login ']")).click();
           
           wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
          @Nullable
		  String Title = driver.getTitle();
          System.out.println(Title);
          driver.quit();
	}

}
