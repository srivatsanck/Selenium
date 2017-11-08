package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//test
		
		//Test2
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/resizable/");
		
		Thread.sleep(3000);
		
		Actions builder = new Actions(driver);
		
//		WebElement ele1=driver.findElement(By.name("lastname"));
//		
////		builder.moveToElement(ele1).keyDown(Keys.SHIFT).sendKeys("Test").contextClick().build().perform();
////		
////		WebElement ele2=driver.findElement(By.name("lastname"));
////	
////		builder.moveToElement(ele2).sendKeys("test").build().perform();
//		
//		builder.moveToElement(ele1).sendKeys("typing").keyDown(Keys.CONTROL).sendKeys("a")
//		.sendKeys("c").keyUp(Keys.CONTROL).sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL)
//		.build().perform();
	/*	driver.switchTo().frame(0);
		 WebElement source = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		builder.dragAndDrop(source, dest).build().perform();*/
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		builder.sendKeys(Keys.PAGE_DOWN).build().perform();
		builder.clickAndHold(ele).moveByOffset(80, 100).release().build().perform();
		
		
	}

}
