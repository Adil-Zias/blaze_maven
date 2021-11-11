package com.DemoBlazzMaven.test.smoke_test;

import com.DemoBlazzMaven.base.BaseClass;
import com.DemoBlazzMaven.page.HeaderSection;
import com.DemoBlazzMaven.page.MainPage;
import com.DemoBlazzMaven.page.ProductPage;
import com.DemoBlazzMaven.page.ShoppingCartPage;
import com.DemoBlazzMaven.util.Common;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest extends BaseClass {
    MainPage mainPage;
    ProductPage productPage;
    HeaderSection headerSection;
    ShoppingCartPage shoppingCartPage;

    @Test
    public void appLoad_test(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "STORE");
    }

    @Test
    public void placeOrder_test(){
        mainPage = new MainPage(driver);
        productPage = new ProductPage(driver);
        headerSection = new HeaderSection(driver);
        shoppingCartPage = new ShoppingCartPage(driver);
        mainPage.clickFirstItem();
        productPage.clickAddToCart();
        headerSection.clickCartButton();
        shoppingCartPage.PlaceOrder();
        Assert.assertEquals(shoppingCartPage.getThankYouMeassage()
                .getText(), "Thank you for your purchase!");
    }

    @Test
    public void signUp_test(){
        mainPage = new MainPage(driver);
        headerSection = new HeaderSection(driver);
        headerSection.clicksignUpLink();
        headerSection.signUp("wcw5", "445544");
        String alerttext = driver.switchTo().alert().getText();
        Assert.assertEquals(alerttext, "Sign up successful.");
    }



}
