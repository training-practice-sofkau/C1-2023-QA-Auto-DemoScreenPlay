#language:es
#encoding:UTF-8
#Author: Juan Esteban Pineda Angel

Característica: Compras en pagina de pruebas
  yo como usuario de la pagina automation exercise
  quiero escoger varios productos
  para hacer el pago por la pagina

  Antecedentes:
    Dado que el usuario se logea
    Cuando navega hasta productos

  @Productos
  Escenario: Orden de compra y pago
    Y escoge  productos en su carrito y pagar con su tarjeta de credito
    Entonces puede ver un mensaje de confirmacion de compra
