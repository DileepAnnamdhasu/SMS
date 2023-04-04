
Feature: student admissionPage search

  Scenario: verifying  student  search

    Given user is navigating to student admission page
    When  user is on student admission page
    Then user enters the text in  firstName
    And user enters the text in lastName
    And user enters the text in phone
    And user select the program from program drop down
    And user select the class from class drop down
    And user select the acodemyYear from acodemy drop down
    And user click on search button
    Then user can find the search results

