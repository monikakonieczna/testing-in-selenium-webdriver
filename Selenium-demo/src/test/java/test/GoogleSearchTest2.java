package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
    private static WebDriver driver = null;

    @BeforeTest
    public void setUpTest() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public static void googleSearch() {
        GoogleSearchPage searchPage = new GoogleSearchPage(driver);
        //go to google.com
        driver.get("https://google.com");
        searchPage.setTextInSearchBox("A B C D ");
        searchPage.clickSearchButton();
    }

    @AfterTest
    public void tearDownTest() {
        //close browser
        driver.close();
        driver.quit();
        System.out.println("Test Completed Successfully");
    }
}
