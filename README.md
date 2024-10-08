# AutomationScreenplay
Examples of Automation with Serenity BDD Web
:octocat:

---

## Installation 

This project was created in:

- Windows 10
- IntelliJ IDEA 2024.2.3
- JAVA 11
- Gradle Release 8.2
- Serenity 3.9.8
- Cucumber 3.9.8

Plugins to Intellij IDE:
* Cucumber for java
* Gherkin
* Sonarlint
* Lombok

---

## Usage

-[ ] Make you sure have Java openjdk-11 installed on your SO.

-[ ] Open the project with IDEA 2024.2.3 or latest.

-[ ] Make you sure using corretto-19.0.2 JDK in Project Structure -> Platform Settings -> SDKs.

-[ ] Install the plugins.

---

## Instructive

1. In ``` src/test/resources/features/serenityLogin.feature ``` do you find the user histories in Gherkin language.
   I recommend you read them.


2. Run the project from the Runner class in
   ``` src/test/java/com/co/demo/runners/SerenityLoginRunner.java ```,
   open the runner and press Shift+F10.

To run the test cases from the "Terminal" tab of the IntelliJ IDE run the following command.

```
gradle clean test aggregate
```
3. Execution:
   
    3.1.The Chrome driver is downloaded and executed thanks to Serenity and Gradle.
   
    3.2. A browser instance is launched and accesses the test page.
    
    3.3. The locators (name, id, xpath, contains) were previously searched for on the test page and with them the driver locates the fields to perform the login.
   
    3.4. The data from the user stories written in gherkin are brought thanks to Cucumber and Selenium so that the driver puts them in the locators.
   
    3.5. The driver presses the login button.
   
    3.6.The page changes to the dashboard and to confirm the word “Dashboard” is searched for.
   
    3.7. The page changes to the list of carriers.
   
    3.8. The driver presses the “New Carrier” button.
   
    3.9. The page changes to the carrier module.
   
    3.10. The driver puts the data of the new carrier (company and phone) in the module locators.

    3.11. The driver presses the “Save” button.

    3.12. The page changes to the list of carriers and to confirm, the company name is searched for in the list.

    3.13. The page closes at the request of the browser.


    Note: if you want to repeat the test, I recommend manually accessing this URL and deleting the newly created carrier by clicking on its name and then on the trash can button (in a real case, dozens of carriers would be placed in a separate file to be imported by the project).


4. Watch the execution and in the end find the report in next project path: 
    ``` /bPOM/target/index.html ``` open in web browser.

You can watch all tests passed ✅✅ and more data about the tests, 
like a next table and graphics

| Descripción                | Valor                |
|----------------------------|----------------------|
| Number of Scenarios        | 2                    |
| Total Number of Test Cases | 2                    |
| Tests Started              | oct 07, 2024 19:45:42|
| Tests Finished             | oct 07, 2024 19:46:04|
| Total Duration             | 22s                  |
| Fastest Test               | 5s                   |
| Slowest Test               | 16s                  |
| Average Execution Time     | 11s                  |
| Total Execution Time       | 22s                  |


---

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

---
## Referals

[Julian Mesa Channel](https://www.youtube.com/@JulianMesaAutomation/videos)

[Reliquias del Software Channel](https://www.youtube.com/@reliquiasdelsoftware)

## License
[MIT](https://choosealicense.com/licenses/mit/)