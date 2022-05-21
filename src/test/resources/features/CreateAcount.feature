Feature:Create account

  @Account
  Scenario:User can sign in with valid credential
    Given the homepage is opened
    When clicks sign in button and enter the email for creating account
    Then navigates to account creation page
    And fills relevant areas with the valid credentials
    Then verifies in homepage that account is created



