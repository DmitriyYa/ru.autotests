package google_servises.common.helpper;

import google_servises.runner.GlobalProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by Dmitriy.Yakovlev on 04.03.17.
 */
public class TimingUtils {

    private static WebDriver driver= GlobalProperties.getDriver();

    /**
     * Сколько секунд нужно подождать
     * @param sec
     */
    public static void witSeconds(double sec){
        try {
            Thread.sleep(Math.round(sec*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * явное ожидание появления элемента по id
     * @param stringEllement
     * @param watSeconds
     */
    public static void waitById(String stringEllement, int watSeconds){
        (new WebDriverWait(driver, watSeconds)).until(ExpectedConditions.presenceOfElementLocated(By.id(stringEllement)));
    }

    /**
     * явное ожидание появления элемента по name
     * @param stringEllement
     * @param watSeconds
     */
    public static void waitByName(String stringEllement, int watSeconds){
        (new WebDriverWait(driver, watSeconds)).until(ExpectedConditions.presenceOfElementLocated(By.name(stringEllement)));
    }

    /**
     * явное ожидание появления элемента по ссылке
     * @param stringEllement
     * @param watSeconds
     */
    public static void waitByLink(String stringEllement, int watSeconds){
        (new WebDriverWait(driver, watSeconds)).until(ExpectedConditions.presenceOfElementLocated(By.linkText(stringEllement)));
    }

}
