package com.xyzbank.pageObjects;

import com.xyzbank.base.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.xyzbank.base.TestBase.driver;

public class ManagerPage extends PageObject {

    public ManagerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@ng-click='addCust()']")
    WebElement addCustomerButton;

    @FindBy(css = "[ng-model='fName']")
    WebElement newCustomerFirstName_textBox;

    @FindBy(css = "[ng-model='lName']")
    WebElement newCustomerLastName_textBox;

    @FindBy(css = "[ng-model='postCd']")
    WebElement newCustomerPostCode_textBox;

    @FindBy(css = "[type='submit']")
    WebElement addCustomerSubmitButton;

    public void clickAddCustomer() {

        Actions actions = new Actions(driver);
        actions.moveToElement(addCustomerButton).click().build().perform();
        waitSecond(1);

    }

    public void fillOutCustomerInfo(String fName, String lName, String zip) {
        newCustomerFirstName_textBox.sendKeys(fName);
        newCustomerLastName_textBox.sendKeys(lName);
        newCustomerPostCode_textBox.sendKeys(zip);
        addCustomerSubmitButton.click();
        driver.switchTo().alert().accept();
        waitSecond(1);
    }

}
