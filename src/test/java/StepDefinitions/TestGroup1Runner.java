package StepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/google.feature", "src/test/resources/features/backgroundKeyword.feature"},
        glue = "StepDefinitions",
        tags = "@another and not @long"
)
public class TestGroup1Runner extends AbstractTestNGCucumberTests {
}
