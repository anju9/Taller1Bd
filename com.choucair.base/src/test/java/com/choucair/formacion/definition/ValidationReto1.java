package com.choucair.formacion.definition;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

import com.choucair.formacion.steps.ValidationStepsReto1;

public class ValidationReto1 {

@Steps
ValidationStepsReto1 ValidationStepsReto1;
	
	
@Given("^Dar clic en la opción Productos y servicios Tarjeta de crédito$")
public void dar_clic_en_la_opción_Productos_y_servicios_Tarjeta_de_crédito() {
	 ValidationStepsReto1.menuFormValidation();
	}

@And("^Mostrar por consola la información de crédito American Express Green$")
public void mostrar_por_consola_la_información_de_crédito_American_Express_Green() {
	ValidationStepsReto1.MostrarAmericanExpressGreen();
}

@And("^Mostrar por consola  MasterCard Black$")
public void mostrar_por_consola_MasterCard_Black() {
	ValidationStepsReto1.MostrarMasterCardBlack();
}

@Then("^Dar clic en solicitala aquí en la tarjetaAmerican Express Green$")
public void dar_clic_en_solicitala_aquí_en_la_tarjetaAmerican_Express_Green() {
	ValidationStepsReto1.SeleccionAmericanExpressGreen();
	}
@When("^Ingresar la información de cada campo$")
public void diligencio_Formulario_Popup_Validation(DataTable dtDatosForm) throws Throwable {
	List<List<String>> data = dtDatosForm.raw();
 
 for(int i=1; i<data.size();i++) {
	 ValidationStepsReto1.diligenciar_popup_datos_tabla(data, i);
	 try {
		 Thread.sleep(5000);
	  }catch(InterruptedException e) {}
  }
}

@Then("^Seleccionar continuar$")
public void seleccionar_continuar() {
	ValidationStepsReto1.SeleccionarContinuar();
 } 



}
