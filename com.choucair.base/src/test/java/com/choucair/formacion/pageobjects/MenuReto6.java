package com.choucair.formacion.pageobjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.exito.com/")
public class MenuReto6  extends PageObject{
	
	//Texto de buscador de compra
	@FindBy(xpath="//*[@id=\'tbxSearch\']")
	public WebElementFacade txtBuscador;

	//Botón buscar
	@FindBy(xpath="//*[@id=\'btnSearch\']")
	public WebElementFacade btnBuscar;
	
	//Botón  cerrar popup
	@FindBy(xpath="//*[@id=\'close-wisepop-88598\']/img")
	public WebElementFacade btnPopup;
	
	//Filtro de pulgadas 
	@FindBy(xpath="//*[@id=\'filterBy\']/div[2]/div[2]/ul/li[2]/a")
	public WebElementFacade liPulgadas;
	
	//Checkbox LG
	@FindBy(xpath="//*[@id=\'filterBy\']/div[2]/div[2]/ul/li[1]/label/input")	
	public WebElementFacade ckLG;
	
	//Link Resolución	
	@FindBy(xpath ="//*[@id=\"plp\"]/div[4]/div[2]/div/div[3]")
	 public WebElementFacade LkResolución ;
	
	//Imprimir la lista de televisores
	@FindBy(xpath ="//*[@id=\'plp\']/div[4]/div[2]/div/div[3]")
	 public List<WebElement> ListaTelevisores ;
	
	//Seleccionar el primer televisor
	@FindBy(xpath ="//*[@id=\'prd0002523836676001\']/div/a/div/img")
	public WebElementFacade ImgTelevisor ;
	
	//Seleccionar añadir al carrito
	@FindBy(xpath ="//*[@id=\'prd0002523836676001\']/div[3]/div[2]/div[2]/button")
	public WebElementFacade btnCarrito ;
	
	//Cerrar popup de confirmación de añadido al carrito de compras
	@FindBy(xpath ="//*[@id=\'bunting_lightbox-713\']/a",timeoutInSeconds="5")
	public WebElementFacade btnCerrar ;
	
	//Botón carrito
	@FindBy(xpath ="//*[@id=\'headerUserInfo\']/div[2]/a/span[1]",timeoutInSeconds="5")
	public WebElementFacade btnCarrito2;
	
	//,timeoutInSeconds="5"
	
	
	public void menuFormValidation() {
		btnPopup.click();
	}
	
	public void BuscadorCompra() {
		String datoPrueba = "televisor";
		txtBuscador.click();
		txtBuscador.clear();
		txtBuscador.sendKeys(datoPrueba);
		btnBuscar.click();
	}
	
	public void CerrarPopup() {
		if(btnPopup.isVisible()) {
		   btnPopup.click();
		}
		
	}
	
	public void SeleccionarListaPulgadas() {
		liPulgadas.click();
	}
	
	public void SeleccionarckLG() {
		ckLG.click();		
	}
	
	public void SeleccionarLkResolución() {
		BajarScroll();
		LkResolución.click();            
	}
	
	public void BajarScroll() {
		  WebDriver driver = this.getDriver();
		  JavascriptExecutor js = null;
		  if (driver instanceof JavascriptExecutor) {
		      js = (JavascriptExecutor) driver;
		  }
		  js.executeScript("return document.getElementById('div-gpt-ad-1431360947381-0').remove()");
	}
	
//	WebDriver Driver;
//	public void invokeBrowser() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\lramosc\\Desktop\\com.choucair.base\\target\\test-classes\\driver\\chromedriver.exe");
//		Driver = new ChromeDriver();
//		String url = "https://www.exito.com/";
//		
//		Driver.manage().deleteAllCookies();
//		Driver.get(url);
//	}
	
	public void ImprimirLista() {
//		List<WebElement> allProduct = Driver.findElements(By.xpath("//*[@id=\'plp\']/div[4]/div[2]/div/div[3]"));
		for(WebElement Lista: ListaTelevisores) {
			System.out.println(Lista.getText());
		}
	}
		
	public void SeleccionarTelevisor() {
		ImgTelevisor.click();
	}
	
	public void SeleccionarCarrito() {
		btnCarrito.click();
	}
	
	public void ConfirmarCarrito() {
		
	   if(btnCerrar.isVisible()) {
		btnCerrar.click();		
		}
			
	 }
	public void CarritoVisible() {
	   btnCarrito2.click();	
	}
	
}
