package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    Thread.sleep(2000);
    driver.findElement(By.linkText("Create new account")).click();
    Thread.sleep(2000);
    WebElement female = driver.findElement(By.xpath("//label[text()='Female']"));
    WebElement male = driver.findElement(By.xpath("//label[text()='Male']"));
    WebElement custom = driver.findElement(By.xpath("//label[text()='Custom']"));
    
    int f1 = female.getRect().getY();
    int m2 = male.getLocation().getY();
    
    Point custom1 = custom.getLocation();
    int c1 = custom1.getY();
 
    if(f1==m2 && f1==c1 && m2==c1)
        {
	       System.out.println("aligned properly and pass");
         }
          else
         {
	       System.out.println("not aligned properly and fail");
          }
        driver.quit();
	}
}


