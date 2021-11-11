package com.DemoBlazzMaven.page;

import com.DemoBlazzMaven.base.BaseClass;
import com.DemoBlazzMaven.util.Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

    @FindBy(css = "#page-wrapper > div > div.col-lg-1 > button")
    private WebElement placeOrderBUtton;

    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "country")
    private WebElement countryInput;

    @FindBy(id = "city")
    private WebElement cityInput;

    @FindBy(id = "card")
    private WebElement cardInput;

    @FindBy(id = "month")
    private WebElement monthInput;

    @FindBy(id = "year")
    private  WebElement yearInput;

    @FindBy(css = "#orderModal > div > div > div.modal-footer > button.btn.btn-primary")
    private WebElement purchaseBUtton;

    @FindBy(css = "body > div.sweet-alert.showSweetAlert.visible > h2")
    private WebElement thankYouMeassage;

    @FindBy(css = "body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button")
    private WebElement confirmButton;


    public ShoppingCartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getPlaceOrderBUtton() {
        return placeOrderBUtton;
    }

    public WebElement getNameInput() {
        return nameInput;
    }

    public WebElement getCountryInput() {
        return countryInput;
    }

    public WebElement getCityInput() {
        return cityInput;
    }

    public WebElement getCardInput() {
        return cardInput;
    }

    public WebElement getMonthInput() {
        return monthInput;
    }

    public WebElement getYearInput() {
        return yearInput;
    }

    public WebElement getPurchaseBUtton() {
        return purchaseBUtton;
    }

    public WebElement getThankYouMeassage() {
        return thankYouMeassage;
    }

    public WebElement getConfirmButton() {
        return confirmButton;
    }

    public void PlaceOrder(){
        getPlaceOrderBUtton().click();
        Common.waitUntilVisible(getNameInput());
        getNameInput().sendKeys("adil");
        getCountryInput().sendKeys("usa");
        getCityInput().sendKeys("ca");
        getCardInput().sendKeys("123456");
        getMonthInput().sendKeys("05");
        getYearInput().sendKeys("2020");
        getPurchaseBUtton().click();
        Common.waitUntilVisible(getThankYouMeassage());
    }

}
