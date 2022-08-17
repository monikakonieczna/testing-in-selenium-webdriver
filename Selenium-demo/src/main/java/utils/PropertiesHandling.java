package utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesHandling {
    static String projectPath = System.getProperty("user.dir");
    static String propertiesFilePath = "/src/test/java/config/config.properties/";
    static String browser;

    public static String getBrowser() {
        getProperties();
        return browser;
    }

    public static void getProperties() {
        try {
            Properties properties = new Properties();
            InputStream inputStream = new FileInputStream(projectPath + propertiesFilePath);
            properties.load(inputStream);
            browser  = properties.getProperty("browser");
            System.out.println(browser);

        } catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }

    }
}
