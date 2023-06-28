Feature: Login Data Driven with Excel

  @sanity
  Scenario Outline: Login Data Driven Excel
    Given User Launch Browser
    And opens URL "http://localhost/opencart/upload/index.php"
    When User Navigate to My AccountMenu
    And Click on Login
    Then check user navigates to MyAccount Page by passing Email and Password with excel row "<row_index>"

    Examples: 
      | row_index |
      |         1 |
      |         2 |
      |         3 |
      
      
