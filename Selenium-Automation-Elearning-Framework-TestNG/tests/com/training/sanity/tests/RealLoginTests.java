package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RealLoginTests {
	
	private WebDriver driver;
	private String baseUrl;
	private RealLoginPOM loginPOM;
	private RealLoginPOM2 pom2;
	private RealLoginPOM3 pom3;
	private RealLoginPOM4 pom4;
	private RealLoginPOM5 pom5;
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
		pom2=new RealLoginPOM2(driver);
		pom3=new RealLoginPOM3(driver);
		pom4=new RealLoginPOM4(driver);
		pom5=new RealLoginPOM5(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		Thread.sleep(3000);
	    		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("Login");
		
			
		Thread.sleep(3000);
	

	loginPOM.Postsmain();
	loginPOM.PostsTags();
	Thread.sleep(3000);
	loginPOM.checkclick();
	loginPOM.BulkactDelete();
	loginPOM.Bulkactapply();
	
	Thread.sleep(3000);
	
	pom2.clickUsers();
	pom2.clickAllUsers();
	pom2.Selectcheckbox();
	pom2.ChangeRole();
	pom2.Change();
	
	Thread.sleep(3000);
	
	
	
	pom3.clickUsers();
	pom3.clickAllUsers();
	pom3.Selectcheckbox();
	pom3.BulkAction();
	pom3.apply2();
	Thread.sleep(3000);
	pom3.Confirm();
	Thread.sleep(3000);
	
	pom4.clickUsers();
	pom4.AddNew();
	Thread.sleep(3000);
	
	pom4.UserName("rama4");
	pom4.Email("rama4@gmail.com");
	pom4.FullName("rama4", "krishna");
	pom4.Website("www.google.com");
	pom4.ShowPass();
	pom4.EnterPass("Rama4@Jublee22");
	pom4.SelectRole();
	pom4.AddNewUser();
	
	Thread.sleep(3000);
	
	pom5.Properties();
	pom5.AllProperties();
	pom5.AllDates();
	
	
	}
	
	

}
