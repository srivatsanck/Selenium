package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.linkText("Sign up")).click();
		List<WebElement> list = driver.findElements(By.tagName("a"));
		//link.click();
		System.out.println(list.size());
		
		String text = driver.findElement(By.linkText("Check Availability")).getText();
		
		System.out.println(text);
		
		String attribute = driver.findElement(By.linkText("Check Availability")).getAttribute("value");
		System.out.println(attribute);
		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("userRegistrationForm:userName")).sendKeys("test4234",Keys.TAB);
		
		WebElement elmt = driver.findElement(By.id("userRegistrationForm:securityQ"));
		Select se = new Select(elmt);
		Thread.sleep(1000);
		
		se.selectByIndex(3);
		se.selectByValue("-1");
		se.selectByVisibleText("What is your pet name?");
		
		//driver.close();
	}

}
