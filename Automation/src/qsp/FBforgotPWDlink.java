package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBforgotPWDlink {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
String fs = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
String fm = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");

System.out.println("Font-size is:"+fs);
System.out.println("Font-family is:"+fm);
driver.quit();
	}

}
