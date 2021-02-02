package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;

public class DataTableSteps {
    @Given("I have a list of values")
    public void iHaveAListOfValues(DataTable table) {
        System.out.println(table);
    }

    @Given("I have a list of lists")
    public void iHaveAListOfLists(DataTable table) {
        List<List<String>> lists = table.asLists();
        for (List<String> list : lists) {
            for (String item:list) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
