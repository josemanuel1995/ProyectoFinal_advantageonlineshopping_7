@test
Feature: Visualizar las redes sociales que se encuentran en la pagina

  Yo como usuario
  Quiero que en la parte inferior de la pagina web aparezcan los link de las redes sociales

  @Scenario:
  Scenario:  El usuario visualiza en la pagina 3 redes sociales
    Given el usuario se encuentra e ingresa en la pagina principal
    When el sistema se dirige al inferior de la pagina web
    Then el usuario podria visualizar 3 redes sociales
    | red1      | red2    | red3     |
    | Facebook  | Twitter | Linkedin |
