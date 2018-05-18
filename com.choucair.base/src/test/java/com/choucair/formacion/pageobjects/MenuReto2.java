package com.choucair.formacion.pageobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://www.grupobancolombia.com/wps/portal/personas")
public class MenuReto2 extends PageObject {
   
	
	//Menu Principal Productos y servicios
	@FindBy(xpath="//*[@id=\'main-menu\']/div[2]/ul[1]/li[3]/a")
	public WebElement menuForms;
	
	//Submenu Visitanos
	@FindBy(xpath="//*[@id=\"footer-content\"]/div[1]/div/div/div[4]/div/a/img")
	public WebElement menuFormGenerals;
	//Campo ciudad a encontrar
	@FindBy(xpath="//*[@id=\"srch-term\"]")
	public WebElementFacade txtCiudad;
	
	//Boton buscar
	@FindBy(xpath="//*[@id=\'tab1\']/div[1]/div[1]/div")
	public WebElementFacade btnBuscar;
	
	//Boton icono sucursal
	@FindBy(xpath="//*[@id=\'tab1\']/div[1]/div[6]/div[1]/div/div[1]/button")
	public WebElementFacade btnSucursal;
	
	//Texto primera sucursal
	@FindBy(xpath="//*[@id=\'mapa\']/div/div/div[1]/div[4]/div[4]/div[1]/div")
	public WebElementFacade txtSucursal;
		
	public void menuFormValidation() {		
		menuForms.click();
		menuFormGenerals.click();
		
	 } 	
	
	public void Select_Ciudad_Departamento() {
	    	String datoPrueba="Poblado";
	    	txtCiudad.click();
	    	txtCiudad.clear();
	    	txtCiudad.sendKeys(datoPrueba);	    	
	    	
		}
	 
	public void SeleccionarBuscar() {		 
		 btnBuscar.click();
		 //btnSucursal.click();
		 
	 }
	
    public void SeleccionarSucursal() {
		 btnSucursal.click();
		 System.out.println("prueba" + txtSucursal.getText());
	}
    
         
	
}
