Feature: Customer 


Scenario Outline: Add new customer

	Given user launches google chrome
	When User open url "https://admin-demo.nopcommerce.com/login"
	And user enters email as "admin@yourstore.com" password is "admin"
	And clcick on login
	Then User can view customer
	When user click on customers menu
	And user click on customers menu item
	And user click on add new customer button
	Then user can view add new customer page
	When enter customer info as "<emal>" and "<newPass>" and "<fname>" and "<lname>" and "<gender>" and "<cname>" and "<adminComment>"
	And user click on save button
	Then user can verify confirmation message as "The new customer has been added successfully"
	And close browser  
	
	Examples:
	| emal | newPass | fname | lname | gender | cname | adminComment |
	|test@gmail.com | praveen7* | praveen | malagi | Male | abc | abc |