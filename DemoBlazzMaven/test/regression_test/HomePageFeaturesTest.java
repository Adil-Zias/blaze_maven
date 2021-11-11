package com.DemoBlazzMaven.test.regression_test;

import com.DemoBlazzMaven.base.BaseClass;
import com.DemoBlazzMaven.page.MainPage;
import com.DemoBlazzMaven.util.Common;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageFeaturesTest extends BaseClass {
    MainPage mainPage;


    @Test
    public void slideSwitchWithInFixedTime(){
        mainPage = new MainPage(driver);
        int size = mainPage.getSlideImages().size();
        for (int i = 1; i < size; i++){
            try {
                Common.waitUntilVisible(mainPage.getSlideImages().get(i));
                Assert.assertTrue(mainPage.getSlideImages().get(i).isDisplayed());
            }catch (Exception e){
                System.out.println("times out");
            }
        }
    }

    @Test
    public void itemsShouldChangedWhenCategoriesClicked(){
        mainPage = new MainPage(driver);
        for (int i = 2; i < mainPage.getCategories().size(); i++){
            int prevSize = mainPage.getItemsContainer().size();
            mainPage.getCategories().get(i).click();
            Common.waitSecond(1);
            Assert.assertNotEquals(prevSize, mainPage.getItemsContainer().size(),prevSize);
        }
    }
}
