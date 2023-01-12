package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {

    private static String readProperty(String propertyName) throws IOException {
        InputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties.getProperty(propertyName);
    }

    public static String getBrowserName() throws IOException {
        return readProperty("browser");
    }
}
