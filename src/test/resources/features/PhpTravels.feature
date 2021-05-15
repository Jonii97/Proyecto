Feature: Página inicial
  Como usuario web
  Quiero navegar en PhpTravels
  And mira en la página Acerca de nosotros

  @Jonatan @Smoke
  Scenario: Como usuario de la web, quiero navegar por la página Acerca de nosotros de PHPTravels
    Given The user is in home page
    When The user go to About Us page
    Then The About Us page is displayed