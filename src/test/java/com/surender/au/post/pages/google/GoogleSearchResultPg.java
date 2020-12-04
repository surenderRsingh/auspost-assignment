package com.surender.au.post.pages.google;

import com.surender.au.post.pages.BasePage;
import io.cucumber.spring.ScenarioScope;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ScenarioScope
public class GoogleSearchResultPg extends BasePage {
    @FindBy(id="search")
    private WebElement searchResultContainer;


    public void validateSearchResultWithUrlExists(String url){
        By recordUrlLinkIdentifier = By.cssSelector("a[href*='" +url + "']");
        Assert.assertNotNull(this.getSearchRecordWithUrl(url));
    }

    public void openPageWithUrl(String url){
        this.getSearchRecordWithUrl(url).click();
    }

    private WebElement getSearchRecordWithUrl(String url){
        By recordUrlLinkIdentifier = By.cssSelector("a[href*='" +url + "']");
        return this.searchResultContainer.findElement(recordUrlLinkIdentifier);
    }
}
