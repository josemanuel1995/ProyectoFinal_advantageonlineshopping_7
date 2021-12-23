package com.indra.stepsDefinitions;

import com.indra.actions.FalabellaActions;
import com.indra.models.ComprarProduct;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class FalabellaSteps {
    @Managed
    WebDriver driver;
    FalabellaActions falabellaActions = new FalabellaActions(driver);

    @Given("^el usuario se encuentra en la pagina principal$")
    public void elusuarioseencuentraenlapaginaprincipal() {
        falabellaActions.open();
    }

    @Given("^el usuario realiza busqueda de un producto$")
    public void elusuariorealizabusquedadeunproducto(List<ComprarProduct>comprarProductos) {
        falabellaActions.clickBuscar(comprarProductos.get(0));
    }

    @When("^el sistema procede a mostrar los procesos y verificara si coinciden en el producto buscado$")
    public void elsistemaprocedeamostrarlosprocesosyverificarasicoincidenenelproductobuscado() {
        falabellaActions.precioProducto = falabellaActions.precioProducto();
    }

    @Then("^el usuario deberia poder agregar el producto de su gusto para enviar al carrito de compras$")
    public void elusuariodeberiapoderagregarelproductodesugustoparaenviaralcarritodecompras() {
        falabellaActions.aggProductoCarrito();
    }
}

