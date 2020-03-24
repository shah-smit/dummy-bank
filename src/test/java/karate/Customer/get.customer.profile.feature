Feature: Version Greeting Controller

  Background:
    Given url 'http://localhost:8080'

  Scenario: Get Application Version

    Given path '/profile/smitshah'
    When method GET
    Then status 200

