package util;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    static AppiumDriver appiumDriver;
    static Properties properties;
    static DesiredCapabilities desiredCapabilities;

    public static AppiumDriver initiliaze_Driver(String browser){
        properties=ConfigReader.getProperties();
        desiredCapabilities = new DesiredCapabilities();
        if (browser.equals("Android")){
            desiredCapabilities.setCapability("platformName","Android");
            desiredCapabilities.setCapability("udid","emulator-5554");
            desiredCapabilities.setCapability("appPackage","com.dmall.mfandroid");
            desiredCapabilities.setCapability("appActivity","com.dmall.mfandroid.activity.base.NewSplash");

        } else if (browser.equals("IOS")) {
            desiredCapabilities.setCapability("platformName","IOS");
            desiredCapabilities.setCapability("udid","");
            desiredCapabilities.setCapability("appPackage","");
            desiredCapabilities.setCapability("appActivity","");
        }
        try {
            appiumDriver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        int impWait = Integer.parseInt(properties.getProperty("impilictlywait"));
        appiumDriver.manage().timeouts().implicitlyWait(impWait, TimeUnit.SECONDS);
        return getDriver();
    }

    public static AppiumDriver getDriver(){
        return appiumDriver;
    }


}
