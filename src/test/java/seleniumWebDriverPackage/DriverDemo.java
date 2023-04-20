package seleniumWebDriverPackage;



import com.digital.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverDemo {
    public static void main(String[] args) throws InterruptedException {
        Driver.getDriver().get("https//www.google.com");

     }
}
