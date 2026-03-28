package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {

    WebDriver driver;

    // Constructor
    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By searchBox = By.name("q");

    // Actions
    public boolean isSearchBoxDisplayed() {
        return driver.findElement(searchBox).isDisplayed();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}