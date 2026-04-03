# Selenium Java Test Automation Framework

## 📌 Overview

Designed and developed a Selenium WebDriver-based automation framework using Java to support scalable and maintainable UI test automation. The framework leverages the Page Object Model (POM) design pattern to separate test logic from UI interactions, improving readability, reusability, and long-term maintainability.

The project demonstrates real-world automation practices, including structured test design, reliable element interaction, and validation strategies aligned with Agile development workflows.

## 🧰 Tech Stack

* Java
* Selenium WebDriver
* WebDriverManager
* TestNG

## 🏗️ Framework Design

- Built using the Page Object Model (POM) to promote separation of concerns
- Centralized browser setup and teardown using TestNG lifecycle methods
- Reusable page classes and utility methods to reduce code duplication
- Designed with scalability in mind to support additional test cases and future enhancements

## 🚀 Features

- Implemented Page Object Model (POM) for scalable and maintainable test design
- Integrated WebDriverManager for automated browser driver management
- Utilized TestNG for test execution, annotations, and assertions
- Implemented reliable element locators using CSS selectors
- Automated end-to-end UI test scenarios
- Structured test setup and teardown using TestNG lifecycle annotations

## 🧪 Sample Test #1

* Navigate to a webpage
* Extract text from an element
*  Validate expected results using assertions

## 🧪 Sample Test #2

* Navigate to a webpage
* Find the search box
* Validate expected results using assertions

## 🧪 Sample Test #3 

* Negative test included to demonstrate failure handling
* Navigate to a webpage
* Extract text from an element
* Validate expected results using assertions

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

## 📈 Future Improvements

- Implement explicit waits for improved synchronization
- Add reporting using Allure or Extent Reports
- Introduce data-driven testing using external data sources
- Integrate with CI/CD pipelines for continuous testing

## 👨‍💻 Author

Mike Jimenez
