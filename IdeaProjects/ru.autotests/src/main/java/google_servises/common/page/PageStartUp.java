package google_servises.common.page;

import google_servises.runner.GlobalProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Dmitriy.Yakovlev on 04.03.17.
 */
public class PageStartUp {
    private static WebDriver driver = GlobalProperties.getDriver();

    /**
     *
     * @return кнопка Войти
     */
    public static WebElement buttonSignIn() {
        return driver.findElement(By.id("gb_70"));
    }

    /**
     *
     * @return кнопка Выйти
     */
    public static WebElement buttonSignOut() {
        return driver.findElement(By.id("gb_71"));
    }

    /**
     *
     * @return тестовое поле поиска
     */
    public static WebElement textboxSerch(){
        return driver.findElement(By.id("gs_htif0"));
    }

    /**
     *
     * @return кнопка Поиск в Google
     */
    public static WebElement buttonSerchInGoogle(){
        return driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]"));
    }

    /**
     *
     * @return кнопка Приложения Google
     */
    public static WebElement buttonAppGoogle() {
        return driver.findElement(By.linkText("Приложения Google"));
    }

    /**
     *
     * @return кнопка Аккаунт Google
     */
    public static WebElement buttonAccountGoogle() {
        return driver.findElement(By.linkText("Аккаунт Google: тест тестович (mytestthebest@gmail.com)"));
    }


}
