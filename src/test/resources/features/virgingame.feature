Feature: VirginGames Bingo Data

  As a User I want to get all Jackpot bingo data from VirginGames API

  Scenario: User want to get all VirginGames Bingo Data
    Given User is on Homepage
    When User get data of Bingo's Jackpot currency
    Then User must get back a valid status code 200
    And User verify currency is GBP

