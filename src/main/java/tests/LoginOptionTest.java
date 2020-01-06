package tests;

import cucumber.api.java.en.When;
import pages.LoginOptionPage;
import runner.TestRunner;

import static tests.PageProvider.getLoginOptionPage;

public class LoginOptionTest {

    @When("^I click customer login button$")
    public void clickCustomerLogin() throws Throwable {
        Thread.sleep(1000);
        getLoginOptionPage().pressCustomerLoginButton();
    }

    @When("^I verify system navigates to customer login page$")
    public void verifyCustomerLoginPage() throws Throwable {
        Thread.sleep(1000);
        getLoginOptionPage().showCheckCustomerLoginPageResult();
    }

}