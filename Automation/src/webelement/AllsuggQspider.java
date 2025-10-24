package webelement;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllsuggQspider {

	public static void main(String[] args) throws InterruptedException {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://google.com");
            driver.findElement(By.name("q")).sendKeys("Q spider BTM");
            Thread.sleep(2000);
           List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'btm')]"));
           int count = allSugg.size();Thread.sleep(2000);
           System.out.println(count);
           
           for (WebElement ele: allSugg) {
        	  String text = ele.getText();
        	  System.out.println(text);
			
        	 WebElement lastEle = allSugg.get(count-1);
        	 lastEle.click();
		}
	} 

}
