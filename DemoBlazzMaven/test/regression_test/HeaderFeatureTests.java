package com.DemoBlazzMaven.test.regression_test;

import com.DemoBlazzMaven.base.BaseClass;
import com.DemoBlazzMaven.page.HeaderSection;
import com.DemoBlazzMaven.page.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderFeatureTests extends BaseClass {
    MainPage mainPage;
    HeaderSection headerSection;


    @Test
    public void sendMessageAtContactUs(){
        headerSection = new HeaderSection(driver);
        headerSection.clickContactUs();
        headerSection.sendMessage("aaa@ggg.com", "aaad", "hi lala");
        String alertMessage = driver.switchTo().alert().getText();
        Assert.assertEquals(alertMessage, "Thanks for the message!!");
    }
}
