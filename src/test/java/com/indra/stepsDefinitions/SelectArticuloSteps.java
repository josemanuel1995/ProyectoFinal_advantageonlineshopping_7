package com.indra.stepsDefinitions;

import com.indra.actions.SelectArticuloActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SelectArticuloSteps {
    @Managed
    WebDriver driver;
    SelectArticuloActions CartArticuloActions = new SelectArticuloActions(driver);

    @Given("^el usuario se encuentra logueado en la pagina principal$")
    public void elusuarioseencuentralogueadoenlapaginaprincipal() {
        CartArticuloActions.open();CartArticuloActions.addLogin();
    }

    @When("^se procede a mostrar los procesos y verificara si coinciden en el producto seleccionado$")
    public void seprocedeamostrarlosprocesosyverificarasicoincidenenelproductoseleccionado() {
        CartArticuloActions.agregarArticuloAlCarrito();
    }

    @Then("^deberia poder agregar el producto para enviar al carrito de compras$")
    public void deberiapoderagregarelproductoparaenviaralcarritodecompras() {
        CartArticuloActions.cartComprasvalidarDetalles();
    }
}
