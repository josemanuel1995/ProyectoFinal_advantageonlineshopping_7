@test
Feature: Formulario de Registro

  Yo como PO
  Quiero un formulario de Registro
  Para que mis clientes puedan comprar los productos

@Scenario
Scenario: EL usuario quiere registrarse para hacer sus compras
  Given el usuario esta en la seccion de logueo para crear un nuevo usuario
  When el usuario ingresa un correo manuelwe34342576@gmail.com valido no registrado
  And el usuario crea y envia los datos requeridos del formulario
  | nombre   | apellido    | password     | company   | nombre1      | apellido1 | direccion     | usa           | codigo_postal   | telefono   | estado     |
  | Manuel   | Araujo      | 95082011200  | INDRA     | Manuel        | Araujo    | Cra 4 # 3-34 | United States |     00120       |8544556    | Florida    |
  Then el usuario deberia ver que el registro se haya registrado correctamente y ya se encuentra logueado dentro de la pagina
