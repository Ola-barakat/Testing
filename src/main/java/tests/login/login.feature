Feature: login

  Scenario Outline:user could login successfully
    Given Click on login from menu
    When  User login with credentials"<username>" and "<userpassword>"
    Then Validate that account is open Successfully
    Examples:
    |username|userpassword|
    |  olabarakat200004@gmail.com | Test@1234 |


