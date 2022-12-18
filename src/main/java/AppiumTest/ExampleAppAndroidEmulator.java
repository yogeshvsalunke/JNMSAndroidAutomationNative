package AppiumTest;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType; 


public class ExampleAppAndroidEmulator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		// TODO Auto-generated method stub
            DesiredCapabilities dc=new DesiredCapabilities();
            
            dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
            dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            dc.setCapability(MobileCapabilityType.PLATFORM_VERSION ,"11.0");
            dc.setCapability(MobileCapabilityType.DEVICE_NAME , "Android Emulator");
            dc.setCapability("avd" , "AVD");
            dc.setCapability(MobileCapabilityType.APP  , "E:\\Nanijdham\\appium\\com.antariksha.donor-1.38.apk");
       //     dc.setCapability(MobileCapabilityType.UDID , "RZ8NB0HBH8H");
            
//            dc.setCapability("appPackage", "com.antariksha.donation");
//            dc.setCapability("appActivity", "com.antariksha.donation.activities.MainActivity");
            
//            dc.setCapability("appPackage", "org.shreesandesh.messenger");
//            dc.setCapability("appActivity", "org.telegram.ui.LaunchActivity");
          dc.setCapability("appPackage", "com.antariksha.donor");
        dc.setCapability("appActivity", "com.antariksha.donor.activities.SplashScreenActivity");
          dc.setCapability("autoGrantPermissions", "true");
//          dc.setCapability("appActivity", "com.antariksha.donor.activities.LoginActivity");
          
//          com.antariksha.donor:id/ed_username
//          com.antariksha.donor:id/ed_password
//          com.antariksha.donor:id/button_login
          
            
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            
            AndroidDriver driver = new AndroidDriver(url,dc);
            
          //  driver.quit();
           // MobileElement t;
            Thread.sleep(5000);
            WebElement user = driver.findElement(By.id("com.antariksha.donor:id/ed_username"));
            WebElement pass = driver.findElement(By.id("com.antariksha.donor:id/ed_password"));
            WebElement button = driver.findElement(By.id("com.antariksha.donor:id/button_login"));
            
            user.sendKeys("D696620");
            pass.sendKeys("1133");
            button.click();
            Thread.sleep(5000);
           
            WebElement Lbutton = driver.findElement(By.id("com.antariksha.donor:id/btn_logout"));
            Lbutton.click();
            Thread.sleep(5000);
            WebElement Lok = driver.findElement(By.id("android:id/button1"));
            Lok.click();
            
	}

}
