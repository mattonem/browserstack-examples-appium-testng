package com.browserstack.app.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends BasePage {
    @AndroidFindBy(accessibility = "UserName")
    @iOSXCUITFindBy(accessibility = "UserName")
    private MobileElement usernameInput;

    @AndroidFindBy(accessibility = "Password")
    @iOSXCUITFindBy(accessibility = "Password")
    private MobileElement passwordInput;

    @AndroidFindBy(accessibility = "LoginButton")
    @iOSXCUITFindBy(accessibility = "LoginButton")
    private MobileElement logInButton;

    @AndroidFindBy(accessibility = "StatusLabel")
    @iOSXCUITFindBy(accessibility = "StatusLabel")
    private MobileElement labelLoginStatus;

    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    public HomePage loginWith(String username, String password) {
        usernameInput.click();
        usernameInput.setValue(username);
 
        passwordInput.click();
        passwordInput.setValue(password);
        logInButton.click();
        return new HomePage(driver);
    }
}
