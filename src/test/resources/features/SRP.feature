@SRP
  Feature: Search Result Page


    @smoke1
    Scenario: Driver who is searching a parking place for under 28 days should be offered only daily rate
      Given The user is on SRP page
      When  The user chooses a location and click submit button
      And The user enters 27 days duration
      And the user clicks Search button
      Then  the user should not see modal up-selling monthly Saver but sees it
      # min period should be 28 days to be able to get offered up-selling Monthly Saver according to acceptance criteria
