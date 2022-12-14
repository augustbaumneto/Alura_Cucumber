Feature: Propondo lances
  

  Scenario: Propondo um unico lance valido
    Given Dado um lance valido
    When Quando propoe um lance
    Then Entao o lance e aceito