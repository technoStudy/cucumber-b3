package StepDefinitions;

import Models.GenericObjectClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class DataTableSteps {
    @Given("I have a list of values")
    public void iHaveAListOfValues(DataTable table) {
        System.out.println(table);
    }

    @Given("I have a list")
    public void iHaveAList(DataTable table) {
        List<String> list = table.asList();
        for (String item : list) {
            System.out.print(item + " ");
        }
    }

    @Given("I have a list of lists")
    public void iHaveAListOfLists(DataTable table) {
        List<List<String>> lists = table.asLists();
        for (List<String> list : lists) {
            for (String item : list) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }


    @Given("I have a map of value")
    public void iHaveAMapOfValue(DataTable table) {
        Map<String, Integer> map = table.asMap(String.class, Integer.class);
        System.out.println(map);
    }

    @Given("I have a list of maps")
    public void iHaveAListOfMaps(DataTable table) {
        List<Map<String, String>> maps = table.asMaps();

        for(Map<String, String> map : maps) {
            System.out.println(map);
        }
    }

    @Given("I have a list of objects")
    public void iHaveAListOfObjects(List<GenericObjectClass> list) {
        // TODO: fix this with data table type
        for (GenericObjectClass item : list ) {
            System.out.println(item);
        }
    }
}
