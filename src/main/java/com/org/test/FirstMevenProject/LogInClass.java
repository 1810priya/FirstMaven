package com.org.test.FirstMevenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInClass 
{
	WebDriver driver;
	
	public LogInClass(WebDriver driver1)
	{
		driver=driver1;
	}


	public void login() throws InterruptedException
	{
		System.out.println("Login class");
	Thread.sleep(5000);
	driver.findElement(By.id("login-mobile")).sendKeys("Siddhant");
	driver.findElement(By.id("login-mobile")).sendKeys("Priya");
	driver.findElement(By.id("login-password")).sendKeys("Siddhant@12345");
	driver.findElement(By.id("sub_btn")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@class='btn btn-sm btn-block btn-cta-primary']")).click();
	
	
	}

}

