package assignmentquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipKartclickprintMSGcart {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.flipkart.com/");
     WebElement cart = driver.findElement(By.xpath("(//a[@title='Cart'])[1]"));
     boolean c1 = cart.isDisplayed();
     if(c1==true)
     {
    	 System.out.println("Cart is Displayed");
     }else {
    	 System.out.println("Cart is not Displayed");
     }
     cart.click();
     Thread.sleep(2000);
    WebElement errmsg = driver.findElement(By.xpath("//div[contains(text(),'Missing')]"));
    String text = errmsg.getText();
    System.out.println(text);
    driver.quit();
	}
    
}
