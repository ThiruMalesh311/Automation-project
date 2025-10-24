package handling_popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pib_gov_in_ChildwidPopUPTitle {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
        WebDriver driver=new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.pib.gov.in/indexd.aspx");
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        
       // driver.switchTo().alert().accept();
        driver.findElement(By.linkText("Ministry of Education")).click();
        driver.switchTo().alert().accept();
        
        Set<String> allwid = driver.getWindowHandles();
        Iterator<String> i=allwid.iterator();
       String pwid = i.next();
       String cwid = i.next();Thread.sleep(3000);
       driver.switchTo().window(cwid);
       System.out.println(driver.getTitle());
       
       driver.quit();
        
      
        
	}

}
