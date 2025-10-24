package handling_mouse_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {

	public static void main(String[] args) throws AWTException, InterruptedException {
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
r.keyPress(KeyEvent.VK_T);Thread.sleep(2000);

Set<String> allwid = driver.getWindowHandles();
Iterator<String> it=allwid.iterator();
String pwid = it.next();
String cwid = it.next();
driver.switchTo().window(cwid);Thread.sleep(2000);
List<WebElement> headinglist = driver.findElements(By.xpath("(//h2)"));
Thread.sleep(2000);

for(int i=headinglist.size()-1;i>0;i--) {
	String text = headinglist.get(i).getText();
	System.out.println(text);
}Thread.sleep(2000);
System.out.println("------print in normal order------");
for(int j=0;j<=headinglist.size();j++) {
	String textA = headinglist.get(j).getText().trim();
	System.out.println(textA);
}
driver.quit();
	}

	}


