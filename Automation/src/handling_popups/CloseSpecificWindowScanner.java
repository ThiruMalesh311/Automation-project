package handling_popups;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificWindowScanner {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the title");
		String title = sc.next();
		sc.close();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		
		Thread.sleep(2000);
		
		Set<String> allwid = driver.getWindowHandles();
		for (String widid: allwid) {
			driver.switchTo().window(widid);
			
			String actualTitle=driver.getTitle();
           if(actualTitle.contains(title)) {
        	   driver.close();
        	   System.out.println("Specific window closed");
			}
			}
	//we can use these also
		//System.out.println(driver.getTitle());
		//driver.quit();
	}

}
