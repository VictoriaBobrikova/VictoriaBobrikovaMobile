package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WebPageObject {

    @AndroidFindBy(className = "android.widget.EditText")
    WebElement searchLine;
    @AndroidFindBy(className = "android.widget.Button")
    WebElement searchButton;

    public WebPageObject(AppiumDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);

    }

}
