package pages;

import locators.HomePageElements;

public class HomePage extends BasePage{

    public String getPageTitle(){
        return getElements.findWebElement("css",HomePageElements.pageTitle).getText();
    }
    public void clickOnTemplatesOption(){
        getElements.findWebElement("css", HomePageElements.templatesOption).click();
    }

    public void clickCreateSpreadsheetButton(){
        getElements.findWebElement("css",HomePageElements.createSpreadsheetButton).click();
    }
}
