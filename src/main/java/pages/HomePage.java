package pages;

import locators.HomePageElements;
import org.openqa.selenium.WebElement;
import utils.GetElements;

import static utils.BaseTest.driver;

public class HomePage {
    GetElements getElements = new GetElements();

    public String getPageTitle(){
        return getElements.findWebElement(driver, "css",HomePageElements.pageTitle).getText();
    }
    public void clickOnTemplatesOption(){
        getElements.findWebElement(driver,"css", HomePageElements.templatesOption).click();
    }

    public void clickCreateSpreadsheetButton(){
        getElements.findWebElement(driver, "css",HomePageElements.createSpreadsheetButton).click();
    }

    public void openSpreadSheetByName(String name){
        WebElement tableElement = getElements.findWebElement(driver,"css",HomePageElements.appsTable);
        int tableRowsCount = getElements.findListOfWebElements(driver,"xpath",HomePageElements.spreadSheetsNameList).size();
        String rowElement = null;

        for(int i = 0; i < tableRowsCount ; i ++){
            if(getElements.findListOfWebElements(driver,"xpath",HomePageElements.spreadSheetsNameList).get(i).getText().equals(name)){
                getElements.findListOfWebElements(driver,"xpath",HomePageElements.spreadSheetsNameList).get(i).click();
                break;
            }
        }
    }
}
