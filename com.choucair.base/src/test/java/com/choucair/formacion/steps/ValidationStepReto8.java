package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.MenuReto8;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class ValidationStepReto8 {
	
	MenuReto8  MenuReto8;
	
	@Step
	public void menuFormValidation(){
		MenuReto8.open();
		
	}
	
	@Step
	public void IngresarCamposRequeridos(List<List<String>> data, int id){
		MenuReto8.IngresarNombreCompleto(data.get(id).get(0).trim());
		Serenity.takeScreenshot();
		MenuReto8.IngresarEmail(data.get(id).get(1).trim());
		Serenity.takeScreenshot();
		MenuReto8.IngresarContraseña(data.get(id).get(2).trim());
		Serenity.takeScreenshot();	
		
	}
	
	@Step
	public void SeleccionarCondicionesyTerminar() {
		MenuReto8.SelServicio();
		MenuReto8.SeleccionarContinuar();
	}
	
	@Step
	public void VerificarRegistro(List<List<String>> data, int id) {
		MenuReto8.IngresarEmpresa(data.get(id).get(0).trim());
		MenuReto8.IngresarTelefono(data.get(id).get(1).trim());
		MenuReto8.SeleccionarZonaHoraria(data.get(id).get(2).trim());
		MenuReto8.SeleccionarIdioma(data.get(id).get(3).trim());
		MenuReto8.SeleccionarMoneda(data.get(id).get(4).trim());		
	}
	
	@Step
	public void ConfirmarRegistro() {
		MenuReto8.SeleccionarExplorar();
	}
	
	
}
