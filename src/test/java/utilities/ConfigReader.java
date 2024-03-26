package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;

    static{
        String path = "configuration.properties";

        try {
            // fis reads the file path of the configuration.properties file
            FileInputStream fis = new FileInputStream(path);

            properties = new Properties();
            properties.load(fis);

            fis.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
