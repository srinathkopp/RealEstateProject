package com.training.pom;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RealLoginPOM6 {
	


private WebDriver driver; 


	public RealLoginPOM6(WebDriver driver) {
		
				
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//li[@id='menu-item-617']//a[contains(text(),'Blog')]")
	private WebElement blog; 
	
	public void Blog() {
		this.blog.click(); 
	}
	

	@FindBy(xpath="//div[@class='col-md-8']//div[@id='post-6507']//a[@class='read-more'][contains(text(),'Read More')]")
		private WebElement readmore;

		public void NewLaunche()
	{	Actions action= new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,60);
	wait.until(ExpectedConditions.elementToBeClickable(readmore));
		action.moveToElement(readmore).click().build().perform();
		
	}
	
	@FindBy(xpath="//textarea[@id='comment']")
	WebElement textarea;
	public void EnterText(String textarea)
	{
		this.textarea.sendKeys(textarea);
		
		
	}
	@FindBy(xpath="//input[@id='author']")
	WebElement name;
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	public void NameEmail(String name ,String email)
	{
		this.name.sendKeys(name);
		this.email.sendKeys(email);
		
	}
	
	
	@FindBy(xpath="//input[@id='submit']")
	
	WebElement postcomment;
	public void PostComment()
	{
		this.postcomment.click();
		
		
	}
	
	@FindBy(xpath="//div[contains(text(),'Comments')]")
	WebElement comment;
	
	public void Comments()
	{
		this.comment.click();
		
		}
	
	@FindBy(xpath="//p[contains(text(),'somethingg to read1')]")
	WebElement hovercomment;
	public void CommentHover()
		{ this.hovercomment.click();
		
	}
	
	
	@FindBy(xpath="//p[contains(text(),'somethingg to read1')]")
	WebElement reply;
	public void Reply()
	{ this.reply.click();
	
}
	
	@FindBy(xpath="//textarea[@id='replycontent']")
	WebElement textarea2;
	public void TextArea(String textarea2)
	{
		this.textarea.sendKeys(textarea2);
	}
	
	
	@FindBy(xpath="//span[@id='replybtn']")
	WebElement approvereply;
	public void ApproveReply()
	{
		this.approvereply.click();
		
	}
	
	

}
