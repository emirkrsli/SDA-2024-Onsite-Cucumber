package stepdefinitions;

import io.cucumber.java.en.*;
import utilities.Driver;

import java.util.List;

public class DataTablesStepDef {
    @When("I search for String on google")
    public void i_search_for_string_on_google(List<List<String>> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        Driver.getDriver();
        for(int i = 0; i<dataTable.size(); i++){
            System.out.println(dataTable.get(i));
            for (int j= 0; j < dataTable.get(i).size(); j++){
                System.out.println(dataTable.get(i).get(j));
            }
        }
    }
    @Then("I should see String on the results")
    public void i_should_see_string_on_the_results(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
    }


}
