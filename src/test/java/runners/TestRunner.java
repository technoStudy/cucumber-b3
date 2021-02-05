package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/google.feature:8",
        glue = "StepDefinitions",
        plugin = {"html:target/report/index.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
