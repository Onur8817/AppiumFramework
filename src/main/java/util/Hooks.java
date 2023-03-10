package util;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.Properties;

public class Hooks {
    AppiumDriver appiumDriver;
    Properties properties;
    @Before
    public void initilization(){
        String browser = "Android";
        properties = ConfigReader.initialize_Properties();
        appiumDriver = DriverFactory.initiliaze_Driver(browser);
    }
    @After
    public void after(){
        appiumDriver.quit();
    }

}
