package com.rough.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("Start the journey");
		System.setProperty("webdriver.gecko.driver","E:\\Selenium\\Jar_Lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.close();
	}

}
