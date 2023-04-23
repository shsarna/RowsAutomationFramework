package locators;

public interface TemplatesPageElements {
    public String integrationDropDownButton = "//input[@placeholder='All Integrations']/../i";
    public String integrationBox = "input[class*='combobox__input']";
    public String integrationsList = "//input[@placeholder='All Integrations']/../following-sibling::div//div[@role='checkbox']//span";
    public String integrationsNameList = "//input[@placeholder='All Integrations']/../following-sibling::div//div[@role='checkbox']/div";
    public String templatesList = "a[data-test='card']";
}
