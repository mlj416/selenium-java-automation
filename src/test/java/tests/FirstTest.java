package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.GooglePage;

public class FirstTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);

        driver.get("https://www.google.com");
    }

    @Test
    public void validateGooglePageTitle() {
        GooglePage googlePage = new GooglePage(driver);

        String title = googlePage.getPageTitle();

        Assert.assertTrue(title.contains("Google"), "Title does not contain 'Google'");
    }

    @Test
    public void validateGoogleSearchBoxIsDisplayed() {
        GooglePage googlePage = new GooglePage(driver);

        Assert.assertTrue(googlePage.isSearchBoxDisplayed(), "Search box is not displayed");
    }

    @Test(enabled = false)
    public void validateGoogleTitleNegativeTest() {
        GooglePage googlePage = new GooglePage(driver);

        String title = googlePage.getPageTitle();

        Assert.assertTrue(title.contains("Bing"), "Title does not contain 'Bing'");
    }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

