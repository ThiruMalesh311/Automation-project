package handling_mouse_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick_printandclose_wind_in_reverseorder {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://online.actitime.com/tyss/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager"+Keys.ENTER);

		driver.findElement(By.xpath("//div[contains(@class,'menu_button_support')]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();Thread.sleep(2000);
		WebElement link = driver.findElement(By.linkText("Read Service Agreement"));Thread.sleep(2000);

		Actions a=new Actions(driver);Thread.sleep(2000);
		a.contextClick(link).perform();Thread.sleep(2000);

		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);

		Set<String> allwid = driver.getWindowHandles();
		List<String>winlist=new ArrayList<String>(allwid);
		
		System.out.println("-----window titles in normal order--------");
		for(int i=0;i<winlist.size()-1;i++) {
			driver.switchTo().window(winlist.get(i));
			System.out.println(driver.getTitle());
		}
		
		System.out.println("------window Titles in Reverse Order------");
		for(int i=winlist.size()-1;i>=0;i--) {
			driver.switchTo().window(winlist.get(i));
			System.out.println(driver.getTitle());
		}
		
		System.out.println("-----");
		
	}

}
