#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda

Característica: Comprar en linea
  yo como usuario de la pagina automation exercise
  Quiero comprar varias prendas por medio de la pagina web
  Para poder ahorrar tiempo y acceder a mas productos disponibles

  @CompraExitosa
  Escenario: Compra exitosa de productos
    Dado que el cliente esta logueado en la pagina principal
    Cuando agrega varios productos al carrito
    Y completa la informacion del formulario del pago
    Entonces mostrara un mensaje confirmando la compra