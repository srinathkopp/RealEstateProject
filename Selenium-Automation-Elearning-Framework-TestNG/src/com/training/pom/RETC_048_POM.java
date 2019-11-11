package com.training.pom;
import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RETC_048_POM {
	
private WebDriver driver; 

	public RETC_048_POM(WebDriver driver) {
					
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//div[contains(text(),'Properties')]")
	private WebElement prop; 
	
	public void Properties() {
		this.prop.click(); 
	}
		
	@FindBy(xpath="//a[@class='wp-first-item current']")
	
	WebElement allprop;
	public void AllProperties()
	{
		this.allprop.click();
		
		}
	
	@FindBy(xpath="//li[@class='trash']//a[contains(text(),'Trash')]")
	WebElement trashno;
	public void TrashNo()
	{
		this.trashno.click();
	}
	
	@FindBy(xpath="//input[contains(@type,'checkbox' )and  @name='post[]']")
	private List<WebElement> checkbx;
	public void Select()
		{ this.checkbx.get(1).click();
		
	}
	
	@FindBy(xpath="//tr//a[contains(text(),'Restore')]")
	private List<WebElement> rest;
	public void Rest()
	{Actions action= new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,60);
	wait.until(ExpectedConditions.elementToBeClickable(this.rest.get(1)));
		action.moveToElement(this.rest.get(1)).click().build().perform(); 
	//this.rest.get(1).click();
}

	@FindBy(xpath="//p[contains(text(),'1 post restored from the Trash.')]")
	 WebElement result;
	@FindBy(xpath="//li[@class='all']//a[contains(text(),'All')]")
	WebElement all;
	public void Result()
	
	{
		assertEquals("1 post restored from the Trash.",result.getText());
		System.out.println("testcase retc048 passed and verified");
		
		this.all.click();
		
	}
	
	
	
}
