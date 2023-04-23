package pages;

import locators.RetweetsTrackerElements;
import locators.ShareOverlayElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class ShareOverlayPage extends BasePage{

    public void enableSharePrivatelyToggle(){
        getElements.findWebElement("css", ShareOverlayElements.shareWithLinkToggle).click();
    }

    public void copyLink() {
        getElements.findWebElement("css", ShareOverlayElements.copyLinkButton).click();
    }

    public void closeShareOverlay(){
        getElements.findWebElement("css", ShareOverlayElements.closeOverlayButton).click();
    }
}
