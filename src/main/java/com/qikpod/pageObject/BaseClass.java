package com.qikpod.pageObject;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;



public class BaseClass {

	 public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException
	    {

	    	AndroidDriver<AndroidElement> driver;
	    	
	    	DesiredCapabilities cap =new DesiredCapabilities();
	    	cap.setCapability("deviceName", "Redmi");
			cap.setCapability("udid", "455026c10305");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "9");
			cap.setCapability("autoGrantPermissions", "true");
			cap.setCapability("appPackage", "com.pdsapp3");
			cap.setCapability("appActivity", "com.pdsapp.MainActivity");
			/*
	    	File f=new File("src");
			//File fs=new File(f,"original.apk");
			File fs=new File(f,"app-release.apk");
			
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "New_Device_API_28");
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
			//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "New_Device_API_28");
			cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
			*/
			driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			return driver;
				

	    }
}
