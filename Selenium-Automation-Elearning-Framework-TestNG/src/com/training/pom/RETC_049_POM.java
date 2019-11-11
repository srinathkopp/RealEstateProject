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

public class RETC_049_POM {
	
private WebDriver driver; 

	public RETC_049_POM(WebDriver driver) {
					
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
	
	
	
	@FindBy(xpath="//input[contains(@type,'checkbox' )and  @name='post[]']")
	private List<WebElement> checkbx;
	public void Select()
		{ this.checkbx.get(1).click();
		
	}
	
	@FindBy(xpath="//tr//a[@class='submitdelete'][contains(text(),'Trash')]")
	private List<WebElement> trash;
	public void Trash()
	{Actions action= new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,60);
	wait.until(ExpectedConditions.elementToBeClickable(this.trash.get(1)));
		action.moveToElement(this.trash.get(1)).click().build().perform(); 
	//this.rest.get(1).click();
}

	@FindBy(xpath="//p[contains(text(),'1 post moved to the Trash.')]")
	 WebElement result;
	
	public void Result()
	
	{
		assertEquals("1 post moved to the Trash. Undo",result.getText());
		System.out.println("moved to trash");
		
		
	}
	@FindBy(xpath="//li[@class='trash']//a[contains(text(),'Trash')]")
	WebElement trashno;
	public void TrashNo()
	{
		this.trashno.click();
		
	}
	
	@FindBy(xpath="//input[contains(@type,'checkbox' )and  @name='post[]']")
	private List<WebElement> checkbx2;
	public void Select2()
		{ this.checkbx2.get(1).click();
		
	}
	
	
	@FindBy(xpath="//tr//a[@class='submitdelete'][contains(text(),'Delete Permanently')]")
	private List<WebElement> delperm;
	public void DeletePerm()
	{Actions action= new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,60);
	wait.until(ExpectedConditions.elementToBeClickable(this.delperm.get(1)));
		action.moveToElement(this.delperm.get(1)).click().build().perform(); 
	//this.rest.get(1).click();
}
	
	//1 post permanently deleted.
	
	@FindBy(xpath="//p[contains(text(),'1 post permanently deleted.')]")
	 WebElement result2;
	
	public void Result2()
	
	{
		assertEquals("1 post permanently deleted.",result2.getText());
		System.out.println("record deleted permanently");
		
		
	}
	
	
}
