package testCases;



import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		
		//Get element color 
		String color = driver.findElement(By.id("doubleClickBtn")).getCssValue("background-color");
		Color color1 = Color.fromString(color);
		String actualcolor = color1.asHex();
		Assertions.assertEquals("#007bff", actualcolor);

	}

}
