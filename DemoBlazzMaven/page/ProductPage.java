package com.DemoBlazzMaven.page;

import com.DemoBlazzMaven.base.BaseClass;
import com.DemoBlazzMaven.util.Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    @FindBy(css = "#tbodyid > div.row > div > a")
    public WebElement addToCartButton;

    public ProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public void clickAddToCart(){
        getAddToCartButton().click();
        Common.waitSecond(1);
        BaseClass.driver.switchTo().alert().accept();
    }


}
