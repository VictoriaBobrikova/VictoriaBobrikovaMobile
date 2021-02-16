package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebPageObject {

    @AndroidFindBy(className = "android.widget.EditText")
    WebElement searchLine;
//    @AndroidFindBy(className = "android.widget.Button")
//    WebElement searchButton;
    @AndroidFindBy(xpath = "//span[contains(text(),'EPAM')]")
    List<WebElement> searchResultsHeadersList;

// this locators also don't work
//    @FindBy(xpath = "//input[@name = 'q']")
//    WebElement searchLine;
//    @FindBy(xpath = "//span[contains(text(),'EPAM')]")
//    List<WebElement> searchResultsHeadersList;

    public WebPageObject(AppiumDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);

    }

}
