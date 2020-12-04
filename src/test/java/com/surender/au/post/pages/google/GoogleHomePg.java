package com.surender.au.post.pages.google;

import com.surender.au.post.pages.BasePage;
import io.cucumber.spring.ScenarioScope;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
@ScenarioScope
public class GoogleHomePg extends BasePage {

    @FindBy(css = "input[title='Search']")
    private WebElement searchTestInput;

    public void searchText(String abc) {

        searchTestInput.sendKeys(abc);
        searchTestInput.submit();
    }
}
