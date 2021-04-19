@stories
  Feature: Utest Page
    As user, I want to join to page Utest

  @scenario1
  Scenario: Go to page Utest an login
    Given than Brandon wants to login in Utest page
    When he fill all the forms
      |strName  |strLastName  |strEmail                |strZip        |strPassword   |
      |Brandon  |Rogers       |brandonrogers@email.com |00000         |r39c7"UY4{    |
    Then He can view the Utest welcome page
    |strWelcomeMessage     |
    |Begin uTest Academy   |