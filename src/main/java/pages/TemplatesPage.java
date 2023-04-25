package pages;

import locators.TemplatesPageElements;
import org.openqa.selenium.WebElement;
import utils.GetElements;

import java.util.List;

import static utils.BaseTest.driver;

public class TemplatesPage {
    GetElements getElements = new GetElements();

    public void clickIntegrationsDropDownButton(){
        getElements.findWebElement(driver,"xpath", TemplatesPageElements.integrationDropDownButton).click();
    }

    public String getIntegrationSelectedValue(){
        return getElements.findWebElement(driver,"css",TemplatesPageElements.integrationBox).getAttribute("placeholder");
    }

    private List<WebElement> getListOfElementsOfIntegrations(){
        return getElements.findListOfWebElements(driver,"xpath",TemplatesPageElements.integrationsList);
    }

    public void selectIntegration(String integrationName){
        getElements.findWebElement(driver,"xpath","//span[text()='"+integrationName+"']").click();
    }

    private List<WebElement> getListOfElementsOfTemplates(){
        return getElements.findListOfWebElements(driver,"css",TemplatesPageElements.templatesList);
    }

    public void clickLastElementOfTemplates(){
        getListOfElementsOfTemplates().get(getListOfElementsOfTemplates().size()-1).click();
    }
}
