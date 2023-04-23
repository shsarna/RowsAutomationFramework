package locators;

public interface HomePageElements {
    public String pageTitle = "div[data-test='workspacePageContent'] h1";
    public String templatesOption = "a[href='/templates']";
    public String integrationOption = "a[href='/integrations']";
    public String communityOption = "a[href='/community']";
    public String createSpreadsheetButton = "button[data-test='createApp-headerButton']";
}
