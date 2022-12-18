package AppiumTest;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.WebDriverWait;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.android.Activity;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.TouchAction;
import io.appium.java_client.driverscripts.*;

public class ExampleAppAndroidRealdevice {
	public static AndroidDriver driver = null;
	public static Wait<AndroidDriver> wait = null;
	public static FileInputStream objfile = null;
      
	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		// TODO Auto-generated method stub
            DesiredCapabilities dc=new DesiredCapabilities();
            
            dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
            dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            dc.setCapability(MobileCapabilityType.PLATFORM_VERSION ,"11.0");
            dc.setCapability(MobileCapabilityType.DEVICE_NAME , "Android");
            dc.setCapability(MobileCapabilityType.UDID , "RZ8NB0HBH8H");
//            dc.setCapability("avd" , "AVD");
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
            
             driver = new AndroidDriver(url,dc);
             wait = new AppiumFluentWait<AndroidDriver>(driver).withTimeout(Duration.ofSeconds(40));
             Properties obj = new Properties();
//             Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(250)).ignoring(NoSuchElementException.class)
//            		 .ignoring(TimeoutException.class);
            		
      	   
            try {
            	 ExampleAppAndroidRealdevice donor=	new ExampleAppAndroidRealdevice();
                           //Thread.sleep(5000);    	 
            			 //donor.loginLogOut();
				        // donor.goToadhyatm();
				         //donor.goToDGsangrah();
				       //  donor.CreateReceiptForSanjeevni(obj);
				         donor.CreateReceiptForMadhukari(obj);
				         donor.receiptHistory();				         
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             
          
          //  driver.quit();
           
             
//            WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/ed_username")));//driver.findElement(By.id("com.antariksha.donor:id/ed_username"));
//            WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/ed_password")));//driver.findElement(By.id("com.antariksha.donor:id/ed_password"));
//            WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/button_login")));//driver.findElement(By.id("com.antariksha.donor:id/button_login"));
//            user.sendKeys("D696620");
//            pass.sendKeys("1133");
//            button.click();
//        
//            WebElement TextViewAdhyatm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]")));//driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]"));            
//            TextViewAdhyatm.click();
//           
//            WebElement LableDigitalSangrah = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_digital_sangrah")));//driver.findElement(By.id("com.antariksha.donor:id/btn_digital_sangrah"));
//            LableDigitalSangrah.click();
//            WebElement BackButton =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_back")));// driver.findElement(By.id("com.antariksha.donor:id/btn_back"));
//                    BackButton.click();
//            WebElement BackButtonA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_back")));//driver.findElement(By.id("com.antariksha.donor:id/btn_back"));   
//                    BackButtonA.click(); 
//     
//            WebElement Lbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_logout")));//driver.findElement(By.id("com.antariksha.donor:id/btn_logout"));
//                    Lbutton.click();
//            WebElement Lok = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));// driver.findElement(By.id("android:id/button1"));
//                    Lok.click();
                        
	}

	public void loginLogOut() throws Exception
	{
		
		 WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/ed_username")));//driver.findElement(By.id("com.antariksha.donor:id/ed_username"));
         WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/ed_password")));//driver.findElement(By.id("com.antariksha.donor:id/ed_password"));
         WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/button_login")));//driver.findElement(By.id("com.antariksha.donor:id/button_login"));
         
        
        user.sendKeys("D696620");
        pass.sendKeys("1133");
        button.click();
        
        WebElement Lbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_logout")));//driver.findElement(By.id("com.antariksha.donor:id/btn_logout"));
        Lbutton.click();
        WebElement Lok = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));// driver.findElement(By.id("android:id/button1"));
        Lok.click();
        System.out.println("Completed login method");
     }
	
	public void goToadhyatm() throws Exception
	{ 
		
		 WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/ed_username")));//driver.findElement(By.id("com.antariksha.donor:id/ed_username"));
         WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/ed_password")));//driver.findElement(By.id("com.antariksha.donor:id/ed_password"));
         WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/button_login")));//driver.findElement(By.id("com.antariksha.donor:id/button_login"));
        
        user.sendKeys("D696620");
        pass.sendKeys("1133");
        button.click();
        
        WebElement TextViewAdhyatm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]")));//driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]"));            
        TextViewAdhyatm.click();
        WebElement BackButtonA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_back")));//driver.findElement(By.id("com.antariksha.donor:id/btn_back"));   
        BackButtonA.click(); 
        WebElement Lbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_logout")));//driver.findElement(By.id("com.antariksha.donor:id/btn_logout"));
        Lbutton.click();
        WebElement Lok = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));// driver.findElement(By.id("android:id/button1"));
         Lok.click();
        System.out.println("Completed Adhyatm method");
	}
	
	public void goToDGsangrah() throws Exception
	{

		WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/ed_username")));//driver.findElement(By.id("com.antariksha.donor:id/ed_username"));
        WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/ed_password")));//driver.findElement(By.id("com.antariksha.donor:id/ed_password"));
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/button_login")));//driver.findElement(By.id("com.antariksha.donor:id/button_login"));
        
        user.sendKeys("D696620");
        pass.sendKeys("1133");
        button.click();
        WebElement TextViewAdhyatm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]")));//driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]"));            
        TextViewAdhyatm.click();
