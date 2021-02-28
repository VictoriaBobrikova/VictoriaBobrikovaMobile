package scenarios;

import dataProvider.MyDataProvider;
import org.testng.annotations.Test;
import setup.BaseTest;

import java.util.Map;

public class nativeMobileTests extends BaseTest {

    @Test(groups = {"native"}, description = "register new account and sign in test",
            dataProvider = "myData", dataProviderClass = MyDataProvider.class)
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

        assert getPo().getWelement("budgetActivity").getText().contains("Budget") : "This is not BudgetActivity page";
    }
}