Feature: some test with  steps from different step definitions

  Scenario: Customer does something
    Given a customer
    When he does something
    Then something cool happens

  Scenario: Customer does something else
    Given a different customer
    When he does something
    Then something cool happens

  Scenario: No customer does nothing
    Given no customer
    When he does something
    Then nothing cool happens