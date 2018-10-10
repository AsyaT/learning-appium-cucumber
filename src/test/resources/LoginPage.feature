Feature: Login

  Scenario Outline: Login flow via app
    As a user I should be able to Login with my Email and Password

    When I click Login button

    And I fill in Email with "<login>"

    And A fill in Password with "<password>"

    Then I choose Login button



    Examples:
    |       login       |   password    |
    |test.user1@test.com|123456         |
    |test.user2@test.com|123456         |
