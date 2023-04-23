package pages;

import locators.TemplatesPageElements;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TemplatesPage extends BasePage{

    public void clickIntegrationsDropDownButton(){
        getElements.findWebElement("xpath", TemplatesPageElements.integrationDropDownButton).click();
    }

    public String getIntegrationSelectedValue(){
        return getElements.findWebElement("css",TemplatesPageElements.integrationBox).getAttribute("placeholder");
    }

    private List<WebElement> getListOfElementsOfIntegrations(){
        return getElements.findListOfWebElements("xpath",TemplatesPageElements.integrationsList);
    }

    public void selectIntegration(String integrationName){
        getElements.findWebElement("xpath","//span[text()='"+integrationName+"']").click();
    }

    private List<WebElement> getListOfElementsOfTemplates(){
        return getElements.findListOfWebElements("css",TemplatesPageElements.templatesList);
    }

    public void clickLastElementOfTemplates(){
        getListOfElementsOfTemplates().get(getListOfElementsOfTemplates().size()-1).click();
    }
}
