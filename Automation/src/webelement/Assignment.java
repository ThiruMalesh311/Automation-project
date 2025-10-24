package webelement;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.facebook.com/");
  WebElement ele = driver.findElement(By.name("login"));
  ele.click();
  WebElement errormsg = driver.findElement(By.xpath("//div[contains(text(),'mobile ')]"));
 String text = errormsg.getText();
 String color = errormsg.getCssValue("color");
 System.out.println(text);
 System.out.println(color);
 
WebElement elee = driver.findElement(By.xpath("//a[@title='Kannada']"));
@Nullable
String tooltip = elee.getAttribute("title");
System.out.println(tooltip);

driver.quit();
 
 
   
	}

}
