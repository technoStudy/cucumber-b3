package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ScenarioOutlineSteps {
    private int startingCucumbers;
    private int eatingCucumbers;

    @Given("there are {int} cucumbers")
    public void thereAreStartCucumbers(int start) {
        startingCucumbers = start;
    }

    @When("I eat {int} cucumbers")
    public void iEatEatCucumbers(int eat) {
        eatingCucumbers = eat;
    }

    @Then("I should have {int} cucumbers")
    public void iShouldHaveLeftCucumbers(int left) {
        Assert.assertEquals(startingCucumbers - eatingCucumbers, left);
    }
}
