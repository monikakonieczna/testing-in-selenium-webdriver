package test;

import framework.DriverFactory;
import framework.DriverFactoryProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeSuite
    public void beforeSuite() {
        DriverFactory driverFactory = DriverFactoryProvider.getDriverFactory("chrome");
        driver = driverFactory.getDriver();
    }

    @AfterSuite
    public void afterSuite() {
        if (null != driver) {
            driver.close();
            driver.quit();
        }

    }
}
