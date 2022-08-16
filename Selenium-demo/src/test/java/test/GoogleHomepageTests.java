package test;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.GoogleHomePage;

public class GoogleHomepageTests extends BaseTest {
    private WebDriver driver = null;
    Logger logger  = LoggerFactory.getLogger(GoogleHomepageTests.class);

    @Test
    public void googleSearch() {
        GoogleHomePage googleHomepage = new GoogleHomePage(getDriver());
        //go to google.com
        googleHomepage.navigateTo();
        logger.info("Google.com page was opened");
        googleHomepage.acceptCookies();
        googleHomepage.setTextInSearchBox("Enginiety");
        googleHomepage.clickSearchButton();
    }
}
