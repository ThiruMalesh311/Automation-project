package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_withoutusingDragandDrop {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("http://jqueryui.com/droppable/");Thread.sleep(2000);
driver.switchTo().frame(0);//to t/f controller to next frame

WebElement draggable = driver.findElement(By.id("draggable"));
WebElement droppable = driver.findElement(By.id("droppable"));

Actions a=new Actions(driver);
a.clickAndHold(draggable).moveToElement(droppable).release().build().perform();//preferd to use build() when we are performing multiple Actions
//these action is called has---- COMPOUND Actions----
driver.quit();
System.out.println("Sucessfully Drag And Droped element");
	}

}
