package com.surender.au.post.config;

import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

//@ContextConfiguration
@CucumberContextConfiguration
@SpringBootTest(classes = TestConfiguration.class)
public class CucumberContextConfig {


}
