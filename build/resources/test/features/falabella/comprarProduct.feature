@test
Feature: Comprar Producto

  Yo como PO
  Quiero un un modulo para realizar buquedas de articulos
  Para que los clientes puedan seleccionar y agregarlo al carrito de compras

Scenario: El usuario quiere realizar las compras de un producto
  Given el usuario se encuentra en la pagina principal
  And el usuario realiza busqueda de un producto
  | productoBuscado   |
  | Consola Xbox      |
  When el sistema procede a mostrar los procesos y verificara si coinciden en el producto buscado
  Then el usuario deberia poder agregar el producto de su gusto para enviar al carrito de compras


