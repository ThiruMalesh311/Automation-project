package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
boolean login = driver.findElement(By.xpath("//button[.='Log in']")).isEnabled();
if(login == true)
{
	System.out.println("login is enabled");
}
else
{
	System.out.println("login is not enabled");
}
driver.quit();
}
	}


