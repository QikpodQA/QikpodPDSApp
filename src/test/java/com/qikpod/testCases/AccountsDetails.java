package com.qikpod.testCases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.qikpod.pageObject.BaseClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AccountsDetails extends BaseClass{
	public static AndroidDriver<AndroidElement> driver;
	
	@Test
	public void account() throws MalformedURLException
	{
		driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		
	}

}
