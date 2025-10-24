package webelement;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnGetmethod {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
  WebElement link = driver.findElement(By.linkText("Forgotten password?"));
   //gettagName() is used to get the tag name of an element
   
   String tagName =link.getTagName();
   //getText() is used to get the tagtext or visible text of an element
   //if the element is not having tagText it will return empty space
   
   String text = link.getText();
   //getAttribute(string attName) will get the attribute value of an element like href,src,title
   //Since we have multiple attributes for 1 element we need to mention the attribute name
   
   @Nullable
String value = link.getAttribute("href");
   //getCss value(String propName) will get the css property of an element like colour,font size,
   //bg color,since we have multiple properties for 1 element we need to mention the property name
   
   String prop = link.getCssValue("font-size");
   System.out.println("TagName Of Link "+tagName);
   System.out.println("Tag Text of the link "+text);
   System.out.println("Attribute value of link "+value);
   System.out.println("css value of link "+prop);
   
	}

}
