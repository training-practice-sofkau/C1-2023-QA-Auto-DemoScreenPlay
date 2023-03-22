Feature: Shopping on the Automation Exercise page
  As: Potential buyer
  I want: Create an account and login to shop for products on the site Automation Exercise
  So that

  Background: I am on home page
    Given I accessed the home page
    When I navigate to the registration form

  @Register
  Scenario: Customer registration
    And I fill in all registration fields
    Then I will be redirected to home page

  @Login
  Scenario: Customer login
    And I fill in all login fields
    Then I will see my name on home page

  @Purchase
  Scenario: Customer purchase
    And I fill in all login fields
    And I make a purchase of a men's jean
    Then I will see an order confirmation message