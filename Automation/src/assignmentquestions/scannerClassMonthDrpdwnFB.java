package assignmentquestions;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class scannerClassMonthDrpdwnFB {


	public static void main(String[] args) {
  //WAS to check whether the given option is present or no in FB month DROPDOWN :
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Month to check in DropDown: ");
		String inputmonth = sc.nextLine();//read the entire line entered by the user
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("month")));
		
		WebElement monthdropdown = driver.findElement(By.id("month"));
		Select s=new Select(monthdropdown);
		
		List<WebElement> options = s.getOptions();
		//fetches all<option>elements inside the dropdown
		boolean found = false;//initialize boolean flag
		for (WebElement option : options) {
			if(option.getText().equalsIgnoreCase(inputmonth)) {
	  //case-insensitive comparision of option text with user input:
				
				found=true;
				break;
				//exit loop if month is found:
			}
		}//java
		if(found) {
		System.out.println(inputmonth + " is present in the month dropdown.");//confirmation message if found
			}else {
				System.out.println(inputmonth + "  is Not present in the month dropdown.");//message if not found
			}
		driver.quit();
	
	}
}
