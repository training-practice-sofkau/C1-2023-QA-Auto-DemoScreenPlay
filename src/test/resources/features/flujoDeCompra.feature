#language:es
#encoding:UTF-8
#Author: BRAYAN DAVID POLO COHEN

Característica: Flujo de compra en la pagina web automation exercise
  yo como usuario de la pagina automation exercise
  quiero seleccionar productos y agregarlos al carrito
  para poder comprar productos en la página

  @FlujoDeCompra
  Escenario: flujo de compra en la pagina web
    Dado que el usuario esta en la pagina de inicio de web automation exercise
     Y el usuario ha iniciado sesion
    Cuando agrego productos al carrito y los compro
    Entonces el usuario debe recibir el siguiente mensaje "Congratulations! Your order has been confirmed!"