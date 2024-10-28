package tests.home;

import Pages.HomePage;
import Pages.LoginPage;
import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.util.List;

public class HomeStepDef {

    WebDriver driver;
    LoginPage login;
    HomePage home;
    driver.DriverManager DriverManager = new DriverManager();

    @And("User is in home page")
    public void userIsInHomePage() throws InterruptedException {
        driver = DriverManager.getDriver();
        home = new HomePage(driver);
        login = new LoginPage(driver);
    }

    @And("Click on Keyboards in categories in home page.")
    public void clickOnKeyboardsInCategoriesInHomePage() throws InterruptedException {

        home.clickOnKeyboardCategory();

    }

    @And("Click on Apply")
    public void clickOnApply() throws InterruptedException {
        home.clickOnApply();


    }

    @Then("Validate that only keyboard products only appear")
    public void validateThatOnlyKeyboardProductsOnlyAppear() throws InterruptedException {
        List<String> productName = home.getAllProduct();
        for (String product : productName) {
            Assert.assertTrue(product.contains("Keyboard"));
        }
    }



    @And("Click on product Logitech Wireless Keyboard and Mouse Combo Black")
    public void clickOnProductLogitechWirelessKeyboardAndMouseComboBlack() throws InterruptedException {
        home.clickOnKeybardproduct();
    }

    @Then("Validate that product name is {string}")
    public void validateThatProductNameIs(String product_name) throws InterruptedException {
        Assert.assertEquals(home.getKeybardgetproductName(), product_name);
    }

    @And("Validate that product price is{string}")
    public void validateThatProductPriceIs(String product_price) throws InterruptedException {
        Assert.assertEquals(home.getKeybardgetproductPrice(), product_price);
    }


    @Then("Validate that product cart are empty {string}")
    public void validateThatProductCartAreEmpty(String empty_message) throws InterruptedException {
        Assert.assertEquals(home.getEmptyCartText(), empty_message);
    }

    @And("Click on cart")
    public void clickOnCart() throws InterruptedException {
        home.clickOnCart();
    }

    @And("Click on Add to cart")
    public void clickOnAddToCart() throws InterruptedException {
        home.clickOnAddToCart();
    }

    @And("Validate that product cart contain {string} element")
    public void validateThatProductCartContainElement(String cart_item_count) {
        int size = home.getItemsCount();
        String count = String.valueOf(size);
        Assert.assertEquals(count, cart_item_count);
    }

    @Then("Validate that product message")
    public void validateThatProductMessage() {
        home.getToastMessage();
    }


    @And("Click on Laptop in categories in home page")
    public void clickOnLaptopInCategoriesInHomePage() {
        home.clickLaptopCategory();
    }


    @And("Click On product tap in header bar")
    public void clickOnProductTapInHeaderBar() throws InterruptedException {
        home.clickProductTap();
    }


    @And("choose product name {string}")
    public void chooseProductName(String product_name) throws InterruptedException {
        home.selectLaptopProductName(product_name);
    }


    @And("Check total price {string}")
    public void checkTotalPrice(String total_price) throws InterruptedException {
        Assert.assertEquals(home.getTotalPrice(), total_price);
    }

    @And("CLick on checkout")
    public void clickOnCheckout() throws InterruptedException {
     home.clickOnCheckout();
    }

    @And("Fill the shipping address")
    public void fillTheShippingAddress() throws InterruptedException {
        home.setCountry("Egypt");
        home.setState("Giza");
        home.setCode("12345");
        home.setAdress1("Address1");
        home.setAdress2("Address2");
        home.setPhone("01010101010");

    }

    @And("Click on checkbox button")
    public void clickOnCheckboxButton() throws InterruptedException {
        home.selectCashOnDlvry();
    }

    @And("Click on Confirm button")
    public void clickOnConfirmButton() throws InterruptedException {
        home.clickConfirm();
    }



    @And("Total final price is {string}")
    public void totalFinalPriceIs(String total_price){
        Assert.assertTrue(home.getFinalPrice().contains(total_price));

    }

    @Then("validate that shipping address contains {string} and {string} and {string} and {string}")
    public void validateThatShippingAddressContainsAndAndAnd(String country, String State, String Address1, String Address2) throws InterruptedException {
        Thread.sleep(20000);
        DriverManager action=new DriverManager();
        action.scroll(home.country());
       Assert.assertTrue(home.getCountry().contains(country));
        Assert.assertTrue(home.getState().contains( State));
        Assert.assertTrue(home.getaddress1().contains(Address1));
        Assert.assertTrue(home.getaddress2().contains(Address2));
    }

    @And("press on Order details")
    public void pressOnOrderDetails() throws InterruptedException {
        home.clickOnAddressTab();
    }
    @After
    public void tearDown() {
        DriverManager.closeDriver(); // Quit the WebDriver
    }



    @And("Check product  {string} and product {string}")
    public void checkProductAndProduct(String title_1, String title_2) throws InterruptedException {
        List<String> productName = home.getAllProductINCart();
        Assert.assertEquals(productName.get(0),title_1);
        Assert.assertTrue(productName.get(1).contains(title_2));
    }
}




