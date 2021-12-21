package com.indra.actions;

import com.indra.models.FormularioRegistro;
import com.indra.pages.RegisterUser;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;


@DefaultUrl("/index.php?controller=authentication&back=my-account")

public class RegisterUserActions extends RegisterUser {

    public RegisterUserActions(WebDriver driver) {
        super(driver);
    }

    public void ingresoEmail(String email){
        enter(email).into(getCampoEmail());
        getBtnCrear().click();
        validarIngresoPaginaRegistro();
    }

    public void validarIngresoPaginaRegistro (){
        assertThat("El titulo deberia coincidir",
                "CREATE AN ACCOUNT",
                Matchers.is(getTittleNewAccount().getText()));
    }

    public void llenarFormularioRegistro(FormularioRegistro registro){
        enter(registro.getNombre()).into(getCampoPrimerNombre());
        enter(registro.getApellido()).into(getCampoApellido());
        enter(registro.getPassword()).into(getCampoPassword());
        enter(registro.getNombre1()).into(getCampoName());
        enter(registro.getApellido1()).into(getCampoLastName());
        enter(registro.getCompany()).into(getCampoCompany());
        enter(registro.getDireccion()).into(getCampoDireccion());
        enter(registro.getCiudad()).into(getCampoCiudad());
        selectOptionFromDropDown(By.id("id_state"),registro.getEstado());
        enter(registro.getCodPostal()).into(getCampoCodPostal());
        enter(registro.getTelefono()).into(getCampoCelular());
    }

    public void enviarRegistro(FormularioRegistro registro){
        llenarFormularioRegistro(registro);
        getBtnRegistrar().click();
    }

    public void validarRegistroConNombreUsuario(){
        assertThat("el usuario deberia ver que el registro se haya registrado correctamente y ya se encuentra logueado dentro de la pagina",
                "Manuel Araujo",
                Matchers.is(getUserRegistered().getText()));
    }

}