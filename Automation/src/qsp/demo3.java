package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class demo3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/thiru/OneDrive/Desktop/Demo4.html");
		WebElement e=driver.findElement(By.tagName("a"));
		e.click();
		driver.quit();


	}}
