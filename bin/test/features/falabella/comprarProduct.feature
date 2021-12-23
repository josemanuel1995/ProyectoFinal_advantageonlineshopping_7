@test
Feature: Comprar Producto

  Yo como PO
  Quiero un un modulo para realizar buquedas de articulos
  Para que los clientes puedan seleccionar y agregarlo al carrito de compras

Scenario: El usuario quiere realizar las compras de un producto
  Given el usuario se encuentra en la paguina principal
  And el usuario realiza busqueda de un producto
  | articuloBuscado   |
  | Consola Xbox      |
  When el sistema procede a mostrar los procesos y verificara si coninciden en el producto buscado
  Then el usuario deberia poder agregar el producto de su gusto para enviar al carrito de compras
