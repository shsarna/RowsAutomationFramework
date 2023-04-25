package pages;

import locators.RetweetsTrackerElements;
import utils.GetElements;
import utils.SeleniumUtils;

import static utils.BaseTest.driver;

public class RetweetsTrackerPage {
    GetElements getElements = new GetElements();
    SeleniumUtils seleniumUtils = new SeleniumUtils();


    public String getPageTitle(){
        return getElements.findWebElement(driver,"css", RetweetsTrackerElements.pageTitle).getText();
    }

    public String getSharedPageTitle(){
        return getElements.findWebElement(driver,"css", RetweetsTrackerElements.sharedRetweetTrackerPage).getText();
    }
    public void clickUseTemplateButton(){
        getElements.findWebElement(driver,"css", RetweetsTrackerElements.useTemplateButton).click();
    }

    public void clickCreateSpreadsheetButton(){
        getElements.findWebElement(driver,"css", RetweetsTrackerElements.createSpreadsheetButton).click();
    }

    public void clickShareButton(){
        getElements.findWebElement(driver,"css", RetweetsTrackerElements.shareButton).click();
    }

    public void clickRowsLogoButtonAndNavigateToHomePage(){
        seleniumUtils.waitForVisibilityOfElement(driver, getElements.findWebElement(driver,"css", RetweetsTrackerElements.logoLink));
        getElements.findWebElement(driver,"css", RetweetsTrackerElements.logoLink).click();
    }
}
