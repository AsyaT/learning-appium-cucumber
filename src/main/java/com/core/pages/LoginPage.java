package com.core.pages;


import com.core.extension.Button;
import com.core.extension.Label;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {

    @AndroidFindBy(id = "login_button")
    private Button btnSignIn;

    @AndroidFindBy(xpath = "//android.widget")
    private Button btnReturn;

    @AndroidFindBy(id = "toolbar_title_text")
    private Label titleDisplayed;

    @AndroidFindBy(id = "button_google_sign_in")
    private Button btnGoogleSignIn;

    @AndroidFindBy(id = "button_facebook_sign_in")
    private  Button btnFbSignIn;

    @AndroidFindBy(id = "or_log_with_email_text")
    private Label emailTextDisplayed;

    @AndroidFindBy(id = "email_sign_in")
    private  Button emailField;

    @AndroidFindBy(id = "password_sign_in")
    private Button passField;

    @AndroidFindBy(xpath = "//android.widget.button[@text='Login' and @index='2']")
    private Button btnLogin;

    @AndroidFindBy(id = "terms_and_Conditions")
    private Label termsAndCondDisplayed;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index='4']")
    private Button btnForgPass;

    @AndroidFindBy(id = "button_new_user_creare_account")
    private  Button createAcc;

    public void clickSignIn() {

        btnSignIn.click();
    }

    public void returnButton() {

        btnReturn.isDisplayed();
    }

    public String getTitle() {
        return Label.getText(titleDisplayed);
    }

    public void getGoogleButton() {
        btnGoogleSignIn.isDisplayed();
    }

    public void getFbButton() {
        btnFbSignIn.isDisplayed();
    }

    public String emailText() {
        return Label.getText(emailTextDisplayed);
    }

    public void setEmail(String email) {
        emailField.sendKeys(email);
    }

    public void setPassword(String password) {
        passField.sendKeys(password);
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public String termsAndConditions() {
        return Label.getText(termsAndCondDisplayed);
    }

    public void getForgotPass() {
        btnForgPass.isDisplayed();
    }

    public void getCreateAcc() {
        createAcc.isDisplayed();
    }
}
