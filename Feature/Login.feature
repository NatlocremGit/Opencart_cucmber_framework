Feature: Login with valid Credentials

  @sanity
  Scenario: Successful Login with Valid Credentials
    Given User Launch Browser
    And opens URL "http://localhost/opencart/upload/index.php"
    When User Navigate to My AccountMenu
    And Click on Login
    And User Enters email as "nat_raj84@yahoo.co.in" and password as "Monat29"
    And Click on Login button
    Then User Navigates to MyAccount page
