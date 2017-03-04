package google_servises.runner;

/**
 * Created by Dmitriy.Yakovlev
 * Created: 04.03.17 12:55
 */

import google_servises.common.page.PageStartUp;
import google_servises.email.SuiteEmailTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.WebDriver;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SuiteEmailTest.class
})

public class AllTests {
@BeforeClass
    public static void startBrowser(){
    WebDriver driver =GlobalProperties.getDriver();
    driver.get("https://www.google.ru/");
}

@AfterClass
    public static void closeBrowser(){
    PageStartUp.buttonAccountGoogle().click();
    PageStartUp.buttonSignOut().click();
    GlobalProperties.getDriver().quit();
}

}
