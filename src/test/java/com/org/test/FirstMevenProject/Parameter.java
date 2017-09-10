package com.org.test.FirstMevenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Parameter {
	WebDriver driver;


	@Parameters("siddhant")
	@BeforeTest
	public void beforeTest(String Chrome) throws InterruptedException {
		if(Chrome.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();


		}
		else if(Chrome.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","resource/geckodriver.exe");
			driver=new FirefoxDriver();


		}


		driver.get("https://dev.tracko.co.in/");

		//driver.findElement(By.xpath("//*[@id='navbar-collapse']/ul/li[6]/a")).click();
	}	//Thread.sleep(1000);


	@Test(priority=1)
	public void signUp() throws InterruptedException
	{
		SignUp ref=new SignUp(driver);
		ref.signup();

	}
	@Test(priority=2)
	public void login() throws InterruptedException
	{
		LogInClass ref=new LogInClass(driver);
		ref.login();
	}

	@AfterTest
	public void afterTest()
	{
		driver.quit();	
	}
}
