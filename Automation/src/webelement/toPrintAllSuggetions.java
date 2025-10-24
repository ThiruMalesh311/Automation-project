package webelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toPrintAllSuggetions {
	//was to print all the suggestions in google after entering Algoshack or Rexerra or Inspironlabs

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     driver.get("https://google.com");
	 driver.findElement(By.name("q")).sendKeys("Algoshack");//All search tabs tagname will start from "q"
	 Thread.sleep(1000);
	 List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'algoshack')]"));
    	int count = allsugg.size();
    	System.out.println(count);
    	
    	for (WebElement ele : allsugg) {
    		String text = ele.getText();
			System.out.println(text);
		}
	 //was to print last Link or suggestions
    	WebElement LastEle = allsugg.get(count-1);
    	LastEle.click();
    	
    	
	 
	 
	 
	}

}
