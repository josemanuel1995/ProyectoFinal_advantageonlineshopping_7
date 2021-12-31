package com.indra.actions;

import com.indra.pages.SelectArticuloPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectArticuloActions extends SelectArticuloPage {
    public SelectArticuloActions(WebDriver driver) {
        super(driver);
    }

    public void addLogin(){
        clicSignInIcono();
        infoLogin("manuel1995","M@NUELsaxo19");
        clicBtnSignI();
    }

    public void clicSignInIcono(){
        getBtnLoginIcono().click();
    }

    public void clicBtnSignI(){
        getBtnSignIn().waitUntilPresent();
        getBtnSignIn().click();
    }

    public void infoLogin(String user, String password){
        enter(user).into(getUserName());
        enter(password).into(getPassword());
    }

    public void clicBtnShopNow(){
        getBtnShopNow().waitUntilPresent();
        getBtnShopNow().click();
    }

    public void clicBtnBuyNow2(){
        getBtnBuyNow2().click();
    }

    public void consultarArticulo(){
        clicBtnShopNow();
        clicBtnBuyNow2();
    }

    public void agregarArticuloAlCarrito(){
        consultarArticulo();
        getspanColor().get(0).click();
        getBtnAggCart().click();
    }

    public void cartComprasmoverMouse(){
        WebElement gmailLink = getDriver().findElement(By.xpath("//nav//ul//li//a[@id='shoppingCartLink']"));
        Actions actionProvider = new Actions(getDriver());
        actionProvider.moveToElement(gmailLink).build().perform();

    }

    public void cartComprasvalidarDetalles() {
        cartComprasmoverMouse();
        getBtnCartCompras().click();
        getTituloShoppingCart().isPresent();
    }
}
