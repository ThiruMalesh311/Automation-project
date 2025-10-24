package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class learn_dragAndDrop {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://demo.automationtesting.in/Register.html");
Actions a=new Actions(driver);
WebElement ele1 = driver.findElement(By.partialLinkText("Interactions"));
a.moveToElement(ele1).perform();
WebElement ele2 = driver.findElement(By.partialLinkText("Drag and Drop"));
a.moveToElement(ele2).perform();
WebElement ele3 = driver.findElement(By.partialLinkText("Static"));
ele3.click();
//a.click(ele3).perform();

WebElement seleniumIMG = driver.findElement(By.id("node"));
WebElement angular = driver.findElement(By.id("angular"));
WebElement mongo = driver.findElement(By.id("mongo"));

WebElement droparea = driver.findElement(By.id("droparea"));

a.dragAndDrop(angular, droparea).perform();
//or without using dragAndDrop
//a.clickAndHold(angular).moveToElement(droparea).release().perform();
a.dragAndDrop(seleniumIMG, droparea).perform();
a.dragAndDrop(mongo, droparea).perform();
	}

}
