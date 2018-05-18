package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.MenuReto3;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;


public class ValidationStepReto3 {

	MenuReto3 MenuReto3;
	
	@Step
	public void menuFormValidation(){
		MenuReto3.open();
		MenuReto3.menuFormValidation();	
	}
	
	@Step
	public void SeleccionarSimulaAhorros() {
		MenuReto3.SeleccionarSimulaAhorros();
	}
	
   @Step
	public void diligenciar_popup_datos_tabla(List<List<String>> data, int id) {	
	   	MenuReto3.SeleccionarQuieresAhorrar(data.get(id).get(0).trim());
		Serenity.takeScreenshot();
		MenuReto3.IngresarMesesAhorro(data.get(id).get(1).trim());
		Serenity.takeScreenshot();
		MenuReto3.SeleccionarProducto(data.get(id).get(2).trim());
		Serenity.takeScreenshot();
		MenuReto3.IngresarMeta(data.get(id).get(3).trim());
   }
   
   @Step
   public void SeleccionarAgrPlanAhorros() {
	   MenuReto3.SeleccionarAgrPlanAhorros();
   }
   
   @Step
   public void SeleccionarDispLegales() {
	   MenuReto3.SeleccionarDispLegales();
//	   MenuReto3.CheckDispLegales();
   }
   
   @Step
   public void SeleccionarCheckDispLegales() {	   
	   MenuReto3.CheckDispLegales();
   }
  
   @Step
   public void CalcularAhorro() {
	   MenuReto3.CalcularAhorro();
   }
   
   @Step
   public void PlanAhorro() {
	   MenuReto3.PlanAhorro();
   }
   
   @Step 
   public void MostrarAhorroMensual() {
	   MenuReto3.MostrarAhorroMensual();
   }
}
   
