#language:es
#encoding:UTF-8
#Author: Jesús Miguel Molina Mendoza

Característica: Comprar productos online
  yo como cliente de la pagina automation exercise
  quiero comprar porductos a traves de la pagina web
  para ahorrar tiempo en ir a la tienda fisica

  @Compra
  Escenario: Compra Exitosa
    Dado que el usuario esta logueado en la pagina principal
    Cuando realiza una orden de compra con productos en el carrito
    Y completa la informacion de pago
    Entonces debera observar un mensaje de confirmacion de la compra