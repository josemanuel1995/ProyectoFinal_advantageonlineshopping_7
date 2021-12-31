package com.indra.stepsDefinitions;

import com.indra.actions.RedesSocialesActions;
import com.indra.models.RedesSocialesModels;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RedesSocialesSteps {
    @Managed
    WebDriver driver;
    RedesSocialesActions redesSocialesActions = new RedesSocialesActions(driver);

    @Given("^el usuario se encuentra e ingresa en la pagina principal$")
    public void elusuarioseencuentraeingresaenlapaginaprincipal() {
        redesSocialesActions.open();
    }

    @When("^el sistema se dirige al inferior de la pagina web$")
    public void elsistemasedirigealinferiordelapaginaweb() {
        redesSocialesActions.procesoRedesSociales();

    }

    @Then("^el usuario podria visualizar 3 redes sociales$")
    public void elusuariopodriavisualizar3redessociales(List<RedesSocialesModels> redesSocialesList) {
        redesSocialesActions.verificarConteoRedesSociales(redesSocialesList.get(0));

    }


}

