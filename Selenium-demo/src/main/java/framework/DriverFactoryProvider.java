package framework;

import framework.ChromeBrowser;
import framework.DriverFactory;

public class DriverFactoryProvider {

    public static DriverFactory getDriverFactory(String browserType) {
        switch (browserType) {
            case "chrome":
                return new ChromeBrowser();
            case "firefox":
                return new FirefoxBrowser();
            default:
                throw new IllegalStateException("Unknown browser type! Please check your configuration");
        }
    }
}
