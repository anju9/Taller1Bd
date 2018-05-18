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
Feature: Trabajar con el CRM Zoho 
  I want to use this template for my feature file

  @Caso1
  Scenario: Registro
    Given El usuario quiere ingresar a CRM Zoho    
    When  Realiza el registro exitoso
    |Nombre Completo|Email                  |Contraseña|
    | Leidy Ramos   |leidyramos114@gmail.com|Siclaro478|
    And Aceptar las condiciones y continuar
    Then Validar acceso exitoso
    |Empresa        |Telefono |ZonaHoraria                                      |Idioma |Moneda  |
    | Prueba        |545455454|(GMT -5:0 ) Hora de Colombia( America/Bogota )   |Español|Colombia|
    
   @Caso2
    Scenario: Creación de tarea
    Given Ingresar al CRM ZOHO con un usuario registrado
    |Nombre Completo|Email                  |Contraseña|
    | Leidy Ramos   |leidyramos114@gmail.com|Siclaro478|    
    When  Realizar la creación de una tarea   
    Then  Verificar la creación de la tarea
    |Empresa        |Telefono |ZonaHoraria                                      |Idioma |Moneda  |
    | Prueba        |545455454|(GMT -5:0 ) Hora de Colombia( America/Bogota )   |Español|Colombia|
    
    
