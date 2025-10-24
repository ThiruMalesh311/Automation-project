package Takes_ScreenShot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraApplication {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://myntra.com");
    TakesScreenshot ts=(TakesScreenshot) driver;
    File src = ts.getScreenshotAs(OutputType.FILE);
    System.out.println(src);
    Thread.sleep(20000);//it act like prtsc its take onlynSS and Store it in temporary container which will be available for only 20000sec 
                        //after that it will automatically get deleted so we should go to paint save empty file/folder copy paste SS to that folder it will be stored permanently
    driver.quit();
    
	}
}
