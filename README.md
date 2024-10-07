# AutomationScreenplay
Examples of Automation with Serenity BDD Web
:octocat:

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

## Usage

Make sure you have openjdk-11 installed on your SO.

Open the project with IDEA 2024.2.3 or latest.

Make you sure using corretto-19.0.2 JDK in Project Structure -> Platform Settings -> SDKs.

Install the plugins.

Run the project from the Runner class in ``` src/test/java/com/co/demo/runners/SerenityLoginRunner.java ```,
open the runner and press Shift+F10.

In ``` src/test/resources/features/serenityLogin.feature ``` do you find one user 
history and four test cases in Gherkin language.

I recommend you read them.

To run the test cases for this user story, open the terminal from 
the "Terminal" tab of the IntelliJ IDE.

Run the following command

```
gradle clean test aggregate
```

Watch the execution and in the end find the report in next project path:

``` /bPOM/target/index.html ```

and open in web browser.

You can watch all tests passed ✅✅ and more data about the tests, 
like a time of executing; the average time to execution is 16 seconds.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## Referals

[Julian Mesa Channel](https://www.youtube.com/@JulianMesaAutomation/videos)

[Reliquias del Software Channel](https://www.youtube.com/@reliquiasdelsoftware)

## License
[MIT](https://choosealicense.com/licenses/mit/)