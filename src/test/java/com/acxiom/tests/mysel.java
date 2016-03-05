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
DesiredCapabilities caps = DesiredCapabilities.firefox();
caps.setBrowserName("firefox");
caps.setPlatform(Platform.WINDOWS);
dr=new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), caps);
	dr.get("http://www.google.com");
	
}
	
	
	
}
