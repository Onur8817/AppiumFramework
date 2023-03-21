package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class N11page {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By kategorilerbutonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");



    public N11page(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);

    }

    public void kategoriler_tikla() throws InterruptedException {
        elementHelper.presenceElement(kategorilerbutonu);
        driver.findElement(kategorilerbutonu).click();
    }

    public void elektronik_tikla() {
        List<WebElement> listofElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/tvCategoryItem\")"));
        listofElement.get(0).click();
    }
}
