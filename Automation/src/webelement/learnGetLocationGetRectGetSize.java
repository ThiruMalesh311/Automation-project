package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnGetLocationGetRectGetSize {

	public static void main(String[] args) {
      
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		Dimension fn1 = firstname.getSize();
		int height1 = fn1.getHeight();
		int width1 = fn1.getWidth();
		
	    int height2 = lastname.getRect().getHeight();
	    int width2 = lastname.getSize().getWidth();
	    
	    if(height1==height2&&width1==width2) {
	    	System.out.println("Both are same size");
	    }else
	    {
	    	System.out.println("Both are not same size");
	    	
	    }
	   Point n1 = firstname.getLocation();
	   int xAxis1 = n1.getX();
	   int xAxis2 = lastname.getRect().getX();
	   
	   int yAxis1 = firstname.getRect().getY();
	   int yAxis2 = lastname.getLocation().getY();
	   
	   if(yAxis1==yAxis2) {
		   System.out.println("Both are aligned properly");
		   
	   }else {
		   System.out.println("Both are not aligned properly");
	   }
	   driver.quit();
	}

}
