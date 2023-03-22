#language:es
#encoding:UTF-8
#Author: Melissa Meneses Acevedo

Característica: Flujo de Compra en una Página Web
  yo como usuaria de la pagina Automation Exercise
  quiero poder comprar productos en la pagina
  para poder recibirlos en mi domicilio

  @Compra
  Escenario: : El usuario completa un flujo de compra en la pagina web
    Dado que estoy en la pagina web Automation Exercise
    Y me he registrado correctamente
    Cuando agrego productos a mi carrito y continuo todo el flujo de la compra
    Entonces deberia ver un mensaje de confirmacion de compra exitosa