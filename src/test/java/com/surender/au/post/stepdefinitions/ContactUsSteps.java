package com.surender.au.post.stepdefinitions;

import com.surender.au.post.pages.securepay.ContactUsPg;
import com.surender.au.post.pages.securepay.HomePg;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.spring.ScenarioScope;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@ScenarioScope
public class ContactUsSteps {

    @Autowired
    private HomePg homePg;

    @Autowired
    private ContactUsPg contactPg;

    @Given("(user )(he )(she )navigates to Contact us page")
    public void openContactUsFromHome(){
        homePg.openContactUsPage();
    }

    @And("user enter random details for following fields")
    public void fillContactUsDetails(List<String> fieldNames) {
        contactPg.contactWithRandomValues(fieldNames);

        // temp step to check if values are selected correctly
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
