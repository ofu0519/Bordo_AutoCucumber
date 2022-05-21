Feature:Create account

  @wip
  Scenario:User can sign in with valid credential
    Given the homepage is opened
    When clicks sign in button and enter the email for creating account
    Then navigates to account creation page
    And fills relevant areas with the valid credentials
    Then verifies in homepage that account is created


    @wip2
    Scenario: User adds products to the cart
      Given Signed user on the home page
