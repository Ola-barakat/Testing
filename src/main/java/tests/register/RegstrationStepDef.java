package tests.register;
import Pages.RegisterPage;
import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;

public class RegstrationStepDef {

    WebDriver driver;
    RegisterPage registerPage;
    DriverManager DriverManager = new DriverManager();


    @Given("User click on User Profile")
    public void userClickOnUserProfile() throws InterruptedException {

        driver = DriverManager.getDriver();
        registerPage= new RegisterPage(driver);
        registerPage.clickOnUserProfile();

    }

    @When("click on register")
    public void clickOnRegister() throws InterruptedException {
        Thread.sleep(2000);
        registerPage.clickOnRegisterFromMenu();
    }

    @And("Fill All Mandatory Field")
    public void fillAllMandatoryField() throws InterruptedException {
        Thread.sleep(2000);
        registerPage.setUsername("Testuser");
        registerPage.setEmail("olabgparseepkpjjooalpt12@gmail.com");
        registerPage.setPassword("Test@1234");
        registerPage.setGender("female");
        registerPage.setAddress1("address1");
        registerPage.setAddress2("address2");
        registerPage.setContact("01010101010");
        registerPage.clickOnRegisterButton();
        Thread.sleep(1000);
    }

    @Then("Validate that user profile contains button logout")
    public void validateThatUserProfileContainsButtonLogout() throws InterruptedException {
        registerPage.clickOnUserProfile();
        Thread.sleep(1000);
        Assert.assertTrue(registerPage.checkLogoutButon().isDisplayed());

    }

    @After
    public void tearDown() {
       DriverManager.closeDriver(); // Quit the WebDriver
    }
}