//        com.antariksha.donor:id/btn_digital_sangrah
//        com.antariksha.donor:id/btn_back
        WebElement LableDigitalSangrah = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_digital_sangrah")));//driver.findElement(By.id("com.antariksha.donor:id/btn_digital_sangrah"));
                    LableDigitalSangrah.click();
        WebElement BackButton =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_back")));// driver.findElement(By.id("com.antariksha.donor:id/btn_back"));
          BackButton.click();
        WebElement BackButtonA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_back")));//driver.findElement(By.id("com.antariksha.donor:id/btn_back"));   
             BackButtonA.click(); 
           
        WebElement Lbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_logout")));//driver.findElement(By.id("com.antariksha.donor:id/btn_logout"));
             Lbutton.click();
        WebElement Lok = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));// driver.findElement(By.id("android:id/button1"));
                Lok.click();
           System.out.println("Completed DgSangrah method");
       }
	
	
	public void CreateReceiptForSanjeevni(Properties yojana) throws Exception
	{
		
		 WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/ed_username")));//driver.findElement(By.id("com.antariksha.donor:id/ed_username"));
         WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/ed_password")));//driver.findElement(By.id("com.antariksha.donor:id/ed_password"));
         WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/button_login")));//driver.findElement(By.id("com.antariksha.donor:id/button_login"));
         user.sendKeys("D696620");
//         TouchAction action = new TouchAction(driver);
//         action.tap(TapOptions.tapOptions().withElement(ElementOption.element(user)));
//         action.perform();
         
         highlightEleTap(driver, user);
//
//)
//         
//         driver.executeDriverScript("android.widget.FrameLayout.setBackgroundColor(Color.parseColor(\"#E7FC3A\"))");
//         driver.setElementResponseAttributes("android:background=\"#ffffffff");
//         JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//			Thread.sleep(1000,2);
//			jsExecutor.executeScript("android:background=\"#ffffffff'", user);
//					
//			Thread.sleep(1000,2);
        pass.sendKeys("1133");
        highlightEleTap(driver, pass);
        highlightEleTap(driver, button);
        //button.click();
        
        WebElement TextViewReceipt= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]")));//driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]"));            
        highlightEleTap(driver,TextViewReceipt );
       // TextViewReceipt.click();
        
        WebElement TextViewPeeth= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]")));
        //highlightEleTap(driver,TextViewPeeth );
         TextViewPeeth.click();
        
        List<WebElement> DropDownPith= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.ListView/android.widget.CheckedTextView")));
//        DropDownPith.get(0).click();
        for(int i =0 ; i<= DropDownPith.size();i++)
        {
        	if(DropDownPith.get(i).getText().equalsIgnoreCase("Mukhya Peeth Nanijdham"))
        	{
        	//	highlightEleTap(driver,DropDownPith.get(i) );
        		DropDownPith.get(i).click();
        		System.out.println("Selected peeth");
        		break;
        	}
        	
        }
        
        WebElement TextViewYojna= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]")));
       // highlightEleTap(driver,TextViewYojna );
        TextViewYojna.click();
        
        List<WebElement> DropDownYojna= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.ListView/android.widget.CheckedTextView")));
       
        System.out.println("Yojana : "+DropDownYojna.get(1).getText());
        String gh = "संजीवनी";
        if(DropDownYojna.get(1).getText().equalsIgnoreCase(gh))
        {
        	System.out.println("matched ");
        }
        objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\yojana.properties");				
	    yojana.load(objfile);
	    String yojanaIndex= yojana.getProperty("sanjivani");
	    //highlightEleTap(driver,DropDownYojna.get(Integer.parseInt(yojanaIndex)) );
        
	   DropDownYojna.get(Integer.parseInt(yojanaIndex)).click();  
	   
	    // System.out.println("counttheFunction "+counttheFunction);
	    
