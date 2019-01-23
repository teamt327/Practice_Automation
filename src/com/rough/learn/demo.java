package com.rough.learn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.XpiDriverService;
import org.openqa.selenium.interactions.ClickAction;

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
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		/*driver.get("https://google.com");
		Point p = new Point(350,250);
		driver.manage().window().setPosition(p);
	
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
*/		
		driver.get("https://qa-cons-gy.halosys.com/MobileManagerPortal/Login");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		WebElement email = driver.findElement(By.id("inputEmail"));
		if(email.isEnabled())
		{
			System.out.println("Its enabled");
			email.sendKeys("sonata;;p");
		}
		else
		{
			System.out.println("Its disabled");
		}
		driver.findElement(By.id("inputPassword")).sendKeys("sonata");
		System.out.println("PAssword is entered");
 		driver.findElement(By.xpath("//button[@type='submit']")).click();
 		System.out.println("Logged in successfully");
		//System.out.println(element.toString());
		
		//driver.close();
	}

}
