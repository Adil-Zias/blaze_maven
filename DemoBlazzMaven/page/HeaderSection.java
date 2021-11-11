package com.DemoBlazzMaven.page;

import com.DemoBlazzMaven.util.Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderSection {
    @FindBy(id = "cartur")
    private WebElement cartButton;

    @FindBy(id = "signin2")
    private WebElement signUpLink;

    @FindBy(css = "#navbarExample > ul > li:nth-child(2) > a")
    private WebElement contactUsLink;


    //sign-up
    @FindBy(id = "sign-username")
    private WebElement userNameInout;

    @FindBy(id = "sign-password")
    private WebElement userPassword;

    @FindBy(css = "#signInModal > div > div > div.modal-footer > button.btn.btn-primary")
    private WebElement submitButton;

    //contactUs
    @FindBy(id = "recipient-email")
    private WebElement contactEmail;

    @FindBy(id = "recipient-name")
    private WebElement contactName;

    @FindBy(id = "message-text")
    private WebElement messageBox;

    @FindBy(css = "#exampleModal > div > div > div.modal-footer > button.btn.btn-primary")
    private WebElement messageSentButton;


    public HeaderSection(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //links
    public WebElement getCartButton() {
        return cartButton;
    }

    public WebElement getSignUpLink() {
        return signUpLink;
    }

    public WebElement getContactUsLink() {
        return contactUsLink;
    }


    //sign-up
    public WebElement getUserNameInout() {
        return userNameInout;
    }

    public WebElement getUserPassword() {
        return userPassword;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    //contact
    public WebElement getContactEmail() {
        return contactEmail;
    }

    public WebElement getContactName() {
        return contactName;
    }

    public WebElement getMessageBox() {
        return messageBox;
    }

    public WebElement getMessageSentButton() {
        return messageSentButton;
    }

    public void clickCartButton(){
        getCartButton().click();
        Common.waitSecond(1);
    }

    public void clicksignUpLink(){
        getSignUpLink().click();
        Common.waitSecond(1);
    }


    public void signUp(String username, String password){
        getUserNameInout().sendKeys(username);
        getUserPassword().sendKeys(password);
        getSubmitButton().click();
        Common.waitSecond(1);

    }

    public void clickContactUs(){
        getContactUsLink().click();
        Common.waitSecond(1);
    }

    public void sendMessage(String contactEmail, String contactName, String messages){
        getContactEmail().sendKeys(contactEmail);
        getContactName().sendKeys(contactName);
        getMessageBox().sendKeys(messages);
        getMessageSentButton().click();
        Common.waitSecond(1);
    }

}
