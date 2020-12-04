package com.surender.au.post.lib;

import com.surender.au.post.config.Settings;
import com.surender.au.post.lib.exceptions.DriverNotSupportedException;
import io.cucumber.spring.ScenarioScope;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component

public class WebDriverFactory {

    @Autowired
    private Settings settings;

    @Bean(name = "driver", destroyMethod = "quit")
    @ScenarioScope
    public WebDriver getWebDriver() throws DriverNotSupportedException {

        String driverPath = settings.getDriverPath();
        String browserType = settings.getBrowserType();
        WebDriver driver;

        switch (browserType) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", driverPath);
                driver = new ChromeDriver();
                break;
            default:
                throw new DriverNotSupportedException(browserType + " not supported");
        }
        this.appWebDriverSettings(driver);
        return driver;
    }

    private void appWebDriverSettings(WebDriver driver) {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(settings.implicitWaitTimeout(), TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(settings.pageLoadTimeout(), TimeUnit.SECONDS);
    }
}
