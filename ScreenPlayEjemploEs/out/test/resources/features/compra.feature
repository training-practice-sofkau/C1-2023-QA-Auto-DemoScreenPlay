#language:es
#encoding:UTF-8
#Author: Gretty Maria Mosquera Taborda

Característica: Compras en pagina de pruebas
  yo como usuario de la pagina automation exercise
  quiero agregar varios productos a mi carrito de compras
  para poder ahorrar tiempo y acceder a mas productos disponibles

  @Registro
  Escenario:
    Dado que el usuario se encuentra en la pagina principal
    Cuando elige una categoria posteriormente se agrega varios productos al carrito
    Y completa la informacion del formulario de facturacion
    Entonces mostrara un mensaje confirmando la compra