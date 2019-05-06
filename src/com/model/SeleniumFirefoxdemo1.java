package com.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirefoxdemo1 {

	public static void main(String[] args) {
		

	 System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.get("https://www.google.com");
	
	}

}
