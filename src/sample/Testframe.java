package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	    Thread.sleep(3000);
		List<WebElement> frames=	driver.findElements(By.tagName("iframe"));
	frames.size();
	System.out.println(frames.size());
	//driver.switchTo().frame(1);
	//driver.switchTo().frame("iframeResult");
	driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	driver.findElement(By.xpath("/html/body/button")).click();
Alert a=	driver.switchTo().alert();
Thread.sleep(3000);
System.out.println(a.getText());
a.sendKeys("hello");
a.accept();
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/button")).click();

	/*
	driver.switchTo().defaultContent();
	driver.switchTo().frame(0);
	driver.findElement(by.)
	
	*/
	
	
		
	}

}
