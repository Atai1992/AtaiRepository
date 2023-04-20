package com.digital.configuration;

import com.digital.ui.driver.ChromeWebDriver;
import com.digital.ui.driver.EdgeWebDriver;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {
        try {
            String path="src/main/resources/config.properties";
            FileInputStream input= new FileInputStream(path);
            properties=new Properties();
            properties.load(input);
            input.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
        System.out.println(getProperty("browser"));
    }
    private static WebDriver driver;
     public static WebDriver getdriver(){
         if (driver == null){
             switch (ConfigReader.getProperty("browser").toLowerCase()){
                 case "edge":
                     driver= EdgeWebDriver.loadEdgeDriver();
                     break;
                 case"chrome":
                     driver= ChromeWebDriver.loadChromeWebDriver();
                     break;
                 default:
                     throw new RuntimeException("u r wrong");

             }
         } return driver;
     } public static void closeDriver(){
         try {


         if (driver!=null){
             driver.close();
             driver.quit();
             driver=null;
         }}catch (Exception e){
             e.printStackTrace();
         }
    }

}
