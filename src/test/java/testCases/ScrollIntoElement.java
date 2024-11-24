package testCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoElement {

    public static void main(String[] args) {
        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        
        // Navigate to the desired webpage
        driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
        
        // Locate the element you want to scroll to
        WebElement linkText  = driver.findElement(By.linkText("How to run Selenium tests using Firefox Driver"));
        
        // Use JavaScript to scroll the element into view
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", linkText);
        
        // Optionally close the browser after the operation
        // driver.quit();
    }
}
