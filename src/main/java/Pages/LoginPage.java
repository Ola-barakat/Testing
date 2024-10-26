package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import driver.DriverManager;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    private final By userProfile = By.className("account-setting-active");
    private final By loginFromMenu=By.xpath("//a[@href='/login']");
    private final By userName = By.xpath("//input[@name='email']");
    private final By userpassWord = By.xpath("//input[@name='password']");
    private final By loginButton=By.xpath("//button[text()='Login']");

    public void clickOnLoginFromMenu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(userProfile).click();
        Thread.sleep(2000);
        driver.findElement(loginFromMenu).click();
    }

    public void setUsername(String user) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(userName).sendKeys(user);
    }
    public void setPassword(String password) {
        driver.findElement(userpassWord).sendKeys(password);
    }
    public void clickOnLoginButton() {
        driver.findElement(loginButton).click();
    }



    public void LoginWithCredentials(String user, String password) throws InterruptedException {

        setUsername(user);
        setPassword(password);
        clickOnLoginButton();
    }
 //   String user="olabarakat2004@gmail.com";
//    String password= "Test@1234";
    //registerPage.clickOnLoginFromMenu();
}
