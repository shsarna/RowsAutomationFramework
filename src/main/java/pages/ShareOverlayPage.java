package pages;

import locators.ShareOverlayElements;
import utils.GetElements;
import utils.SeleniumUtils;

import static utils.BaseTest.driver;

public class ShareOverlayPage {
    GetElements getElements = new GetElements();

    public void enableSharePrivatelyToggle(){
        getElements.findWebElement(driver,"css", ShareOverlayElements.shareWithLinkToggle).click();
    }

    public void copyLink() {
        getElements.findWebElement(driver,"css", ShareOverlayElements.copyLinkButton).click();
    }

    public void closeShareOverlay(){
        SeleniumUtils.clickAndWait(driver,getElements.findWebElement(driver,"css", ShareOverlayElements.closeOverlayButton));
    }
}
