package hooks;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Hooks {
    private DriverManager webDriverManager = new DriverManager();


    @Before
    public void setUp() {
        webDriverManager.getDriver(); // Initialize the
    }

    @After
    public void tearDown() {
        webDriverManager.closeDriver(); // Quit the WebDriver
    }

    public WebDriver getDriver() {
        return webDriverManager.getDriver(); // Access the WebDriver instance
    }


}
