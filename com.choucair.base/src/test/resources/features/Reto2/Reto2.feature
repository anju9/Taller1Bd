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
Feature: Formulario Visitanos
  El usuario da clic en la opción Visitanos
  Luego ingresa una dirección y al darle en buscar
  Se mostrarán las sucursales más cercanas.
  Selecciona la primera y debe de mostrarla en el mapa.

  @Caso1
  Scenario: Ingreso a la página de visitanos
    Given Ingresar a la página y dar clic en visitanos
    When Escribir la dirección a buscar en el campo ciudad 
    And  Buscar la primera oficina en el mapa         
    Then Mostrar la dirección de la primera sucursal  
    
    
    
    
   

  