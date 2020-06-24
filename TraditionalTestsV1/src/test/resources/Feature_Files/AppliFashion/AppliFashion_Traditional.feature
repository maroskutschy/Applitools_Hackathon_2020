Feature: AppliFashion Traditional

  Scenario: UFG Hackathon - Applitools
    When I validate that AppliFashion Home page is successfully displayed
    Then I make Applitools Visual Test validation running via UltraFast Grid with test name: "Task 1" and step name: "Cross-Device Elements Test"
    And I maximize the browser
    And I select "Black" checkbox
    And I click on "Filter" button
    Then I make Applitools Visual Test validation of region: "product_grid" running via UltraFast Grid with test name: "Task 2" and step name: "Filter Results"
    And I click on item number "1" in the selection
    Then I make Applitools Visual Test validation running via UltraFast Grid with test name: "Task 3" and step name: "Product Details test"


  Scenario Outline: Task 1 - Cross-Device Elements Test

    Given I open AppliFashion Home page with "<browser>" browser and "<viewport>" viewport and "<device type>" devicr type
    When I validate that AppliFashion Home page is successfully displayed
    Then I validate if all relevant elements on the Home page for "task 1" are correctly dsiplayed

    When I unsuccessfully login to facebook with email "<email>" and password "<password>"
    Then Because of "<reason of problem>" Incorrect Login Page is displayed with following message "<message>"

    Examples:
      |reason of problem               |email                      |password   |message                                                                                     |
      |Incorrect password              |jasecuframework@gmail.com  |JasecuXX12X|The password you’ve entered is incorrect. Forgot Password?                                  |
      |Incorrect email or phone number |jasecuxxframeworkx         |Jasecu12   |The email or phone number you’ve entered doesn’t match any account. Sign up for an account. |
      |Incorrect email                 |xyzadsfasd@gmail.com       |Jasecu12   |The email you’ve entered doesn’t match any account. Sign up for an account.                 |
      |Incorrect email and password    |xyzadsfasd@gmail.com       |JasecuXX12X|The email you’ve entered doesn’t match any account. Sign up for an account.                 |
