package handling_mouse_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grooming_fb_AllLangs {

	public static void main(String[] args) throws InterruptedException, AWTException {
		  WebDriver driver=new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     driver.get("https://www.facebook.com/login/");
		     Thread.sleep(2000);
		     
		     //Find all language links at the bottom
		     List<WebElement> allLang = driver.findElements(By.xpath("//div[@id='pageFooter']/ul/li/a"));
		     
		     Actions as=new Actions(driver);
		     Robot r=new Robot();
		    
		     //Right-Click each Language link and open in new tab using Robot
		     for(int i=0;i<10;i++) {
		    	WebElement ele = allLang.get(i);
		    	as.contextClick(ele).perform();
		    	Thread.sleep(500);
		    	
		    	//Move to "open link in new tab"option
		    	r.keyPress(KeyEvent.VK_DOWN);
		    	r.keyRelease(KeyEvent.VK_DOWN);
		    	Thread.sleep(200);
		    	
		    	//Press Enter to open new tab
		    	r.keyPress(KeyEvent.VK_ENTER);
		    	r.keyRelease(KeyEvent.VK_ENTER);
		    	Thread.sleep(1000);
		   }
		     //get all window IDs
		     Set<String> allwid = driver.getWindowHandles();
		     ArrayList<String>tabs=new ArrayList<String>(allwid);
		     
		     //Switch to the 7th tab(index 6)
		     driver.switchTo().window(tabs.get(6));
		    
		     
	}

}
