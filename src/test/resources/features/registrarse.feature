#encoding:UTF-8
#Author: James Arley Muñoz Borja

Feature: Compras en pagina de pruebas
yo como usuario de la pagina automation exercise
quiero crear una cuenta e ingresar
para poder comprar productos en la página

Scenario:
Given que el usuario esta en la pagina de inicio
When navega hasta la el formulario de registro
And llena todos los campos correctamente
Then el usuario debe ver su nombre en la pagina principal
