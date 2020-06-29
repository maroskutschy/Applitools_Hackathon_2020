Feature: AppliFashion Traditional

  Scenario Outline: AppliFashion Traditional - all 3 tasks

    Given I open "AppliFashion Home" page with "<browser>" browser and "<width>" viewport width and "<height>" viewport height and "<device type>" device type
    When I validate that AppliFashion Home page is successfully displayed
    Then I validate after opening the page if all relevant elements on the Home page for task No "1" and "<browser>" browser and "<width>" viewport width and "<height>" viewport height and "<device type>" device type are correctly displayed
    When I maximize the browser
    And I select "Black" checkbox
    And I click on "Filter" button
    And I resize the browser to "<width>" viewport width and "<height>" viewport height
    Then I validate that number of found items is "2" for task No "2" and "<browser>" browser and "<width>" viewport width and "<height>" viewport height and "<device type>" device type
    And I validate after search for black colors if all relevant elements on the Home page for task No "2" and "<browser>" browser and "<width>" viewport width and "<height>" viewport height and "<device type>" device type are correctly displayed
    When I click on item number "1" in the selection
    Then I validate that selected value of size option is "Small (S)" for task No "3" and "<browser>" browser and "<width>" viewport width and "<height>" viewport height and "<device type>" device type
    And I validate that value of new price is "$33.00" for task No "3" and "<browser>" browser and "<width>" viewport width and "<height>" viewport height and "<device type>" device type
    And I validate if shoe image is displayed for task No "3" and "<browser>" browser and "<width>" viewport width and "<height>" viewport height and "<device type>" device type
    And I validate after click on item if all relevant elements on the Home page for task No "3" and "<browser>" browser and "<width>" viewport width and "<height>" viewport height and "<device type>" device type are correctly displayed

    Examples:
      |browser                         |width                   |height   |device type                           |
      |Chrome                          |1200                    |700      |Laptop                                |
      |Firefox                         |1200                    |700      |Laptop                                |
      |Edge Chromium                   |1200                    |700      |Laptop                                |
      |Chrome                          |768                     |700      |Tablet                                |
      |Firefox                         |768                     |700      |Tablet                                |
      |Edge Chromium                   |768                     |700      |Tablet                                |
      |Chrome                          |500                     |700      |Mobile                                |