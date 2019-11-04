package com.training.pom;
import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RealLoginPOM {
	
	
private WebDriver driver; 
	
	public RealLoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_login")
	private WebElement userName; 
	
	@FindBy(id="user_pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement SigninBtn; 
	
	@FindBy(xpath="//div[contains(text(),'Posts')]")
	private WebElement posts;
	
	@FindBy(xpath="//li[@id='menu-posts']//ul[@class='wp-submenu wp-submenu-wrap']//li//a[contains(text(),'Tags')]")
	private WebElement tags;
	
	
	@FindBy(xpath="//input[contains(@type,'checkbox' )and  @name='delete_tags[]']")
	private List<WebElement> checkbx;
	

	@FindBy(xpath="//select[@id='bulk-action-selector-bottom']")
	private WebElement bulkact;
	
	
	@FindBy(xpath="//input[@id='doaction2']")
	private WebElement apply;	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.SigninBtn.click(); 
	}

	public void Postsmain() {
		this.posts.click(); 
		
	}
	public void PostsTags() {
		this.tags.click(); 
		
	}
	
	//select any one check box
	
	public void checkclick()
	{
		
		this.checkbx.get(0).click();
						
		
	}
	public void BulkactDelete()
	{
		
		new Select(this.bulkact).selectByVisibleText("Delete");
					
		
	}

	public void Bulkactapply()
	{
		
	this.apply.click();
					
		
	}
	
}
