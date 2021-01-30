package StepDefinitions;

import io.cucumber.java.en.Given;

public class Task1SolutionSteps {
    @Given("my height/weight is {double} meters/kilograms")
    public void myHeightIsMeters(double number) {
        System.out.println(number);
    }
}
