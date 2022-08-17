package test;

import framework.DriverFactory;
import framework.DriverFactoryProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.PropertiesHandling;

public class BaseTest {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeSuite
    public void beforeSuite() {
        DriverFactory driverFactory = DriverFactoryProvider.getDriverFactory(PropertiesHandling.getBrowser());
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
