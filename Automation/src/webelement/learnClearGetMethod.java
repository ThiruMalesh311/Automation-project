package webelement;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnClearGetMethod {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     
     driver.get("https://www.facebook.com/");
      WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
          String text = logo.getText();
          String tagName = logo.getTagName();
          String Fontsize = logo.getCssValue("font-size");
        @Nullable
		String Attribute = logo.getAttribute("src");
        
        System.out.println("Text of logo is "+text);
        System.out.println("TagName of logo is "+tagName);
        System.out.println("Css value of logo is "+Fontsize);
        System.out.println("Attribute of logo is "+Attribute);
        driver.quit();
        
        
	}

}
