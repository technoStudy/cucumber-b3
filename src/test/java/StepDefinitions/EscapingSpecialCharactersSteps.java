package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EscapingSpecialCharactersSteps {
    @Given("I drink coffee\\(with milk) every day")
    public void iDrinkCoffeeWithMilkEveryDay() {
    }

    @Then("I need to use \\{} in side my text")
    public void iNeedToUseInSideMyText() {
    }
}
