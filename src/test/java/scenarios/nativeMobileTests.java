package scenarios;

import dataProvider.NativeDataProvider;
import org.testng.annotations.Test;
import setup.BaseTest;

import java.util.Map;

public class nativeMobileTests extends BaseTest {

//    @Test(groups = {"native"}, description = "This simple test just click on the Sign In button")
//    public void simpleNativeTest() throws IllegalAccessException, NoSuchFieldException, InstantiationException {
//        getPo().getWelement("signInButton").click();
//        System.out.println("Simplest Android native test done");
//    }

    @Test(groups = {"native"}, description = "register new account and sign in test",
            dataProvider = "nativeAppData", dataProviderClass = NativeDataProvider.class)
    public void registerAndSignInTest(Map<String,String> mapData) throws IllegalAccessException, NoSuchFieldException, InstantiationException {

        String email = mapData.get("email");
        String name = mapData.get("name");
        String password = mapData.get("password");

        //register
        getPo().getWelement("registerButton").click();
        System.out.println("Registration page is opened");

        getPo().getWelement("registrationEmailInputField").sendKeys(email);
        getPo().getWelement("registrationUsernameInputField").sendKeys(name);

        getPo().getWelement("registrationPasswordInputField").sendKeys(password);
        getPo().getWelement("confirmPasswordInputField").sendKeys(password);
        System.out.println("Required fields are filled in");
        getPo().getWelement("registerNewAccountButton").click();
        System.out.println("New account is registered");

        getPo().getWelement("emailInputField").sendKeys(email);
        getPo().getWelement("passwordInputField").sendKeys(password);
        getPo().getWelement("signInButton").click();
        System.out.println("Logged in to new account");

        assert getPo().getWelement("budgetActivity").getText().equals("BudgetActivity") : "This is not BudgetActivity page";
    }

    @Test(groups = {"nativeiOS"}, description = "register new account and sign in test for iOS native",
            dataProvider = "nativeAppData", dataProviderClass = NativeDataProvider.class)
    public void registerAndSignInTestiOS(Map<String,String> mapData) throws IllegalAccessException, NoSuchFieldException, InstantiationException {

        String email = mapData.get("email");
        String name = mapData.get("name");

        //register
        getPo().getWelement("registerButton").click();
        System.out.println("Registration page is opened");

        getPo().getWelement("registrationEmailInputField").sendKeys(email);
        getPo().getWelement("registrationUsernameInputField").sendKeys(name);
        getPo().getWelement("registrationPasswordInputField").click();
        getPo().getWelement("registrationPasswordInputField").click();
        getPo().getWelement("confirmPasswordInputField").click();
        getPo().getWelement("confirmPasswordInputField").click();

        getPo().getWelement("switchIos").click();

        System.out.println("Required fields are filled in");
        getPo().getWelement("registerNewAccountButton").click();
        System.out.println("New account is registered");

        getPo().getWelement("emailInputField").sendKeys(email);
        getPo().getWelement("passwordInputField").click();
        getPo().getWelement("passwordInputField").click();
        getPo().getWelement("signInButton").click();
        System.out.println("Logged in to new account");

        assert getPo().getWelement("budgetActivity").getText().equals("BudgetActivity") : "This is not BudgetActivity page";
    }
}