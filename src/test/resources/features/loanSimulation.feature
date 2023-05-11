Feature: Loan simulation
  As a user
  I want to be able to simulate a loan
  So that I can get an estimate of the monthly payments

  Background:
    Given I am on the Bancolombia website
    When I click on "SABER MÁS" button under the title "Financia lo que sueñas, quieres y necesitas"

  Scenario: Simulate a free investment loan
    When I select the "Simular Crédito de libre inversión" option in the Creditos de Consumo page
    And I select "CONTINUAR"
    And I select "Si" for the question "¿Sabes cuánto dinero necesitas?"
    And I enter a loan amount between 1'000.000 and 500.000.000
    And I enter a random number of months between 48 and 84
    And I enter a birth date
    And I click on "SIMULAR"
    Then I should see the estimated monthly payment