package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
//EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
    
    String title=driver.getTitle();
    System.out.println(title);
    driver.close();
   // driver.quit(); we can use this also instead of close
	}

}
