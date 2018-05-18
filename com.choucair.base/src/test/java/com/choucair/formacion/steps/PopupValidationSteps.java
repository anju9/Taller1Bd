package com.choucair.formacion.steps;

import org.openqa.selenium.WebElement;
import com.choucair.formacion.pageobjects.ColorlibLoginPage;
import com.choucair.formacion.pageobjects.ColorlibMenuPage;

import net.thucydides.core.annotations.Step;

public class PopupValidationSteps {

	 ColorlibLoginPage colorlibLoginPage;
	 ColorlibMenuPage  colorlibMenuPage;
		
	    @Step
	    public void login_colorlib(String strUsuario, String strPass){
	    	colorlibLoginPage.open();
	    	colorlibLoginPage.IngresarDatos(strUsuario, strPass);
	    	colorlibLoginPage.VerificaHome();
	    }
	    
	       
	    @Step
	    public void ingresar_form_validation() {
	    	colorlibMenuPage.menuFormValidation();
	    	/*colorlibMenuPage.menuForms.click();
	    	colorlibMenuPage.menuFormValidation.click();
	    	String strMensaje = lblFormValidation.getText();
	    	assertThat(strMensaje,containsString("Popup Validation"));
	    	*/
	    } 	    
	    
	    
	}
