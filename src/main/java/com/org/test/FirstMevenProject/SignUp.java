package com.org.test.FirstMevenProject;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

public class SignUp
{
WebDriver driver;//defined

public SignUp(WebDriver driver1)
{
	driver=driver1;
}

	public void signup() throws InterruptedException
	{
		System.out.println("Sign Up");
		driver.findElement(By.xpath("//*[@id='navbar-collapse']/ul/li[6]/a")).click();
		//driver.findElement(By.id(id))
		Thread.sleep(3000);
		
		driver.findElement(By.id("name")).sendKeys("Nikhil");
		driver.findElement(By.id("email")).sendKeys("babubhai@tracko.com");
		driver.findElement(By.id("mobile")).sendKeys("4444444443");
		driver.findElement(By.id("sub_btn_signup")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("otp")).sendKeys("123456");
		driver.findElement(By.id("sub_btn_verify")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		///html/body/div[3]/div[2]/button[1]
		driver.findElement(By.id("password")).sendKeys("niki@12345");
		driver.findElement(By.id("repassword")).sendKeys("niki@12345");
		driver.findElement(By.id("sub_btn_setpass")).click();	
	}

	
	
}
