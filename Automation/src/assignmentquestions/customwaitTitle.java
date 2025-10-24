package assignmentquestions;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class customwaitTitle {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://online.actitime.com/tyss/login.do");
     driver.findElement(By.id("username")).sendKeys("admin");
     driver.findElement(By.name("pwd")).sendKeys("manager");
     driver.findElement(By.xpath("//div[text()='Login ']")).click();
     
     for(int i=0;i<100;i++) {
    	@Nullable
		String title = driver.getTitle();
    	if(title.contains("Enter")) {
    		
    	//System.out.println(i);
    	System.out.println("Title is "+title);
    	break;
    	}  
	}
   driver.quit();
  }
}
