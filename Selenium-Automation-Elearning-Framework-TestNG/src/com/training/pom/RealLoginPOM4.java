package com.training.pom;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RealLoginPOM4 {
	
	
private WebDriver driver; 
	
	public RealLoginPOM4(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(text(),'Users')]")
	private WebElement users; 
	
	public void clickUsers() {
		this.users.click(); 
	}
	
	
	
	@FindBy(linkText="Add New")
	private WebElement addnew; 
	
	public void AddNew() {
		this.addnew.click(); 
	}

	@FindBy(id="user_login")
	private WebElement username; 
	
	public void UserName(String username)
	{
		this.username.clear();
		this.username.sendKeys(username);
	}
	
		
	@FindBy(xpath="//input[@id='email']")
	private WebElement email; 
	
	public void Email(String email)
	{
		this.email.clear();
		this.email.sendKeys(email);
	}
	

	
	@FindBy(xpath="	//input[@id='first_name']")
	private WebElement fname; 
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lname;
	
	public void FullName(String fname,String lname)
	{
		this.fname.clear();
		this.fname.sendKeys(fname);
		this.lname.clear();
		this.lname.sendKeys(lname);
				
		
	}
	
	
	@FindBy(xpath="//input[@id='url']")
	private WebElement url;
	
	public void Website(String url)
	{
		this.url.clear();
		this.url.sendKeys(url);
		
	}
		

	@FindBy(xpath="//button[@class='button wp-generate-pw hide-if-no-js']")
	private WebElement showpass;
	
	public void ShowPass()
	{
	
		this.showpass.click();
	}
	
	
	@FindBy(xpath="//input[@id='pass1-text']")
	private WebElement enterpass;
	public void EnterPass(String enterpass)
	{
		this.enterpass.clear();
		this.enterpass.sendKeys(enterpass);
	}
	
	@FindBy(xpath="//select[@id='role']")
	private WebElement role;
	public void SelectRole()
	{
		new Select(this.role).selectByVisibleText("Agent");
	}
	
		
	@FindBy(xpath="//input[@id='createusersub']")
	private WebElement addnewuser;
	
	public void AddNewUser()
	{
		this.addnewuser.click();
		
	}
	
	

}
