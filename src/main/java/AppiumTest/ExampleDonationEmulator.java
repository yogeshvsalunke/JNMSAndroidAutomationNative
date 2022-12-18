package AppiumTest;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType; 


public class ExampleDonationEmulator {

	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub
            DesiredCapabilities dc=new DesiredCapabilities();
            
            dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
            dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            dc.setCapability(MobileCapabilityType.PLATFORM_VERSION ,"11.0");
            dc.setCapability(MobileCapabilityType.DEVICE_NAME , "Android Emulator");
            dc.setCapability("avd" , "AVD");
            dc.setCapability(MobileCapabilityType.APP, "E:\\Nanijdham\\appium\\com.antariksha.donation-2.38.apk");
            
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            
            AndroidDriver driver = new AndroidDriver(url,dc);
          //  driver.quit();
            
	}

}
