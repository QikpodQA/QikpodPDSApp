package com.qikpod.testCases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qikpod.pageObject.BaseClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AccountsDetails extends BaseClass{
	public static AndroidDriver<AndroidElement> driver;
	
	@Test
	public void account() throws MalformedURLException, InterruptedException
	{
		driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//android.widget.EditText[@text='enter phone number']")).sendKeys("8892486148");
		driver.findElement(By.xpath("//android.view.ViewGroup[3]")).click();
		Thread.sleep(10000);
		driver.findElementByXPath("//android.widget.TextView[@text='Account']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Account Settings']").click();
		driver.findElementByXPath("//android.widget.EditText[@text='full name']").sendKeys("vinay");
		driver.findElementByXPath("//android.widget.EditText[@text='email address']").sendKeys("vinay.kumar@gmail.com");
		driver.findElementByXPath("//android.widget.EditText[@text='Employee ID']").sendKeys("Qikpod@1234");
		driver.findElementById("android:id/text1").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Flipkart\"));");
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='Flipkart']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Save Changes']").click();
		
		
		
		
	}

}
