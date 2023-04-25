import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class AssignmentTest extends BaseTest {

    public void signIn(){
        landingPage.clickSignInButton();
        signInPage.enterCredentialsAndSignIn(username,password);
    }

    @Test
    public void pasteCopiedUrlInNewTab(){
        signIn();
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
        seleniumUtils.openNewTab(driver);
        seleniumUtils.switchToLastTab(driver);
        driver.get(copiedUrl);
        Assert.assertEquals(retweetsTrackerPage.getSharedPageTitle(),"Retweets tracker",
                "Failed!!!: User is Not on Retweets tracker Page");
    }

    @Test
    public void pasteCopiedUrlInTableCell(){
        signIn();
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
        String copiedUrl =  seleniumUtils.pasteCopiedClipboardText();
        shareOverlayPage.closeShareOverlay();
        retweetsTrackerPage.clickRowsLogoButtonAndNavigateToHomePage();
        homePage.clickCreateSpreadsheetButton();
        spreadsheetPage.selectInputFieldOptionFromInsertDropDownButton();
        seleniumUtils.switchToActiveElement(driver).sendKeys(copiedUrl+Keys.ENTER);
        String spreadSheetName = spreadsheetPage.getSpreadSheetName();
        spreadsheetPage.clickRowsLogoButtonAndNavigateToHomePage();
        homePage.openSpreadSheetByName(spreadSheetName);
        Assert.assertEquals(spreadsheetPage.getTextOfRow(),copiedUrl, "Failed!!!: Copied url didn't match");
    }
}
