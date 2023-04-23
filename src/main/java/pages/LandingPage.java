package pages;


import locators.LandingPageElements;

public class LandingPage extends BasePage {



    public void clickSignInButton(){
        getElements.findWebElement("xpath", LandingPageElements.signInButton ).click();
    }

    public void clickSignUpButton(){
        getElements.findWebElement("xpath", LandingPageElements.signUpButton ).click();
    }
}
