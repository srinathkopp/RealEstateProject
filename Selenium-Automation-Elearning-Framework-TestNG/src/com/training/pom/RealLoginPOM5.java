package com.training.pom;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RealLoginPOM5 {
	
	
private WebDriver driver; 
	
	public RealLoginPOM5(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(text(),'Properties')]")
	private WebElement prop; 
	
	public void Properties() {
		this.prop.click(); 
	}
	
	@FindBy(xpath="//a[contains(text(),'All Properties')]")
	private WebElement allprop; 
	
	public void AllProperties() {
		this.allprop.click(); 
	}
	
	
	
	@FindBy(xpath="//select[@id='filter-by-date']")
	private WebElement dates;
	
	@FindBy(xpath="//input[@id='post-query-submit']")
	private WebElement filter;
	public void AllDates() throws InterruptedException
	{
		new Select(this.dates).selectByVisibleText("March 2018");
		this.filter.click();
		Thread.sleep(3000);
		new Select(this.dates).selectByVisibleText("September 2019");
		this.filter.click();
		
		
	}
	
		
	
	
	
	

}
