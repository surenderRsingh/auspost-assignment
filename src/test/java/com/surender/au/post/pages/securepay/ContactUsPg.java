package com.surender.au.post.pages.securepay;

import com.surender.au.post.lib.dataOperations.RandomData;
import com.surender.au.post.lib.exceptions.FieldNotAutomatedException;
import com.surender.au.post.pages.BasePage;
import io.cucumber.spring.ScenarioScope;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ScenarioScope
public class ContactUsPg extends BasePage {

    @Autowired
    RandomData dataGenerator;

    @FindBy(css = "label[for='firstName'] input")
    private WebElement firstNameInput;

    @FindBy(css = "label[for='lastName'] input")
    private WebElement lastNameInput;

    @FindBy(css = "label[for='email'] input")
    private WebElement emailInput;

    @FindBy(css = "label[for='phone'] input")
    private WebElement phoneNonput;

    @FindBy(css = "label[for='company'] input")
    private WebElement companyNameInput;
    @FindBy(css = "label[for='website'] input")
    private WebElement websiteNameInput;
    @FindBy(css = "label[for='amount'] select")
    private WebElement revenueList;
    @FindBy(css = "label[for='message'] textarea")
    private WebElement messageInput;

    private void setFieldValue(String fieldName)  {
        switch (fieldName) {
            case "First Name":
                this.firstNameInput.sendKeys(dataGenerator.getFirstName());
                break;
            case "Last Name":
                this.lastNameInput.sendKeys(dataGenerator.getLastName());
                break;
            case "Email Address":
                this.emailInput.sendKeys(dataGenerator.getEmail());
                break;
            case "Phone No":
                this.phoneNonput.sendKeys(dataGenerator.getPhoneNo());
                break;
            case "Company name":
                this.companyNameInput.sendKeys(dataGenerator.getCompanyname());
                break;
            case "Website Url":
                this.websiteNameInput.sendKeys(dataGenerator.getWebsite());
                break;
            case "Revenue":
                this.performAction.selectValueByVisibleText(this.revenueList,dataGenerator.getRevenue());
                break;
            case "Message":
                this.messageInput.sendKeys(dataGenerator.getMessage());
                break;
            default:
                Assert.fail("Field " + fieldName +" not supported for automation");
        }

    }

    public void contactWithRandomValues(List<String> fields) {

        fields.stream().forEach(this::setFieldValue);

    }
}
