package assignmentquestions;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hdfc_bank_AllLang_Print {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.hdfcbank.com/");
Thread.sleep(2000);
WebElement login = driver.findElement(By.xpath("(//button[text()='Login'])[1]"));Thread.sleep(2000);
Actions a=new Actions(driver);
a.moveToElement(login).perform();
Thread.sleep(2000);
driver.findElement(By.linkText("NetBanking")).click();
Thread.sleep(2000);
Set<String> allwid1 = driver.getWindowHandles();
Thread.sleep(2000);
Iterator<String> it=allwid1.iterator();
String pwid1 = it.next();
String cwid1 = it.next();Thread.sleep(2000);
driver.switchTo().window(cwid1);Thread.sleep(2000);
driver.switchTo().frame(0);
Thread.sleep(2000);
driver.findElement(By.partialLinkText("Know")).click();Thread.sleep(2000);
Set<String> allwid2 = driver.getWindowHandles();Thread.sleep(2000);
Iterator<String> i=allwid2.iterator();
String pwid2 = i.next();
String cwid2 = i.next();
String ccwid2 = i.next();//added these because here we have three windows/tabs
Thread.sleep(2000);
driver.switchTo().window(ccwid2);Thread.sleep(2000);
List<WebElement> alllang = driver.findElements(By.xpath("//p[contains(text(),'your preferred language')]"));Thread.sleep(2000);
for (WebElement langs : alllang) {
	System.out.println(langs.getText());
	
}
driver.quit();
	}

}
