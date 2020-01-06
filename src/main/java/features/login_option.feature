# new feature
# Tags: optional

Feature: Login option

  Scenario: Customer choose login option successfully
    Given Open website http://www.way2automation.com/angularjs-protractor/banking/#/login
    When I click customer login button
    Then I verify system navigates to customer login page
