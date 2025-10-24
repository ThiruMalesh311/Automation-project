package POM_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Demo_loginPage1 {
	
	               private WebElement unTbx;
	               private WebElement pwdTbx;
	               private WebElement loginBtn;
	               
	           public Demo_loginPage1(WebDriver driver) {
	        	  unTbx= driver.findElement(By.id("username"));
	        	  pwdTbx= driver.findElement(By.name("pwd"));
	        	 loginBtn= driver.findElement(By.xpath("//div[text()='Login ']"));
			}
	               
	           public void Login() {
	        	   unTbx.sendKeys("admin");
	        	   pwdTbx.sendKeys("manager");
	        	   loginBtn.click();
	           }
	               

}
