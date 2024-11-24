package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommand {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		// Delete cookies
		driver.manage().deleteAllCookies();

		driver.get("https://www.rediff.com/");
		
		//Switching to the frame 
		driver.switchTo().frame("moneyiframe");

		WebElement option = driver.findElement(By.id("nseindex"));

		String test = option.getText();

		// quit the frame 
		System.out.println("The value " + test);
		

	}

}
