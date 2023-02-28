Feature:Two-way flight inquiry an Turkish Airlines website
  @smoke
  Scenario: TestCase1
    Given the users enters "baseUrl"
    When homepage should be display successfully

  Scenario: TestCase2
    Given the users should check that the from location selection area
    When the users should check that the to location selection area
    Then the users should check that the date selection are
    And the users should check that the flight intermediate elements

  Scenario: TestCase3
    Given the users should check the round trip option is selected by default.

  Scenario: TestCase4
    Given the users click on the where entry area
    When the users delete expression what is on written

  Scenario: TestCase5
    Given the users write "Istanbul" to input
    When the users clicks input to where option
    Then the users verifies all our destinations option is displayed

  Scenario: TestCase6
    Given the users clicks all our destinations option
    When the users verifies that alphabetical filtering screen is displayed
    Then the users verifies that country selection menu is displayed
    And the users verifies that airport list is displayed

  Scenario: TestCase7
    Given the users clicks the letter "i"
    When the users verifies that letter "i" is selected in the alphabetic filtering screen.
    Then the users verifies that  it is seen that countries starting with the letter "i" come.

  Scenario: TestCase8
    Given the users select "Spain" option from the dropdown menu
    When the users sees that the airports in Spain are listed.

  Scenario: TestCase9
    Given the users select "Barselona El Prat Airport (BCN), Barselona" option
    When the users verifies that date selection screen apperars

  Scenario: TestCase10
    Given the users select "11 March" for departure date
    When the users select "10 March" for return date
    Then the users verifies that return date cannot be before the departure date

  Scenario: TestCase11
    Given the user verifies that ‘Date selection is complete" message
    When the users verifies that OK button is clickable
    Then the users verifies that passenger selection menu is displayed

  Scenario: TestCase12
    Given the users verifies that Adult Person option is selected default
    When the users verifies that Economy Class option is selected default

  Scenario: TestCase13
    Given the users clicks search flight button
    When the users verifies that between IST-BCN flights are listed