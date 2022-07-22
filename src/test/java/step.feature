Feature: Register
  Scenario: register user
    Given register
    And create account using Username as "Jolly" and Password as "admin"
    And login account using username "Jolly" and password "admin"
    Then click on login button
#  Scenario: login
#    Given user name "user" and password "user"

