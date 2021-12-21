package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class RegisterUser extends BasePage {

    public RegisterUser(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email_create")
    private WebElementFacade campoEmail;

    @FindBy(id = "SubmitCreate")
    private WebElementFacade btnCrear;

    @FindBy(className = "page-subheading")
    private WebElementFacade tittleNewAccount;

    @FindBy(name = "customer_firstname")
    private WebElementFacade campoPrimerNombre;

    @FindBy(id = "customer_lastname")
    private WebElementFacade campoApellido;

    @FindBy(id = "passwd")
    private WebElementFacade campoPassword;

    @FindBy(name = "firstname")
    private WebElementFacade campoName;

    @FindBy(name = "lastname")
    private WebElementFacade campoLastName;

    @FindBy(id = "company")
    private WebElementFacade campoCompany;

    @FindBy(id = "address1")
    private WebElementFacade campoDireccion;

    @FindBy(id = "city")
    private WebElementFacade campoCiudad;

    @FindBy(id = "id_state")
    private WebElementFacade campoEstado;

    @FindBy(id = "postcode")
    private WebElementFacade campoCodPostal;

    @FindBy(id = "phone_mobile")
    private WebElementFacade campoCelular;

    @FindBy(id = "submitAccount")
    private WebElementFacade btnRegistrar;

    @FindBy(className = "account")
    private WebElementFacade userRegistered;





    public WebElementFacade getCampoEmail() {
        return campoEmail;
    }

    public WebElementFacade getBtnCrear() {
        return btnCrear;
    }

    public WebElementFacade getTittleNewAccount() {
        return tittleNewAccount;
    }

    public WebElementFacade getCampoPrimerNombre() {
        return campoPrimerNombre;
    }

    public WebElementFacade getCampoApellido() {
        return campoApellido;
    }

    public WebElementFacade getCampoPassword() {
        return campoPassword;
    }

    public WebElementFacade getCampoName() {
        return campoName;
    }

    public WebElementFacade getCampoLastName() {
        return campoLastName;
    }

    public WebElementFacade getCampoCompany() {
        return campoCompany;
    }

    public WebElementFacade getCampoDireccion() {
        return campoDireccion;
    }

    public WebElementFacade getCampoCiudad() {
        return campoCiudad;
    }

    public WebElementFacade getCampoEstado() {
        return campoEstado;
    }

    public WebElementFacade getCampoCodPostal() {
        return campoCodPostal;
    }

    public WebElementFacade getCampoCelular() {
        return campoCelular;
    }

    public WebElementFacade getBtnRegistrar() {
        return btnRegistrar;
    }

    public WebElementFacade getUserRegistered() {
        return userRegistered;
    }

}
