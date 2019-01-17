package com.rough.learn;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("Start the journey");
		//System.setProperty("webdriver.gecko.driver","E:\\Selenium\\Jar_Lib\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		String key = "webdriver.chrome.driver";
		String value = "E:\\Selenium\\Jar_Lib\\chrome\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		Point p = new Point(350,250);
		driver.manage().window().setPosition(p);
	
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://qa-cons-gy.halosys.com/MobileManagerPortal/Login");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	
		driver.close();
	}

}
