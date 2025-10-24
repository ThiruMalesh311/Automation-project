package webelement;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customWaitLogoutLink {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));implicitwait not required
     //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));ExplicitWait Not required
     driver.get("http://online.actitime.com/tyss/login.do");
     driver.findElement(By.id("username")).sendKeys("admin");
     driver.findElement(By.name("pwd")).sendKeys("manager");
     driver.findElement(By.xpath("//div[text()='Login ']")).click();
     for(int i=0;i<100;i++) {
    	try  {
    		     driver.findElement(By.id("logoutLink")).click();
    		     break;
    	     }
       	catch(NoSuchElementException e) {
       		
    	      System.out.println(i);
    	      System.out.println("logout link clicked");
     }
    	
	}
     driver.quit();
}
}
     
	


