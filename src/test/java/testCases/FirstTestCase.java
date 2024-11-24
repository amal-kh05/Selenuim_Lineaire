package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// Open chrome

		WebDriver driver = new ChromeDriver();

		// access to URL
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// Fill user name
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");

		// Fill Password
		driver.findElement(By.name("password")).sendKeys("admin123");

		// Click to login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Validation enter on home page

		// Close chrome browser
		//driver.close();
		
		// kill session
		
		//driver.quit();

	}

}
