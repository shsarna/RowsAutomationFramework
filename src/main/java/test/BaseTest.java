package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.*;
import utils.Constants;
import utils.SeleniumUtils;


import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    BaseTest(){
        initialisePageClasses();
    }
    public static WebDriver driver;
    public SeleniumUtils seleniumUtils;

    //pageClasses
    public LandingPage landingPage;
    public HomePage homePage;
    public SignInPage signInPage;
    public TemplatesPage templatesPage;
    public RetweetsTrackerPage retweetsTrackerPage;
    public ShareOverlayPage shareOverlayPage;
    String operatingSystem;
    String userDirectory = System.getProperty("user.dir");

    @BeforeTest
    public void beforeTest(){
        operatingSystem = System.getProperty("os.name");
        System.out.println("Current operating system is "+operatingSystem);
    }

    @BeforeMethod
    @Parameters("browser")
    public void beforeMethod(String browser){

        driverSetUp(browser);
        driver.manage().window().maximize();
        driver.get(Constants.url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void afterMethod(ITestResult itestResult){

        driver.quit();
    }

    @AfterTest
    public void afterTest(){}

    public void driverSetUp(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            if(operatingSystem.contains("Mac")) {
                System.setProperty(
                        "webdriver.chrome.driver",
                        userDirectory + File.separator + "drivers" + File.separator + "chromedriver_mac64");
            } else {
                System.setProperty(
                        "webdriver.chrome.driver",
                        userDirectory + File.separator + "drivers" + File.separator + "chromedriver_win32");
            }
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("FF")){

        } else if(browser.equalsIgnoreCase("Safari")){

        }
    }

    private void initialisePageClasses(){
        seleniumUtils = new SeleniumUtils();
        homePage = new HomePage();
        landingPage = new LandingPage();
        signInPage = new SignInPage();
        templatesPage = new TemplatesPage();
        retweetsTrackerPage = new RetweetsTrackerPage();
        shareOverlayPage = new ShareOverlayPage();
    }
}
