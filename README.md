
# WebAutomationFramework-Java-Selenium-TestNG for AlgoScale Assessment

o(*￣︶￣*)o
## About 
In this enterprise level framework built on Java/Selenium/Testng, I have added all sorts of functionalites which were not really neeeded for this assesment but for future scalablity I added like HTML Report generation after Test runs(you can check that in report folder) , Utility to get data from a Json file and parse it into our Tests for Data driven Automation support , Thread Safe execution , Page Object Model implementation , Jenkins Integration , CrossBrowser testing support, headless execution in chrome , and TestRunner on the basis of Profiles created like for example Smoke.


## Getting Started

These instructions will help you set up and run the tests in this automation framework.

### Prerequisites

- Java
- Maven
- Selenium WebDriver
- TestNG
- aventStack
- Jacksondatabind
  
### Installation

To install the framework, navigate to the project directory and run one of the following commands:

```bash
mvn clean install
or
mvn install
```
Running All Tests
To run all tests ending with "test":
```bash
mvn test
```
Running Tests by Profile
To run tests according to the profiles set in pom.xml:
```bash
mvn test -PSmoke
```
To Run Tests in different browsers (default is chrome)
```bash
mvn test -PSmoke -Dbrowser=Firefox
mvn test -PSmoke -Dbrowser=Edge
mvn test -PSmoke -Dbrowser=Chrome
mvn test -PSmoke -Dbrowser=ChromeHeadless
```
Running Tests in Eclipse IDE
If you prefer not to use the terminal, you can simply run the TestNG XML files located in the root directory of your Eclipse project.
Built With

- Java - The programming language used
- Selenium WebDriver - The web framework used for automation
- TestNG - Testing framework
- Maven - Dependency Management

Authors

Apaekshit Rawat




