package com.indra.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://advantageonlineshopping.com/")

public class RedesSocialesPage extends PageObject {

    public RedesSocialesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='follow']")
    private WebElementFacade VistaDeLasRedesSociales;

    @FindBy(xpath = "//div[@id='follow']//img")
    private List<WebElement> ListadodelasRedesSociales;

/*********************************************************************************************************/

    public WebElementFacade getVistaDeLasRedesSociales() {
        return VistaDeLasRedesSociales;
    }

    public List<WebElement> getListadodelasRedesSociales() {
        return ListadodelasRedesSociales;
    }
}
