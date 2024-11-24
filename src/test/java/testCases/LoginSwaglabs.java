package testCases;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSwaglabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Open chrome

		WebDriver driver = new ChromeDriver();
		// Implicite wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// Maximize browser
		driver.manage().window().maximize();

		// Delete cookies
		driver.manage().deleteAllCookies();

		// access to URL
		driver.get("https://www.saucedemo.com/");

		// Fill user name
		Thread.sleep(3000);

		WebElement username = driver.findElement(By.name("user-name"));
		username.clear();
		username.sendKeys("standard_user");

		// Fill Password
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("secret_sauce");

		// Click to login button
		// WebElement loginBtn =driver.findElement(By.name("login-button")) ;
		// loginBtn.click();

		// click on login button using explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login-button")));
		loginBtn.click();

		// Assert enter home page
		String textProduct = driver.findElement(By.xpath("//*[@class='title']")).getText();
		Assertions.assertEquals(textProduct, "Product");

		// Print Screen message
		System.out.println("login successfully ");

		// Kill browser
		// driver.quit();
		// driver.close();

	}

}
