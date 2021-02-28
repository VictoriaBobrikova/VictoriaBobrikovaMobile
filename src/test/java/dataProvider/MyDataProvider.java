package dataProvider;

import org.testng.annotations.DataProvider;
import utils.ReadJsonFileData;

import java.util.Map;

public class MyDataProvider {

    @DataProvider
    public Object[][] myData() {
        String filePath = "src/test/resources/data/data.json";
        Map<String, String> map = ReadJsonFileData.readJson(filePath);
        return new Object[][] {{map}};
    }
}
