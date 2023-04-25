package locators;

public interface HomePageElements {
    String pageTitle = "div[data-test='workspacePageContent'] h1";
    String templatesOption = "a[href='/templates']";
    String integrationOption = "a[href='/integrations']";
    String communityOption = "a[href='/community']";
    String createSpreadsheetButton = "button[data-test='createApp-headerButton']";
    String appsTable = "table[data-test='appsTable']";
    String appsTableRows = "table[data-test='appsTable'] tbody tr";
    String spreadSheetsNameList = "//table[@data-test='appsTable']/tbody/tr/td[3]";
}
