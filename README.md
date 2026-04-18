# Selenium Java Test Automation Framework

## 📌 Overview

This project demonstrates a UI automation framework built using Selenium WebDriver with Java. It showcases browser automation, structured test execution using TestNG, and scalable design using the Page Object Model (POM), with a focus on modern test automation practices and framework design.

## 🧰 Tech Stack

- Java
- Selenium WebDriver
- WebDriverManager
- TestNG
- Maven

## 🏗️ Framework Design

- Implemented the Page Object Model (POM) to separate UI interactions from test logic
- Managed browser setup and teardown using TestNG lifecycle annotations (`@BeforeMethod`, `@AfterMethod`)
- Encapsulated user actions within page classes to improve reusability and readability
- Integrated explicit waits (WebDriverWait) to handle dynamic elements and improve test stability
- Designed with scalability in mind to support additional test scenarios and future enhancements

## 🚀 Features

- Automated end-to-end UI test scenarios using reusable page classes
- Utilized TestNG for structured test execution, lifecycle management, and assertions
- Integrated WebDriverManager for automated browser driver management
- Implemented explicit waits (WebDriverWait) to handle dynamic elements and improve test stability
- Designed scalable test architecture to support additional scenarios and future enhancements

## 🧪 Example Test

```java
GooglePage page = new GooglePage(driver);

page.search("Selenium");
Assert.assertTrue(page.resultsDisplayed());
```
Demonstrates a search workflow using the Page Object Model with validation via assertions.

## 🧪 Sample Test #1

- Navigate to a webpage
- Extract text from an element
- Validate expected results using assertions

## 🧪 Sample Test #2

- Navigate to a webpage
- Find the search box
- Validate expected results using assertions

## 🧪 Sample Test #3 

- Negative test included to demonstrate failure handling
- Navigate to a webpage
- Extract text from an element
- Validate expected results using assertions

## 🧪 Sample Test #4

- Navigate to the Google homepage
- Perform a search using a query input
- Validate that the results page is displayed using URL verification

## 🛠️ Setup & Execution

1. Clone the repository  
2. Open the project in IntelliJ IDEA  
3. Install dependencies using Maven  
4. Run tests using TestNG or via Maven:

```bash
mvn clean test
```

## 📈 Future Improvements

- Add reporting using Allure or Extent Reports
- Introduce data-driven testing using external data sources
- Integrate with CI/CD pipelines for continuous testing

## 👨‍💻 Author

Mike Jimenez
