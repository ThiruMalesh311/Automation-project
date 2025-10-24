package handling_popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {
ChromeOptions opt=new ChromeOptions();//used to change browser settings

opt.addArguments("--disable-notifications","--start-maximized","-incognito","--headless");
                     //or
                     
//opt.addArguments("--disable-notifications");//it will disable the notification popup
//opt.addArguments("--start-maximized");//it will launch the browser in maximized mode
//opt.addArguments("-incognito");//it will open the browser in incognito mode
//opt.addArguments("--headless");//it will launch the browser in headless mode
//WebDriver driver=new ChromeDriver();//will launch browser in default settings
WebDriver driver=new ChromeDriver(opt);//will launch browser in modified settings
driver.get("https://www.yatra.com");
System.out.println(driver.getTitle());
	}

}
