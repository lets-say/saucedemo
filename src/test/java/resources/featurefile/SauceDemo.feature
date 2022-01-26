Feature: Search functionality
  As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.

  Scenario: User navigates saucedemo page and complete the item purchas
    Given I am on saucedemo page
    When I login with credential username "standard_user" and password "secret_sauce"
    And I click on Login button
    And I filter the products by Price "Price (high to low)"
    And I select cheapest & costliest products and add to basket
    And I open shopping cart
    And I go to checkout
    And I enter details firstname "Abcd", lastName "Xyz" and zipPostalCode "Ha3 4lu"
    And I click on continue button
    And I click on finish button
    Then I should be able to see message "THANK YOU FOR YOUR ORDER"
