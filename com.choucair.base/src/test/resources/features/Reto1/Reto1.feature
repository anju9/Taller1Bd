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
Feature: Formulario Tarjetas de crédito
  El usuario debe de ingresar a la opción de productos y servicios
  Ingresar a la opción de tarjeta de crédito
  Seleccionar la trajeta American Express Green y Mastercard Black
  Luego debe de darle clic en solicitala aquí en American Express
  En el formulario de tarjetas de crédito se deben de llenar todos los
  campos obligatorios.

  @Caso1
  Scenario: Ingreso a la opción de productos y servicios.
    Given Dar clic en la opción Productos y servicios Tarjeta de crédito    
    And Mostrar por consola la información de crédito American Express Green 
    And Mostrar por consola  MasterCard Black
    And Dar clic en solicitala aquí en la tarjetaAmerican Express Green
    When Ingresar la información de cada campo     	
    |nombresReq|apellidosReq|typedocreq          |numeroPasaporte    |fechaNacimientoReq|ingresos-mensuales|reqCiuidadDpto_value|
    | julio   |Perez        |Cédula de Ciudadanía|4547888            |1980/02/05       |1500000           |Medellin - Antioquia   |
    Then Seleccionar continuar 
    



 
