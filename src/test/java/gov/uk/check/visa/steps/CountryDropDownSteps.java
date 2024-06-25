package gov.uk.check.visa.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class CountryDropDownSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {

    }


    @Then("I can see following country into dropdown")
    public void iCanSeeFollowingCountryIntoDropdown(DataTable dataTable) {
        List<List<String>> countryList =  dataTable.asLists(String.class);
        for (List<String> list : countryList ) {
            System.out.println(list.get(0));
            // new SelectNationalityPage().selectcountry(list.get(0));
        }
    }

}
