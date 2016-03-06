package com.acxiom.tests;


import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class mysel {
protected WebDriver dr;
	
@Test
public void hey() throws IOException{
DesiredCapabilities caps = DesiredCapabilities.chrome();
caps.setBrowserName("chrome");
caps.setPlatform(Platform.WINDOWS);
System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
dr=new RemoteWebDriver(new URL("http://10.0.0.9:4444/wd/hub"), caps);
	dr.get("http://www.google.com");
	dr.close();
}
	
	
	
}
