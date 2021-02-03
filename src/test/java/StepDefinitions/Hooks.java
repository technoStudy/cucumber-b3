package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setUp(Scenario scenario) {
        System.out.println("Before scenario " + scenario.getName() + "!");
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("After scenario " + scenario.getName() + "!");
        System.out.println(scenario.getStatus());
    }
}
