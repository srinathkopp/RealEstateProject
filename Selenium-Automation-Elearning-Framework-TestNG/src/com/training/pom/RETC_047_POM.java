package com.training.pom;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RETC_047_POM {
	


private WebDriver driver; 


	public RETC_047_POM(WebDriver driver) {
		
				
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(xpath="//div[contains(text(),'Properties')]")
	private WebElement prop; 
	
	public void Properties() {
		this.prop.click(); 
	}
	

	
	@FindBy(xpath="//a[@class='page-title-action']")
	
	WebElement addnew;
	public void AddNew()
	{
		this.addnew.click();
		
		
	}
	
	@FindBy(xpath="//input[@id='title']")
	WebElement proptitle;
	
	public void PropTitle(String proptitle)
	{
		this.proptitle.clear();
		this.proptitle.sendKeys(proptitle);
		
		}
	@FindBy(xpath="//textarea[@id='content']")
	WebElement content;
	public void Content(String content)
	{
		this.content.clear();
		this.content.sendKeys(content);
		
		}
	
	@FindBy(xpath="//input[@id='in-property_feature-416']")
	WebElement checkbox;
	public void AddedChk()
	
	{
		this .checkbox.click();
	}
	
	
	@FindBy(xpath="//a[@class='submitdelete deletion']")
	WebElement movetrash;
	public void Trash()
	{
		this.movetrash.click();
		
	}
	
	public void alert()
	{
		Alert simpleAlert = driver.switchTo().alert();
		 String alertText = simpleAlert.getText();
		 System.out.println("Alert text is " + alertText);
		 simpleAlert.accept();
	}
	
	@FindBy(xpath="//li[@class='trash']//a[contains(text(),'Trash')]")
	WebElement trashno;
	public void TrashNo()
	{
		this.trashno.click();
	}
	
//	public boolean isAlertPresent() 
//	{ 
//	    try 
//	    { 
//	        driver.switchTo().alert(); 
//	        return true; 
//	    }   // try 
//	    catch (NoAlertPresentException Ex) 
//	    { 
//	        return false; 
//	    }   // catch 
//	}   // isAlertPresent()
//	
	
	
	
	
}
