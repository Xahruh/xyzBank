package com.xyzbank.testSteps;

import com.xyzbank.base.PageObject;
import com.xyzbank.pageObjects.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.xyzbank.base.TestBase.driver;

public class LoginSteps extends PageObject {

    LoginPage loginPage = new LoginPage();


    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }

    @Given("login with first customer username")
    public void login_with_first_customer_username() throws InterruptedException {
        loginPage.clickLoginButton();
        waitSecond(1);
        loginPage.loginWithFirstUsername();
        waitSecond(1);
    }

    @Then("verify user logged in successfully")
    public void verify_user_logged_in_successfully() {
        loginPage.verifyUserLoggedIn();
    }


    @Given("login as manager")
    public void login_as_manager() {
        loginPage.loginAsBankManager();
    }


    @Then("verify manager logged in successfully")
    public void verify_manager_logged_in_successfully() {
        Assert.assertTrue(driver.findElement(By.cssSelector("[ng-click='addCust()']")).isDisplayed());
    }


}
