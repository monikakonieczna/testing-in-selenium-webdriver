package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
    private static WebDriver driver = null;
    By textboxSearch = By.id("lst-ib");
    By buttonSearch = By.name("btnK");

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setTextInSearchBox(String text) {
        driver.findElement(textboxSearch).sendKeys(text);
    }

    public void clickSearchButton() {
        //driver.findElement(buttonSearch).click();
        driver.findElement(buttonSearch).sendKeys(Keys.RETURN);
    }
}
