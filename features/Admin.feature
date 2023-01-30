Feature: Login

@Sanity
Scenario: Successfully login with valid credentials

	Given user launches google chrome
	When User open url "https://admin-demo.nopcommerce.com/login"
	And user enters email as "admin@yourstore.com" password is "admin"
	And clcick on login
	Then page title should be "Dashboard / nop	Commerce administration"
	
@Smoke
Scenario Outline: Successfully login with valid credentials

	Given user launches google chrome
	When User open url "https://admin-demo.nopcommerce.com/login"
	And user enters email as "<email>" password is "<Password>"
	And clcick on login
	Then page title should be "Dashboard / nop	Commerce administration"
	
	Examples:
	|email | Password |
	|admin@yourstore.com |admin |