Feature: Verify ETrade Home Page functionality

  Scenario: Refer a Friend link functionality

    Given User is in home page
    When User clicks on Refer a Friend links
    Then User enters User ID
    And User enters User password
    When user clicks on Log on button
    Then User see the Invalid Text
    But User does not see welcome text