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

public class RETC_050_POM {
	
private WebDriver driver; 

	public RETC_050_POM(WebDriver driver) {
					
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
	private List<WebElement> restore1;
	public void Restore1()
	{Actions action= new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,60);
	wait.until(ExpectedConditions.elementToBeClickable(this.restore1.get(1)));
		action.moveToElement(this.restore1.get(1)).click().build().perform(); 
	//this.rest.get(1).click();
}
	
	@FindBy(xpath="//p[contains(text(),'1 post restored from the Trash.')]")
	 WebElement result;
	
	public void Result()
	
	{
		assertEquals("1 post restored from the Trash.",result.getText());
		System.out.println("restored");
		
		
	}
	
	@FindBy(xpath="//input[@id='post-search-input']")
	WebElement input;
	public void Input(String input)
	{
		this.input.sendKeys(input);
	}
	
	@FindBy(xpath="//input[@id='search-submit']")
	WebElement search;
	public void Search()
	{
		this.search.click();
	}
	
	
}
