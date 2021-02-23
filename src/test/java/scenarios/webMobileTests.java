package scenarios;

import dataProvider.WebDataProvider;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import setup.BaseTest;

import java.util.Map;

public class webMobileTests extends BaseTest {

//    @Test(groups = {"web"}, description = "Make sure that we've opened IANA homepage")
//    public void simpleWebTest() throws InterruptedException {
//        getDriver().get("http://iana.org"); // open IANA homepage
//
//        // Make sure that page has been loaded completely
//        new WebDriverWait(getDriver(), 10).until(
//                wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
//        );
//
//        // Check IANA homepage title
//        assert ((WebDriver) getDriver()).getTitle().equals("Internet Assigned Numbers Authority") : "This is not IANA homepage";
//
//        // Log that test finished
//        System.out.println("Site opening done");
//    }

    @Test(groups = {"web"}, description = "go to a Google search page and search using keyword",
            dataProvider = "webAppData", dataProviderClass = WebDataProvider.class)
    public void googleSearchWithKeywordEpamTest(Map<String,String> mapData) throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        getDriver().get(mapData.get("url"));
        // Make sure that page has been loaded completely
        new WebDriverWait(getDriver(), 10).until(
                wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
        );
        System.out.println("Site opening done");
        getPo().getWelement("searchLine").sendKeys(mapData.get("keyword"));
        System.out.println("Searching by keyword");
        new WebDriverWait(getDriver(), 10).until(
                wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
        );
        System.out.println("Search page opening done");
        //Make sure that there are some relevant results (non-empty list)
        assert getPo().getWebElements("searchResultsHeadersList").size() > 0;
    }
}
