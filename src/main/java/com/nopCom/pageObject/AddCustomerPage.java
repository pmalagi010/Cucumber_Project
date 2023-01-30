package com.nopCom.pageObject;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	public AddCustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p")
	WebElement customersMenu;
	
	@FindBy(xpath="//p[text()=' Customers']")
	WebElement customersItem;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement addNew;
	
	@FindBy(xpath="//*[@id='Email']")
	WebElement custEmail;
	
	@FindBy(xpath="//*[@id='Password']")
	WebElement custPass;
	
	@FindBy(xpath="//*[@id='FirstName']")
	WebElement fname;
	
	@FindBy(xpath="//*[@id='LastName']")
	WebElement lname;
	
	@FindBy(xpath="//*[@id='Gender_Male']")
	WebElement genderMale;
	
	@FindBy(xpath="//*[@id='Gender_Female']")
	WebElement genderfemale;


	@FindBy(xpath="//*[@id='DateOfBirth']")
	WebElement dob;
	
	@FindBy(xpath="//*[@id='Company']")
	WebElement companyName;
	
	@FindBy(xpath="//*[@id='AdminComment']")
	WebElement adminComment;
	
	public WebElement getCustomersMenu() {
		return customersMenu;
	}

	public void setCustomersMenu(WebElement customersMenu) {
		this.customersMenu = customersMenu;
	}

	public WebElement getCustomersItem() {
		return customersItem;
	}

	public void setCustomersItem(WebElement customersItem) {
		this.customersItem = customersItem;
	}

	public WebElement getAddNew() {
		return addNew;
	}

	public void setAddNew(WebElement addNew) {
		this.addNew = addNew;
	}

	public WebElement getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(WebElement custEmail) {
		this.custEmail = custEmail;
	}

	public WebElement getCustPass() {
		return custPass;
	}

	public void setCustPass(WebElement custPass) {
		this.custPass = custPass;
	}

	public WebElement getFname() {
		return fname;
	}

	public void setFname(WebElement fname) {
		this.fname = fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public void setLname(WebElement lname) {
		this.lname = lname;
	}

	public WebElement getGenderMale() {
		return genderMale;
	}

	public void setGenderMale(WebElement genderMale) {
		this.genderMale = genderMale;
	}

	public WebElement getGenderfemale() {
		return genderfemale;
	}

	public void setGenderfemale(WebElement genderfemale) {
		this.genderfemale = genderfemale;
	}

	public WebElement getDob() {
		return dob;
	}

	public void setDob(WebElement dob) {
		this.dob = dob;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public void setCompanyName(WebElement companyName) {
		this.companyName = companyName;
	}

	public WebElement getAdminComment() {
		return adminComment;
	}

	public void setAdminComment(WebElement adminComment) {
		this.adminComment = adminComment;
	}

	
	public void setGender(String gender) {
		if(gender.equals("male")) {
			getGenderMale().click();
		}
		else {
			getGenderfemale().click();
		}
	}
	
	@FindBy(xpath="/html/head/title")
	WebElement title;

	public WebElement getTitle() {
		return title;
	}

	public void setTitle(WebElement title) {
		this.title = title;
	}
	
	@FindBy(xpath="//button[@name='save']")
	WebElement custsave;

	public WebElement getCustsave() {
		return custsave;
	}

	public void setCustsave(WebElement custsave) {
		this.custsave = custsave;
	}
	
}
