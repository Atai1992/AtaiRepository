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
import java.util.List;

public class PracticeSel {
    @Test
    public void demo2() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        driver.get("https://demoqa.com/text-box");
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("John Doe");
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("johndoe@gmail.com");
        Thread.sleep(2000);
        WebElement addres = driver.findElement(By.id("current Address"))
        addres.sendKeys("New Yor 45 str");
        Thread.sleep(2000);
        WebElement permAddres = driver.findElement(By.id("permanentAddress"));
        permAddres.sendKeys("Brooklyn Chase av 56");
        permAddres.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(2000);
        WebElement enterSubmit = driver.findElement(By.id("submit"));
        enterSubmit.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        WebElement johnText= driver.findElement(By.tagName("p"));
        String expectedTextIphone="Name:John Doe";
        Assert.assertEquals(johnText.getText(),expectedTextIphone);
        WebElement johnEmail= driver.findElement(By.id("email"));
        String expectedEmail="Email:johndoe@gmail.com";
        Assert.assertEquals(johnEmail.getText(),expectedEmail);
        WebElement johnAddress= driver.findElement(By.id("currentAddress"));
        String expectedAddress="Current Address :New Yor 45 str";
        Assert.assertEquals(johnAddress.getText(),expectedAddress);
//        WebElement johnPermanent=driver.findElement(By.id("permanentAddress"));
//        String expectedPermanent="Permananet Address:Brooklyn Chase av 56";
//        Assert.assertEquals(johnPermanent.getText(),expectedPermanent);
        String sessionId = ((RemoteWebDriver) driver).getSessionId().toString();
        System.out.println("Session ID" + sessionId);
        driver.close();
        driver.quit();
    }
}
