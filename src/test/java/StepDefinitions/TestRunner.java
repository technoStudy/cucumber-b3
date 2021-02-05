package StepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/google.feature:8",
        glue = "StepDefinitions"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
