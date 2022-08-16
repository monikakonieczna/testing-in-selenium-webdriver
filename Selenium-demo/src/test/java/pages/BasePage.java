package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBe;

public class BasePage {
    private static final Duration DRIVER_TIMEOUT = Duration.ofSeconds(5);
    private static final int ELEMENT_TIMEOUT = 5;
    private static final Duration POLLING = Duration.ofSeconds(100);

    protected WebDriver driver;
    private final WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, DRIVER_TIMEOUT, POLLING);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, ELEMENT_TIMEOUT), this);
    }

    protected void waitForElementToAppear(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForElementToDisappear(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void waitForTextToDisappear(By locator, String text) {
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, text)));
    }

}
