package seleniumWebDriverPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumDemo {
    @Test
    public void demo1() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        driver.get("https://www.google.com");
        WebElement searchInputField= driver.findElement(By.name("q"));
        searchInputField.sendKeys("Iphone");
        Thread.sleep(3000);
        searchInputField.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        WebElement appleText= driver.findElement(By.tagName("h3"));
        String expectedTextIphone="iPhone - Apple";
        Assert.assertEquals(appleText.getText(),expectedTextIphone);
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());
        String sessionId = ((RemoteWebDriver) driver).getSessionId().toString();
        System.out.println("Session ID"+sessionId);
        driver.close();
        driver.quit();



    }


    }


