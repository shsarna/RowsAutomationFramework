package pages;

import locators.HomePageElements;
import locators.RetweetsTrackerElements;

public class RetweetsTrackerPage extends BasePage{

    public String getPageTitle(){
        return getElements.findWebElement("css", RetweetsTrackerElements.pageTitle).getText();
    }

    public String getSharedPageTitle(){
        return getElements.findWebElement("css", RetweetsTrackerElements.sharedRetweetTrackerPage).getText();
    }
    public void clickUseTemplateButton(){
        getElements.findWebElement("css", RetweetsTrackerElements.useTemplateButton).click();
    }

    public void clickCreateSpreadsheetButton(){
        getElements.findWebElement("css", RetweetsTrackerElements.createSpreadsheetButton).click();
    }

    public void clickShareButton(){
        getElements.findWebElement("css", RetweetsTrackerElements.shareButton).click();
    }

    public void gotoHomePage(){
        getElements.findWebElement("css", RetweetsTrackerElements.logoLink).click();
    }
}
