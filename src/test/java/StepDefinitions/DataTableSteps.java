package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class DataTableSteps {
    @Given("I have a list of values")
    public void iHaveAListOfValues(DataTable table) {
        System.out.println(table);
    }
}
