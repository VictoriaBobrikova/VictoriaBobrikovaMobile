package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJsonFileData {

    public static Map<String, String> readJson(String filePath) {
        Map<String, String> map = new HashMap<>();

        try {
            ObjectMapper mapper = new ObjectMapper();
            FileInputStream fis = new FileInputStream(filePath);

            map = mapper.readValue(fis,
                    new TypeReference<HashMap<String, String>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
