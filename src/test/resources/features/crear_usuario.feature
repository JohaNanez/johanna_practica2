Feature: Crear usuario PetStore

  @test1
  Scenario: Crear usuario

    When creo el usuario con username "johannananez", firstname "Johanna",lastname "Nanez"
    Then el codigo de respuesta es 200
    And el type es "unknown"



  @test2
  Scenario: Obtener usuario

    When obtengo el usuario con username "johannananez"
    Then el codigo de respuesta de obtener usuario es 200