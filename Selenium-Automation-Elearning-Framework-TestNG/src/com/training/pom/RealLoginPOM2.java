package com.training.pom;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RealLoginPOM2 {
	
	
private WebDriver driver; 
	
	public RealLoginPOM2(WebDriver driver) {
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
	
	@FindBy(xpath="//select[@id='new_role']")
	private WebElement changerole;
	
	public void ChangeRole()
	{
		
		new Select(this.changerole).selectByVisibleText("Agent");
		
	}
	
	@FindBy(xpath="//input[@id='changeit']")
			private WebElement change;
	
	public void Change()
	{
		this.change.click();
	}

}
