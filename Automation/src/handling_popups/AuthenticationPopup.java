package handling_popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
         
	}

}
  /*
  * url https://the-internet.herokuapp.com/basic_auth
    un admin
    pwd admin 
    
    (PROTOCOL)          PWD
       https://admin:admin@the-internet.herokuapp.com/basic_auth
               UN                   URL
**/