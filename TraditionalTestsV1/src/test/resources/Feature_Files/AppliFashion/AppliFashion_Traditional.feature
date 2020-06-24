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
