package pages;

import locators.SignInPageElements;

public class SignInPage extends BasePage {

    public void enterCredentialsAndSignIn(String username, String password){
        getElements.findWebElement("id", SignInPageElements.emailTextBox).sendKeys(username);
        getElements.findWebElement("id",SignInPageElements.passwordTextBox).sendKeys(password);
        getElements.findWebElement("css",SignInPageElements.signInButton).click();
    }
}
