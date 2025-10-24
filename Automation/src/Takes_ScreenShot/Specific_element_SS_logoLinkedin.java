package Takes_ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specific_element_SS_logoLinkedin {

	public static void main(String[] args) throws IOException {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://www.linkedin.com/");
     //no need of typecasting because it is WEBELEMENT Type
     //TakesScreenshot ts=(TakesScreenshot) driver;
     WebElement logo = driver.findElement(By.xpath("//a[contains(@class,'nav__logo-link')]"));
	 File src = logo.getScreenshotAs(OutputType.FILE);
	 File dest=new File("./screenshots/img1.png");
	 FileUtils.copyFile(src, dest);
	 driver.quit();
	
	}

}
