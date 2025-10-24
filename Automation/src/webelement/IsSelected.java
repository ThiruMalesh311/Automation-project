package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://timetracker.ctepl.com/actitime/login.do");
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		checkbox.click();
		Thread.sleep(2000);
		boolean res = checkbox.isSelected();
		if(res==true) {
			System.out.println("Checkbox is Selected");
		}
		else {
			System.out.println("Checkbox is not Selected");
		}
		driver.quit();

	}

}
