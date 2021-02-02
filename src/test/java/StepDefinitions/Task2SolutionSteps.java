package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Task2SolutionSteps {
    int number1;
    int number2;


    @Given("first number = {int}")
    public void firstNumberNumber(int arg0) {
        number1 = arg0;
    }

    @And("second number = {int}")
    public void secondNumberNumber(int arg0) {
        number2 = arg0;
    }

    @Then("result should be = {int}")
    public void resultShouldBeResult(int arg0) {
        Assert.assertEquals(number1 * number2, arg0);
    }
}
