import framework.DriverFactory;
import framework.DriverFactoryProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumCapabilities {
    public static void main(String[] args) {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("ignoreProtectedModeSettings", "true");

        DriverFactory driverFactory = DriverFactoryProvider.getDriverFactory("chrome");
        WebDriver driver = driverFactory.getDriver();

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("hello");
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

        driver.close();
        driver.quit();

    }
}
