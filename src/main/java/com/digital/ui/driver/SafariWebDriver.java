package com.digital.ui.driver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.time.Duration;

public class SafariWebDriver {
    public static WebDriver loadSafariWebDriver(){
        WebDriverManager.safaridriver().setup();
        SafariOptions options = new SafariOptions();
        WebDriver driver=new SafariDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }

    }




