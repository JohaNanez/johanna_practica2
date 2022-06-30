package com.nttdata.PetStore;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ObtenerUsuario {

    private static String GET_USER = "https://petstore.swagger.io/v2/user/";

    @Step("Obtener usuario {0} en PetStore")
     public void obtenerUsuario(String username){
        SerenityRest.get(GET_USER+username);

    }
}
