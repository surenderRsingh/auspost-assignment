package com.surender.au.post.stepdefinitions;

import com.surender.au.post.pages.google.GoogleHomePg;
import com.surender.au.post.pages.google.GoogleSearchResultPg;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.springframework.beans.factory.annotation.Autowired;

@ScenarioScope
public class GoogleSearchSteps {

    @Autowired
    GoogleHomePg googleHomePg;

    @Autowired
    GoogleSearchResultPg resultPg;

    @Given("User is on Google search page")
    public void openGoogleSearchPg() {
        googleHomePg.navigateToUrl("https://www.google.com/");
    }

    @When("user search {string}")
    public void googleSearchText(String searchText) {
        googleHomePg.searchText(searchText);
    }

    @Then("website with url {string} should be available in search result")
    public void verifySearchResultHasUrl(String url) {
        resultPg.validateSearchResultWithUrlExists(url);
    }

    @Given("User opens secure pay by google search")
    public void openSecurePay(){
        this.openGoogleSearchPg();
        this.googleSearchText("securepay");
        resultPg.openPageWithUrl("www.securepay.com.au/");
    }
}
