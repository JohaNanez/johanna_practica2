package com.nttdata.PetStore;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ObtenerUsuarioStepsDefs {

    @Steps
    ObtenerUsuario obtenerUsuario;

    @When("obtengo el usuario con username {string}")
    public void obtenerUsuario(String username){
        obtenerUsuario.obtenerUsuario(username);
    }
    @Then("el codigo de respuesta de obtener usuario es {int}")
    public void elCodigoDeRespuestaEs(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }
}
