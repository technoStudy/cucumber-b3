package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
    @Given("there are {int} cucumbers")
    public void thereAreStartCucumbers(int start) {
        System.out.println(start);
    }

    @When("I eat {int} cucumbers")
    public void iEatEatCucumbers(int eat) {
        System.out.println(eat);
    }

    @Then("I should have {int} cucumbers")
    public void iShouldHaveLeftCucumbers(int left) {
        System.out.println(left);
    }
}
