package com.choucair.formacion.pageobjects;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://www.grupobancolombia.com/wps/portal/personas")
public class MenuReto1 extends PageObject {	
	//Menu Principal Productos y servicios
	@FindBy(xpath="//*[@id=\'main-menu\']/div[2]/ul[1]/li[3]/a")
	public WebElement menuForms;

	//submenu Tarjeta de crédito
	@FindBy(xpath="//*[@id=\'productosPersonas\']/div/div[1]/div/div/div[7]/div/a")
	public WebElement menuFormGenerals;
	
	//Botón solicitala aquí
	@FindBy(xpath="//*[@id=\'card_0\']/div[4]/a")
	public WebElementFacade btnSolicitarAqui;
	
	//Campo nombres	
	//@FindBy(id="nombresReq")
	@FindBy(xpath="//*[@id=\'nombresReq\']")
	public WebElementFacade txtNombres;
	
	//Campo apellidos	
	@FindBy(xpath= "//*[@id=\'apellidosReq\']")
	public WebElementFacade txtApellidos;
	
	//Campo tipo de documento
	@FindBy(xpath="//*[@id=\'typedocreq\']")
	public WebElementFacade cmbTipoDocumento;

    //Campo número de documento 	
	@FindBy(xpath="//*[@id=\'numeroDocumento\']")
	public WebElementFacade txtNumeroDocumento;
	
	// Campo Fecha de nacimiento
	@FindBy(xpath="//*[@id=\'fechaNacimientoReq\']")
	public WebElementFacade txtFechaNacimiento;
	
	//Campo Ingresos mensuales	
	@FindBy(xpath="//*[@id=\'ingresos-mensuales\']")
	public WebElementFacade txtIngresosMensuales;
	
	//Campo Ciudad y departamento de residencia
	//@FindBy(xpath="//[@id=\'reqCiuidadDpto_value\']']")
	@FindBy(xpath="//INPUT[@id='reqCiuidadDpto_value']")
	public WebElementFacade txtCiudadDepartamento;
	
	//Campo autocompletar
	@FindBy(xpath="//*[@id=\'reqCiuidadDpto_dropdown\']/div[3]/div")
	public WebElementFacade cmbAuto;
	
	//Botón continuar
	@FindBy(xpath="//*[@id=\'conIframe_rm\']/div/form/div[7]/div[2]/button")
	public WebElementFacade btnContinuar;
	
	public void menuFormValidation() {		
		menuForms.click();
		menuFormGenerals.click();
		
	 } 	
		
	public void MostrarAmericanExpressGreen() {
		System.out.println("//*[@id=\'card_0\']/div[3]"); 
	}
	
	
	public void MostrarMasterCardBlack() {
		System.out.println("//*[@id=\'card_1\']/div[3]/ul"); 
	}
	
    public void SeleccionAmericanExpressGreen() {
    	btnSolicitarAqui.click();
    }
    
    
    public void Nombres(String datoPrueba) {
    	this.getDriver().switchTo().frame("Demos");  
    	txtNombres.click();
    	txtNombres.clear();
    	txtNombres.sendKeys(datoPrueba);    	
    	this.getDriver().switchTo().defaultContent();
    	   	 
	}
    
    public void Apellidos(String datoPrueba) {
    	this.getDriver().switchTo().frame("Demos"); 
    	txtApellidos.click();
    	txtApellidos.clear();
    	txtApellidos.sendKeys(datoPrueba);
    	this.getDriver().switchTo().defaultContent();
    }
    
    
    public void Select_Tipo_Documento(String datoPrueba) {
    	this.getDriver().switchTo().frame("Demos"); 
    	cmbTipoDocumento.click();
    	cmbTipoDocumento.selectByVisibleText(datoPrueba);
    	this.getDriver().switchTo().defaultContent();
	}
    
    public void Documento(String datoPrueba) {
    	this.getDriver().switchTo().frame("Demos"); 
    	txtNumeroDocumento.click();
    	txtNumeroDocumento.clear();
    	txtNumeroDocumento.sendKeys(datoPrueba);
    	this.getDriver().switchTo().defaultContent();
    }              
    
    public void Fecha_Nacimiento(String datoPrueba) {
    	this.getDriver().switchTo().frame("Demos"); 
    	txtFechaNacimiento.click();
    	txtFechaNacimiento.clear();
    	txtFechaNacimiento.sendKeys(datoPrueba);
    	this.getDriver().switchTo().defaultContent();
	}
    
    
    public void IngresosMensuales(String datoPrueba) {
    	this.getDriver().switchTo().frame("Demos"); 
    	txtIngresosMensuales.click();
    	txtIngresosMensuales.clear();
    	txtIngresosMensuales.sendKeys(datoPrueba);
    	this.getDriver().switchTo().defaultContent();
    
    }     
    
    
    public void Select_Ciudad_Departamento(String datoPrueba) {
    	this.getDriver().switchTo().frame("Demos"); 
    	txtCiudadDepartamento.click();
    	txtCiudadDepartamento.clear();
    	txtCiudadDepartamento.sendKeys(datoPrueba);
    	cmbAuto.click();
    	this.getDriver().switchTo().defaultContent();
	}
    
   // public void Autocompletar(String datoPrueba) {
    	//this.getDriver().switchTo().frame("Demos"); 
    	//cmbAuto.click();
    	//cmbAuto.selectByVisibleText(datoPrueba);
    	//this.getDriver().switchTo().defaultContent();
    //}
    
    
    public void Boton_Continuar() {
    btnContinuar.click();
    
    }
    
   
    
    
    
}



	
	

