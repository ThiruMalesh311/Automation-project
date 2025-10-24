package handling_frames;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//go to google.com click on 3 dot move to youtube and scroll to youtube music and click on it 



public class Google_youtube_mouse_frame_click {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://google.com");
Thread.sleep(2000);
driver.findElement(By.id("gbwa")).click();

driver.switchTo().frame("app");Thread.sleep(2000);

Actions a=new Actions(driver);
WebElement youtube = driver.findElement(By.xpath("//*[text()='YouTube']"));
Thread.sleep(2000);
a.moveToElement(youtube).perform();
WebElement music = driver.findElement(By.xpath("//*[text()='YouTube Music']"));

a.scrollToElement(music).perform();
music.click();
Thread.sleep(2000);
driver.quit();

	}

}
