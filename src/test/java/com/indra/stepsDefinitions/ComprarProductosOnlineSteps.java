package com.indra.stepsDefinitions;

import com.indra.actions.ComprarProductosOnlineActions;
import com.indra.models.ComprarProductosOnlineModels;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ComprarProductosOnlineSteps {
    @Managed
    WebDriver driver;
    ComprarProductosOnlineActions compraOnlineActions = new ComprarProductosOnlineActions(driver);

    @Given("^el usuario se loguea para ingresar a la pagina principal$")
    public void elusuarioselogueaparaingresaralapaginaprincipal() {
        compraOnlineActions.open();
        compraOnlineActions.ingresarLogin();
    }


    @When("^el usuario agrega un producto al carrito de compras$")
    public void elusuarioagregaunproductoalcarritodecompras() {
        compraOnlineActions.agregarElArticuloAlCarrito();
    }

    @Then("^se hace clic en el carrito y el sistema deberia visualizar los detalles del producto seleccionado$")
    public void sehaceclicenelcarritoyelsistemadeberiavisualizarlosdetallesdelproductoseleccionado() {
        compraOnlineActions.validarDetallesDelCarritoCompras();

    }

    /****************** punto 2 *******************************/

    @Given("^que el usuario se loguea para ingresar a la pagina principal$")
    public void queelusuarioselogueaparaingresaralapaginaprincipal() {
        elusuarioselogueaparaingresaralapaginaprincipal();
    }

    @Given("^se agrega un articulo al carrito de compras$")
    public void seagregaunarticuloalcarritodecompras() {
        elusuarioagregaunproductoalcarritodecompras();
    }

    @When("^hace click en checkOut$")
    public void haceClickEnCheckOut() {
        sehaceclicenelcarritoyelsistemadeberiavisualizarlosdetallesdelproductoseleccionado();
        compraOnlineActions.hacerClicCheckOut();
    }

    @Then("^el portal deberia mostrar una pantalla con los siguientes datos:$")
    public void elportaldeberiamostrarunapantallaconlossiguientesdatos(@NotNull List<ComprarProductosOnlineModels> onlineModelsList) {
        compraOnlineActions.validarShippingDetails(onlineModelsList.get(0));
    }

    /******************* punto 3 **************************/

    @Given("^que el usuario esta logueado e ingresa a la pagina principal$")
    public void queelusuarioestalogueadoeingresaalapaginaprincipal() {
        elusuarioselogueaparaingresaralapaginaprincipal();
    }

    @Given("^se agrega un producto al carrito de compras$")
    public void seagregaunproductoalcarritodecompras() {
        elusuarioagregaunproductoalcarritodecompras();
    }

    @Given("^se encuentra en la pantalla shipping details$")
    public void seencuentraenlapantallashippingdetails() {
        haceClickEnCheckOut();
    }

    @When("^se hace click en Edit shipping details$")
    public void sehaceclickenEditshippingdetails() {
        compraOnlineActions.hacerClicEditarDetalles();
    }

    @Then("^el usuario deberia poder editar la informacion$")
    public void elUsuarioDeberiaPoderEditarLaInformacion() {
        compraOnlineActions.validaQueSeaEditableLaInformacion();
    }

    /***************** punto 4 ********************/

    @Given("^que se logueo en el portal$")
    public void queSeLogueoEnElPortal() {
        elusuarioselogueaparaingresaralapaginaprincipal();
    }


    @Given("^que agrego un articulo a la canasta$")
    public void queAgregoUnArticuloALaCanasta() {
        elusuarioagregaunproductoalcarritodecompras();
    }

    @When("^esta en la pantalla Payment Method$")
    public void estaEnLaPantallaPaymentMethod() {
        haceClickEnCheckOut();
        compraOnlineActions.hacerClicNext();

    }

    @Then("^deberia poder visulizar dos opciones de pago$")
    public void deberiaPoderVisulizarDosOpcionesDePago(List<ComprarProductosOnlineModels> buyOnlineModels) {
        compraOnlineActions.validarOpcionesDePago(buyOnlineModels.get(0));
    }

    /****************** punto 5 *********************** No ejecuta bien */

    @Given("^que se logueo el usuario en el portal$")
    public void queSeLogueoElUsuarioEnElPortal() {
        elusuarioselogueaparaingresaralapaginaprincipal();
    }

    @Given("^que el usuario agregro un articulo de compra$")
    public void queElUsuarioAgregroUnArticuloDeCompra() {
        elusuarioagregaunproductoalcarritodecompras();
    }

    @When("^selecciona la opcion de pago Master Credit$")
    public void seleccionaLaOpcionDePagoMasterCredit() {
        estaEnLaPantallaPaymentMethod();
        compraOnlineActions.seleccionarMetodoPagoMasterCredit();
    }

    @Then("^deberia poder visualizar la opcion de editar tarjeta de credito$")
    public void deberiaPoderVisualizarLaOpcionDeEditarTarjetaDeCredito() {

        compraOnlineActions.validarOpcionEditarTarjetaCredito();
    }

    /**************** punto 6******************/

    @When("^hace click en el link de editar tarjeta$")
    public void haceClickEnElLinkDeEditarTarjeta() {
        compraOnlineActions.hacerClicEditarTarjetaCredito();
    }

    @Then("^deberia poder visualizar los datos de la tarjeta anterior$")
    public void deberiaPoderVisualizarLosDatosDeLaTarjetaAnterior() {

        compraOnlineActions.validarCargadeDatosTarjetaCreditoAnterior(5);

    }
    /********************** punto 7**************************/

    @Then("^deberia poder visualizar el boton de Pay Now$")
    public void deberiaPoderVisualizarElBotonDePayNow() {

        compraOnlineActions.validaBotonPaynowEstaPresente();
    }

    /******************** punto 8  ****************************/

    @When("^hace click en el boton Pay Now$")
    public void haceClickEnElBotonPayNow() {
        compraOnlineActions.hacerClicBotonPayNow();
    }

    @Then("^deberia poder visualizar la orden de pago con los siguientes campos$")
    public void deberiaPoderVisualizarLaOrdenDePagoConLosSiguientesCampos(List<ComprarProductosOnlineModels>
                                                                                  buyOnlineModels) {
        compraOnlineActions.validarCamposOrdenDePago(buyOnlineModels.get(0));

    }

}

