package com.appium.qa.driver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class androidDependency {

    public static WebDriver driver;
    DesiredCapabilities capabilities = new DesiredCapabilities();

    public void androidWebCapabilities () throws Throwable {

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 6");
        //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, “Android Emulator”);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.0");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(5000);



    }

    public void androidAppCababilities() throws Throwable{

        //File app = new File(System.getProperty(“user.dir”) + “/apks/news.apk”);

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
        //capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        //capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, “uk.co.telegraph.android.test”);
        //capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, “uk.co.telegraph.android.splash.controller.SplashActivity”);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(5000);


    }
}
