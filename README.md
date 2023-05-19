# Proyecto de Automatización de Pruebas

Este proyecto incluye automatizacion de pruebas para el sitio web www.advantageonlineshopping.com.

La automatización de pruebas utiliza Java 11 como lenguaje de programación y el framework de automatización de pruebas Selenium. La automatización realiza los siguientes pasos:

- Ingresa a la página web https://www.advantageonlineshopping.com/#/.
- Elige la opción cuenta y selecciona crear una cuenta.
- Ingresa todos los datos solicitados para realizar el registro.
- Valida que el usuario haya sido creado correctamente.


## Requisitos de Ejecución

- Se recomienda usar Java 11 para las automatizacion, ejecutar el test con JUnit ya creado o con el comando "gradle clean test aggregate".
- en el archivo file.properties escribir el usuario, email y contraseña que desea registrar y en el stepDefinitioN escribir en el valor esperado del usuario a registrar
para validar la aserción.

***NOTA: LOS USUARIOS QUEDAN REGISTRADOS EN LA PÁGINA ENTONCES AL CORRER EL TEST PARA VERIFICAR LA ASERCIÓN SE DEBE ESCRIBIR UN NUEVO USUARIO***

*By: James Muñoz*
