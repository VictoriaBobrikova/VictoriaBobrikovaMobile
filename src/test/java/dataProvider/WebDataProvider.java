package dataProvider;

import org.testng.annotations.DataProvider;
import utils.ReadJsonFileData;

import java.util.Map;

public class WebDataProvider {

    @DataProvider
    public Object[][] webAppData() {
        String filePath = "src/test/resources/data/webData.json";
        Map<String, String> map = ReadJsonFileData.readJson(filePath);
        return new Object[][] {{map}};
    }
}
