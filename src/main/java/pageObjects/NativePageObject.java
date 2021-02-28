package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NativePageObject  {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='user@example.com']")
    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_email")
    WebElement emailInputField;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Required']")
    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_pwd")
    WebElement passwordInputField;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sign In']")
    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/email_sign_in_button")
    WebElement signInButton;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Register new account']")
    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_button")
    WebElement registerButton;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='user@example.com']")
    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_email")
    WebElement registrationEmailInputField;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='TimApple']")
    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_username")
    WebElement registrationUsernameInputField;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Required']")
    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_password")
    WebElement registrationPasswordInputField;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Repeat please']")
    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_confirm_password")
    WebElement confirmPasswordInputField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch[@label='I read agreaments and agree wit it']")
    WebElement switchIos;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Register new account']")
    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_new_account_button")
    WebElement registerNewAccountButton;
    @AndroidFindBy(xpath = "//*[contains(@text, 'BudgetActivity')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Budget']")
    WebElement budgetActivity;

    public NativePageObject(AppiumDriver appiumDriver) {
        PageFactory.initElements( new AppiumFieldDecorator(appiumDriver), this);
    }
}