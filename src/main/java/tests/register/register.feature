Feature: register

  Scenario: user could register successfully
    Given User click on User Profile
    When click on register
    And Fill All Mandatory Field
    Then Validate that user profile contains button logout


