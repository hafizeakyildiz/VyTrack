package VyTrack.B2087;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AC6 {
    WebDriver driver;
    @BeforeMethod

    public void setUpMethod() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    }
    @Test
    public void VtTrackTest1(){
        driver.get("https://qa2.vytrack.com/");

    }




}
