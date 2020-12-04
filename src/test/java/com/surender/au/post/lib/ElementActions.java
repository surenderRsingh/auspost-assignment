package com.surender.au.post.lib;

import io.cucumber.spring.ScenarioScope;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ScenarioScope
public class ElementActions {
    @Autowired
    WebDriver driver;

    public void  selectValueByVisibleText(By identifier, String value){
        Select selectEle = new Select(driver.findElement(identifier));
        selectEle.selectByVisibleText(value);
    }

    public void  selectValueByVisibleText(WebElement element, String value){
        Select selectEle = new Select(element);
        selectEle.selectByVisibleText(value);
    }
}
