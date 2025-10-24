package assignmentquestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDeselectALLdemoapps {

	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       driver.get("https://demoapps.qspiders.com/");
	       driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	       driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	       driver.findElement(By.linkText("Multi Select")).click();
	       WebElement mult = driver.findElement(By.id("select-multiple-native"));
	       Select s=new Select(mult);
	       
	       List<WebElement> allList = s.getOptions();
	       
	       int count = allList.size();
	       System.out.println(count);
	       //selectALLoptions
	       for(int i=0;i<count;i++) {
	    	  String text = allList.get(i).getText();
	    	  System.out.println(text);
	    	  s.selectByIndex(i);//it tick/select allopt in dropdown;
	       }
         Thread.sleep(3000);
         System.out.println("------------------------------------------------------------------------------------------------------");
         //deselect the options one by one(reverse order)
         System.out.println("Deselecting the options in reverse order:");
         for(int i=allList.size()-1;i>=0;i--) {
         String textrev = allList.get(i).getText();//to get the text of the option;
         System.out.println("Deselecting: "+textrev);//print the text of the option being deselected;
         s.deselectByIndex(i);
         }
	    //or we can use simply:
         //s.deselectAll();
         
         driver.quit();
	
	}

}
