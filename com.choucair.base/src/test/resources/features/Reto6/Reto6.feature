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
Feature: Compra de televisor
  Se quiere comprar un televisor el la página del éxito de 
  más de 44 a 49 pulgadas, marca LG y Resolución UHD-4K.
  Imprimir por consola los resultados del filtro de los televisores que cumplan
  con los requisitos anteriores.
  El televisor escogido debe de ser añadido al carrito de compras.

  @CasoExitoso
  Scenario: Compra de televisor 
    Given Ingresar a la página del éxito    
    And Ingresar al buscador y escribir la palabra televisor
    And  Seleccionar Caracteristicas Pulgadas
    And  Seleccionar Caracteristicas Marca
    And  Seleccionar Caracteristicas Resolucion
    And  Mostrar información televisores
    When Seleccionar el primer televisor
    And  Adicionarlo al carrito de compras
    Then Confirmar al carrito de compras
   
   