package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.MenuReto2;
import net.thucydides.core.annotations.Step;

public class ValidationStepsReto2 {

	MenuReto2  MenuReto2;	
	
	@Step
    public void menuFormValidation(){
		MenuReto2.open();
		MenuReto2.menuFormValidation();	
    } 
	
	@Step
	public void SeleccionarCiudad() {
		MenuReto2.Select_Ciudad_Departamento();
	}
	
	@Step
	public void SeleccionarBuscar() {
		MenuReto2.SeleccionarBuscar();
	}
	
	@Step
	public void SeleccionarSucursal() {
		MenuReto2.SeleccionarSucursal();
	}
	
	
}
