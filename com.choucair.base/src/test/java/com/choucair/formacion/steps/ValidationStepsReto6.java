package com.choucair.formacion.steps;
import net.thucydides.core.annotations.Step;
import java.util.List;
import com.choucair.formacion.pageobjects.MenuReto6;
import net.serenitybdd.core.Serenity;
import java.util.List;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class ValidationStepsReto6 {
	
	MenuReto6  MenuReto6;
	
	@Step
	public void menuFormValidation(){
		MenuReto6.open();
		MenuReto6.CerrarPopup();
	}
	
	@Step
	public void BuscadorCompra() {
		MenuReto6.BuscadorCompra();
	}
	
	@Step
	public void SeleccionarPulgadas() {
		MenuReto6.SeleccionarListaPulgadas();
				
    }
	
	@Step
	public void SeleccionarMarca() {
		MenuReto6.SeleccionarckLG();
	}
	
	@Step
	public void SeleccionarResolucion() {
		MenuReto6.SeleccionarLkResolución();
	}
	
	@Step
	public void Mostrarinformacióntelevisores() {
	  MenuReto6.ImprimirLista();
	}
	
	@Step
	public void SeleccionarTelevisor() {
	  MenuReto6.SeleccionarTelevisor();
	}
	
	@Step
	public void SeleccionarCarrito() {
	  MenuReto6.SeleccionarCarrito();
	
	}
	
	@Step
	public void ConfirmarCarrito() {
	 MenuReto6.ConfirmarCarrito();
	}
	
	@Step
	public void CarritoVisible() {
	 MenuReto6.CarritoVisible();
	}
	
	
}