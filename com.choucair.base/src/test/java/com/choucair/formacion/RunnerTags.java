package com.choucair.formacion;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


  @RunWith(CucumberWithSerenity.class)
  //@CucumberOptions (features = "src/test/resources/features/", tags = "@SmokeTest")
 //@CucumberOptions (features = "src/test/resources/features/Colorlib/Forms/PopupValidation.feature", tags = "@Regresion")
  
  //Reto1
  @CucumberOptions (features = "src/test/resources/features/Reto8/Reto8.feature", tags = "@Caso1")
  
  public class RunnerTags {

  }
