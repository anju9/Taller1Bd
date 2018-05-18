package com.choucair.formacion.definition;
import com.choucair.formacion.steps.ValidationStepsReto6;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ValidationReto6 {

	@Steps
	ValidationStepsReto6 ValidationStepsReto6;
	
	@Given("^Ingresar a la página del éxito$")
	public void Ingresar_a_la_página_del_éxito() {
		ValidationStepsReto6.menuFormValidation();
	}
	
	
	@And("^Ingresar al buscador y escribir la palabra televisor$")
	public void Ingresar_al_buscador_y_escribir_la_palabra_televisor(){
	    ValidationStepsReto6.BuscadorCompra();
	}
	
	
	@And("^Seleccionar Caracteristicas Pulgadas$")
	public void  seleccionar_Caracteristicas_Pulgadas(){
	    ValidationStepsReto6.SeleccionarPulgadas();
	}
	
	@And("^Seleccionar Caracteristicas Marca$")
	public void Seleccionar_Caracteristicas_Marca(){
	    ValidationStepsReto6.SeleccionarMarca();
	}
	
	@And("^Seleccionar Caracteristicas Resolucion$")
	public void Seleccionar_Caracteristicas_Resolucion(){
	    ValidationStepsReto6.SeleccionarResolucion();
	    try {
			 Thread.sleep(5000);
		  }catch(InterruptedException e) {}
	  }
	
	@And("^Mostrar información televisores$")
	public void mostrar_información_televisores() {
		ValidationStepsReto6.Mostrarinformacióntelevisores();
	}
	
	@When ("^Seleccionar el primer televisor$")
	public void seleccionar_el_primer_televisor() {
		ValidationStepsReto6.SeleccionarTelevisor();
	}
	
	@And ("^Adicionarlo al carrito de compras$")
	public void adicionarlo_al_carrito_de_compras() {
		ValidationStepsReto6.SeleccionarCarrito();
	}
	
	@Then ("^Confirmar al carrito de compras$")
	public void confirmar_al_carrito_de_compras() {
		ValidationStepsReto6.ConfirmarCarrito();
		ValidationStepsReto6.CarritoVisible();
	  
	}
}
   
	

	
	

