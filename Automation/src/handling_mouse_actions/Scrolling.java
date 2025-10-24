package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://facebook.com");
Actions a=new Actions(driver);
a.scrollByAmount(0, 200).perform();//it will scroll vertically for 200 pixels
a.scrollByAmount(0, -100).perform();//it will scroll back vertically for 100 pixels

WebElement link = driver.findElement(By.linkText("Sign Up"));
a.scrollToElement(link).perform();//it will scroll untill an element is visible
	}

}
