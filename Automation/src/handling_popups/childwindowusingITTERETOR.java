package handling_popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindowusingITTERETOR {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("/a[text()='New Tab']")).click();
		driver.findElement(By.xpath("//button[text()='view more']")).click();
		
		Set<String> allwid = driver.getWindowHandles();
		Iterator<String> i= allwid.iterator();
		String pwid = i.next();
		String cwid = i.next();
		
		//to close child window 1st
		driver.close(); Thread.sleep(2000);
		
		//controller will be present in child window only so we should use below stmt to navigate the controller to parent window
		driver.switchTo().window(pwid);
		driver.close();//close parent window
		
	}
}
