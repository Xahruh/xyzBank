package com.xyzbank.pageObjects;

import com.xyzbank.base.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static com.xyzbank.base.TestBase.driver;

public class LoginPage extends PageObject {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[ng-click='customer()']")
    WebElement customerLoginButton;
    @FindBy(id = "userSelect")
    WebElement userSelectDropDown;
    @FindBy(css = "[value='1']")
    WebElement firstUsername;
    @FindBy(css = "[type='submit']")
    WebElement loginSubmitButton;
    @FindBy(css = ".fontBig.ng-binding")
    WebElement loggedInUsernameHeader;

    @FindBy(css = "[ng-click=\"manager()\"]")
    WebElement bankManagerLoginButton;


    public void clickLoginButton() {
        customerLoginButton.click();
    }

    public void loginWithFirstUsername() {
        userSelectDropDown.click();
        waitSecond(1);
        firstUsername.click();
        waitSecond(1);
        loginSubmitButton.click();
        waitSecond(1);
    }

    public void verifyUserLoggedIn() {
        String actualText = loggedInUsernameHeader.getText();
        Assert.assertTrue(actualText.contains("Hermoine Granger"));
    }


    public void loginAsBankManager() {
        bankManagerLoginButton.click();
        waitSecond(3);
    }

}
