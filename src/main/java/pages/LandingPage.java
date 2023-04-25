package pages;


import locators.LandingPageElements;
import utils.GetElements;

import static utils.BaseTest.driver;

public class LandingPage {

    GetElements getElements = new GetElements();

    public void clickSignInButton(){
        getElements.findWebElement(driver,"xpath", LandingPageElements.signInButton ).click();
    }

    public void clickSignUpButton(){
        getElements.findWebElement(driver,"xpath", LandingPageElements.signUpButton ).click();
    }
}
