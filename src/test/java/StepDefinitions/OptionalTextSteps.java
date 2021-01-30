package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class OptionalTextSteps {
    @Given("I am older by {int} year(s)")
    public void iAmOlderByYears(int number) {
        System.out.println("I am older by " + number);
    }

    @When("my birthday is in( year) {int}")
    public void myBirthdayIsInYear(int year) {
        System.out.println(year);
    }
}
