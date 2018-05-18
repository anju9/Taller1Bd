#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Menú necesidades
  El usuario da clic en la opción necesidades de la cual se despliega
  el submenu Estudio, en la sección cuenta de ahorrador da clic en el simulador
  de ingresos, diligencia el formulario, luego da clic en agregar el plan de ahorros.
  Luego va a la opción de disposiciones legales clic en calcular ahorro y al final
  le presentará el plan de ahorro que debe ahorrar mensualmente.

  @CasoExitoso
  Scenario: Ingresar al menú Simula tus ahorros
    Given Ingresar al menú Necesidades submenú Estudio    
    And Ingresar al link Simula tus ahorros
    When Diligenciar los campos del Paso1    
    | cmbQuieresAhorrar | txtMesesAhorro | cmbProducto        |txtMeta  | 
    | Vivienda          |12              | Cuenta Ahorrador   |2000000  |
    And Dar clic en el botón Agregar al plan de ahorros
    And Dar clic en el paso 2 de Disposiciones Legales
    And Dar clic en la opción Calcular ahorro
    And Dar clic en plan Ahorro
    Then Caso Exitoso
    
    
  
