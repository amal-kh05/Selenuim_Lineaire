package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		JavascriptExecutor js =(JavascriptExecutor) driver ;
		js.executeScript("window.scrollBy(0, 800)", "");
		WebElement fullName = driver.findElement(By.id("userName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement currentAdress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		WebElement  btnSubmit = driver.findElement(By.id("submit"));
		fullName.sendKeys("Amal KHALIFA");
		email.sendKeys("amal.khalifa.ing@gmail.com");
		currentAdress.sendKeys("Tunis");
		
		// Copy paste
		currentAdress.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		currentAdress.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		permanentAddress.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		btnSubmit.click();
		driver.quit(); 
	}

}