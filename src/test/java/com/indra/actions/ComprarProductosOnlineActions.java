package com.indra.actions;

import com.indra.models.ComprarProductosOnlineModels;
import com.indra.pages.ComprarProductosOnlinePage;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;


@DefaultUrl("/#/")

public class ComprarProductosOnlineActions extends ComprarProductosOnlinePage {

    public ComprarProductosOnlineActions(WebDriver driver) {
        super(driver);
    }

    public void ingresarLogin(){
        clicEnIconoSignIn();
        ingresarInformacionLogin("manuel2021","Mde%42fggrdf");
        clicEnBtnSignI();
        getCargaEnMenu().waitUntilNotVisible();
    }

    public void clicEnIconoSignIn(){
        getBtnIconoLogin().click();
    }

    public void clicEnBtnSignI(){
        getBtnSignIn().waitUntilPresent();
        getBtnSignIn().click();
    }

    public void ingresarInformacionLogin(String usuario, String contrasena){
        enter(usuario).into(getUserName());
        enter(contrasena).into(getPassword());
    }

    public void clicBtnBuscar(){
        getBtnBuscar().waitUntilPresent();
        getBtnBuscar().click();
    }

    public void agregarArticuloBuscado(String articuloBuscado){
        getCajaBuscarArticulo().waitUntilEnabled();
        enter(articuloBuscado, Keys.ENTER).into(getCajaBuscarArticulo());
    }

    public void clicBtnCerrarBusqueda(){
        getBtnClose().click();
    }

    public void realizarProcesoBusquedaDeArticulo(){
        clicBtnBuscar();
        agregarArticuloBuscado("HP S9500 Bluetooth Wireless Speaker");
        clicBtnCerrarBusqueda();
    }

    public void agregarElArticuloAlCarrito(){
        realizarProcesoBusquedaDeArticulo();
        getListadoArticulos().get(0).click();
        getBtnAgregarCarrito().click();
    }
    public void moverElMouseCarritoCompras(){
        WebElement gmailLink = getDriver().findElement(By.xpath("//nav//ul//li//a[@id='shoppingCartLink']"));
        Actions actionProvider = new Actions(getDriver());
        actionProvider.moveToElement(gmailLink).build().perform();
    }
    public void validarDetallesDelCarritoCompras(){
        moverElMouseCarritoCompras();
        getBtnCarritoComprasHover().click();
        getTituloShoppingCart().isPresent();
        int igualdad=0;
        /** Se realiza la validacion campo a campo de los detalles de cada uno de los articulos seleccionados, si todos son iguales aumenta el contador en 1 */
        for(int i=0; i< getPrecioArticuloHover().size();i++){
            if(getCantidadArticulosHover().get(i).getText().split(" ")[1].equals(getCantidadArticuloTabla().get(i).getText())
                    && getColorArticuloHover().get(i).getText().equals(getColorArticuloTabla()
                    .get(i).getAttribute("title"))
                    && getImagenArticuloHover().get(i).getAttribute("src")
                    .equals(getImagenArticuloTabla().get(i).getAttribute("src"))
                    && getNombreArticuloTabla().get(i).getText()
                    .contains(getNombreArticuloHover().get(i).getText().replace("...",""))
                    && getPrecioArticuloHover().get(i).getText().equals(getPrecioArticuloTabla().get(i).getText())){
                igualdad++;
            }
        }
        MatcherAssert.assertThat("los detalles del pop up del carrito de compras de todos los articulos " +
                "seleccionados es igual al mostrado en el apartado SHOPPING CART ",getCantidadArticulosHover().size(),Matchers.is(igualdad));
    }

    public void hacerClicCheckOut(){
        getBtnCheckOut().click();
    }

    public void validarShippingDetails(ComprarProductosOnlineModels buyOnlineModels){
        List<String> listaDatos = new ArrayList<>();
        listaDatos.add(buyOnlineModels.getNombreUsuario());
        listaDatos.add(buyOnlineModels.getDireccionUsuario());
        listaDatos.add(buyOnlineModels.getTelefonoUsuario());
        int cantidadDatos=0;

        if(getCampoDatoNombre().isPresent()){
            cantidadDatos++;
        }
        if(getCampoDatoDireccion().isPresent()){
            cantidadDatos++;
        }
        if(getCampoDatoTefono().isPresent()){
            cantidadDatos++;
        }
        MatcherAssert.assertThat("la cantidad de datos presentes es  Shipping Details" +
                " es igual a la cantidad de datos a valida", listaDatos.size(), Matchers.is(cantidadDatos));
    }

