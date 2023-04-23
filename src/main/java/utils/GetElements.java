package utils;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import test.BaseTest;

import java.util.List;

public class GetElements {

    public WebElement findWebElement(String locatorType, String locatorValue){
        switch (locatorType)
        {
            case "id":
                return BaseTest.driver.findElement(By.id(locatorValue));
            case "css":
                    return BaseTest.driver.findElement(By.cssSelector(locatorValue));
            case "classname":
                return BaseTest.driver.findElement(By.className(locatorValue));
            case "xpath":
                return BaseTest.driver.findElement(By.xpath(locatorValue));
            case "name":
                return BaseTest.driver.findElement(By.name(locatorValue));
            default:
                return null;
        }
    }


    public List<WebElement>findListOfWebElements(String locatorType, String locatorValue){
        switch (locatorType)
        {
            case "id":
                return BaseTest.driver.findElements(By.id(locatorValue));
            case "css":
                return BaseTest.driver.findElements(By.cssSelector(locatorValue));
            case "classname":
                return BaseTest.driver.findElements(By.className(locatorValue));
            case "xpath":
                return BaseTest.driver.findElements(By.xpath(locatorValue));
            case "name":
                return BaseTest.driver.findElements(By.name(locatorValue));
            default:
                return null;
        }
    }
}
