package com.qikpod.testCases;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qikpod.pageObject.BaseClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPage extends BaseClass {

	public static AndroidDriver<AndroidElement> driver;
	
	@Test
	public void login() throws MalformedURLException, InterruptedException
	{
		driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='enter phone number']")).sendKeys("9482779997");
		driver.findElement(By.xpath("//android.view.ViewGroup[3]")).click();
		Thread.sleep(10000);
		String el =driver.findElementsByXPath("//android.widget.TextView[3]").get(1).getText();
		System.out.print(el);
		driver.findElementByXPath("//android.view.ViewGroup[@bounds='[648,2018][703,2061]']").click();
		driver.findElementByXPath("//android.widget.EditText[@text='Enter AWB number or Pod ID']").sendKeys(el);
		driver.findElementByXPath("android.widget.TextView[@text='Submit']").click();
		driver.findElementByXPath("//android.view.ViewGroup[3]").click();
		
		
		
		
		
		
	}
}
