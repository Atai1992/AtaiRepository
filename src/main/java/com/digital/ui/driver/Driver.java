package com.digital.ui.driver;

import com.digital.configuration.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver(){}
        private static WebDriver driver;

        public static WebDriver getDriver(){
            if (driver == null){
                switch (ConfigReader.getProperty("browser").toLowerCase()){
                    case "chrome" :
                        driver = ChromeWebDriver.loadChromeWebDriver();
                        break;
                    case "edge" :
                        driver = EdgeWebDriver.loadEdgeDriver();
                        break;
                    case "safari" :
                        driver = SafariWebDriver.loadSafariWebDriver();
                        break;
                    case "firefox" :
                        driver = FireFoxWebDriver.loadFireFoxDriver();
                        break;
                    default:
                        throw new RuntimeException("You provided wrong browser name");
                }
            }
            return driver;
        }

        public static void closeDriver(){
            try {
                if (driver != null){
                    driver.close();
                    driver.quit();
                    driver = null;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
    }
}
