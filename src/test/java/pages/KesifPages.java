package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class KesifPages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public KesifPages(AppiumDriver driver){
        this.driver = driver;
        this.wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper= new ElementHelper(driver);
    }



}
