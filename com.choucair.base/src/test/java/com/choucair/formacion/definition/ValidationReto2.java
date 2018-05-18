package com.choucair.formacion.definition;

import com.choucair.formacion.steps.ValidationStepsReto2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ValidationReto2 {
	@Steps
	ValidationStepsReto2 ValidationStepsReto2;
	
	
	@Given("^Ingresar a la página y dar clic en visitanos$")
	public void Ingresar_a_la_página_y_dar_clic_en_visitanos() {
		ValidationStepsReto2.menuFormValidation();
    }
	
	@When("^Escribir la dirección a buscar en el campo ciudad$")
	public void escribir_la_dirección_a_buscar_en_el_campo_ciudad() {
		ValidationStepsReto2.SeleccionarCiudad();
	}
	
	 
	 @And("^Buscar la primera oficina en el mapa$")
	 public void buscar_la_primera_oficina_en_el_mapa() {
		 ValidationStepsReto2.SeleccionarBuscar();
		 try {
    		 Thread.sleep(5000);
    	  }catch(InterruptedException e) {}		
	 }
	 
	 @Then("^Mostrar la dirección de la primera sucursal$")
	 public void mostrar_la_dirección_de_la_primera_sucursal() {
		 ValidationStepsReto2.SeleccionarSucursal();
		 
	 }
	 
	 

}
