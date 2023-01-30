package com.nopCom.stepDefinitions;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.nopCom.pageObject.AddCustomerPage;
import com.nopCom.pageObject.AdminPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BasePage{
	
	
	
	
	@Given("user launches google chrome")
	public void user_launches_google_chrome() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "E:\\Automation_Course_2022\\Selenium Softwares\\chromedriver.exe");
	    driver = new ChromeDriver();
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	}

	@When("User open url {string}")
	public void user_open_url(String url) throws InterruptedException{
	    admin = new AdminPage(driver);
	    driver.get(url);
	    Thread.sleep(3000);
	}

	@And("user enters email as {string} password is {string}")
	public void user_enters_email_as_password_is(String string, String string2) throws InterruptedException {
		admin = new AdminPage(driver);
		admin.setEmail(string);
		admin.setPass(string2);
		Thread.sleep(3000);
	}

	@And("clcick on login")
	public void clcick_on_login() throws InterruptedException{
		admin = new AdminPage(driver);
		admin.setLogin();
		Thread.sleep(3000);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) throws InterruptedException {
	    driver.close();
	    Thread.sleep(2000);
	}
	
	@Then("User can view customer")
	public void user_can_view_customer() throws InterruptedException{
//		addcust = new AddCustomerPage(driver);
//		Thread.sleep(3000);
//		Assert.assertEquals("Dashboard / non Commerce administration", addcust.getTitle());
	}

	@When("user click on customers menu")
	public void user_click_on_customers_menu() throws InterruptedException {
		addcust = new AddCustomerPage(driver);
		Thread.sleep(3000);
		addcust.getCustomersMenu().click();
		
	}

	@When("user click on customers menu item")
	public void user_click_on_customers_menu_item() throws InterruptedException{
		addcust = new AddCustomerPage(driver);
		Thread.sleep(3000);
		addcust.getCustomersItem().click();
	}

	@When("user click on add new customer button")
	public void user_click_on_add_new_customer_button() throws InterruptedException{
		addcust = new AddCustomerPage(driver);
		Thread.sleep(3000);
		addcust.getAddNew().click();;
	}

	@Then("user can view add new customer page")
	public void user_can_view_add_new_customer_page() throws InterruptedException {
//		addcust = new AddCustomerPage(driver);
//		Thread.sleep(3000);
//		Assert.assertEquals("Add a new customer / nopCommerce administration", addcust.getTitle());
	}

	@When("enter customer info as {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void enter_customer_info_as_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7) throws InterruptedException {
		addcust = new AddCustomerPage(driver);
		Thread.sleep(3000);
		addcust.getCustEmail().sendKeys(string);
		addcust.getCustPass().sendKeys(string2);
		addcust.getFname().sendKeys(string2);
		addcust.getLname().sendKeys(string3);
		addcust.setGender(string4);
		addcust.getDob().sendKeys(string5);;
		addcust.getCompanyName().sendKeys(string6);
		addcust.getAdminComment().sendKeys(string7);
		Thread.sleep(2000);
	}

	@When("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
		addcust = new AddCustomerPage(driver);
		Thread.sleep(3000);
		addcust.getCustsave().click();
		Thread.sleep(2000);
	}

	@Then("user can verify confirmation message as {string}")
	public void user_can_verify_confirmation_message_as(String string) throws InterruptedException{
		addcust = new AddCustomerPage(driver);
		
	}

	@Then("close browser")
	public void close_browser() throws InterruptedException{
		addcust = new AddCustomerPage(driver);
		driver.close();
	}
}