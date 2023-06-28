Feature: Login Data Driven

  @sanity
  Scenario Outline: Login Data Driven
    Given User Launch Browser
    And opens URL "http://localhost/opencart/upload/index.php"
    When User Navigate to My AccountMenu
    And Click on Login
    And User Enters email as "<email>" and password as "<password>"
    And Click on Login button
    Then User Navigates to MyAccount page

    Examples: 
      | email                 | password |
      | nat_raj84@yahoo.co.in | Monat29  |
      | nat_raj84@yahoo.co.in | Monat@29 |
