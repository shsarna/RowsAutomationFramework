package pages;

import locators.RetweetsTrackerElements;
import locators.SpreadsheetPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.GetElements;
import utils.SeleniumUtils;

import static utils.BaseTest.driver;

public class SpreadsheetPage {

    GetElements getElements = new GetElements();

    public void selectInputFieldOptionFromInsertDropDownButton(){
        SeleniumUtils.clickAndWait(driver,getElements.findWebElement(driver,"xpath",SpreadsheetPageElements.insertDropDownButton));
        SeleniumUtils.clickAndWait(driver,getElements.findWebElement(driver,"xpath",SpreadsheetPageElements.inputFieldOption));
    }

    public String getSpreadSheetName(){
        return getElements.findWebElement(driver,"css",SpreadsheetPageElements.spreadSheetName).getText();
    }

    public void clickRowsLogoButtonAndNavigateToHomePage(){
        SeleniumUtils.clickAndWait(driver,getElements.findWebElement(driver,"css", RetweetsTrackerElements.logoLink));
    }

    public String getTextOfRow(){
        return getElements.findWebElement(driver,"css",SpreadsheetPageElements.tableRowWithText).getText();
    }
}