    public void validaQueSeaEditableLaInformacion(){

        int informacionEditable=0;
        if(getNombreEditable().isEnabled()){
            informacionEditable ++;
        }
        if(getDireccionEditable().isEnabled()){
            informacionEditable ++;
        }
        if(getTelefonoEditable().isEnabled()){
            informacionEditable ++;
        }
        MatcherAssert.assertThat("El nombre, Direccion y Telefono son editables"
                ,informacionEditable,Matchers.is(3));
    }

    public void hacerClicEditarDetalles(){
        getBtnEditarDetalles().click();
    }

    public void hacerClicNext(){
        getBtnNext().click();
    }

    public void validarOpcionesDePago(ComprarProductosOnlineModels buyOnlineModels){

        int metodospagoexitentes=0;
        if(buyOnlineModels.getOpcionPago1().toLowerCase()
                .equals(getMetodoPagoSafepay().getAttribute("alt").toLowerCase())){
            metodospagoexitentes++;
        }
        if(buyOnlineModels.getOpcionPago2().toLowerCase()
                .equals(getMetodoPagoMasterCredit().getAttribute("alt").toLowerCase())){
            metodospagoexitentes++;
        }
        MatcherAssert.assertThat("se muestra los dos metodos de pago"
                ,metodospagoexitentes,Matchers.is(2));
    }

    public void seleccionarMetodoPagoSafePay(){
        getMetodoPagoSafepay().click();
    }

    public void seleccionarMetodoPagoMasterCredit(){
        getMetodoPagoMasterCredit().click();
    }

    public void validarOpcionEditarTarjetaCredito(){
        getCargaEnMenu().waitUntilNotVisible();
        int opcionEcontrada=0;
        if(getLinkEditarTarjetaCredito().isEnabled()){
            opcionEcontrada++;
        }
        MatcherAssert.assertThat("la opcion editar tarjeta  de credito esta habilitada",opcionEcontrada,Matchers.is(1));
    }

    public void hacerClicEditarTarjetaCredito(){
        getLinkEditarTarjetaCredito().click();
    }

    public void validarCargadeDatosTarjetaCreditoAnterior(int cantidadcampoRequeridos){

        int camposRequeridosExistentes=0;
        if (!getCardNumber().getAttribute("value").isEmpty()){
            camposRequeridosExistentes++;
        }
        if (!getCardHolderName().getAttribute("value").isEmpty()){
            camposRequeridosExistentes++;
        }
        if (!getCvvNumber().getAttribute("value").isEmpty()){
            camposRequeridosExistentes++;
        }
        if (!getYear().getAttribute("value").isEmpty()){
            camposRequeridosExistentes++;
        }
        if(!getCardHolderName().getAttribute("value").isEmpty()){
            camposRequeridosExistentes++;
        }
        MatcherAssert.assertThat("la cantidad de campos diligencias es igual a la cantidad de campos requeridos",
                camposRequeridosExistentes,Matchers.is(cantidadcampoRequeridos));
    }
    public void validaBotonPaynowEstaPresente(){
        int btnPayNowHabilitado=0;
        if(getBtnPayNow().isEnabled()){
            btnPayNowHabilitado++;
        }
        MatcherAssert.assertThat("EL boton esta presente y habilitado",
                btnPayNowHabilitado, Matchers.is(1));
    }

    public void hacerClicBotonPayNow(){
        getBtnPayNow().click();
    }

    public void validarCamposOrdenDePago(ComprarProductosOnlineModels buyOnlineModels){
        List<String> listaCamposOrdenPago = new ArrayList<>();
        listaCamposOrdenPago.add(buyOnlineModels.getDireccionDeEntrega());
        listaCamposOrdenPago.add(buyOnlineModels.getMedioDePago());
        listaCamposOrdenPago.add(buyOnlineModels.getResumenCompra());
        listaCamposOrdenPago.add(buyOnlineModels.getNumeroOrden());
        listaCamposOrdenPago.add(buyOnlineModels.getNumeroGuia());
        int campoPresente=0;
        if(getDireccionDeEntrega().getText().contains(buyOnlineModels.getDireccionDeEntrega())){
            campoPresente++;
        }
        if(getMedioDePago().getText().contains(buyOnlineModels.getMedioDePago())){
            campoPresente++;
        }
        if(getResumenCompra().getText().contains(buyOnlineModels.getResumenCompra())){
            campoPresente++;
        }
        if(getNumeroOrden().isPresent()){
            campoPresente++;
        }
        if(getNumeroGuia().isPresent()){
            campoPresente++;
        }
        MatcherAssert.assertThat("los campos estan presentes son iguales a los del requerimiento",
                campoPresente,Matchers.is(listaCamposOrdenPago.size()));
    }
}
