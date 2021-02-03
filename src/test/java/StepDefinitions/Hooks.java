package StepDefinitions;

import io.cucumber.core.gherkin.Step;
import io.cucumber.java.*;

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

    @BeforeStep
    public void beforeEachStep(Scenario scenario) {
        System.out.println("Before step");
    }

    @AfterStep
    public void afterEachStep(Scenario scenario){
        System.out.println("After step");
    }
}
