@stories
  Feature: Utest Page
    As user, I want to join to page Utest

  @scenario1
  Scenario: Go to page Utest an login
    Given than Brandon wants to login in Utest page
    When he fill all the forms
      |strName  |strLastName  |strEmail                 |strZip  |strPassword   |strCity    |strCountry   |strLanguage |
      |Brandon  |Rogers       |brandonrogers1@email.com |00000   |r39c7"UY4{    |Paris      |France       |Spanish     |
    Then He can view the Utest welcome page
    |strWelcomeMessage     |
    |Complete Setup        |