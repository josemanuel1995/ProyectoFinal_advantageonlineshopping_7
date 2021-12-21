package com.indra.stepsDefinitions;

import com.indra.actions.RegisterUserActions;
import com.indra.models.FormularioRegistro;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegisterUserSteps {

    @Managed
    WebDriver driver;
    RegisterUserActions registerUserActions = new RegisterUserActions(driver);

    @Given("^el usuario esta en la seccion de logueo para crear un nuevo usuario$")
    public void el_usuario_esta_en_la_seccion_de_logueo_para_crear_un_nuevo_usuario() {
        registerUserActions.open();
    }

    @When("el usuario ingresa un correo (.*) valido no registrado$")
    public void el_usuario_ingresa_un_correo_valido_no_registrado(String email) {
        registerUserActions.ingresoEmail(email);
    }

    @When("el usuario crea y envia los datos requeridos del formulario$")
    public void el_usuario_crea_y_envia_los_datos_requeridos_del_formulario(List <FormularioRegistro> formularioRegistros ) {
        registerUserActions.enviarRegistro(formularioRegistros.get(0));
    }

    @Then("el usuario deberia ver que el registro se haya registrado correctamente y ya se encuentra logueado dentro de la pagina$")
    public void el_usuario_deberia_ver_que_el_registro_se_haya_registrado_correctamente_y_ya_se_encuentra_logueado_dentro_de_la_pagina(){
        registerUserActions.validarRegistroConNombreUsuario();
    }

}


