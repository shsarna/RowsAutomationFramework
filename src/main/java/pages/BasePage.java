package pages;

import locators.HomePageElements;
import locators.LandingPageElements;
import locators.SignInPageElements;
import locators.TemplatesPageElements;
import org.openqa.selenium.interactions.Actions;
import utils.GetElements;
import utils.SeleniumUtils;

public class BasePage {
    GetElements getElements;
    BasePage(){
        initialiseElementClasses();
    }

    private void initialiseElementClasses(){

        getElements = new GetElements();

    }
}
