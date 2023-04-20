package com.digital.ui.element.helper;

import com.digital.ui.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebElementActions {
    public WebElementActions input(WebElement element, String txt){
        element.sendKeys(txt);
        return this;
    }
    public WebElementActions press(WebElement element){
        element.click();
        return this;
    }
    public WebElementActions waitElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }
    public WebElementActions waitElementToBeClickAble(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }
}
