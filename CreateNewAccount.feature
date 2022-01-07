#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Jpetstore New account 
 Scenario Outline: Test creating a new account in JPetstore All
 Given I go to the Jpetstore Login
 When I enter valid "<UserID>","<Newpassword>","<Repeatpassword>","<Fname>","<Lname>","<Email>","<Phone>","<Address1>","<City>","<Zip>","<State>","<Country>" combination
 Then I should be able create a new user with the User Information "<UserID>","<Newpassword>" successfully 
 Examples: 
 | UserID | Newpassword | Repeatpassword | Fname | Lname | Email | Phone | Address1 | City | Zip | State | Country |
 | yzhou | word | word | Fname | Lname | Email | Phone | Address1 | City | Zip | State | Country |
 | yzhou1 | word | word | Fname | Lname | Email | Phone | Address1 |  | Zip | State | Country |
 