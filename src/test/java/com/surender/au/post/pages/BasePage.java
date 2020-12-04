package com.surender.au.post.pages;

import com.surender.au.post.lib.ElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BasePage {
    @Autowired
    protected WebDriver driver;

    @Autowired
    protected ElementActions performAction;

    @PostConstruct
    public void initializeObjects(){
        PageFactory.initElements(this.driver,this);
    }

    public void navigateToUrl(String url){
        this.driver.get(url);
    }
}
