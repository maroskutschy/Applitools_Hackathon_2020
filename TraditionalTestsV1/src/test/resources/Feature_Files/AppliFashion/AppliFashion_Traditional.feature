Feature: AppliFashion Traditional

#  Scenario: UFG Hackathon - Applitools
#    When I validate that AppliFashion Home page is successfully displayed
#    Then I make Applitools Visual Test validation running via UltraFast Grid with test name: "Task 1" and step name: "Cross-Device Elements Test"
#    And I maximize the browser
#    And I select "Black" checkbox
#    And I click on "Filter" button
#    Then I make Applitools Visual Test validation of region: "product_grid" running via UltraFast Grid with test name: "Task 2" and step name: "Filter Results"
#    And I click on item number "1" in the selection
#    Then I make Applitools Visual Test validation running via UltraFast Grid with test name: "Task 3" and step name: "Product Details test"


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
    And I click on item number "1" in the selection
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