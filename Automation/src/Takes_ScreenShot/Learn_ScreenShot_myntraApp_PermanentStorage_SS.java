package Takes_ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_ScreenShot_myntraApp_PermanentStorage_SS {

	public static void main(String[] args) throws Exception   {
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.myntra.com/");
      TakesScreenshot ts=(TakesScreenshot) driver;//typecasting to access takesscreenshot interface
      Thread.sleep(2000);
      File src = ts.getScreenshotAs(OutputType.FILE);//method to take SS (file type)
      Thread.sleep(2000);
      File dest=new File("./screenshots/img.png");//to store it in file/folder we create file type object to store it in destination type ref variable
      FileUtils.copyFile(src, dest);Thread.sleep(2000);//Copy paste src to dest
      driver.quit();
	}

}
