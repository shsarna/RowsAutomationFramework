package test;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class AssignmentTest extends BaseTest{

    @Parameters({"username", "password"})
    @BeforeMethod
    public void signIn(String username, String password){
        landingPage.clickSignInButton();
        signInPage.enterCredentialsAndSignIn(username,password);
    }

    @Test
    public void pasteCopiedUrlInNewTab(){
        Assert.assertEquals(homePage.getPageTitle(),"Home",
                "Failed!!!: User is Not on Home Page");
        homePage.clickOnTemplatesOption();
        templatesPage.clickIntegrationsDropDownButton();
        String integrationValue = "Twitter";
        templatesPage.selectIntegration(integrationValue);
        Assert.assertEquals(templatesPage.getIntegrationSelectedValue(),integrationValue,
                "Failed!!!: "+integrationValue+" is Not selected");
        templatesPage.clickLastElementOfTemplates();
        retweetsTrackerPage.clickUseTemplateButton();
        retweetsTrackerPage.clickCreateSpreadsheetButton();
        retweetsTrackerPage.clickShareButton();
        shareOverlayPage.enableSharePrivatelyToggle();
        shareOverlayPage.copyLink();
        String copiedUrl = seleniumUtils.pasteCopiedClipboardText();
        driver=seleniumUtils.openNewTab(driver);
        driver=seleniumUtils.switchToLastTab(driver);
        driver.get(copiedUrl);
        Assert.assertEquals(retweetsTrackerPage.getSharedPageTitle(),"Retweets tracker",
                "Failed!!!: User is Not on Retweets tracker Page");

    }

    @Test
    public void pasteCopiedUrlInTableCell(){
        Assert.assertEquals(homePage.getPageTitle(),"Home",
                "Failed!!!: User is Not on Home Page");
        homePage.clickOnTemplatesOption();
        templatesPage.clickIntegrationsDropDownButton();
        String integrationValue = "Twitter";
        templatesPage.selectIntegration(integrationValue);
        Assert.assertEquals(templatesPage.getIntegrationSelectedValue(),integrationValue,
                "Failed!!!: "+integrationValue+" is Not selected");
        templatesPage.clickLastElementOfTemplates();
        retweetsTrackerPage.clickUseTemplateButton();
        retweetsTrackerPage.clickCreateSpreadsheetButton();
        retweetsTrackerPage.clickShareButton();
        shareOverlayPage.enableSharePrivatelyToggle();
        shareOverlayPage.copyLink();
        String copiedUrl = seleniumUtils.pasteCopiedClipboardText();
        shareOverlayPage.closeShareOverlay();
    }
}
