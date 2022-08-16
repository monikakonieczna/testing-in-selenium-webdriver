package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends BasePage {
    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    By textboxSearch = By.cssSelector("input[class=\"gLFyf gsfi\"]");
    By buttonSearch = By.cssSelector("div[class=\"FPdoLc lJ9FBc\"] .gNO89b");
    By buttonAcceptCookies = By.cssSelector("button[class=\"tHlp8d\"]:nth-of-type(2)");

    public void navigateTo(){
        driver.get("https://google.com");
    }
    public void acceptCookies(){
        driver.findElement(buttonAcceptCookies).sendKeys(Keys.RETURN);
    }
    public void setTextInSearchBox(String text) {
        driver.findElement(textboxSearch).sendKeys(text);
    }

    public void clickSearchButton() {
        //driver.findElement(buttonSearch).click();
        driver.findElement(buttonSearch).sendKeys(Keys.RETURN);
    }
}
