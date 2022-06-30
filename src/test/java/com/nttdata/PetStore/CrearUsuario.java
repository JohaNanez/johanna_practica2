package com.nttdata.PetStore;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CrearUsuario {

    private static String CREATE_USER = "https://petstore.swagger.io/v2/user";

    @Step("Crear usuario {0} en PetStore")
    public void crearUsuario(String username, String firstname, String lastname){
        SerenityRest.given()
                .contentType("application/json")
                .body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"username\":"+"\""+username+"\","+"\n" +
                        "  \"firstname\":"+"\""+firstname+"\","+"\n" +
                        "  \"lastname\":"+"\""+lastname+"\","+"\n" +
                        "  \"email\": \"string\",\n" +
                        "  \"password\": \"string\",\n" +
                        "  \"phone\": \"string\",\n" +
                        "  \"userStatus\": 0\n" +
                        "}")
                .post(CREATE_USER);
    }

}
