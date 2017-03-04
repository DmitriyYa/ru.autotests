package google_servises.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Dmitriy.Yakovlev on 04.03.17.
 */
public class GlobalProperties {

    private static WebDriver driver=new FirefoxDriver();

    private static final String DRIVER_FIREFOX="web_driver_firefox";

    public static void setDriver(WebDriver driver) {
        GlobalProperties.driver = driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }



}
