package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learn_MoveTOElement_vtigerCom {

	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.get("https://www.vtiger.com/");
     WebElement dropdown = driver.findElement(By.id("companyDropdown"));
     
     Actions a=new Actions(driver);
     a.moveToElement(dropdown).perform();
     driver.findElement(By.linkText("Contact Us")).click();
      
    WebElement text = driver.findElement(By.xpath("//p[contains(text(),'Melbourne')]/../p[2]"));
     String t1 = text.getText();
     System.out.println(t1);
     
     driver.quit();
	}

}
