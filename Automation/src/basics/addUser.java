package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addUser {

	public static void main(String[] args) throws InterruptedException
	{
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("http://localhost/login.do");
         driver.findElement(By.id("username")).sendKeys("admin");
         driver.findElement(By.name("pwd")).sendKeys("manager");
         driver.findElement(By.xpath("//div[text()='Login ']")).click();
         
         driver.findElement(By.xpath("//div[text()='USERS']")).click();
         driver.findElement(By.xpath("//div[text()='Add User']")).click();
         driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Thiru");
         driver.findElement(By.id("userDataLightBox_middleNameField")).sendKeys("S");
         driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("hc");
         driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("Thiru@gmail.com");
         driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Thiru2");
         driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Thiru@256");
         driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Thiru@256");
         driver.findElement(By.xpath("//span[text()='Create User']")).click();
         
         
       //  driver.findElement(By.xpath("//input[contains(@class,'filterFieldInput')] ")).sendKeys("Thiru");Thread.sleep(2000);
        // driver.findElement(By.xpath("//span[contains(text(),'Thiru')]")).click();Thread.sleep(2000);
        // driver.findElement(By.id("userDataLightBox_deleteBtn")).click();Thread.sleep(2000);
        String text = driver.findElement(By.className("innerHtml")).getText();
 		 System.out.println(text);
 	    driver.findElement(By.id("logoutLink")).click();
 		
    /*  driver.findElement(By.xpath("//input[contains(@class,'filterFieldInput')]")).sendKeys("Thiru");         
         driver.findElement(By.xpath("//li[@class='firstWarning']/../../..//span[@class='userNameSpan']")).click();Thread.sleep(2000);
         driver.findElement(By.id("userDataLightBox_deleteBtn")).click();Thread.sleep(2000);
         driver.switchTo().alert().accept();
         Thread.sleep(2000);*/
         driver.quit();
	}

}
