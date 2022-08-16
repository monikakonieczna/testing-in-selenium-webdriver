package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser implements DriverFactory {

    @Override
    public WebDriver getDriver() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
        System.setProperty("headless", "false");
        String headless = System.getProperty("headless");

        if ("true".equals(headless)) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            return new ChromeDriver(chromeOptions);
        } else {
            return new ChromeDriver();
        }
    }
}
