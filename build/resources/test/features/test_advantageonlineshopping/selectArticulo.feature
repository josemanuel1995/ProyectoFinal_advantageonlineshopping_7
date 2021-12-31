@test
Feature: Selección en línea de productos de tecnología

  Yo como usuario
  Quiero Seleccionar artículos de tecnología en línea para adicionar al canasto y luego realizar el pago.


  Scenario: La canasta de compras deberia mostrar los detalles del producto a comprar
    Given el usuario se encuentra logueado en la pagina principal
    When se procede a mostrar los procesos y verificara si coinciden en el producto seleccionado
    Then deberia poder agregar el producto para enviar al carrito de compras


