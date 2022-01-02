package com.appium.demo;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.appium.Base.Base;

public class AnnotationsAppium extends Base{

	
	@Test
	public void test1() throws MalformedURLException {
		
		startEmulator();
		
		driver.findElementByAccessibilityId("Preference").click();
		
		driver.findElementByAccessibilityId("3. Preference dependencies").click();
	}
	
	@Test
	public void test2() throws InterruptedException, MalformedURLException {
		
		startEmulator();
		driver.findElementsById("android:id/text1").get(9).click();
		Thread.sleep(2000);
		driver.findElementsById("android:id/text1").get(2).click();
		
		driver.findElementById("android:id/checkbox").click();
		
		driver.findElementsById("android:id/title").get(2).click();
		
		driver.findElementById("android:id/edit").sendKeys("mohammed123");
		
		driver.findElementById("android:id/button1").click();
	}
}
