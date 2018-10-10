package com.business;

import com.core.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends BaseTest {
    private LoginPage loginPage = new LoginPage();

    @When("^I click Login button$")
    public void iClickLoginButton()  {
        loginPage.clickSignIn();
    }

    @And("^I fill in Email with \"([^\"]*)\"$")
    public void iFillInEmailWith(String email) {
        loginPage.setPassword(email);
        log.info("Email is entered");

    }

    @And("^A fill in Password with \"([^\"]*)\"$")
    public void aFillInPasswordWith(String password) {
        loginPage.setPassword(password);
        log.info("Password is entered");
    }

    @Then("^I choose Login button$")
    public void iChooseLoginButton() {
        loginPage.clickLogin();

    }


}




