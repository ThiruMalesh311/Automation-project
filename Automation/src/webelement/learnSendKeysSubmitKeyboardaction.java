package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnSendKeysSubmitKeyboardaction {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        WebElement UN = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        UN.sendKeys("Admin");
        WebElement Pwd = driver.findElement(By.name("password"));
        
        Pwd.sendKeys("admin123"+Keys.ENTER);
        driver.quit();
        }

}
