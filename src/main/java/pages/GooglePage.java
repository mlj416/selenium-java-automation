package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage {

    WebDriver driver;

    // Constructor
    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }
    WebDriverWait wait;

    // Locators
    private By searchBox = By.name("q");

    // Actions
    public boolean isSearchBoxDisplayed() {
        return driver.findElement(searchBox).isDisplayed();
    }

    public void search(String query) {
        wait.until(ExpectedConditions.elementToBeClickable(searchBox)).sendKeys(query);
        driver.findElement(searchBox).submit();
    }

    public boolean resultsDisplayed() {
        wait.until(ExpectedConditions.urlContains("search"));
        return driver.getCurrentUrl().contains("search");
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

}