
@test
Feature: Realizar la compra en línea de productos de tecnología

  Yo como Usuario  del portal Demo necsito Realizar la compra en línea de productos de tecnología
  para Seleccionar artículos de tecnología de la página, realizando el pago en línea.

    #-------------------------------caso 1 ------------------------------
  Scenario: La canasta de compras muestra los detalles del producto a comprar
    Given el usuario se loguea para ingresar a la pagina principal
    When el usuario agrega un producto al carrito de compras
    Then se hace clic en el carrito y el sistema deberia visualizar los detalles del producto seleccionado

    #-------------------------------caso 2 ------------------------------
  Scenario: El carrito de compras deberia visualizar la opcion Shipping Details
    Given que el usuario se loguea para ingresar a la pagina principal
    And se agrega un articulo al carrito de compras
    When hace click en checkOut
    Then el portal deberia mostrar una pantalla con los siguientes datos:
      | nombreUsuario | direccionUsuario  | telefonoUsuario   |
      | nombre        | direccion         | numerotelefonico  |

    #-------------------------------caso 3 ------------------------------
  Scenario: El usario deberia poder editar la Informacion de Shopping Details
    Given que el usuario esta logueado e ingresa a la pagina principal
    And se agrega un producto al carrito de compras
    And se encuentra en la pantalla shipping details
    When se hace click en Edit shipping details
    Then el usuario deberia poder editar la informacion

    #-------------------------------caso 4 ------------------------------
  Scenario: el usuario deberia poder visulizar dos opciones de pago
    Given que se logueo en el portal
    And que agrego un articulo a la canasta
    When esta en la pantalla Payment Method
    Then deberia poder visulizar dos opciones de pago
      | opcionPago1 | opcionPago2    |
      | SafePay     | Master credit  |

    #-------------------------------caso 5 ------------------------------
  Scenario: el usuario deberia poder ver la opcion de editar tarjeta
    Given que se logueo el usuario en el portal
    And que el usuario agregro un articulo de compra
    When selecciona la opcion de pago Master Credit
    Then deberia poder visualizar la opcion de editar tarjeta de credito

    #-------------------------------caso 6 ------------------------------
  Scenario: el usuario deberia poder ver los datos de la tarjeta anterior
    Given que se logueo el usuario en el portal
    And que el usuario agregro un articulo de compra
    And selecciona la opcion de pago Master Credit
    When hace click en el link de editar tarjeta
    Then deberia poder visualizar los datos de la tarjeta anterior

    #-------------------------------caso 7 ------------------------------
  Scenario: el usuario deberia poder ver la opcion Pay Now
    Given que se logueo el usuario en el portal
    And que el usuario agregro un articulo de compra
    When selecciona la opcion de pago Master Credit
    Then  deberia poder visualizar el boton de Pay Now

    #-------------------------------caso 8 ------------------------------
  Scenario: el usuario deberia poder ver la orden de pago
    Given que se logueo el usuario en el portal
    And que el usuario agregro un articulo de compra
    When selecciona la opcion de pago Master Credit
    And hace click en el boton Pay Now
    Then  deberia poder visualizar la orden de pago con los siguientes campos
      | direccionDeEntrega  | medioDePago     | resumenCompra | numeroOrden     | numeroGuia    |
      | Shipping to         | Payment method  | Order Summary | tracking number | order number  |