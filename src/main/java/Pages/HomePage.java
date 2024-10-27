package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import driver.DriverManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    String productName;
    String xpathForLapTopProductName = String.format("//a[@href='/product/63448f0500b2931578c0a5ab']", productName);
    private final By keyboardCategory = By.xpath("//button[text()='keyboard']");
    private final By apply = By.xpath("//button[text()='Apply']");
    private final By returnedProduct= By.xpath("//div[@class='product-content text-center']");
    private final By keybardproductName=By.xpath("//h2[text()='Logitech Wireless Keyboard and Mouse Combo - Black (MK270)']");
    private final By keybardproductPrice=By.xpath("//div[@class='product-details-price']/span[contains(text(), '$')]");
    private final By keybardproduct=By.xpath("//a[text()='Logitech Wireless Keyboard and Mouse Combo - Black (MK270)']");
    private final By cart=By.xpath("//button[@class='icon-cart']/i[@class='pe-7s-shopbag']");
    private final By cartEmpty=By.xpath(" //p[text()='No items added to cart']");
    private final By addToCart= By.xpath("//button[text()='Add To Cart']");
    private final By cartItems=By.className("single-shopping-cart");
    private final By toastMessage=By.xpath("//div[text()='Added To Cart']");
    private final By productTap=By.xpath("//a[@href='/shop-grid-standard']");
    private final By laptopProduct=By.xpath("");
    private final By laptopCategory=By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div[2]/div/ul/li[2]/div/button");
    private final By totalPrice=By.className("shop-total");
    private final By allProductInCart=By.xpath("//li[@class='single-shopping-cart']");
    private final By checkOut=By.xpath("//a[@href= '/checkout']");
    // Address details
    private final By country=By.name("rcrs-country");
    private final By state=By.name("rcrs-region");
    private final By address1=By.name("address1");
    private final By address2=By.name("address2");
    private final By code=By.name("postalcode");
    private final By phoneumber=By.name("contact");
    private final By cashOnDelievry=By.xpath("//label[text()='Cash on Delivery']");
    private final By confirm=By.xpath("//button[text()='Confirm']");
    private final By returnedProductInCart= By.xpath("//a[@href='/product/undefined']");
//Shipping addres elements
    private final By addressTab=By.xpath("//button[h3/span]");
    private final By countryField =By.xpath("//h4[contains(text(), 'Country :')]");
    private final By stateField =By.xpath("//h4[contains(text(), 'Region : ')]");
    private final By address1Field =By.xpath("//h4[contains(text(), 'Address 1 : ')]");
    private final By address2Field =By.xpath("//h4[contains(text(), 'Address 2 : ')]");
    private final By finalPrice =By.xpath("//h4[contains(text(), 'Total :')]");


    public List<String> getAllProduct() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> items = driver.findElements(returnedProduct);
        List<String> textList = new ArrayList<>();
        for (WebElement item : items) {
            textList.add(item.getText());
        }
        return  textList;
    }


    public List<String> getAllProductINCart() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> items = driver.findElements(returnedProductInCart);
        List<String> textList = new ArrayList<>();
        for (WebElement item : items) {
            textList.add(item.getText());
        }
        return  textList;
    }


    public void clickOnKeybardproduct() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(keybardproduct).click();
    }
    public String getKeybardgetproductName() throws InterruptedException {
        Thread.sleep(2000);
        return  driver.findElement(keybardproductName).getText();
    }
    public String getKeybardgetproductPrice() throws InterruptedException {
        Thread.sleep(2000);
        return  driver.findElement(keybardproductPrice).getText();
    }

    public void clickOnKeyboardCategory() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(keyboardCategory).click();
    }
    public void clickOnApply() throws InterruptedException {
        Thread.sleep(2000);
       driver.findElement(apply).click();
    }

    public void clickOnCart() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(cart).click();
    }
    public String getEmptyCartText() throws InterruptedException {
        Thread.sleep(2000);
        return  driver.findElement(cartEmpty).getText();
    }

    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(3000);
         driver.findElement(addToCart).click();
    }
    public int getItemsCount() {
        List<WebElement> items = driver.findElements(cartItems);
        return items.size();
    }
    public void getToastMessage(){
        driver.findElement(toastMessage).isDisplayed();
    }

    public void clickProductTap() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(productTap).click();
    }

    public void clickLaptopProduct(){
        driver.findElement(laptopProduct).click();
    }

    public void clickLaptopCategory(){
        driver.findElement(laptopCategory).click();
    }


    public void selectLaptopProductName(String product_name) throws InterruptedException {
        Thread.sleep(100);
        driver.findElement(By.xpath(xpathForLapTopProductName)).click();
    }

    public String getTotalPrice() throws InterruptedException {
        Thread.sleep(2000);
     return    driver.findElement(totalPrice).getText();
    }

    public void clickOnCheckout() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(checkOut).click();
    }

    //Set address form
    public void setCountry (String cntry) throws InterruptedException {
        Thread.sleep(6000);
        driver.findElement(country);
        Select select = new Select(driver.findElement(country));
        select.selectByVisibleText(cntry);
    }
    public void setState(String region) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(state);
        Select select = new Select(driver.findElement(state));
        select.selectByVisibleText(region);
    }

    public void setAdress1(String ad1) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(address1).sendKeys(ad1);
    }
    public void setAdress2(String ad2) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(address2).sendKeys(ad2);
    }
    public void setCode(String cde) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(code).sendKeys(cde);
    }
    public void setPhone(String number) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(phoneumber).sendKeys(number);
    }
    public void selectCashOnDlvry() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(cashOnDelievry).click();
    }
    public void clickConfirm() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(confirm).click();
    }

    //Shipping address elements getter

    public void clickOnAddressTab() throws InterruptedException {
        Thread.sleep(10000);
     driver.findElement(addressTab).click();}

    public String getCountry() throws InterruptedException {
       return driver.findElement(countryField).getText();}

    public String getState() {
        return driver.findElement(stateField).getText();}

    public String getaddress1() {
        return driver.findElement(address1Field).getText();}

    public String getaddress2() {
        return driver.findElement(address2Field).getText();}

    public String getFinalPrice() {
        return driver.findElement(finalPrice).getText();}

}

