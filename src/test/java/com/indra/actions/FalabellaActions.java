package com.indra.actions;


import com.indra.models.ComprarProduct;
import com.indra.pages.FalabellaPage;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


@DefaultUrl("/falabella-co/")

public class FalabellaActions extends FalabellaPage {
    public String precioProducto;

    public FalabellaActions(WebDriver driver) {
        super(driver);
    }

    public void ingresarProductoBuscado(ComprarProduct comprarProduct){
        enter(comprarProduct.getProductoBuscado()).into(getCajaDeBusqueda());
    }

    public void clickBuscar(ComprarProduct comprarProduct){
        ingresarProductoBuscado(comprarProduct);
        getBtnBuscar().click();
    }

    public void aggProductoCarrito(){
        moverMouseAlProducto(By.xpath("//div[@id='testId-pod-9461744']//li//div"));
        getBtnAgregarBolsa().click();
        getBtnVerCarritoDeCompras().click();
        validacionDePrecios();
    }

    public void moverMouseAlProducto( By by){
        WebElement seleccionarProducto = getDriver().findElement(by);
        Actions moverMouse = new Actions(getDriver());
        moverMouse.moveToElement(seleccionarProducto).build().perform();
    }

    public String precioProducto(){
        String nprecio=getValorProducto().getText();
        return nprecio;
    }

    public String precioProductoFinal(){
        String preciofinal = getValorProductoCarritoCompras().getText();
        return preciofinal;
    }

    public void validacionDePrecios(){
        MatcherAssert.assertThat("El precio del Producto en la pantalla inicial es igual a la pantalla del carrito de compras",
                precioProductoFinal(), Matchers.equalTo(precioProducto));
    }
}
