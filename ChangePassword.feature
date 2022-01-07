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
Feature: Test JPetStore ChangePassword

  Scenario Outline: Test JPetStore ChangePassword

    Given I log into the JPetStore page with valid credentials
    And I navigate to the my account page
    When I enter valid "<password>" and "<repeatPassword>" combination2
    Then I should be able to change my password successfully

    Examples: 
      | password                  | repeatPassword |
      | 123456789  								| 123456789      |
