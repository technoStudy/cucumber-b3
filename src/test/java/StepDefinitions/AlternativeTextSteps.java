package StepDefinitions;

import io.cucumber.java.en.Given;

public class AlternativeTextSteps {
    @Given("I am a parent/teacher/child")
    public void iAmAParent() {
        System.out.println("this is step is only for parent/teacher/child");
    }

    @Given("I am a gardener/guard")
    public void iAmAGardener() {
        System.out.println("this step is for additional staff");
    }
}
