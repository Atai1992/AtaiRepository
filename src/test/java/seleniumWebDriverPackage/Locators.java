package seleniumWebDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Locators extends BaseTestDemo {

    @Test
            public void xpathDemo() throws InterruptedException{
        setUp();
        driver.get("https://demoqa.com/text-box");
        WebElement absoluteXpath = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));

        WebElement fullNameXpath = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        WebElement submitBtn = driver.findElement(By.xpath("//button[text()='Submit']"));
    sendKeys(fullNameXpath,"John Doe")
            .sendKeys(email,"johndoe@gmail.com")
            .sendKeys(currentAddress,"New Yor 45 str")
            .sendKeys(permanentAddress,"Brooklyn Chase av 56")
            .click(submitBtn);

//        WebElement fullNameResult = driver.findElement(By.xpath("//p[contains(text(),'Name:')]"));
//        WebElement emailResult = driver.findElement(By.xpath("//p[contains(text(),'Email:')]"));
//        WebElement currentAddressResult= driver.findElement(By.xpath("//p[contains(text(),'Current Address :')]"));
//        WebElement permanentAddressResult= driver.findElement(By.xpath("//p[contains(text(),'Permananet Address :')]"));
//
//        assertTrue(fullNameResult.getText().contains("John Doe"));
//        assertTrue(emailResult.getText().contains("johndoe@gmail.com"));
//        assertTrue(currentAddressResult.getText().contains("New Yor 45 str"));
//        assertTrue(permanentAddressResult.getText().contains("Brooklyn Chase av 56"));

    }

}
