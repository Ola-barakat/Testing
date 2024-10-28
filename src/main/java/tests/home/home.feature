Feature: home


  Scenario Outline:Validate that only keyboard products only appear
    Given Click on login from menu
    When  User login with credentials"<username>" and "<userpassword>"
    And Validate that account is open Successfully
    And User is in home page
    And Click on Keyboards in categories in home page.
    And Click on Apply
    Then Validate that only keyboard products only appear
    Examples:
      | username                   | userpassword |
      | olabarakat200004@gmail.com | Test@1234    |

  Scenario Outline:Validate that product name and price are valid
    Given Click on login from menu
    When  User login with credentials"<username>" and "<userpassword>"
    And Validate that account is open Successfully
    And User is in home page
    And Click on Keyboards in categories in home page.
    And Click on Apply
    And Click on product Logitech Wireless Keyboard and Mouse Combo Black
    Then Validate that product name is "<product_name>"
    And Validate that product price is"<product_price>"
    Examples:
      |username|userpassword   | product_name                                               |product_price|
      |  olabarakat200004@gmail.com | Test@1234  | Logitech Wireless Keyboard and Mouse Combo - Black (MK270) | $33 |


  Scenario Outline:Validate that product cart is empty
    Given Click on login from menu
    When  User login with credentials"<username>" and "<userpassword>"
    And Validate that account is open Successfully
    And User is in home page
    And Click on Keyboards in categories in home page.
    And Click on Apply
    And Click on cart
    Then Validate that product cart are empty "<empty_message>"
    Examples:
      |username|userpassword|empty_message|
      |  olabarakat200004@gmail.com | Test@1234 |  No items added to cart  |


  Scenario Outline:Validate that product cart contain one element & Validate that product message
    Given Click on login from menu
    When  User login with credentials"<username>" and "<userpassword>"
    And Validate that account is open Successfully
    And User is in home page
    And Click on Keyboards in categories in home page.
    And Click on Apply
    And Click on product Logitech Wireless Keyboard and Mouse Combo Black
    And Click on Add to cart
    Then Validate that product message
    And Validate that product cart contain "<cart_item_count>" element

    Examples:
      |username|userpassword|cart_item_count|
    |  olabarakat200004@gmail.com | Test@1234 |      1   |



  Scenario Outline:Validate that two products which include (title and Price) added successfully to cart
    Given Click on login from menu
    When  User login with credentials"<username>" and "<userpassword>"
    And Validate that account is open Successfully
    And User is in home page
    And Click on Keyboards in categories in home page.
    And Click on Apply
    And Click on product Logitech Wireless Keyboard and Mouse Combo Black
    And Click on Add to cart
    And Click On product tap in header bar
    And Click on Laptop in categories in home page
    And Click on Apply
    And choose product name "<product_name>"
    And Click on Add to cart
    Then Validate that product cart contain "<cart_item_count>" element
    And Click on cart
    And Check total price "<total_price>"
    And Check product  "<title_1>" and product "<title_2>"

    Examples:
      |username|     userpassword        |cart_item_count |product_name|title_1            |title_2|total_price|
      |olabarakat200004@gmail.com|Test@1234|2 | Dell Chromebook 11 3120|   Logitech Wireless Keyboard and Mouse Combo - Black (MK270) |Dell Chromebook 11 3120 |$733.00|


  Scenario Outline:validate that shipping address are correct and total price
    Given Click on login from menu
    When  User login with credentials"<username>" and "<userpassword>"
    And User is in home page
    And Validate that account is open Successfully
    And Click on Keyboards in categories in home page.
    And Click on Apply
    And Click on product Logitech Wireless Keyboard and Mouse Combo Black
    And Click on Add to cart
    And Click On product tap in header bar
    And Click on Laptop in categories in home page
    And Click on Apply
    And choose product name "<product_name>"
    And Click on Add to cart
    And Click on cart
    And CLick on checkout
    And Fill the shipping address
    And Click on checkbox button
    And Click on Confirm button
    And press on Order details
    Then validate that shipping address contains "<country>" and "<State>" and "<Address1>" and "<Address2>"
    And  Total final price is "<total_price>"
    Examples:
      |username|userpassword | product_name |total_price         |country|State|Address1| Address2|
      |  olabarakat200004@gmail.com | Test@1234  |  Dell Chromebook 11 3120   |$733|Egypt| Giza | Address1|Address2|