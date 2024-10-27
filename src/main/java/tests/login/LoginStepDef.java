package tests.login;

import Pages.LoginPage;
import Pages.RegisterPage;
import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDef {
    WebDriver driver;
    RegisterPage registerPage;
    LoginPage login;
    DriverManager DriverManager = new DriverManager();


    @Given("Click on login from menu")
    public void clickOnLoginFromMenu() throws InterruptedException {
        driver = DriverManager.getDriver();
        login= new LoginPage(driver);
        registerPage= new RegisterPage(driver);
        login.clickOnLoginFromMenu();
    }

    @When("User login with credentials")
    public void userLoginWithCredentials() throws InterruptedException {
        login.setUsername("olabarakat200004@gmail.com");
        login.setPassword("Test@1234");
        login.clickOnLoginButton();
    }
    @When("User login with credentials{string} and {string}")
    public void userLoginWithCredentialsAnd(String username, String userpassword) throws InterruptedException {
        login.setUsername(username);
        login.setPassword(userpassword);
        login.clickOnLoginButton();
    }

    @Then("Validate that account is open Successfully")
    public void validateThatAccountIsOpenSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        registerPage.clickOnUserProfile();
        Thread.sleep(1000);
        Assert.assertTrue(registerPage.checkLogoutButon().isDisplayed());

    }
    @After
    public void tearDown() {
        DriverManager.closeDriver(); // Quit the WebDriver
    }


}

