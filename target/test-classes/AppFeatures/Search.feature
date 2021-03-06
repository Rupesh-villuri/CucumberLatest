Feature: Amazon Search functionality

  Scenario: search a product
    Given Amazon logins avaialble
    When enter "username" and "password"
    When search for a product with price 2000 and enter
    Then add to cart

  Scenario: Add a product
    Given Amazon logins avaialble
    When search for a product
    Then add to cart
    
    
    
    
