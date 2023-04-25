package pages;

import locators.SignInPageElements;
import utils.GetElements;

import static utils.BaseTest.driver;

public class SignInPage {
    GetElements getElements = new GetElements();

    public void enterCredentialsAndSignIn(String username, String password){
        getElements.findWebElement(driver,"id", SignInPageElements.emailTextBox).sendKeys(username);
        getElements.findWebElement(driver,"id",SignInPageElements.passwordTextBox).sendKeys(password);
        getElements.findWebElement(driver,"css",SignInPageElements.signInButton).click();
    }
}
