package locators;

public interface RetweetsTrackerElements {

    public String pageTitle = "div[data-test='pageContainer'] header[data-test='editor-header'] h2";
    String useTemplateButton = "button[data-test='connectButton']";
    String createSpreadsheetButton = "button[data-test='folderPickerDialogConfirm']";
    String menuButton = "div[data-test='element-controls'] button[data-test='itemOptionsMenu']";
    String shareButton = "button[data-test='share-button']";
    String retweetsTitle = "//section[@data-test='pageContainer']/div/div[2]/div[2]//h3[@data-test='elementName']";

    public String sharedRetweetTrackerPage = "section[data-test='pageContainer'] h2";
    public String logoLink = "a[data-test='logoLink']";

}
