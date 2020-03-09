package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFOX {
    public static void main(String[] args) {
        String baseUrl = "https://www.harrow.gov.uk";
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);
        System.out.println("Main page + tittle");
        driver.quit();
    }
}