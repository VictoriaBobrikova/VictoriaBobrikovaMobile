package scenarios;

import dataProvider.MyDataProvider;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import setup.BaseTest;

import java.util.Map;

public class webMobileTests extends BaseTest {

    @Test(groups = {"web"}, description = "go to a Google search page and search using keyword",
            dataProvider = "myData", dataProviderClass = MyDataProvider.class)
    public void googleSearchWithKeywordEpamTest(Map<String,String> mapData) throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        getDriver().get(mapData.get("url"));
        // Make sure that page has been loaded completely
        new WebDriverWait(getDriver(), 10).until(
                wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
        );
        System.out.println("Site opening done");
        getPo().getWelement("searchLine").sendKeys(mapData.get("keyword"));
        getPo().getWelement("searchLine").sendKeys(Keys.ENTER);
        System.out.println("Searching by keyword");
        new WebDriverWait(getDriver(), 10).until(
                wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
        );
        System.out.println("Search page opening done");
        //Make sure that there are some relevant results (non-empty list)
        assert getPo().getWebElements("searchResultsHeadersList").size() > 0;
    }
}
