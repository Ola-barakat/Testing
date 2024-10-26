package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import driver.DriverManager;


public class RegisterPage  {

    WebDriver driver;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;

    }



    //Locators for elements
    private final By userProfile = By.className("account-setting-active");
    private final By registerFromMenu = By.xpath(("//a[@href='/register']"));
    private final By loginFromMenu=By.xpath("//a[@href='/login']");
    private final By username = By.id("username");
    private final By email = By.id("email");
    private final By password = By.id("password");
    private final By gender = By.id("gender");
    private final By address1 = By.id("address1");
    private final By address2 = By.id("address2");
    private final By contact = By.id("contact");
    private final By registerButton= By.tagName( "button");
    private final By logout = By.xpath("//li[text()='Logout']");



    public void clickOnUserProfile() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(userProfile).click();
    }

    public void clickOnRegisterFromMenu() {
        driver.findElement(registerFromMenu).click();
    }



    public void setUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void setEmail(String user) {
        driver.findElement(email).sendKeys(user);
    }

    public void setPassword(String user) {
        driver.findElement(password).sendKeys(user);
    }

    public void setGender(String user) {
        driver.findElement(gender).sendKeys(user);
    }
    public void setAddress1(String user) {
        driver.findElement(address1).sendKeys(user);
    }
    public void setAddress2(String user) {
        driver.findElement(address2).sendKeys(user);
    }

    public void setContact(String user) {
        driver.findElement(contact).sendKeys(user);
    }

    public void clickOnRegisterButton() {
        driver.findElement(registerButton).click();
    }


    public WebElement checkLogoutButon() {
       return driver.findElement(logout);

    }

    public String gettext () {
       return DriverManager.driver.findElement(logout).getText();
    }






    }






//  #root > header > div.sticky-bar.header-res-padding.clearfix.stick > div.container > div > div.col-xl-2.col-lg-2.col-md-6.col-8 > div > div.same-style.account-setting.d-none.d-lg-block > div > ul > li:nth-child(1) > a

// class item-empty-area__text
//






