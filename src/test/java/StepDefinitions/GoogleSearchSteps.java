package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
    @Given("I navigate to Google")
    public void iNavigateToGoogle() {
        System.out.println("I am navigating to google website");
    }

    @When("I enter {string} in search box")
    public void iEnterInSearchBox(String searchText) {
        System.out.println("Entering " + searchText + " in search box");
//        throw new RuntimeException(); // will not continue if a step fails
    }

    @Then("I see {string} results")
    public void iSeeResults(String resultText) {
        System.out.println("I must see results containing " + resultText);
    }

    @Given("I launch web browser,")
    public void iLaunchWebBrowser() {
        System.out.println("open web browser");
    }
}
