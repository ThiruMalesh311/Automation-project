package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//in realtime we will not hardcode the data (directly we will not give or enter)
//we use Datadriven method to enter date /we make use of Property file

public class HandlingPropertyFile {

	public static void main(String[] args) throws IOException {
		
FileInputStream fis=new FileInputStream("./data/commandata.properties");//covert high-level-lang into low -level-lang binaries
Properties p=new Properties();//to access non-sataic-methods of properties class we need to create an object
p.load(fis);//will load the binaries into the property object

//getproperty(string key) will get the value of the method key name

String url = p.getProperty("url");
String un = p.getProperty("username");
String pwd = p.getProperty("password");

System.out.println(url);
System.out.println(un);
System.out.println(pwd);

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get(url);
driver.findElement(By.id("user-name")).sendKeys(un);
driver.findElement(By.id("password")).sendKeys(pwd);
driver.findElement(By.id("login-button")).click();

driver.quit();
	}

}
