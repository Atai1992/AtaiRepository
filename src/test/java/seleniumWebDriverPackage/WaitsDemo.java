package seleniumWebDriverPackage;

import com.digital.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitsDemo {
    WebDriver driver= Driver.getDriver();

    @Test
    public void explicitWait() throws InterruptedException {
        driver.get("https://demoqa.com/dynamic-properties");
        driver.findElement(By.id("visibleAfter")).click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(7));
        boolean txt = wait.until(ExpectedConditions.attributeToBe(By.id("colorChange"),"class","mt-4 text-danger btn btn-primary"));
        System.out.println(txt);
//        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(6))
//                .until(ExpectedConditions.attributeToBe(By.id("colorChange"),"class","mt-4 text-danger btn btn-primary"));
//        Assert.assertEquals(driver.findElement(By.id("visibleAfter")).getAttribute("class"), "mt-4 btn btn-primary");
       // Thread.sleep(4000);

    }
}
