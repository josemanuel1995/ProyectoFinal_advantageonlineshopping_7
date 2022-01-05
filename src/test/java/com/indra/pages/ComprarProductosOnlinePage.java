package com.indra.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://advantageonlineshopping.com/")

public class ComprarProductosOnlinePage extends PageObject {

    public ComprarProductosOnlinePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "menuUser")
    private WebElementFacade btnIconoLogin;

    @FindBy(xpath = "//input[@name='username']")
    private WebElementFacade userName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElementFacade password;

    @FindBy(id = "sign_in_btnundefined")
    private WebElementFacade btnSignIn;

    /** Seccion de buscar Y agregar articulo */

    @FindBy(className = "loader")
    private WebElementFacade cargaEnMenu;

    @FindBy(xpath = "//div[@id='search']")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//div[@class='autoCompleteCover']//input[@id='autoComplete']")
    private WebElementFacade cajaBuscarArticulo;

    @FindBy(xpath = "//img[@src='../../css/images/closeDark.png']")
    private WebElementFacade btnClose;

    @FindBy(xpath = " //p//a[@class='productName ng-binding']")
    private List<WebElementFacade> listadoArticulos;

    @FindBy(xpath = "//button[@name='save_to_cart']")
    private WebElementFacade btnAgregarCarrito;


    /** Seccion Detalles Carrito compras*/

    @FindBy(xpath = "(//a//h3[@class='ng-binding'])")
    private List<WebElement> NombreArticuloHover;

    @FindBy(xpath = "(//table[@ng-show='cart.productsInCart.length > 0'])[1][1]/tbody/tr/td/a/label[1]")
    private List<WebElement> cantidadArticulosHover;

    @FindBy(xpath = "(//table[@ng-show='cart.productsInCart.length > 0'])[1][1]/tbody/tr/td/a/label/span")
    private List<WebElement> colorArticuloHover;

    @FindBy(xpath = "(//table[@ng-show='cart.productsInCart.length > 0'])[1][1]/tbody/tr/td/a/img")
    private List<WebElement> imagenArticuloHover;

    @FindBy(xpath = "//nav//ul//li//a[@id='shoppingCartLink']")
    private WebElementFacade btnCarritoComprasHover;



    @FindBy(xpath = "(//table[@ng-show='cart.productsInCart.length > 0'])[1][1]/tbody/tr/td/p")
    private List<WebElement> precioArticuloHover;

    /** Detalles CheckOut*/
    @FindBy(xpath = "(//table[@ng-show='cart.productsInCart.length > 0'])[2]/tbody/tr/td/label[@class='roboto-regular productName ng-binding']" )
    private List<WebElement> nombreArticuloTabla;

    @FindBy(xpath = "(//table[@ng-show='cart.productsInCart.length > 0'])[2]/tbody/tr/td[4]/span")
    private List<WebElement> colorArticuloTabla;

    @FindBy(xpath = "(//table[@ng-show='cart.productsInCart.length > 0'])[2]/tbody/tr/td[5]/label[2]")
    private List<WebElement> cantidadArticuloTabla;

    @FindBy(xpath = "(//table[@ng-show='cart.productsInCart.length > 0'])[2]/tbody/tr/td[6]/p")
    private List<WebElement> precioArticuloTabla;

    @FindBy(xpath = "(//table[@ng-show='cart.productsInCart.length > 0'])[2]/tbody/tr/td[1]/img")
    private List<WebElement> imagenArticuloTabla;

    @FindBy(xpath = "//h3[contains(.,'SHOPPING CART')]")
    private WebElementFacade tituloShoppingCart;

    @FindBy(id = "checkOutButton")
    private WebElementFacade btnCheckOut;



    @FindBy (xpath = "//div[@id='userDetails']/div/img")
    private WebElementFacade campoDatoNombre;

    @FindBy (xpath = "//div[@id='userDetails']/div/div[@icon-home]")
    private WebElementFacade campoDatoDireccion;

    @FindBy (xpath = "//div[@id='userDetails']/div/div[@icon-phone]")
    private WebElementFacade campoDatoTefono;

    @FindBy (xpath = "//a[contains(.,'Edit shipping details')]")
    private WebElementFacade btnEditarDetalles ;

    /** Seccion Datos de la edicion*/

    @FindBy (name = "first_name")
    private WebElementFacade nombreEditable ;

    @FindBy (name = "address")
    private WebElementFacade direccionEditable ;

    @FindBy (name = "phone_number")
    private WebElementFacade telefonoEditable ;

    /**  Seccion metodos de pago */

    @FindBy(xpath = "//button[@id='next_btn']")
    private WebElementFacade btnNext;

    @FindBy(xpath = "(//div[@class='paymentMethods']/div/img)[2]")
    private WebElementFacade metodoPagoMasterCredit;

    @FindBy(xpath = "(//div[@class='paymentMethods']/div/img)[1]")
    private WebElementFacade metodoPagoSafepay;

    @FindBy(xpath = "//label[@class='edit  ng-scope']")
    private WebElementFacade linkEditarTarjetaCredito;

    /** Seccion edicion tarjeta credito*/
    @FindBy(xpath = "//input[contains(@id,'creditCard')]")
    private WebElementFacade cardNumber;
    @FindBy(xpath = "//input[@name='cvv_number']")
    private WebElementFacade cvvNumber;
    @FindBy(xpath = "//select[@name='mmListbox']")
    private WebElementFacade expirationDate;
    @FindBy(xpath = "//select[@name='yyyyListbox']")
    private WebElementFacade year;
    @FindBy(xpath = "//input[@name='cardholder_name']")
    private WebElementFacade cardHolderName;
    @FindBy (xpath = "(//div[@class='blueLink']//a[@class='ng-scope'])[2]")
    private WebElementFacade linkRegresar;

    @FindBy(xpath = "//button[@id='pay_now_btn_MasterCredit']")
    private WebElementFacade btnPayNow;

    @FindBy(xpath = "(//div[@class='seccion borderRight']/span)[1]")
    private WebElementFacade direccionDeEntrega ;
    @FindBy(xpath = "(//div[@class='seccion borderRight']/span)[2]")
    private WebElementFacade medioDePago;
    @FindBy(xpath = "//div[@class='seccion']/span")
    private WebElementFacade resumenCompra;
    @FindBy(xpath = "//p/label[@id='orderNumberLabel']")
    private WebElementFacade numeroOrden;
    @FindBy(xpath = "//p/label[@id='trackingNumberLabel']")
    private WebElementFacade numeroGuia;

    /*****************************************************************************************/

    public WebElementFacade getCargaEnMenu() {
        return cargaEnMenu;
    }

    public WebElementFacade getBtnIconoLogin() {
        return btnIconoLogin;
    }

    public WebElementFacade getUserName() {
        return userName;
    }

    public WebElementFacade getPassword() {
        return password;
    }

    public WebElementFacade getBtnSignIn() {
        return btnSignIn;
    }

    public WebElementFacade getBtnBuscar() {
        return btnBuscar;
    }

    public WebElementFacade getCajaBuscarArticulo() {
        return cajaBuscarArticulo;
    }

    public WebElementFacade getBtnClose() {
        return btnClose;
    }

    public List<WebElementFacade> getListadoArticulos() {
        return listadoArticulos;
    }

    public WebElementFacade getBtnAgregarCarrito() {
        return btnAgregarCarrito;
    }

    public List<WebElement> getNombreArticuloHover() {
        return NombreArticuloHover;
    }

    public List<WebElement> getCantidadArticulosHover() {
        return cantidadArticulosHover;
    }

    public List<WebElement> getColorArticuloHover() {
        return colorArticuloHover;
    }

    public List<WebElement> getImagenArticuloHover() {
        return imagenArticuloHover;
    }

    public WebElementFacade getBtnCarritoComprasHover() {
        return btnCarritoComprasHover;
    }

    public List<WebElement> getPrecioArticuloHover() {
        return precioArticuloHover;
    }

    public List<WebElement> getNombreArticuloTabla() {
        return nombreArticuloTabla;
    }

    public List<WebElement> getColorArticuloTabla() {
        return colorArticuloTabla;
    }

    public List<WebElement> getCantidadArticuloTabla() {
        return cantidadArticuloTabla;
    }

    public List<WebElement> getPrecioArticuloTabla() {
        return precioArticuloTabla;
    }

    public List<WebElement> getImagenArticuloTabla() {
        return imagenArticuloTabla;
    }

    public WebElementFacade getTituloShoppingCart() {
        return tituloShoppingCart;
    }

    public WebElementFacade getBtnCheckOut() {
        return btnCheckOut;
    }


    public WebElementFacade getCampoDatoNombre() {
        return campoDatoNombre;
    }

    public WebElementFacade getCampoDatoDireccion() {
        return campoDatoDireccion;
    }

    public WebElementFacade getCampoDatoTefono() {
        return campoDatoTefono;
    }

    public WebElementFacade getBtnEditarDetalles() {
        return btnEditarDetalles;
    }

    public WebElementFacade getNombreEditable() {
        return nombreEditable;
    }

    public WebElementFacade getDireccionEditable() {
        return direccionEditable;
    }

    public WebElementFacade getTelefonoEditable() {
        return telefonoEditable;
    }

    public WebElementFacade getBtnNext() {

        return btnNext;
    }

    public WebElementFacade getMetodoPagoSafepay() {
        return metodoPagoSafepay;
    }

    public WebElementFacade getMetodoPagoMasterCredit() {
        return metodoPagoMasterCredit;
    }

    public WebElementFacade getLinkEditarTarjetaCredito() {
        return linkEditarTarjetaCredito;
    }

    public WebElementFacade getCardNumber() {
        return cardNumber;
    }

    public WebElementFacade getCvvNumber() {
        return cvvNumber;
    }

    public WebElementFacade getExpirationDate() {
        return expirationDate;
    }

    public WebElementFacade getYear() {
        return year;
    }

    public WebElementFacade getCardHolderName() {
        return cardHolderName;
    }

    public WebElementFacade getLinkRegresar() {
        return linkRegresar;
    }

    public WebElementFacade getBtnPayNow() {
        return btnPayNow;
    }

    public WebElementFacade getDireccionDeEntrega() {
        return direccionDeEntrega;
    }

    public WebElementFacade getMedioDePago() {
        return medioDePago;
    }

    public WebElementFacade getResumenCompra() {
        return resumenCompra;
    }

    public WebElementFacade getNumeroOrden() {
        return numeroOrden;
    }

    public WebElementFacade getNumeroGuia() {
        return numeroGuia;
    }

}