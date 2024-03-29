package com.training.sanity.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RealLoginPOM;
import com.training.pom.RealLoginPOM2;
import com.training.pom.RealLoginPOM3;
import com.training.pom.RealLoginPOM4;
import com.training.pom.RealLoginPOM5;
import com.training.pom.RealLoginPOM6;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RealLoginTests2 {
	
	private WebDriver driver;
	private String baseUrl;
	private RealLoginPOM loginPOM;
	private RealLoginPOM6 pom6;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new RealLoginPOM(driver); 
		pom6=new RealLoginPOM6(driver);
		
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		
//	    		loginPOM.sendUserName("admin");
//		loginPOM.sendPassword("admin@123");
//		loginPOM.clickLoginBtn(); 
//		screenShot.captureScreenShot("Login");
		
			
		Thread.sleep(3000);
	
      pom6.Blog();
      
      Thread.sleep(2000);
	
	pom6.NewLaunche();
      
	pom6.EnterText("somethingg to read1");
	pom6.NameEmail("ramu1", "ramu2@gmail.com");
	pom6.PostComment();
	
	Thread.sleep(3000);
	
   driver.get(baseUrl);
loginPOM.sendUserName("admin");
  loginPOM.sendPassword("admin@123");
  loginPOM.clickLoginBtn();


  pom6.Comments();
pom6.CommentHover();
pom6.Reply();
 

  Thread.sleep(3000);
  
  pom6.TextArea("adding some comments");
	
  pom6.ApproveReply();
	}
	
	

}
