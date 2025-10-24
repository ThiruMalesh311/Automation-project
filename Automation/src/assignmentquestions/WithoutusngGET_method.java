package assignmentquestions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* WAP to get a title of a web page without using getTitle
 * WAP to find an element without using Find Element Method
 * WAS to get the text from a textbox 
 */
public class WithoutusngGET_method {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		

	}

}
