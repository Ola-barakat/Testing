package driver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.time.Duration;

public class DriverManager {
    public static WebDriver driver;
    public WebDriver getDriver() {
        String baseUrl = "https://practice-react.sdetunicorns.com/";
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize(); // Optional: maximize the window
            driver.get(baseUrl);
             Actions actions = new Actions(driver);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            actions.sendKeys(Keys.PAGE_DOWN).perform();
        }
        return driver;
    }

    public void scroll(WebElement element){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(element);
    }

   public void closeDriver() {
        if (driver != null) {
           driver.quit();
           driver = null; // Reset the driver instance
        } }


}
