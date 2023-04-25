package locators;

public interface SpreadsheetPageElements {

    String logoLink = "a[data-test='logoLink']";
    String insertDropDownButton = "//button[@data-test='fbInsert']";
    String inputFieldOption= "//ul[@role='menu']/li[6]";
    String spreadSheetName = "h1[data-test='appNameLabel']";
    String tableRowWithText = "textarea[placeholder='Type here...'][rows='1']";
}
