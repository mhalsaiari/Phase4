package com.appium.Base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<MobileElement> driver;
	
	public static DesiredCapabilities cap;
	
	public static void startEmulator() throws MalformedURLException {
		cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		/*
		// To test swiggy application on mobile browser
		 
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		*/
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
		// To test swiggy application on mobile browser, it works but nothing to test their seince i am not able to login
		// driver.get("https://www.swiggy.com");
	}
}
