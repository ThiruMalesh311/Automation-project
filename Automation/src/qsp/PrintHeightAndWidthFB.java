package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeightAndWidthFB {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    WebElement login = driver.findElement(By.name("login"));
  int height = login.getSize().getHeight();
  int width= login.getSize().getWidth();
  System.out.println("height="+height);
  System.out.println("width="+width);
  driver.quit();
	}

}
