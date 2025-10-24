package handling_disabled_elements;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//driver.get("https://www.netflix.com/in/");
driver.navigate().to("https://www.netflix.com/in/");
JavascriptExecutor js=(JavascriptExecutor)driver;//typecasting

js.executeScript("window.scrollBy(0,1000)");//it will scroll for 500 pixels
js.executeScript("window.scrollTo(0,300)");//it will scroll for 300 pixels from intial position


	}

}
