#language:es
#encoding:UTF-8
#Author: Santiago Ramirez Arenas

Característica: Compras en pagina de pruebas
  yo como usuario de la pagina automation exercise
  quiero crear una cuenta e ingresar
  para poder comprar productos en la página

  Antecedentes:
    Dado que el usuario esta en la pagina de inicio
    Cuando navega hasta la el formulario de registro

  @CompraProducto
  Escenario: Comprar producto
    Y  agrega un producto al carrito de compras, realizando el pago
    Entonces  deberia realizarse la compra exitosamente, ademas de un mensaje de confirmacion