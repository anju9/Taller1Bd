package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.ValidationStepReto3;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ValidationReto3 {

	@Steps
	ValidationStepReto3 ValidationStepReto3;
	
	@Given("^Ingresar al menú Necesidades submenú Estudio$")
	public void ingresar_al_menú_Necesidades_submenú_Estudio() {
		ValidationStepReto3.menuFormValidation();		
		
    }
	
	
	
    @And("^Ingresar al link Simula tus ahorros$")
	public void ingresar_al_link_Simula_tus_ahorros() {
		ValidationStepReto3.SeleccionarSimulaAhorros();
	}
    
      
  	@When("^Diligenciar los campos del Paso1$")
  	public void diligenciar_los_campos_del_Paso1(DataTable dtDatosForm) throws Throwable {
  		//ValidationStepReto3.menuFormValidation();		
  		
  		List<List<String>> data = dtDatosForm.raw();
  	     
  	     for(int i=1; i<data.size();i++) {
  	    	 ValidationStepReto3.diligenciar_popup_datos_tabla(data, i);
  	    	 try {
  	    		 Thread.sleep(5000);
  	    	  }catch(InterruptedException e) {}
  	      }
  	
      }   	

    @And("^Dar clic en el botón Agregar al plan de ahorros$")
    public void dar_clic_en_el_botón_Agregar_al_plan_de_ahorros() {
    	ValidationStepReto3.SeleccionarAgrPlanAhorros();
    	 try {
	    		 Thread.sleep(3000);
	    	  }catch(InterruptedException e) {}
	      
    }
    
    @And("^Dar clic en el paso 2 de Disposiciones Legales$")
    public void dar_clic_en_el_paso_2_de_Disposiciones_Legales() {
    	ValidationStepReto3.SeleccionarDispLegales();
    	ValidationStepReto3.SeleccionarCheckDispLegales();
    }
    
    @And("^Dar clic en la opción Calcular ahorro$")
    public void dar_clic_en_la_opción_Calcular_ahorro() {
    ValidationStepReto3.CalcularAhorro();
	}
   
    @And("^Dar clic en plan Ahorro$")
    public void dar_clic_en_plan_Ahorro() {
    ValidationStepReto3.PlanAhorro();
    }
    
    @Then("^Caso Exitoso$")
    public void caso_Exitoso() {
    	ValidationStepReto3.MostrarAhorroMensual();
    }
}
