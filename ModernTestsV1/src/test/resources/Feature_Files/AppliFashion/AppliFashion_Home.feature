Feature: AppliFashion Home

  Scenario: Task 1 – Cross-Device Elements Test

        # on Mac:
          # if ModernTestsV1 is not recognized as maven project: right Click on pom and add s maven project
          # if driver is not executable: chmod 777 chromedriver
          # if if there is problem with setting viewport size: change resolution to lower


    When I validate that AppliFashion Home page is successfully displayed
#    Then I make Applitools Visual Test validation running Locally with screenshot name: "Task 1"
    Then I make Applitools Visual Test validation running via UltraFast Grid with test name: "Task 1" and step name: "Cross-Device Elements Test"
#    Then I make Applitools Visual Test validation with screenshot name: "AppliFashion Home page 2"
#    Then I validate the page using Applitools Eyes

#    Given I successfully login to facebook with email "jasecuframework@gmail.com" and password "Jasecu12"
#    Then Facebook Welcome Page is successfully displayed
#
#  @LoginTest
#  Scenario: Successful Login to Facebook with default credentials
#
#    When I login to facebook with default credentials
#    Then Facebook Welcome Page is successfully displayed
#
#  @LoginTest
#  Scenario Outline: Unsuccessful Login to Facebook
#    When I unsuccessfully login to facebook with email "<email>" and password "<password>"
#    Then Because of "<reason of problem>" Incorrect Login Page is displayed with following message "<message>"
#
#    Examples:
#    |reason of problem               |email                      |password   |message                                                                                     |
#    |Incorrect password              |jasecuframework@gmail.com  |JasecuXX12X|The password you’ve entered is incorrect. Forgot Password?                                  |
#    |Incorrect email or phone number |jasecuxxframeworkx         |Jasecu12   |The email or phone number you’ve entered doesn’t match any account. Sign up for an account. |
#    |Incorrect email                 |xyzadsfasd@gmail.com       |Jasecu12   |The email you’ve entered doesn’t match any account. Sign up for an account.                 |
#    |Incorrect email and password    |xyzadsfasd@gmail.com       |JasecuXX12X|The email you’ve entered doesn’t match any account. Sign up for an account.                 |

  Scenario: Task 2 - Shopping Experience Test


    When I validate that AppliFashion Home page is successfully displayed
    And I maximize the browser
    And I select "Black" checkbox
    And I click on "Filter" button
    #Then I make Applitools Visual Test validation running Locally with test name: "Task 2" and step name: "Filter Results"
    Then I make Applitools Visual Test validation running via UltraFast Grid with test name: "Task 2" and step name: "Filter Results"

    # TODO: how to group all the tests into one batch + change eyes.check - Target ?