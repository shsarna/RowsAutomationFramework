package locators;

public interface TemplatesPageElements {
    String integrationDropDownButton = "//input[@placeholder='All Integrations']/../i";
    String integrationBox = "input[class*='combobox__input']";
    String integrationsList = "//input[@placeholder='All Integrations']/../following-sibling::div//div[@role='checkbox']//span";
    String templatesList = "a[data-test='card']";
}
