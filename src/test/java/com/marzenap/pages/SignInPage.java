package com.marzenap.pages;

import com.marzenap.models.Customer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    private WebDriver driver;

    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@name='login[username]']")
    private WebElement emailInput;
    @FindBy(xpath = "//input[@name='login[password]']")
    private WebElement passwordInput;
    @FindBy(xpath = "//button[@class='action login primary']")
    private WebElement signInButton;

    public SignInPage fillEmail(String email) {
        emailInput.sendKeys(email);
        return this;
    }

    public SignInPage fillPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public PageTopPanel clickSignInButton() {
        signInButton.click();
        return new PageTopPanel(driver);
    }

}
