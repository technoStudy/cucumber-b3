package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParameterTypeSteps {
    @Given("my age is {int} years old")
    public void myAgeIsInt(int age) {
        System.out.println("My age is " + age);
    }

    @When("I divide my age by {float}")
    public void iDivideMyAgeBy(float arg0) {
        System.out.println(arg0);
    }

    @Then("I get a random {word} split")
    public void iGetARandomBananaSplit(String word) {
        System.out.println(word);
    }
}
