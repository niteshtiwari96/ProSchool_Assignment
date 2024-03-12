Feature: ProSchool Website Application 

	As a user
In order to explore the features of ProSchool Website
I want to visit https://proschool.ai/

@MobileTest 
Scenario: User wants to open into ProSchool website 
	Given  ProSchool website is open in the browser 
	Then  the website is launched successfully
	
@RegTest
Scenario: User wants to login into ProSchool website
    When user clicks on login menu button
    Then Welcome to ProSchool page is displayed
    When user clisks on student option button
    Then user Enter EmailID
    | erniteshtiwari186@gmail.com  | 
    And  user Enter Password 
    |  blu3@T0p    |
    When user clicks on login button
    Then user succussfully complete the login process