package com.choucair.formacion.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.zoho.com/es-xl/crm/")
public class MenuReto8 extends PageObject{
	
	//Campo texto nombre completo
	@FindBy(xpath= "//*[@id = 'namefield']")
    public WebElementFacade txtNombre;
	
	//Campo texto email
	@FindBy(xpath= "//*[@id = 'email']")
	public WebElementFacade txtEmail;
	
	//Campo texto contraseña
	//@FindBy(xpath= "//*[@id = 'sgnpaswrd']")
	@FindBy(xpath = "//*[@id=\'dialogRegister\']/div[3]/div/input")
	public WebElementFacade txtContraseña;
	
			
	//Campo botón comenzar
	 @FindBy(xpath= "//*[@id =\'signupbtn\']")
	 public WebElementFacade btnComenzar;
	 
	 //Campo nombre de la empresa
	 @FindBy(xpath= "//*[@id=\'orgName\']")
	 public WebElementFacade txtEmpresa;
	 
	//Campo teléfono 
	@FindBy(xpath="//*[@id=\'orgPhone\']")
	public WebElementFacade txtTelefono;
	
	//Combo zona horaria
	@FindBy(xpath="//*[@id=\'select2-userTimeZone-container\']/span")
	public WebElementFacade cmdZonaHoraria;
	
	//Campo Texto zona horaria
	@FindBy(xpath="//INPUT[@class='select2-search__field']")
	public WebElementFacade txtZonaHoraria;
	
	//Campo idioma
	@FindBy(xpath="//*[@id=\'select2-language-container\']")
	public WebElementFacade cmdIdioma;
	
	//Campo texto idioma
	@FindBy(xpath="//INPUT[@class='select2-search__field']")
	public WebElementFacade txtIdioma;
	
	//Campo moneda local
	@FindBy(xpath="//*[@id=\'select2-currencyLocale-container\']")
	public WebElementFacade cmbMoneda;
	
	//Campo moneda local
	@FindBy(xpath="//INPUT[@class='select2-search__field']")
	public WebElementFacade txtMoneda;
	
	//Botón explorar con datos de muestra
	@FindBy(xpath="//*[@id=\'profileDetailBtn2\']")
	public WebElementFacade btnExplorar;
		
	
	 
	 public void IngresarNombreCompleto(String datoPrueba) {		 
		 txtNombre.click();
		 txtNombre.clear();
		 txtNombre.sendKeys(datoPrueba);
	 }
	 
	 public void IngresarEmail(String datoPrueba) {
		 txtEmail.click();
		 txtEmail.clear();
		 txtEmail.sendKeys(datoPrueba);
     }
     
     public void IngresarContraseña(String datoPrueba) {
    	 txtContraseña.click();
    	 txtContraseña.clear();
		 txtContraseña.sendKeys(datoPrueba);
     }
     
//     public void removerElemento() {
//    	 
//    	 WebDriver driver = this.getDriver();
//    	 WebElement input = driver.findElement(By.id("tos"));
//    	 new Actions(driver).moveToElement(input).click().perform();
//    	 }
//         
     
     public void SelServicio() {    	 
    	
    	 WebDriver driver = this.getDriver();
    	 WebElement input = driver.findElement(By.id("tos"));
    	 new Actions(driver).moveToElement(input).click().perform(); 
    	   
	 }
      
     public void SeleccionarContinuar() {
		 btnComenzar.click();
	 }
	 
	 
	 public void IngresarEmpresa(String datoPrueba) {
		 try {
	   		 Thread.sleep(30000);
	   	   }catch(InterruptedException e) {}
		 
		 txtEmpresa.click();
		 txtEmpresa.clear();     	 
		 txtEmpresa.sendKeys(datoPrueba);
		 
	 }
	 
	 public void IngresarTelefono(String datoPrueba) {		 
		 txtTelefono.click();
		 txtTelefono.clear();     	 
		 txtTelefono.sendKeys(datoPrueba);
		 
	 }
	 
	 public void SeleccionarZonaHoraria(String datoPrueba) {
		 cmdZonaHoraria.click();
		 txtZonaHoraria.click();
		 txtZonaHoraria.sendKeys(datoPrueba);
		 txtZonaHoraria.sendKeys(Keys.ENTER);
				 
	 }
	 
	 
	 public void SeleccionarIdioma(String datoPrueba) {
		 cmdIdioma.click();
		 txtIdioma.click();
		 txtIdioma.sendKeys(datoPrueba);
		 txtIdioma.sendKeys(Keys.ENTER);
	 }
	 
	 
	 public void SeleccionarMoneda(String datoPrueba) {
		 cmbMoneda.click();
		 txtMoneda.click();
		 txtMoneda.sendKeys(datoPrueba);
		 txtMoneda.sendKeys(Keys.ENTER);
		 
	 }
	 
	 public void SeleccionarExplorar() {
		 btnExplorar.click();
	 }
	 
	 //Link para iniciar sesión
}