//      for(int i =0 ; i<= DropDownYojna.size();i++)
//      {
//      	if(DropDownPith.get(i).getText().equalsIgnoreCase(""))
//      	{
//      		DropDownPith.get(i).click();
//      		System.out.println("Selected Yojna");
//      		break;
//      	}
//      	
//      }
//      
//        driver.findElement(By.xpath("//android.widget.CheckedTextView/text(.,'Mukhya Peeth Nanijdham')")).click();   
//        Select dropdown = new Select(TextViewPeeth); 
//        dropdown.selectByVisibleText("Mukhya Peeth Nanijdham");
        //driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]"));            
       
	  //com.antariksha.donor:id/et_amount
	      //com.antariksha.donor:id/et_installment
	        //com.antariksha.donor:id/btn_create_receipt  
	    
	    WebElement Amount= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/et_amount")));
	    Amount.sendKeys("100");
	    	    
        WebElement Installments = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/et_installment")));
        Installments.sendKeys("0");
        highlightEleTap(driver,Installments );
         
        WebElement SubmitButton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_create_receipt")));
        highlightEleTap(driver,SubmitButton );
      //  SubmitButton.click();
	    
        //com.antariksha.donor:id/errorMessage
        WebElement Errormsg= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/errorMessage"))); 
        highlightEleTap(driver,Errormsg );
	    
        System.out.println(Errormsg.getText());
        
        //com.antariksha.donor:id/btn_ok
        WebElement ErrorOkButton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_ok"))); 
        highlightEleTap(driver,ErrorOkButton );
        //ErrorOkButton.click();
        
        
        WebElement BckButton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_back")));
        highlightEleTap(driver,BckButton );
	    
        //BckButton.click();
        
       // android.widget.LinearLayout0
        //android.widget.LinearLayout0
        
        WebElement Lbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_logout")));//driver.findElement(By.id("com.antariksha.donor:id/btn_logout"));
        highlightEleTap(driver,Lbutton );
      //  Lbutton.click();
        WebElement Lok = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));// driver.findElement(By.id("android:id/button1"));
        highlightEleTap(driver,Lok );
        //Lok.click();
        System.out.println("Completed receipt creation for sanjivani method");
     }
	

	public void CreateReceiptForMadhukari(Properties yojana) throws Exception
	{
		
		 WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/ed_username")));//driver.findElement(By.id("com.antariksha.donor:id/ed_username"));
         WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/ed_password")));//driver.findElement(By.id("com.antariksha.donor:id/ed_password"));
         WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/button_login")));//driver.findElement(By.id("com.antariksha.donor:id/button_login"));
         user.sendKeys("D696620");
//         TouchAction action = new TouchAction(driver);
//         action.tap(TapOptions.tapOptions().withElement(ElementOption.element(user)));
//         action.perform();
         
         highlightEleTap(driver, user);
//
//)
//         
//         driver.executeDriverScript("android.widget.FrameLayout.setBackgroundColor(Color.parseColor(\"#E7FC3A\"))");
//         driver.setElementResponseAttributes("android:background=\"#ffffffff");
//         JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//			Thread.sleep(1000,2);
//			jsExecutor.executeScript("android:background=\"#ffffffff'", user);
//					
//			Thread.sleep(1000,2);
        pass.sendKeys("1133");
        highlightEleTap(driver, pass);
        highlightEleTap(driver, button);
        //button.click();
        
        WebElement TextViewReceipt= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]")));//driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]"));            
        highlightEleTap(driver,TextViewReceipt );
       // TextViewReceipt.click();
        
        WebElement TextViewPeeth= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]")));
        //highlightEleTap(driver,TextViewPeeth );
         TextViewPeeth.click();
        
        List<WebElement> DropDownPith= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.ListView/android.widget.CheckedTextView")));
//        DropDownPith.get(0).click();
        for(int i =0 ; i<= DropDownPith.size();i++)
        {
        	if(DropDownPith.get(i).getText().equalsIgnoreCase("Mukhya Peeth Nanijdham"))
        	{
        	//	highlightEleTap(driver,DropDownPith.get(i) );
        		DropDownPith.get(i).click();
        		System.out.println("Selected peeth");
        		break;
        	}
        	
        }
        
        WebElement TextViewYojna= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]")));
       // highlightEleTap(driver,TextViewYojna );
        TextViewYojna.click();
        
        List<WebElement> DropDownYojna= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.ListView/android.widget.CheckedTextView")));
       
        //System.out.println("Yojana : "+DropDownYojna.get(1).getText());
        String gh = "माधुकरी";
       
        objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\yojana.properties");				
	    yojana.load(objfile);
	    String yojanaIndex= yojana.getProperty("Madhukari");
	 if(DropDownYojna.get(Integer.parseInt(yojanaIndex)).getText().equalsIgnoreCase(gh))
        {
        	System.out.println("Matched ");
        }
	    //highlightEleTap(driver,DropDownYojna.get(Integer.parseInt(yojanaIndex)) );
	 //System.out.println(DropDownYojna.get(Integer.parseInt(yojanaIndex)).getText());
	   DropDownYojna.get(Integer.parseInt(yojanaIndex)).click();
	   
	   
	    // System.out.println("counttheFunction "+counttheFunction);
	    
