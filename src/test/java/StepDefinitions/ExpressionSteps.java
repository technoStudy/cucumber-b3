package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ExpressionSteps {
    @Given("I do enter cucumber expression")
    public void iDoEnterCucumberExpression() {
        
    }

    @Given("^I do enter regular expression$")
    public void iDoEnterRegularExpression() {
    }

    @When("I print {string} in console using cucumber expression")
    public void iPrintInConsoleUsingCucumberExpression(String arg0) {
        System.out.println(arg0);
    }

    @When("^I print \"([^\"]*)\" in console using regular expression$")
    public void iPrintInConsoleUsingRegularExpression(String arg0) {
        System.out.println(arg0);
    }
}
