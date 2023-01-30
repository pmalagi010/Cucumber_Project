package com.nopCom.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id='Email']")
	WebElement admemail;
	
	@FindBy(xpath="//*[@id='Password']")
	WebElement admpass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	
	public void setEmail(String email)
	{
		admemail.clear();
		admemail.sendKeys(email);
	}
	
	public void setPass(String pass)
	{
		admpass.clear();
		admpass.sendKeys(pass);
	}
	
	public void setLogin()
	{
		login.click();
	}
}
