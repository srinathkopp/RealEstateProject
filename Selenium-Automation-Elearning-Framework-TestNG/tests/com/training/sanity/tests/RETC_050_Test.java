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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RETC_047_POM;
import com.training.pom.RETC_048_POM;
import com.training.pom.RETC_049_POM;
import com.training.pom.RETC_050_POM;
import com.training.pom.RealLoginPOM;
import com.training.pom.RealLoginPOM2;
import com.training.pom.RealLoginPOM3;
import com.training.pom.RealLoginPOM4;
import com.training.pom.RealLoginPOM5;
import com.training.pom.RealLoginPOM6;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_050_Test {
	
	private WebDriver driver;
	private String baseUrl;
	private RealLoginPOM loginPOM;
	private RETC_050_POM pom50;
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
		pom50=new RETC_050_POM(driver);
		
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
		
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		
	pom50.Properties();
	pom50.AllProperties();
	pom50.TrashNo();
	pom50.Select();
	pom50.Restore1();
	pom50.Result();
	pom50.Properties();
	pom50.AllProperties();
    pom50.Input("sometitle");
    pom50.Search();
	
	
	
     
	}
	
	

}
