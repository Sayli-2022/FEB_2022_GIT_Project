package com.practice.GitProjectWithMaven_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		   driver= new ChromeDriver();
		   System.out.println("Launching Browser");
	}
		   
    @Test
	public void doLogin()
		   {
			   System.out.println("Executing Login Test");
			   driver.get("https://www.facebook.com/");
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			   
			   System.out.println("Entering Username");
			   
			   driver.findElement(By.xpath("//*[@id='email']")).sendKeys("saylideshpande1991@gmail.com");
  
			   driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("abcd");
			   
			   System.out.println("Entering Password");
			 
			   driver.findElement(By.name("login")).click();
			   
			   System.out.println("Clicking on login button");
			   
			   System.out.println("Logging into Facebook account");
		   }
		   
		  @AfterTest
		   public void QuitDriver()
		   {
			   if(driver!=null)
				   driver.close();
		   }
	}


