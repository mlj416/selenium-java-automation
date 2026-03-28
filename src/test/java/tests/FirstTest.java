package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {

    WebDriver driver;

    public void setup() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
    }


    public void navigateTo(String url) {
        driver.get(url);
        driver.manage().window().maximize();
        System.out.println("Title: " + driver.getTitle());
    }

    public void tearDown() {
        driver.quit();
    }

    public void validateElementText(By locator, String expectedText) {
        String actualText = driver.findElement(locator).getText();

        Assert.assertEquals(actualText, expectedText, "Could not find element " + locator);

        System.out.println("Validation passed!");
    }

    public static void main(String[] args) {
        FirstTest test = new FirstTest();

        try {
            test.setup();
            test.navigateTo("https://example.com");
            test.validateElementText(By.cssSelector("h1"), "Google");
        } finally {
            test.tearDown();
        }
    }

}