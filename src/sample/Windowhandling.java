package sample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[@id='button1']")).click();
		// driver.findElement(By.xpath("//button[@id='button1']")).click();
		Set<String> vin = driver.getWindowHandles();
		int count = 1;
		for (String win : vin) {
			// if(count == 3){
			
			System.out.println(win);
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
			//}
			//count++;
			
		}
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
