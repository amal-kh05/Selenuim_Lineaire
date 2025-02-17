package testCases;

import java.time.Duration;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://juliemr.github.io/protractor-demo/");
		driver.findElement(By.xpath("//input[@ng-model='first']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@ng-model='second']")).sendKeys("6");
		driver.findElement(By.id("gobutton")).click();
		
		//Thread.sleep(5000); to avoid 
		//Best practice 
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		Pattern pattern = Pattern.compile("\\d+");
		wait.until(ExpectedConditions.textMatches(By.tagName("h2"), pattern));
		WebElement result = driver.findElement(By.tagName("h2"));
		System.out.println("the result is " +result.getText());
		
		driver.quit();

	}

}
