package com.surender.au.post.pages.securepay;

import com.surender.au.post.pages.BasePage;
import io.cucumber.spring.ScenarioScope;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;



@Component
@ScenarioScope
public class HomePg extends BasePage {

    @FindBy(className = "c-site-footer")
    private WebElement footerContainer;

    public void openContactUsPage(){
        WebElement contactUsLink = footerContainer.findElement(By.linkText("Contact us"));
        contactUsLink.click();
    }
}
