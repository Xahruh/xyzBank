package com.xyzbank.testSteps;

import com.xyzbank.pageObjects.LoginPage;
import com.xyzbank.pageObjects.ManagerPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import static com.xyzbank.base.TestBase.driver;

public class ManageSteps {

    LoginPage loginPage = new LoginPage();
    ManagerPage managerPage = new ManagerPage();

    String firstname;
    String lastname;
    String postcode;

    @And("add a customer with valid account")
    public void add_a_customer_with_valid_account() {
        loginPage.loginAsBankManager();
        managerPage.clickAddCustomer();
    }


    @Given("create a customer with following data")
    public void create_a_customer_with_following_data(DataTable dataTable) {
        firstname = dataTable.cell(1, 0);
        lastname = dataTable.cell(1, 1);
        postcode = dataTable.cell(1, 2);
        managerPage.fillOutCustomerInfo(firstname, lastname, postcode);
    }


    @Then("verify new customer is added")
    public void verify_new_customer_is_added() {
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        pageSource.contains(firstname);

    }
}
