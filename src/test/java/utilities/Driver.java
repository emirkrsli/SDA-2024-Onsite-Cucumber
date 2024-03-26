package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class Driver {

    // To make a singleton class
    private Driver(){}

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver(){
        if (driver.get() == null){
            switch (ConfigReader.getProperty("browser")){
                case "chrome":
                    driver.set(new ChromeDriver());
                    break;
                case "ie":
                    driver.set(new InternetExplorerDriver());
                    break;
                default:
                    driver.set(new ChromeDriver());
                    break;
            }
            driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get().manage().window().maximize();
        }
        return driver.get();
    }

    public static void closeDriver(){
        driver.get().close();
        driver.set(null);
    }
}
