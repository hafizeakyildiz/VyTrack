package VyTrack.B2087;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AC6 {

    public static void main(String[] args) {
        System.out.println("Hello world");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.vytrack.com/");
        driver.close();
    }
}
