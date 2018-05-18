package com.choucair.formacion.pageobjects;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://www.grupobancolombia.com/wps/portal/personas")
public class MenuReto3 extends PageObject {
	
	//Menú Necesidades
	@FindBy(xpath="//*[@id=\'main-menu\']/div[2]/ul[1]/li[2]/a")
	public WebElementFacade menuNecesidades;
	
	//Submenú Estudio
	@FindBy(xpath="//*[@id=\'necesidadesPersonas\']/div/div[1]/div[1]/div/div[3]/div/a")
	public WebElementFacade submenuEstudio;
	
	//Link Simula tus ahorros
	@FindBy(xpath="//*[@id=\'wizard1\']/div/div[1]/div/div/div[1]/p[2]/strong/a")
	public WebElementFacade LkSimulaAhorros;
	
	//Campo porqué quieres ahorrar
	@FindBy(xpath="//*[@id=\'browser-Off\']/div/div/div[1]/form/div[2]/select")
	public WebElementFacade cmbQuieresAhorrar;
	
	//Campo meses de ahorro
	@FindBy(xpath="//*[@id=\'browser-Off\']/div/div/div[1]/form/div[3]/input")
	public WebElementFacade txtMesesAhorro;
	
	//Campo selección producto	
    @FindBy(xpath="//*[@id=\'browser-Off\']/div/div/div[1]/form/div[4]/select")
	public WebElementFacade cmbProducto;
	
	//Campo dinero-meta
	@FindBy(xpath="//*[@id=\'browser-Off\']/div/div/div[1]/form/div[5]/input")
	public WebElementFacade txtMeta;
		
	//Botón agregar al plan de ahorro
	@FindBy(xpath="//*[@id=\'browser-Off\']/div/div/div[1]/form/div[8]/button")
	public WebElementFacade btnAhorro;
	
	//Botón Disposiciones Legales
	@FindBy(xpath="//*[@id=\'browser-Off\']/div/ul/li[2]/a/div[2]")
	public WebElementFacade btnDispLegal;
	
	
	//CheckBox
	@FindBy(xpath="//*[@id=\'browser-Off\']/div/div/div[2]/div[3]/form/input")
	public WebElementFacade chkDispLegal;
	
	
	//Botón calcular ahorro
	@FindBy(xpath="//*[@id=\'browser-Off\']/div/div/div[2]/div[3]/form/button")
	public WebElementFacade btnCalcularAhorro;
	
	//Botón Plan de ahorro Inversión
	@FindBy(xpath="//*[@id=\'browser-Off\']/div/ul/li[3]/a/div[2]")
	public WebElementFacade btnPlanAhorro;
	
	//Valor ahorro mensual
	@FindBy(xpath="//*[@id=\'tablaAhorro\']/table/tbody/tr[1]/td[2]")
	public WebElementFacade lblAhorroMensual;
	
	
	public void menuFormValidation() {		
		menuNecesidades.click();
		submenuEstudio.click();
		
	 }
	
	public void SeleccionarSimulaAhorros() {
		LkSimulaAhorros.click();
	}
	
	public void SeleccionarQuieresAhorrar(String datoPrueba) {
		//this.getDriver().switchTo().frame("Demos");
		cmbQuieresAhorrar.click();
		cmbQuieresAhorrar.selectByVisibleText(datoPrueba);
		//this.getDriver().switchTo().defaultContent();
	}
	
	public void IngresarMesesAhorro(String datoPrueba) {
		//this.getDriver().switchTo().frame("Demos");  
		txtMesesAhorro.click();
		txtMesesAhorro.clear();
		txtMesesAhorro.sendKeys(datoPrueba);
		//this.getDriver().switchTo().defaultContent();
	
	}
	
	public void SeleccionarProducto(String datoPrueba) {
		//this.getDriver().switchTo().frame("Demos");  
		cmbProducto.click();
		cmbProducto.selectByVisibleText(datoPrueba);
		//this.getDriver().switchTo().defaultContent();
	}
	
	
	public void IngresarMeta(String datoPrueba) {
		//this.getDriver().switchTo().frame("Demos");  
		txtMeta.click();
		txtMeta.clear();
		txtMeta.sendKeys(datoPrueba);
		//this.getDriver().switchTo().defaultContent();
	
	}
	
	public void SeleccionarAgrPlanAhorros() {
		btnAhorro.click();
	}
	
	public void SeleccionarDispLegales() {
		btnDispLegal.click();
	}
	public void CheckDispLegales() {
		chkDispLegal.click();
	}
	
	public void CalcularAhorro() {
		btnCalcularAhorro.click();
	}
	
	public void PlanAhorro() {
		btnPlanAhorro.click();
	}
	public void MostrarAhorroMensual() {
	     System.out.println(lblAhorroMensual.getText()); 
	}
}
