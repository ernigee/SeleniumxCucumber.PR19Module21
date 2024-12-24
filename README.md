# UI Web Testing Framework with Cucumber, Java, Gradle, and Selenium

This project provides a UI web testing framework built with Cucumber, Java, Gradle, and Selenium. It implements the Page Object Model (POM) pattern and supports automated testing using Gherkin syntax.

## Prerequisites

Before setting up the project, ensure the following are installed on your system:

- Java Development Kit (JDK) 8 or higher
- Gradle (or use Gradle Wrapper)
- An Integrated Development Environment (IDE) such as IntelliJ IDEA or Eclipse
- A web browser for running tests (e.g., Chrome, Firefox)
- WebDriver for your chosen browser (e.g., ChromeDriver, GeckoDriver)

## Setup

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-folder>
   ```

2. Configure the Gradle project by adding the required dependencies in the `build.gradle` file:

   ```groovy
   plugins {
       id 'java'
   }

   repositories {
       mavenCentral()
   }

   dependencies {
       testImplementation 'io.cucumber:cucumber-java:7.11.0'
       testImplementation 'io.cucumber:cucumber-junit:7.11.0'
       testImplementation 'org.seleniumhq.selenium:selenium-java:4.11.0'
       testImplementation 'org.junit.jupiter:junit-jupiter:5.10.0'
   }
   ```

3. Set up WebDriver for your browser. Place the executable in your system path or specify its location in your test setup.

## Project Structure

The project follows a modular structure:

```
src
├── main
│   
├── test
│   ├── java
│   │   ├── pages
│   │   │   └── <pagesClass>.java
│   │   ├── stepdefinitions
│   │   │   └── <StepDefinitionClasses>.java
│   │   └── runners
│   │       └── TestRunner.java
│   └── resources
│       └── features
│           └── <FeatureFiles>.feature
│           └── <FeatureFiles>.feature
```

### Key Components

- **Page Object Model (POM):** Each web page is represented as a separate Java class in the `pages` package.
    - Contains locators and methods for interacting with elements on the page.

- **Feature Files:** Written in Gherkin syntax, located in the `test/resources/features` folder. These files define the test scenarios.

- **Step Definitions:** Java classes in the `test/java/stepdefinitions` folder that map Gherkin steps to code.

- **Test Runner:** Located in the `test/java/runners` folder, it configures the execution of tests.

## Writing Tests

1. **Define Feature Files:** Create `.feature` files describing test cases using Gherkin syntax. Example:

   ```gherkin
   Feature: Login Functionality

   Scenario: Successful login with valid credentials
       Given the user is on the login page
       When the user enters valid credentials
       Then the user should see the dashboard
   ```

2. **Implement Step Definitions:** Map the steps in the feature file to Java methods in the `stepdefinitions` package:

   ```java
   @Given("the user is on the login page")
   public void the_user_is_on_the_login_page() {
       loginPage.navigateToLoginPage();
   }
   
   @When("the user enters valid credentials")
   public void the_user_enters_valid_credentials() {
       loginPage.enterCredentials("username", "password");
   }

   @Then("the user should see the dashboard")
   public void the_user_should_see_the_dashboard() {
       assertTrue(dashboardPage.isDashboardVisible());
   }
   ```

3. **Run Tests:** Use the Test Runner class to execute tests. Example configuration:

   ```java
   @RunWith(Cucumber.class)
   @CucumberOptions(
       features = "src/test/resources/features",
       glue = "stepdefinitions",
       plugin = {"pretty", "html:target/cucumber-reports.html"}
   )
   public class TestRunner {
   }
   ```

## Running the Framework

Run the tests using Gradle:

```bash
gradle test
```

## Features

- **Positive and Negative Testing:** Covers different scenarios to ensure the application behaves as expected under various conditions.
- **Reporting:** Generates detailed reports using Cucumber's reporting plugins.

## Contributing

Feel free to contribute by submitting issues or pull requests to improve the framework.

## License