@test
Feature: Formulario de Contacto

  Yo como PO
  Quiero un formulario de Registro
  Para que mis clientes puedan comprar los productos

@Scenario
Scenario: EL Usuario quiere registrarse para hacer sus compras
  Given que el usuario esta en la seccion de logueo para crear un nuevo usuario
  When el usuario ingresa un correo valido
  And el usuario completa el formulario de registro con los campos obligatorios
  |email|
  Then el sistema mostrara la pantalla de MY ACCOUNT
