package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class deleteCustomer {
//getter methods for delete customer in 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		driver.findElement(By.linkText("TASKS")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Start typing name ...']")).sendKeys("ICICI");
		
		driver.findElement(By.xpath("//span[@class='highlightToken']/../../div[@class='editButton available']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'edit_customer_sliding_panel')]//div[text()='ACTIONS']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'edit_customer_sliding_panel')]//div[text()='Delete']")).click();
		driver.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
		
		String text = driver.findElement(By.className("innerHtml")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.quit();
	}

}
