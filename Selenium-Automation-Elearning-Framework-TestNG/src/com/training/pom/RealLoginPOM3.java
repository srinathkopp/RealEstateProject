package com.training.pom;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RealLoginPOM3 {
	
	
private WebDriver driver; 
	
	public RealLoginPOM3(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(text(),'Users')]")
	private WebElement users; 
	
	public void clickUsers() {
		this.users.click(); 
	}
	
	
	
	@FindBy(xpath="//a[contains(text(),'All Users')]")
	
	private WebElement allusers; 
	
	public void clickAllUsers() {
		this.allusers.click(); 
	}
	
	
	@FindBy(xpath="//input[contains(@type,'checkbox') and @class='subscriber']")
	private List<WebElement> checkbx1; 
	
	public void Selectcheckbox() {
		
		this.checkbx1.get(0).click();
		
	}
	
	@FindBy(xpath="//select[@id='bulk-action-selector-top']")
	private WebElement bulkact2;
	
	public void BulkAction()
	{
		
		new Select(this.bulkact2).selectByVisibleText("Delete");
		
		
	}
	
	@FindBy(xpath="//input[@id='doaction']")
	private WebElement change;
	
	public void apply2()
	{
		this.change.click();
	}

	@FindBy(xpath="//input[@id='submit']")
	private WebElement confirm;

public void Confirm()
{
this.confirm.click();
}
//p[contains(text(),'User deleted.')]	
	
	
}
