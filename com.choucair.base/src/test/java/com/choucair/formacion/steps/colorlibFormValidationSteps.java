package com.choucair.formacion.steps;


import com.choucair.formacion.pageobjects.ColorlibFormValidationPage;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class colorlibFormValidationSteps {

colorlibFormValidationSteps  colorlibFormValidationSteps;

ColorlibFormValidationPage colorlibFormValidationPage;


public void diligenciar_popup_datos_tabla(List<List<String>> data, int id) {	
	colorlibFormValidationPage.Required(data.get(id).get(0).trim());
	Serenity.takeScreenshot();
	colorlibFormValidationPage.Select_Sport(data.get(id).get(1).trim());
	Serenity.takeScreenshot();
	colorlibFormValidationPage.Multiple_Select(data.get(id).get(2).trim());
	Serenity.takeScreenshot();
	colorlibFormValidationPage.Multiple_Select(data.get(id).get(3).trim());
	Serenity.takeScreenshot();
	colorlibFormValidationPage.url(data.get(id).get(4).trim());
	Serenity.takeScreenshot();
	colorlibFormValidationPage.email(data.get(id).get(5).trim());
	Serenity.takeScreenshot();
	colorlibFormValidationPage.password(data.get(id).get(6).trim());
	Serenity.takeScreenshot();
	colorlibFormValidationPage.confirm_password(data.get(id).get(7).trim());
	Serenity.takeScreenshot();
	colorlibFormValidationPage.minimun_field_size(data.get(id).get(8).trim());
	Serenity.takeScreenshot();
	colorlibFormValidationPage.maximun_field_size(data.get(id).get(9).trim());
	Serenity.takeScreenshot();
	colorlibFormValidationPage.number(data.get(id).get(10).trim());
	Serenity.takeScreenshot();
	colorlibFormValidationPage.ip(data.get(id).get(11).trim());
	Serenity.takeScreenshot();
	colorlibFormValidationPage.Date(data.get(id).get(12).trim());
	Serenity.takeScreenshot();
	colorlibFormValidationPage.DateEarlier(data.get(id).get(13).trim());
	Serenity.takeScreenshot();
	colorlibFormValidationPage.validate();
	}

@Step
public void verificar_ingreso_datos_formulario_exitoso() {
   colorlibFormValidationPage.form_sin_errores();
 }

@Step
public void verificar_ingreso_datos_formulario_con_errores() {
	colorlibFormValidationPage.form_con_errores();
 }


}