//      for(int i =0 ; i<= DropDownYojna.size();i++)
//      {
//      	if(DropDownPith.get(i).getText().equalsIgnoreCase(""))
//      	{
//      		DropDownPith.get(i).click();
//      		System.out.println("Selected Yojna");
//      		break;
//      	}
//      	
//      }
//      
//        driver.findElement(By.xpath("//android.widget.CheckedTextView/text(.,'Mukhya Peeth Nanijdham')")).click();   
//        Select dropdown = new Select(TextViewPeeth); 
//        dropdown.selectByVisibleText("Mukhya Peeth Nanijdham");
        //driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]"));            
       
	  //com.antariksha.donor:id/et_amount
  //com.antariksha.donor:id/btn_create_receipt  
	    
	    WebElement Amount= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/et_amount")));
	    Amount.sendKeys("0");
	    	    
         
        WebElement SubmitButton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_create_receipt")));
        highlightEleTap(driver,SubmitButton );
      //  SubmitButton.click();
	    
       
       // com.antariksha.donor:id/SuccessTitle
        WebElement Errormsg= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/SuccessTitle"))); 
        highlightEleTap(driver,Errormsg );
	    
        System.out.println(Errormsg.getText());
        
        //com.antariksha.donor:id/btn_ok
        WebElement ErrorOkButton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_ok"))); 
        highlightEleTap(driver,ErrorOkButton );
        //ErrorOkButton.click();
        
        
        WebElement BckButton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_back")));
        highlightEleTap(driver,BckButton );
	    
        //BckButton.click();
        
       // android.widget.LinearLayout0
        //android.widget.LinearLayout0
        
        WebElement Lbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_logout")));//driver.findElement(By.id("com.antariksha.donor:id/btn_logout"));
        highlightEleTap(driver,Lbutton );
      //  Lbutton.click();
        WebElement Lok = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));// driver.findElement(By.id("android:id/button1"));
        highlightEleTap(driver,Lok );
        //Lok.click();
        System.out.println("Completed receipt creation for Madhukari method");
     }
	
	
	public void receiptHistory()throws Exception
	{
		
		 WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/ed_username")));//driver.findElement(By.id("com.antariksha.donor:id/ed_username"));
         WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/ed_password")));//driver.findElement(By.id("com.antariksha.donor:id/ed_password"));
         WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/button_login")));//driver.findElement(By.id("com.antariksha.donor:id/button_login"));
         user.sendKeys("D696620");
//         TouchAction action = new TouchAction(driver);
//         action.tap(TapOptions.tapOptions().withElement(ElementOption.element(user)));
//         action.perform();
         
         highlightEleTap(driver, user);
//
//)
//         
//         driver.executeDriverScript("android.widget.FrameLayout.setBackgroundColor(Color.parseColor(\"#E7FC3A\"))");
//         driver.setElementResponseAttributes("android:background=\"#ffffffff");
//         JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//			Thread.sleep(1000,2);
//			jsExecutor.executeScript("android:background=\"#ffffffff'", user);
//					
//			Thread.sleep(1000,2);
        pass.sendKeys("1133");
        highlightEleTap(driver, pass);
        highlightEleTap(driver, button);
        //button.click();
        
        WebElement TextViewReceiptHistory= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]")));//driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]"));            
        highlightEleTap(driver,TextViewReceiptHistory );
       // TextViewReceiptHistory.click();
        
            //com.antariksha.donor:id/btn_donation_receipt
             WebElement ReceiptButton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_donation_receipt")));
                   ReceiptButton.click();
        
                   
                   
                   //com.antariksha.donor:id/btn_back
                   WebElement BckButtonDontnRcpt= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_back")));
                   highlightEleTap(driver,BckButtonDontnRcpt );
                   
        //com.antariksha.donor:id/btn_back
        WebElement BckButton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_back")));
        highlightEleTap(driver,BckButton );
	    
        //BckButton.click();
        
       // android.widget.LinearLayout0
        //android.widget.LinearLayout0
        
        WebElement Lbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.antariksha.donor:id/btn_logout")));//driver.findElement(By.id("com.antariksha.donor:id/btn_logout"));
        highlightEleTap(driver,Lbutton );
      //  Lbutton.click();
        WebElement Lok = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));// driver.findElement(By.id("android:id/button1"));
        highlightEleTap(driver,Lok );
        //Lok.click();
        System.out.println("Completed Receipt History method");
  	}
	
	public void highlightEleTap(AndroidDriver driver,WebElement ele)
	{
	TouchAction action = new TouchAction(driver);
    action.tap(TapOptions.tapOptions().withElement(ElementOption.element(ele)));
    action.perform();
	}
	
}

