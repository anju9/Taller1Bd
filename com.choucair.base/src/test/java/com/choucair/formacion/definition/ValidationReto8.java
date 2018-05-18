package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.ValidationStepReto8;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ValidationReto8 {

	@Steps
	ValidationStepReto8 ValidationStepReto8;
	
	@Given("^El usuario quiere ingresar a CRM Zoho$")
	public void El_usuario_quiere_ingresar_a_CRM_Zoho() {
		ValidationStepReto8.menuFormValidation();
	}
	
	@When ("^Realiza el registro exitoso$")
	public void realiza_el_registro_exitoso(DataTable dtDatosForm) throws Throwable {
		List<List<String>> data = dtDatosForm.raw();
 	     
 	     for(int i=1; i<data.size();i++) {
 	    	 ValidationStepReto8.IngresarCamposRequeridos(data, i);
 	    	 
 	      }
	}
	
 	@And ("^Aceptar las condiciones y continuar$")
 	public void aceptar_las_condiciones_y_continuar() {
 		ValidationStepReto8.SeleccionarCondicionesyTerminar();
 		
 		 		
 	 }
 	
 	@Then("^Validar acceso exitoso$")
 	public void validar_acceso_exitoso(DataTable dtDatosForm) {
 		List<List<String>> data = dtDatosForm.raw();
 		for(int i=1; i<data.size();i++) {
	    	 ValidationStepReto8.VerificarRegistro(data, i);	    	
	    	 		 
	      }
 		
 		  ValidationStepReto8.ConfirmarRegistro();
 		 try {
	   		 Thread.sleep(30000);
	   	   }catch(InterruptedException e) {}
		 
 		}
 	   
 	
	}

	
	
	

