package seleniumWebDriverPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public abstract class BaseTestDemo {

    public WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.out.println("--------BEFORE CLASS----------");
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
    }
    public  BaseTestDemo open (String url){
        driver.get(url);
        return this;
    }
    public BaseTestDemo sendKeys (WebElement element,String txt){
        element.sendKeys(txt);
        return this;
    }
    public BaseTestDemo click (WebElement element){
        element.click();
        return this;
    }
    @AfterClass
    public void close(){
        System.out.println("---------AFTER CLASS---------");
        driver.close();
        driver.quit();
    }
}
