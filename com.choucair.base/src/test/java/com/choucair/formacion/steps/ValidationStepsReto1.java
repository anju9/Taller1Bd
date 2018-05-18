package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.MenuReto1;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;


public class ValidationStepsReto1 {

	MenuReto1  MenuReto1;	
	
	@Step
    public void menuFormValidation(){
		MenuReto1.open();
		MenuReto1.menuFormValidation();	
    } 
		
	@Step
	public void MostrarAmericanExpressGreen() {
		MenuReto1.MostrarAmericanExpressGreen();
	}
	
	@Step
	public void MostrarMasterCardBlack() {
		MenuReto1.MostrarMasterCardBlack();
	}
	
	@Step
	public void SeleccionAmericanExpressGreen() {
		MenuReto1.SeleccionAmericanExpressGreen();
	}
	
	
	@Step
	public void diligenciar_popup_datos_tabla(List<List<String>> data, int id) {		
		MenuReto1.Nombres(data.get(id).get(0).trim());
		Serenity.takeScreenshot();
		MenuReto1.Apellidos(data.get(id).get(1).trim());		
		Serenity.takeScreenshot();
		MenuReto1.Select_Tipo_Documento(data.get(id).get(2).trim());
		Serenity.takeScreenshot();
		MenuReto1.Documento(data.get(id).get(3).trim());
		Serenity.takeScreenshot(); 		
		MenuReto1.Fecha_Nacimiento(data.get(id).get(4).trim());
		Serenity.takeScreenshot();
		MenuReto1.IngresosMensuales(data.get(id).get(5).trim());
		Serenity.takeScreenshot();
		MenuReto1.Select_Ciudad_Departamento(data.get(id).get(6).trim()); 
		//Serenity.takeScreenshot();
		//MenuReto1.Autocompletar(data.get(id).get(7).trim()); 
		}
	
	@Step
	public void SeleccionarContinuar() {
		MenuReto1.Boton_Continuar();
	}

   
}
