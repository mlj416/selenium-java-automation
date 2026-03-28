package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    public void search(String query)  {
        driver.findElement(searchBox).sendKeys(query);
        driver.findElement(searchBox).submit();
    }

    public boolean resultsDisplayed() {
        return driver.getCurrentUrl().contains("search");
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

}