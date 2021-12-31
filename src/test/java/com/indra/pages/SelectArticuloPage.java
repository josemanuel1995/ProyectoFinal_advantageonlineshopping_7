package com.indra.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://advantageonlineshopping.com/")

public class SelectArticuloPage extends PageObject {

    public SelectArticuloPage(WebDriver driver) {
        super(driver);
    }

    /*********** login ***************/

    @FindBy(id = "menuUser")
    private WebElementFacade btnLoginIcono;

    @FindBy(xpath = "//input[@name='username']")
    private WebElementFacade userName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElementFacade password;

    @FindBy(id = "sign_in_btnundefined")
    private WebElementFacade btnSignIn;

    /****************  agregar articulo *****************/

    @FindBy(xpath = "//div[@id='laptopsImg']")
    private WebElementFacade btnShopNow;

    @FindBy(xpath = "(//button[@role='button'])[3]")
    private WebElementFacade btnBuyNow;

    @FindBy(xpath = "//button[@class='roboto-medium ng-scope']")
    private WebElementFacade btnBuyNow2;

    @FindBy(xpath = "(//span[@id='bunny'])[4]")
    private List<WebElementFacade> spanColor;

    @FindBy(xpath = "//div[@increment-value-attr='+'][2]")
    private List<WebElementFacade> cantidadProduct;

    @FindBy(xpath = "//button[@name='save_to_cart']")
    private WebElementFacade btnAggCart;

    /** Popup Detalles Carrito compras*/

    @FindBy(xpath = "//nav//ul//li//a[@id='shoppingCartLink']")
    private WebElementFacade btnCartCompras;

    /** Detalles CheckOut*/

    @FindBy(xpath = "//h3[contains(.,'SHOPPING CART')]")
    private WebElementFacade tituloShoppingCart;



    public WebElementFacade getBtnLoginIcono() {
        return btnLoginIcono;
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

    public WebElementFacade getBtnShopNow() {
        return btnShopNow;
    }

    public WebElementFacade getBtnBuyNow2() {
        return btnBuyNow2;
    }

    public List<WebElementFacade> getspanColor() {
        return spanColor;
    }

    public WebElementFacade getBtnAggCart() {
        return btnAggCart;
    }

    public WebElementFacade getBtnCartCompras() {
        return btnCartCompras;
    }

    public WebElementFacade getTituloShoppingCart() {
        return tituloShoppingCart;
    }

}
