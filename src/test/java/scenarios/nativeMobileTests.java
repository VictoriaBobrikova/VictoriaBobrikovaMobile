package scenarios;

import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import setup.BaseTest;

public class nativeMobileTests extends BaseTest {

    @Test(groups = {"native"}, description = "This simple test just click on the Sign In button")
    public void simpleNativeTest() throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        getPo().getWelement("signInButton").click();
        System.out.println("Simplest Android native test done");
    }

    @Parameters({"name","password","email"})
    @Test(groups = {"native"}, description = "register new account and sign in test")
    public void registerAndSignInTest(String name, String password, String email) throws IllegalAccessException, NoSuchFieldException, InstantiationException {
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
}