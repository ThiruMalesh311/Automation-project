package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseClass {
	//public static WebDriver driver;       //we can acess in another class also without creating object
	public WebDriver driver;                //removed static because of parallel excecution we want multiple copys so (static creat singlecopy)  	
	@Parameters("browser")                  //should create parameter to access browsers
	@BeforeClass(groups = {"SmokeTest","RegressionTest"})
  //public void openBrowser() 
	public void openBrowser(String browser)   //make parameterized for cross browser execution
	{ 
		  /*switch (browser)
		{
	       case "chrome":driver=new ChromeDriver();break;
	       case "edge":driver=new EdgeDriver();break;
	       case "firefox":driver=new FirefoxDriver();break;
	       default:driver=new ChromeDriver();
	}*/
		     //OR 
		
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if (browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}    
		
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost/login.do");
		Reporter.log("openBrowser",true);
	}
	private void elseif(boolean equals) {
		// TODO Auto-generated method stub
		
	}
	@BeforeMethod(groups = {"SmokeTest","RegressionTest"})
	public void login() {
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Reporter.log("login",true);
	}
    @AfterMethod(groups = {"SmokeTest","RegressionTest"})
	public void logout() {
    	
    	driver.findElement(By.id("logoutLink")).click();
    	Reporter.log("logout",true);
	}
	@AfterClass(groups = {"SmokeTest","RegressionTest"})
	public void closeBrowser() {
		driver.quit();	
		Reporter.log("closeBrowser",true);
	}
}
