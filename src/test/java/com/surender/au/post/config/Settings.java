package com.surender.au.post.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.test.context.TestPropertySource;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

@Component
public class Settings {

    private Properties properties;

    @PostConstruct
    private void initializePropFile() throws IOException {
        URL url = Thread.currentThread().getContextClassLoader().getResource("settings.properties");
        this.properties = new Properties();
        properties.load(new FileInputStream(url.getPath()));
    }

    public String getDriverPath(){

        return  Thread.currentThread().getContextClassLoader().
                getResource(properties.getProperty("webdriver.path")).getPath();
    }

    public String getBrowserType() {
        return  properties.getProperty("webdriver.browser");
    }

    public int pageLoadTimeout(){
        return Integer.parseInt(properties.getProperty("webdriver.pageLoadTimeout"));
    }

    public int implicitWaitTimeout(){
        return Integer.parseInt(properties.getProperty("webdriver.implicitTimeout"));
    }
}

