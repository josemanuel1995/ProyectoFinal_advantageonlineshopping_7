package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.falabella.com.co")
public class FalabellaPage extends PageObject {
    public FalabellaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='testId-SearchBar-Input']")
    private WebElementFacade cajaDeBusqueda;

    @FindBy(xpath = "//img[@src='https://images.contentstack.io/v3/assets/blt088e6fffbba20f16/blte9c20b98d24f1a25/60376c9a4a75a66ee92262d6/searcher-glass.svg']")
    private WebElementFacade btnBuscar;

    @FindBy (xpath = "//b[contains(.,'Consola Xbox')]")
    private WebElementFacade nombreProducto;

    @FindBy(xpath = "//div[@id='testId-pod-9461744']//li//div")
    private  WebElementFacade valorProducto;

    @FindBy(xpath="(//div[@class='jsx-3153667981 jsx-3886284353 btn-text'])[1]")
    private WebElementFacade btnAgregarBolsa;

    @FindBy(id = "linkButton")
    private WebElementFacade btnVerCarritoDeCompras;


    @FindBy (xpath = "//a[@href='/falabella-co/product/9461744/Consola-Xbox-Series-S-512-GB/9461744'][contains(.,'Consola Xbox Series S 512 GB')]")
    private WebElementFacade nombreProductoCarritoCompras;

    @FindBy(xpath = "(//div[@class='fb-pod__prices']//span)[1]")
    private  WebElementFacade valorProductoCarritoCompras;

    public WebElementFacade getNombreProductoCarritoCompras() {
        return nombreProductoCarritoCompras;
    }

    public WebElementFacade getValorProductoCarritoCompras() {return valorProductoCarritoCompras;}

    public WebElementFacade getBtnVerCarritoDeCompras() {
        return btnVerCarritoDeCompras;
    }

    public WebElementFacade getBtnAgregarBolsa() {
        return btnAgregarBolsa;
    }

    public WebElementFacade getCajaDeBusqueda() {
        return cajaDeBusqueda;
    }

    public WebElementFacade getBtnBuscar() {
        return btnBuscar;
    }

    public WebElementFacade getNombreProducto() {
        return nombreProducto;
    }

    public WebElementFacade getValorProducto() {
        return valorProducto;
    }
}
