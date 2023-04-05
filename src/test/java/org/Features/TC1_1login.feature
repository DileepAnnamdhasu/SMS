Feature: sms login page

  Scenario: verifying  login page web elements UI test
    Given user is navigating to SMS login page
    When  user is on login page
    Then user is able to see sms image on the top
    And user is able to see userName textBox
    And user is able to see password textBox
    And user is able to see blocked eye symbol
    And user is able to see sign in button
    And user is able to see Reset Password link
    And user is able to see Forgot UserID
    And user is able to see Forgot password

  Scenario: verifying login page with invalid userName and valid password
      When user is on login page1
      Then user is able to enter userName
      And user is able to enter password
      And user is able to click on signIn button
      Then user will get validation message1

  Scenario: verifying login page with valid userName and invalid password
    When user is on login page2
    Then user is able to enter userName2
    And user is able to enter password2
    And user is able to click on signIn button2
    Then user will get validation message2

  Scenario: verifying login page with invalid userName and invalid password
    When user is on login page3
    Then user is able to enter userName3
    And user is able to enter password3
    And user is able to click on signIn button3
    Then user will get validation message3

  Scenario: verifying login page with valid userName and valid password
    When user is on login page4
    Then user is able to enter userName4
    And user is able to enter password4
    And user is able to click on signIn button4
    Then user will get validation message4

