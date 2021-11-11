package com.DemoBlazzMaven.page;

import com.DemoBlazzMaven.util.Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {
    @FindBy(xpath = "//*[@id='tbodyid']/div[1]/div/a/img")
    private WebElement firstItem;

    @FindBy(css = "#contcar > div > div > div img")
    private List<WebElement> slideImages;

    //mid-section
    @FindBy(css = "#contcont > div > div.col-lg-3 > div a")
    private List<WebElement> categories;

    @FindBy(css = "#tbodyid > div")
    private List<WebElement> itemsContainer;


    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getSlideImages() {
        return slideImages;
    }

    //mid_section
    public WebElement getFirstItem() {
        return firstItem;
    }

    public List<WebElement> getCategories() {
        return categories;
    }

    public List<WebElement> getItemsContainer() {
        return itemsContainer;
    }

    public void clickFirstItem(){
        getFirstItem().click();
        Common.waitSecond(1);
    }




}
