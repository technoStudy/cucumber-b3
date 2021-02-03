package StepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "StepDefinitions",
        tags = "@group1"
)
public class TestGroup1Runner extends AbstractTestNGCucumberTests {
}
