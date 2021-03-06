package com.surender.au.post.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"},plugin = {"pretty","json:target/cucumber.json"},
        glue={"com.surender.au.post.config","com.surender.au.post.stepdefinitions"})
public class CucumberJunitTest {
}
