Feature: Registro en la pagina AvantageDemo
  yo como usuario de la página AvantageDemo
  quiero poder realizar un registro exitosamente
  para poder iniciar sesion en la página

  Scenario: Crear cuenta
    Given que el usuario esta en la pagina de inicio
    When navega hasta la el formulario de registro
    And llena todos los campos correctamente
    Then el usuario debe ver su nombre en la pagina principal
