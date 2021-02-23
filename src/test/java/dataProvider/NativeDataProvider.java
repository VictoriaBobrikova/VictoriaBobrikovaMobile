package dataProvider;

import org.testng.annotations.DataProvider;
import utils.ReadJsonFileData;

import java.util.Map;

public class NativeDataProvider {

    @DataProvider
    public Object[][] nativeAppData() {
        String filePath = "src/test/resources/data/nativeData.json";
        Map<String, String> map = ReadJsonFileData.readJson(filePath);
        return new Object[][] {{map}};
    }
}
